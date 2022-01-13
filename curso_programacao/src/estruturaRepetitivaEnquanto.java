import java.util.Locale;
import java.util.Scanner;

public class estruturaRepetitivaEnquanto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner ed = new Scanner(System.in);

		//Exercício Estrutura Repetitiva (While) - 01 - PDF
		System.out.printf("Crie uma senha: ");
		int senha = ed.nextInt();
		System.out.printf("Insira sua senha de acesso: ");
		int senha_02 = ed.nextInt();
		if (senha == senha_02) {
			System.out.println("Acesso Permitido.");
		} else {
			while (senha != senha_02) {
				System.out.println("Senha Inválida");
				System.out.printf("Insira novamente sua senha de acesso: ");
				senha_02 = ed.nextInt();
			}
			System.out.println("Acesso Permitido.");
		}
		
		
		
		
		
		
		
		
		
		
		
		ed.close();

	}

}
