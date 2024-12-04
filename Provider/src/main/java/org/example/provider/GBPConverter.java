package org.example.provider;

import org.example.service.CurrencyConverter;

public class GBPConverter implements CurrencyConverter {
    @Override
    public double convertTo(String toCurrency, double amount) {
        switch (toCurrency.toUpperCase()) {
            case "USD":
                return amount * 1.33; // GBP -> USD
            case "SEK":
                return amount * 14.0; // GBP -> SEK
            default:
                throw new IllegalArgumentException("Unsupported currency: " + toCurrency);
        }
    }

    @Override
    public String getBaseCurrency() {
        return "GBP";
    }
}
