import org.example.service.CurrencyConverter;

module Consumer {
    requires Service;
    uses CurrencyConverter;
}