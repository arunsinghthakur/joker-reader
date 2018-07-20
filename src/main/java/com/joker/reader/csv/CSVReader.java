package com.joker.reader.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.joker.dto.CountryCurrency;
import com.joker.reader.AbstractReader;

public class CSVReader extends AbstractReader {

	public CSVReader(String url) {
		super(url);
	}

	@Override
	public List<CountryCurrency> read() {
		List<CountryCurrency> countryCurrencies = null;
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			countryCurrencies = new ArrayList<>();
			String line = null;
			int count = 0;
			while ((line = br.readLine()) != null) {
				if (count > 0) {
					String[] token = line.split(",");
					countryCurrencies.add(mapToCountryCurrency(token));
				}
				++count;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return countryCurrencies;
	}

}
