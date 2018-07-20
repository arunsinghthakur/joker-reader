package com.joker.dto;

public class CountryCurrency {

	private String countryName;
	private String currency;
	private long amount;

	private CountryCurrency() {
	}

	public String getCountryName() {
		return countryName;
	}

	public String getCurrency() {
		return currency;
	}

	public long getAmount() {
		return amount;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		private CountryCurrency countryCurrency = new CountryCurrency();

		public Builder country(String countryName) {
			countryCurrency.countryName = countryName;
			return this;
		}

		public Builder currency(String currency) {
			countryCurrency.currency = currency;
			return this;
		}

		public Builder amount(long amount) {
			countryCurrency.amount = amount;
			return this;
		}

		public CountryCurrency build() {
			return countryCurrency;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder2 = new StringBuilder();
		builder2.append("CountryCurrency [countryName=");
		builder2.append(countryName);
		builder2.append(", currency=");
		builder2.append(currency);
		builder2.append(", amount=");
		builder2.append(amount);
		builder2.append("]");
		return builder2.toString();
	}

}
