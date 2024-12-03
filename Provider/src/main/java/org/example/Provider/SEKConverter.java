package org.example.Provider;

import org.example.service.CurrencyConverter;

public class SEKConverter implements CurrencyConverter {
    @Override
    public double convertTo(String toCurrency, double amount) {
        switch (toCurrency.toUpperCase()) {
            case "USD":
                return amount * 0.095; // SEK -> USD
            case "GBP":
                return amount * 0.072; // SEK -> GBP
            default:
                throw new IllegalArgumentException("Unsupported currency: " + toCurrency);
        }
    }

    @Override
    public String getBaseCurrency() {
        return "SEK";
    }
}
