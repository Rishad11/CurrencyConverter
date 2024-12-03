package org.example.service;

public interface CurrencyConverter {
    double convertTo(String toCurrency, double amount);
    String getBaseCurrency();
}
