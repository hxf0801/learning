package com.shu.example.study.excel.io;

import java.io.IOException;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;

import com.jcabi.log.Logger;
import com.vgv.excel.io.XsProps;
import com.vgv.excel.io.XsRow;
import com.vgv.excel.io.XsSheet;
import com.vgv.excel.io.XsStyle;
import com.vgv.excel.io.XsWorkbook;
import com.vgv.excel.io.cells.FormulaCell;
import com.vgv.excel.io.cells.NumberCells;
import com.vgv.excel.io.cells.TextCells;
import com.vgv.excel.io.props.row.Height;
import com.vgv.excel.io.styles.FillPattern;
import com.vgv.excel.io.styles.ForegroundColor;

public class ExcelIOSaveFile 
{
	public static void main(String[] args)
    {
		try {
			new XsWorkbook(new XsSheet(
					new XsRow().with(new TextCells("name", "email", "salary", "bonus", "total"))
							.with(new XsStyle(new ForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex()),
									new FillPattern(FillPatternType.SOLID_FOREGROUND))),
					new XsRow().with(new TextCells("Steve Hook", "steve.hook@gmail.com"))
							.with(new NumberCells(160000.0, 35337.6))
							.with(new FormulaCell("SUM(C3:D3)")
									.with(new XsStyle(new ForegroundColor(IndexedColors.RED.getIndex()),
											new FillPattern(FillPatternType.SOLID_FOREGROUND))))
							.with(new XsProps<>(new Height((short) 500))))).saveTo("Test.xlsx");
		} catch (IOException e) {
			e.printStackTrace();
			Logger.error(e, "excel-io save error");
		}
    }
}
