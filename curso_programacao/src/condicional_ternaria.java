import java.util.Locale;
import java.util.Scanner;

public class condicional_ternaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner ed = new Scanner(System.in);
		System.out.printf("Insira um valor: ");
		double numero_01 = ed.nextDouble();
		System.out.printf("Insira outro valor: ");
		double numero_02 = ed.nextDouble();
		double valor = (numero_01 > numero_02) ? numero_01 : numero_02;
		System.out.printf("O valor maior é: %.2f", valor);

	}

}
