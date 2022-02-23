package Application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSemPoo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ed = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;
        System.out.println("Calcular Área do Triângulo A");
        System.out.printf("Insira um valor para o lado A: ");
        xA = ed.nextDouble();
        System.out.printf("Insira um valor para o lado B: ");
        xB = ed.nextDouble();
        System.out.printf("Insira um valor para o lado C: ");
        xC = ed.nextDouble();
        double p = (xA + xB + xC) / 2;
        double area = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        System.out.printf("%nArea do triângulo A é igual a %.4f%n", area);

        System.out.println("Calcular Área do Triângulo B");
        System.out.printf("Insira um valor para o lado A: ");
        yA = ed.nextDouble();
        System.out.printf("Insira um valor para o lado B: ");
        yB = ed.nextDouble();
        System.out.printf("Insira um valor para o lado C: ");
        yC = ed.nextDouble();
        double p2 = (yA + yB + yC) / 2;
        double area2 = Math.sqrt(p2 * (p2 - yA) * (p2 - yB) * (p2 - yC));
        System.out.printf("%nArea do triângulo A é igual a %.4f%n", area2);

        if (area > area2) {
            System.out.println("Triângulo A possui a área maior que o Triângulo B.");
        } else {
            System.out.println("Triângulo B possui a área maior que o Triângulo A.");
        }

        ed.close();
    }
}