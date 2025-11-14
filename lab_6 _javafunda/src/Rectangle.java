import java.util.Scanner;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }
    public double CalculateArea() {
        return width * height;
    }
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10.0, 9.0);

        double area = rect.CalculateArea();
        System.out.println("The area of the rectangle is: " + area);

    }
}
