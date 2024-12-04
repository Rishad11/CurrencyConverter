package org.example.provider;

import org.example.service.CurrencyConverter;

public class USDConverter implements CurrencyConverter {
    @Override
    public double convertTo(String toCurrency, double amount) {
        switch (toCurrency.toUpperCase()) {
            case "GBP":
                return amount * 0.75; // USD -> GBP
            case "SEK":
                return amount * 10.5; // USD -> SEK
            default:
                throw new IllegalArgumentException("Unsupported currency: " + toCurrency);
        }
    }

    @Override
    public String getBaseCurrency() {
        return "USD";
    }
}
