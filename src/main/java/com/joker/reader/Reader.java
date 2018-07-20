package com.joker.reader;

import java.util.List;

import com.joker.dto.CountryCurrency;

public interface Reader {
	List<CountryCurrency> read();
}
