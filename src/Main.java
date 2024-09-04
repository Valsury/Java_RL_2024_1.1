import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Height: " + rectangle1.getHeight());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        System.out.println("\nRectangle 2:");
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Height: " + rectangle2.getHeight());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());

        System.out.println("\n");
        Stock stock = new Stock("SBER", "ПАО Сбербанк");
        stock.setPreviousClosingPrice(281.50);
        stock.setCurrentPrice(282.87);
        System.out.printf("Процент изменения стоимости акций: %.2f%%\n", stock.getChangePercent());

        System.out.println("\n");
        long[] elapsedTimes = {
                10000,
                100000,
                1000000,
                10000000,
                100000000,
                1000000000,
                10000000000L,
                100000000000L
        };

        for (long elapsedTime : elapsedTimes) {
            Date date = new Date(elapsedTime);
            System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
            System.out.println("Date: " + date.toString());
            System.out.println();
        }
    }
}