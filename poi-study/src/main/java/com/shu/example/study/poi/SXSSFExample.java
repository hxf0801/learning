package com.shu.example.study.poi;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

/**
 * The SXSSF API is available in the package org.apache.poi.xssf.streaming. This
 * one is suitable for writing very large spreadsheets using low heap memory.
 * SXSSF keeps a portion of the workbook in memory, instead of keeping the whole
 * workbook. This portion is specified by a window size that indicates the
 * number of rows accessible from memory. The other rows are gradually flushed
 * into temporary files. In this way, SXSSF achieves its low memory footprint.
 * 
 * We can specify the window size in the constructor of SXSSFWorkbook. The
 * default window size is 100. When a new row is created using the sheet’s
 * createRow() method, the unflashed row with the lowest index value will be
 * flushed if the total number of unflushed rows exceeds the window size. The
 * flushed row is no longer accessible by using the getRow() method.
 * 
 * In the above example, a workbook of 500 rows has been created. Here, the
 * window size is set to 100. We are creating the rows sequentially starting
 * from index 0. When the 101st row is created, the 1st row (with index 0) is
 * removed from memory and flushed to a temporary file. Thus the 1st row will
 * not be available to access any longer. After the creation of 500 rows is
 * finished, only last 100 rows will be available to getRow(). So, a call of
 * getRow(0) and getRow(200) will return null. Meanwhile, a call of getRow(400)
 * will return a valid reference.
 * 
 * SXSSF uses temporary files to flush the sheet data. These files are not
 * cleaned up automatically. The workbook’s dispose() method should be used to
 * do the cleanup. The size of these temporary files can become very large if
 * the spreadsheet is very big. The workbook’s setCompressTempFiles() method
 * should be used in such cases. Thus temporary files will be created using GZIP
 * compression and disk storage will be saved.
 */
public class SXSSFExample {
	public static void main(String[] args) throws Exception {
		SXSSFWorkbook workbook = new SXSSFWorkbook(100);
		Sheet sheet = workbook.createSheet();
		for (int rownum = 0; rownum < 500; rownum++) {
			Row row = sheet.createRow(rownum);
			for (int cellnum = 0; cellnum < 10; cellnum++) {
				Cell cell = row.createCell(cellnum);
				cell.setCellValue((rownum + 1) + ", " + (cellnum + 1));
			}
		}

		System.out.println(sheet.getRow(0));
		System.out.println(sheet.getRow(200));
		System.out.println(sheet.getRow(400));

		final String FILE_NAME = "./sxssf_example.xlsx";
		FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
		workbook.write(outputStream);
		outputStream.close();
		workbook.dispose();
		workbook.close();
	}
}
