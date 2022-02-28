package Entities;

public class Value {
    public double number;
    public static double pi = 3.14159;

    public double circumference() {
        return 2 * 3.14 * number;
    }

    public double volume() {
        return 4 * 3.14 * (Math.pow(number, 3)) / 3;
    }
}
