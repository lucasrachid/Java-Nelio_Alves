import java.util.Locale;
import java.util.Scanner;

public class exerc_estrutura_sequencial {

	public static void main(String[] args) {
		// Exerc�cio de Fixa��o.
//		String product1 = "Computer";
//		String product2 = "Office Desk";
//		
//		int age = 30;
//		int code = 5290;
//		char gender = 'F';
//		
//		double price1 = 2100.0;
//		double price2 = 650.50;
//		double measure = 53.234567;
//		System.out.println("Products:");
//		System.out.printf("%s, which price is $ %.2f", product1, price1);
//		System.out.printf("%n%s, which price is $ %.2f", product2, price2);
//		System.out.printf("%n%nRecord: %d years old, code %d and gender: %s", age, code, gender);
//		System.out.printf("%n%nMeasure with eight decimal places: %.8f", measure);
//		System.out.printf("%nRouded (three decimal places): %.3f", measure);
//		Locale.setDefault(Locale.US);
//		System.out.printf("%nUS decimal point: %.3f", measure);
		
		//Exerc�cio Estrutura Sequencial - 01 - Youtube
//		Locale.setDefault(Locale.US);
//		double largura, comprimento, valor;
//		Scanner entradaDeDados = new Scanner(System.in);
//		System.out.println("Qual a largura do terreno ? ");
//		largura = entradaDeDados.nextDouble();
//		System.out.println("Qual o comprimento do terreno ? ");
//		comprimento = entradaDeDados.nextDouble();
//		System.out.println("Qual o valor do metro quadrado ? ");
//		valor = entradaDeDados.nextDouble();
//		double area = largura * comprimento;
//		double valorTotal = area * valor;
//		System.out.printf("%nO seu terreno possui %.2f metros quadrados", area);
//		System.out.printf("%nO valor do seu terreno � de %.2f reais.", valorTotal);
//		entradaDeDados.close();		
			
		//Exerc�cio Estrutura Sequencial - 01 - PDF
//		int a, b;
//		Locale.setDefault(Locale.US);
//		Scanner ed = new Scanner(System.in); 
//		System.out.println("Diga o primeiro valor: ");
//		a = ed.nextInt();
//		System.out.println("Diga um segundo valor: ");
//		b = ed.nextInt();
//		int soma = a + b;
//		System.out.printf("%nA soma de %d e %d � igual a %d", a, b, soma);
		
		//Exerc�cio Estrutura Sequencial - 02 - PDF
//		Locale.setDefault(Locale.US);
//		Scanner ed = new Scanner(System.in); 
//		System.out.println("Qual o raio do c�rculo ? ");
//		double raio, area, tt;
//		raio = ed.nextDouble();
//		tt = 3.14159;
//		area = Math.pow(raio, 2) * tt;		
//		System.out.printf("%nA �rea do seu c�rculo �: %.4f", area);
		
		//Exerc�cio Estrutura Sequencial - 03 - PDF
//		Locale.setDefault(Locale.US);
//		Scanner ed = new Scanner(System.in); 
//		int a, b, c, d, diferenca;
//		System.out.println("Diga um valor para A: ");
//		a = ed.nextInt();
//		System.out.println("Diga um valor para B: ");
//		b = ed.nextInt();
//		System.out.println("Diga um valor para C: ");
//		c = ed.nextInt();
//		System.out.println("Diga um valor para D: ");
//		d = ed.nextInt();
//		diferenca = (a * b) - (c * d);
//		System.out.println("Diferenca: " + diferenca);
		
		//Exerc�cio Estrutura Sequencial - 04 - PDF
//		Locale.setDefault(Locale.US);
//		Scanner ed = new Scanner(System.in); 
//		int numeroFuncionario, horasTrabalhadas;
//		double valorHora;
//		System.out.println("Qual o n�mero do funcion�rio ? ");
//		numeroFuncionario = ed.nextInt();
//		System.out.println("Quantas horas trabalhadas ? ");
//		horasTrabalhadas = ed.nextInt();
//		System.out.println("Qual o valor da hora trabalhada ? ");
//		valorHora = ed.nextDouble();
//		double salario = horasTrabalhadas * valorHora;
//		System.out.printf("%nN�mero Funcion�rio: %d", numeroFuncionario);
//		System.out.printf("%nSal�rio Funcion�rio: U$ %.2f", salario);
		
		//Exerc�cio Estrutura Sequencial - 05 - PDF
//		Locale.setDefault(Locale.US);
//		Scanner ed = new Scanner(System.in);
//		int peca1, numeroPeca1, peca2, numeroPeca2; 
//		double valorUnit1, valorUnit2;
//		System.out.println("C�digo da Pe�a 01: ");
//		peca1 = ed.nextInt();
//		System.out.println("Numero de pe�as 01: ");
//		numeroPeca1 = ed.nextInt();
//		System.out.println("Valor Unit�rio pe�a 01: ");
//		valorUnit1 = ed.nextDouble();
//		System.out.println("C�digo da Pe�a 02: ");
//		peca2 = ed.nextInt();
//		System.out.println("Numero de pe�as 02: ");
//		numeroPeca2 = ed.nextInt();
//		System.out.println("Valor Unit�rio pe�a 02: ");
//		valorUnit2 = ed.nextDouble();
//		double valorAPagar = (numeroPeca1 * valorUnit1) + (numeroPeca2 * valorUnit2);
//		System.out.printf("%nVALOR A PAGAR: R$ %.2f", valorAPagar);
		
		//Exerc�cio Estrutura Sequencial - 06 - PDF
		Locale.setDefault(Locale.US);
		Scanner ed = new Scanner(System.in);
		System.out.println("Diga um valor para A: ");
		double a = ed.nextDouble();
		System.out.println("Diga um valor para B: ");
		double b = ed.nextDouble();
		System.out.println("Diga um valor para C: ");
		double c = ed.nextDouble();
		double triangulo = (a * c) / 2; 
		double circulo = 3.14159 * Math.pow(c, 2);
		double trapezio = ((a + b) * c) / 2;
		double quadrado = b *b;
		double retangulo = a * b;
		System.out.printf("%nTRIANGULO: %.4f", triangulo);
		System.out.printf("%nCIRCULO: %.4f", circulo);
		System.out.printf("%nTRAPEZIO: %.4f", trapezio);
		System.out.printf("%nQUADRADO: %.4f", quadrado);
		System.out.printf("%nRETANGULO: %.4f", retangulo);
		
	}

}
