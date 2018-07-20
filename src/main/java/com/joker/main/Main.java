package com.joker.main;

import java.util.List;

import com.joker.dto.CountryCurrency;
import com.joker.reader.ReaderType;
import com.joker.reader.factory.ReaderFactory;

public class Main {

	public static void main(String[] args) {
		List<CountryCurrency> list = ReaderFactory.getReader(ReaderType.CSV, "C:\\Users\\arunsingh\\workspace\\joker-reader\\src\\main\\resources\\Input.csv").read();
		
		System.out.println(list);
	}

}
