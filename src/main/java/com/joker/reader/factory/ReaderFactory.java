package com.joker.reader.factory;

import com.joker.reader.Reader;
import com.joker.reader.ReaderType;
import com.joker.reader.csv.CSVReader;

public class ReaderFactory {

	private ReaderFactory() {
	}

	public static Reader getReader(ReaderType readerType, String filePath) {
		switch (readerType) {
		case CSV:
			return new CSVReader(filePath);
		case XML:
			throw new IllegalArgumentException("Not done");
		default:
			throw new IllegalArgumentException("Not done");
		}
	}
}
