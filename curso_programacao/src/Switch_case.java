import java.util.Locale;
import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner ed = new Scanner(System.in);
		System.out.printf("Insira um n�mero para o dia da semana: ");
		int diaSemanaNumero = ed.nextInt();
		String diaSemana = null;
		switch (diaSemanaNumero) {
		case 1: 
			diaSemana = "Domingo";
			break;
		case 2:
			diaSemana = "Segunda-Feira";
			break;
		case 3:
			diaSemana = "Ter�a-Feira";
			break;
		case 4:
			diaSemana = "Quarta-Feira";
			break;
		case 5: 
			diaSemana = "Quinta-Feira";
			break;
		case 6: 
			diaSemana = "Sexta-Feira";
			break;
		case 7:
			diaSemana = "S�bado";
			break;
		default:
			diaSemana = "Valor inv�lido";
			break;
			
		}
		System.out.printf("Hoje �: %s", diaSemana);
		
		
	}

}
