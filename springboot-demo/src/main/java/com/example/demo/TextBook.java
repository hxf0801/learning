package com.example.demo;

import java.util.Map;

public class TextBook implements Book {
	
	private Map<String, String> map;

	@Override
	public String getType() {
		return "TextBook" + map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

}
