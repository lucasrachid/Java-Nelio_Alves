package Application;

import Entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class RectangleExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ed = new Scanner(System.in);

        Rectangle rectangle;
        rectangle = new Rectangle();

        System.out.printf("Diga um valor para a Base do retângulo: ");
        rectangle.width = ed.nextDouble();
        System.out.printf("Diga um valor para a Altura do retângulo: ");
        rectangle.height = ed.nextDouble();

        System.out.println("AREA = " + rectangle.area());
        System.out.println("PERIMETER = " + rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f", rectangle.diagonal());

        ed.close();

    }
}
