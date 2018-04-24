package services;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.anx.v2.ANXExchange;
import org.knowm.xchange.binance.BinanceExchange;
import org.knowm.xchange.binance.dto.BinanceException;
import org.knowm.xchange.bitbay.BitbayExchange;
import org.knowm.xchange.bitcointoyou.BitcointoyouExchange;
import org.knowm.xchange.bitfinex.v1.BitfinexExchange;
import org.knowm.xchange.bitstamp.BitstampExchange;
import org.knowm.xchange.bittrex.BittrexExchange;
import org.knowm.xchange.bleutrade.BleutradeExchange;
import org.knowm.xchange.btcchina.BTCChinaExchange;
import org.knowm.xchange.bter.BTERExchange;
import org.knowm.xchange.campbx.CampBXExchange;
import org.knowm.xchange.cexio.CexIOExchange;
import org.knowm.xchange.clevercoin.CleverCoinExchange;
import org.knowm.xchange.coinbase.CoinbaseExchange;
import org.knowm.xchange.coinfloor.CoinfloorExchange;
import org.knowm.xchange.coinmate.CoinmateExchange;
import org.knowm.xchange.coinsetter.CoinsetterExchange;
import org.knowm.xchange.cointrader.CointraderExchange;
import org.knowm.xchange.cryptofacilities.CryptoFacilitiesExchange;
import org.knowm.xchange.cryptsy.CryptsyExchange;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.dsx.DSXExchange;
import org.knowm.xchange.dto.marketdata.Ticker;
import org.knowm.xchange.empoex.EmpoExExchange;
import org.knowm.xchange.gatecoin.GatecoinExchange;
import org.knowm.xchange.gdax.GDAXExchange;
import org.knowm.xchange.hitbtc.v2.HitbtcExchange;
import org.knowm.xchange.huobi.HuobiExchange;
import org.knowm.xchange.independentreserve.IndependentReserveExchange;
import org.knowm.xchange.itbit.v1.ItBitExchange;
import org.knowm.xchange.kraken.KrakenExchange;
import org.knowm.xchange.kucoin.KucoinExchange;
import org.knowm.xchange.loyalbit.LoyalbitExchange;
import org.knowm.xchange.mercadobitcoin.MercadoBitcoinExchange;
import org.knowm.xchange.mexbt.MeXBTExchange;
import org.knowm.xchange.okcoin.OkCoinExchange;
import org.knowm.xchange.poloniex.PoloniexExchange;
import org.knowm.xchange.quoine.QuoineExchange;
import org.knowm.xchange.ripple.RippleExchange;
import org.knowm.xchange.service.marketdata.MarketDataService;
import org.knowm.xchange.taurus.TaurusExchange;
import org.knowm.xchange.therock.TheRockExchange;
import org.knowm.xchange.vircurex.VircurexExchange;

import java.io.IOException;
import java.util.ArrayList;

public class ExchangeService {

    ArrayList<Exchange> exchangesList;
    Exchange highestExchange;
    Exchange lowestExchange;

    public ExchangeService() {
        exchangesList = new ArrayList<Exchange>();

        Exchange anxv2          = ExchangeFactory.INSTANCE.createExchange(ANXExchange.class.getName());
        Exchange binance        = ExchangeFactory.INSTANCE.createExchange(BinanceExchange.class.getName());
        Exchange bitbay         = ExchangeFactory.INSTANCE.createExchange(BitbayExchange.class.getName());
        //Exchange bitcointoyou   = ExchangeFactory.INSTANCE.createExchange(BitcointoyouExchange.class.getName());
        Exchange bitfinex       = ExchangeFactory.INSTANCE.createExchange(BitfinexExchange.class.getName());
        Exchange bitstamp       = ExchangeFactory.INSTANCE.createExchange(BitstampExchange.class.getName());
        Exchange bittrex        = ExchangeFactory.INSTANCE.createExchange(BittrexExchange.class.getName());
        Exchange bleutrade      = ExchangeFactory.INSTANCE.createExchange(BleutradeExchange.class.getName());
        Exchange btcchina       = ExchangeFactory.INSTANCE.createExchange(BTCChinaExchange.class.getName());
        //Exchange bter           = ExchangeFactory.INSTANCE.createExchange(BTERExchange.class.getName());
        Exchange campbx         = ExchangeFactory.INSTANCE.createExchange(CampBXExchange.class.getName());
        Exchange cexio          = ExchangeFactory.INSTANCE.createExchange(CexIOExchange.class.getName());
        //Exchange clevercoin     = ExchangeFactory.INSTANCE.createExchange(CleverCoinExchange.class.getName());
        Exchange coinbase       = ExchangeFactory.INSTANCE.createExchange(CoinbaseExchange.class.getName());
        Exchange coinfloor      = ExchangeFactory.INSTANCE.createExchange(CoinfloorExchange.class.getName());
        Exchange coinmate       = ExchangeFactory.INSTANCE.createExchange(CoinmateExchange.class.getName());
        //Exchange coinsetter     = ExchangeFactory.INSTANCE.createExchange(CoinsetterExchange.class.getName());
        //Exchange cointrader     = ExchangeFactory.INSTANCE.createExchange(CointraderExchange.class.getName());
        Exchange cryptofacilities = ExchangeFactory.INSTANCE.createExchange(CryptoFacilitiesExchange.class.getName());
        //Exchange cryptsy        = ExchangeFactory.INSTANCE.createExchange(CryptsyExchange.class.getName());
        Exchange dsx            = ExchangeFactory.INSTANCE.createExchange(DSXExchange.class.getName());
        Exchange empoex         = ExchangeFactory.INSTANCE.createExchange(EmpoExExchange.class.getName());
        Exchange gatecoin       = ExchangeFactory.INSTANCE.createExchange(GatecoinExchange.class.getName());
        Exchange gdax           = ExchangeFactory.INSTANCE.createExchange(GDAXExchange.class.getName());
        Exchange hitbtc         = ExchangeFactory.INSTANCE.createExchange(HitbtcExchange.class.getName());
        Exchange huobi          = ExchangeFactory.INSTANCE.createExchange(HuobiExchange.class.getName());
        Exchange independentreserve = ExchangeFactory.INSTANCE.createExchange(IndependentReserveExchange.class.getName());
        Exchange itbit          = ExchangeFactory.INSTANCE.createExchange(ItBitExchange.class.getName());
        Exchange kraken         = ExchangeFactory.INSTANCE.createExchange(KrakenExchange.class.getName());
        Exchange kucoin         = ExchangeFactory.INSTANCE.createExchange(KucoinExchange.class.getName());
        Exchange loyalbit       = ExchangeFactory.INSTANCE.createExchange(LoyalbitExchange.class.getName());
        Exchange mercadobitcoin = ExchangeFactory.INSTANCE.createExchange(MercadoBitcoinExchange.class.getName());
        //Exchange mexbt          = ExchangeFactory.INSTANCE.createExchange(MeXBTExchange.class.getName());
        Exchange okcoin         = ExchangeFactory.INSTANCE.createExchange(OkCoinExchange.class.getName());
        Exchange poloniex       = ExchangeFactory.INSTANCE.createExchange(PoloniexExchange.class.getName());
        Exchange quoine         = ExchangeFactory.INSTANCE.createExchange(QuoineExchange.class.getName());
        Exchange ripple         = ExchangeFactory.INSTANCE.createExchange(RippleExchange.class.getName());
        Exchange taurus         = ExchangeFactory.INSTANCE.createExchange(TaurusExchange.class.getName());
        Exchange therock        = ExchangeFactory.INSTANCE.createExchange(TheRockExchange.class.getName());
        Exchange vircurex       = ExchangeFactory.INSTANCE.createExchange(VircurexExchange.class.getName());

        exchangesList.add(anxv2);
        exchangesList.add(binance);
        exchangesList.add(bitbay);
        //exchangesList.add(bitcointoyou);
        exchangesList.add(bitfinex);
        exchangesList.add(bitstamp);
        exchangesList.add(bittrex);
        exchangesList.add(bleutrade);
        exchangesList.add(btcchina);
        //exchangesList.add(bter);
        exchangesList.add(campbx);
        exchangesList.add(cexio);
        //exchangesList.add(clevercoin);
        exchangesList.add(coinbase);
        exchangesList.add(coinfloor);
        exchangesList.add(coinmate);
        //exchangesList.add(coinsetter);
        //exchangesList.add(cointrader);
        exchangesList.add(cryptofacilities);
        //exchangesList.add(cryptsy);
        exchangesList.add(dsx);
        exchangesList.add(empoex);
        exchangesList.add(gatecoin);
        exchangesList.add(gdax);
        exchangesList.add(hitbtc);
        exchangesList.add(huobi);
        exchangesList.add(independentreserve);
        exchangesList.add(itbit);
        exchangesList.add(kraken);
        exchangesList.add(kucoin);
        exchangesList.add(loyalbit);
        exchangesList.add(mercadobitcoin);
        //exchangesList.add(mexbt);
        exchangesList.add(okcoin);
        exchangesList.add(poloniex);
        exchangesList.add(quoine);
        exchangesList.add(ripple);
        exchangesList.add(taurus);
        exchangesList.add(therock);
        exchangesList.add(vircurex);


    }

    public void ScanHighLowExchanges() throws IOException {

        MarketDataService marketDataService;
        this.lowestExchange     = null;
        this.highestExchange    = null;
        Ticker currentTicker    = null;
        Ticker lowestTicker     = null;
        Ticker highestTicker    = null;

        for (Exchange ex: exchangesList) {
            System.out.print("Scanning " + ex.getExchangeSpecification().getExchangeName() + " . . . ");
            try {
                marketDataService = ex.getMarketDataService();
                currentTicker = marketDataService.getTicker(CurrencyPair.BTC_USD);
                System.out.println(currentTicker.getLast());
                if(highestExchange == null && lowestExchange == null){
                    lowestExchange  = ex;
                    highestExchange = ex;
                    lowestTicker    = currentTicker;
                    highestTicker   = currentTicker;
                } else {
                    if (currentTicker.getLast().compareTo(highestTicker.getLast()) == 1){
                        highestTicker = currentTicker;
                        highestExchange = ex;
                    } else if (currentTicker.getLast().compareTo(lowestTicker.getLast()) == -1){
                        lowestTicker = currentTicker;
                        lowestExchange = ex;
                    }
                }
            } catch (Exception e) {
                System.out.println("N/A");
                continue;
            }
        }
    }

    public Exchange getHighestExchange() {
        return highestExchange;
    }

    public void setHighestExchange(Exchange highestExchange) {
        this.highestExchange = highestExchange;
    }

    public Exchange getLowestExchange() {
        return lowestExchange;
    }

    public void setLowestExchange(Exchange lowestExchange) {
        this.lowestExchange = lowestExchange;
    }
}
