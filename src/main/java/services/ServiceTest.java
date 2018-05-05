package services;

import org.knowm.xchange.currency.CurrencyPair;

import java.io.IOException;

public class ServiceTest {

    public static void main(String[] args) throws IOException {


        ArbitrageScanner arbitrageScanner = new ArbitrageScanner();
        arbitrageScanner.getBestArbitrageExchangesForPair(arbitrageScanner.getDefaultExchangeList(), CurrencyPair.ETH_BTC);

    }
}
