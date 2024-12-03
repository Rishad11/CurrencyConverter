package org.example.Consumer;

import org.example.service.CurrencyConverter;

import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<CurrencyConverter> loader = ServiceLoader.load(CurrencyConverter.class);

        System.out.println("Available Currency Converters:");
        int index = 1;
        for (CurrencyConverter converter : loader) {
            System.out.println(index++ + ". " + converter.getBaseCurrency());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a base currency by number: ");
        int choice = scanner.nextInt();

        CurrencyConverter selectedConverter = loader.stream()
                .skip(choice - 1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid choice"))
                .get();

        System.out.printf("Selected base currency: %s%n", selectedConverter.getBaseCurrency());
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        System.out.print("To currency (e.g., USD, GBP, SEK): ");
        String toCurrency = scanner.next();

        try {
            double result = selectedConverter.convertTo(toCurrency, amount);
            System.out.printf("Converted amount: %.2f %s%n", result, toCurrency);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
