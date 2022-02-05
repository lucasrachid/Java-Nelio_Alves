import java.util.Scanner;
import java.util.Locale;

public class DoWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ed = new Scanner(System.in);

        char opcao;
         do {
             System.out.printf("Digite a temperatura em Celsius: ");
             double temperatura = ed.nextDouble();
             double fahrenheit = (temperatura * 1.8) + 32;
             System.out.printf("%.2f Celsius equivalem a %.2f Fahrenheit", temperatura, fahrenheit);
             System.out.printf("%nDeseja repetir (s/n) ? ");
             opcao = ed.next().charAt(0);

         } while (opcao != 'n');


         ed.close();

    }
}
