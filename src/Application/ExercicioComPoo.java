package Application;

import Entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioComPoo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ed = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Calcular Área do Triângulo A");
        System.out.printf("Insira um valor para o lado A: ");
        x.a = ed.nextDouble();
        System.out.printf("Insira um valor para o lado B: ");
        x.b = ed.nextDouble();
        System.out.printf("Insira um valor para o lado C: ");
        x.c = ed.nextDouble();

        double areaX = x.area();

        System.out.printf("%nArea do triângulo A é igual a %.4f%n", areaX);

        System.out.println("Calcular Área do Triângulo B");
        System.out.printf("Insira um valor para o lado A: ");
        y.a = ed.nextDouble();
        System.out.printf("Insira um valor para o lado B: ");
        y.b = ed.nextDouble();
        System.out.printf("Insira um valor para o lado C: ");
        y.c = ed.nextDouble();

        double areaY = y.area();

        System.out.printf("%nArea do triângulo A é igual a %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Triângulo A possui a área maior que o Triângulo B.");
        } else {
            System.out.println("Triângulo B possui a área maior que o Triângulo A.");
        }

        ed.close();
    }
}
