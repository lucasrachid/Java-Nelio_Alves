import java.util.Locale;
import java.util.Scanner;

public class ProblemaSemPoo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ed = new Scanner(System.in);

        // Triângulo A
        double a, b, c;
        System.out.printf("Insira um valor para o lado A: ");
        a = ed.nextDouble();
        System.out.printf("Insira um valor para o lado B: ");
        b = ed.nextDouble();
        System.out.printf("Insira um valor para o lado C: ");
        c = ed.nextDouble();
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("%nArea do triângulo é igual a %.4f%n", area);

        // Triângulo B
        double d, e, f;
        System.out.printf("%nInsira um valor para o lado D: ");
        d = ed.nextDouble();
        System.out.printf("Insira um valor para o lado E: ");
        e = ed.nextDouble();
        System.out.printf("Insira um valor para o lado F: ");
        f = ed.nextDouble();
        double p2 = (d + e + f) / 2;
        double area2 = Math.sqrt(p2 * (p2 - d) * (p2 - e) * (p2 - f));
        System.out.printf("%nArea do triângulo é igual a %.4f", area2);

    }
}
