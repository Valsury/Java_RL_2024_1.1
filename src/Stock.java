public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    // Конструктор, создающий акции с указанными обозначением и наименованием
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    // Метод для получения процента изменения стоимости акций
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    // Методы для установки и получения previousClosingPrice и currentPrice
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
}
