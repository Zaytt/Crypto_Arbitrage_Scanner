package services;

import org.knowm.xchange.currency.CurrencyPair;

import java.io.IOException;

public class ServiceTest {

    public static void main(String[] args) throws IOException {
        ExchangeService exchangeService = new ExchangeService();
        exchangeService.ScanHighLowExchanges();
        System.out.println("Highest Priced Exchange: " +
                exchangeService.getHighestExchange().getExchangeSpecification().getExchangeName() +
                " - BTC/USD price: " + exchangeService.getHighestExchange().getMarketDataService().getTicker(CurrencyPair.BTC_USD).getLast());
        System.out.println("Lowest Priced Exchange: " +
                exchangeService.getLowestExchange().getExchangeSpecification().getExchangeName() +
                " - BTC/USD price: " + exchangeService.getLowestExchange().getMarketDataService().getTicker(CurrencyPair.BTC_USD).getLast());
    }
}
