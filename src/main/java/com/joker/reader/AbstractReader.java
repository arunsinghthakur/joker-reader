package com.joker.reader;

import java.io.File;

import com.joker.dto.CountryCurrency;

public abstract class AbstractReader implements Reader {
	protected File file;

	public AbstractReader(String url) {
		if (null == url) {
			throw new IllegalArgumentException("Wrong file path" + url);
		}
		file = new File(url);
	}

	protected CountryCurrency mapToCountryCurrency(String[] token) {
		return CountryCurrency.builder().country(token[0]).currency(token[1]).amount(Long.parseLong(token[2])).build();
	}
}
