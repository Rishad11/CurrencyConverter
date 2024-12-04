module Provider {
    requires Service;
    provides org.example.service.CurrencyConverter with org.example.provider.USDConverter, org.example.provider.SEKConverter;
}
