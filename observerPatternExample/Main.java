package observerPatternExample;
public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobile1 = new MobileApp("Investor1");
        Observer web1 = new WebApp("Dashboard1");

        stockMarket.registerObserver(mobile1);
        stockMarket.registerObserver(web1);

        stockMarket.setStockPrice(101.5);
        stockMarket.setStockPrice(105.0);

        stockMarket.removeObserver(mobile1);
        stockMarket.setStockPrice(110.75);
    }
}
