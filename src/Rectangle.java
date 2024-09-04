public class Rectangle {
    private double width = -1;
    private double height = -1;

    // Безаргументный конструктор
    public Rectangle() {
    }

    // Конструктор с указанными шириной и высотой
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Метод для вычисления площади
    public double getArea() {
        return width * height;
    }

    // Метод для вычисления периметра
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Методы для получения ширины и высоты
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
