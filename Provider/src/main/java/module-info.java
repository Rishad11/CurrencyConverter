import org.example.Provider.GBPConverter;
import org.example.Provider.SEKConverter;
import org.example.Provider.USDConverter;
import org.example.service.CurrencyConverter;

module org.example.Provider {
    requires Service;
    provides CurrencyConverter with USDConverter, SEKConverter, GBPConverter;
}