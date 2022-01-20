import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
//		System.out.println("Olá mundo!");

//		String nome = "Rachid";
//		int idade = 25;
//		double renda = 1500.555;
//		System.out.printf("%s tem %d anos e %nganha R$ %.2f reais", nome, idade, renda);
//		char letra = '\u0061';
//		System.out.print(letra);
		int y = 25;
		double x = 10.35784;
		System.out.println(y);
		System.out.println("Bom dia");
		System.out.print(x);
		Locale.setDefault(Locale.US);
		System.out.printf("%n%.2f%n", x);
		System.out.printf("Resultado da soma de 25 e 10.35 é: %.4f", y + x);

	}

}
