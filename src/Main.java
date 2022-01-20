//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Locale;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int y = 25;
        double x = 10.35784D;
        System.out.println(y);
        System.out.println("Bom dia");
        System.out.print(x);
        Locale.setDefault(Locale.US);
        System.out.printf("%n%.2f%n", x);
        System.out.printf("Resultado da soma de 25 e 10.35 é: %.4f", (double)y + x);
    }
}
