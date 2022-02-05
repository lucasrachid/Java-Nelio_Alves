import java.util.Scanner;
import java.util.Locale;


public class Funcoes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ed = new Scanner(System.in);
        System.out.println("Insira três valores inteiros.");
        int valor01, valor02, valor03;
        System.out.printf("Valor 01: ");
        valor01 = ed.nextInt();
        System.out.printf("Valor 02: ");
        valor02 = ed.nextInt();
        System.out.printf("Valor 03: ");
        valor03 = ed.nextInt();
        int maiorValor = max(valor01, valor02, valor03);
        showResult(maiorValor);

        ed.close();

    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if ( y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int valor) {
        System.out.println("O Maior valor é: " + valor);
    }
}
