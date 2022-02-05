import java.util.Locale;
import java.util.Scanner;


public class Exerc_estrutura_condicional {

    public static void main(String[] args) {

        //Exerc�cio Estrutura Condicional - 01 - Youtube
//		Locale.setDefault(Locale.US);
//		Scanner ed = new Scanner(System.in);
//		double semestre_01, semestre_02;
//		System.out.println("Qual foi a sua nota no primeiro semestre ?");
//		semestre_01 = ed.nextDouble();
//		System.out.println("Qual foi a sua nota no segundo semestre ?");
//		semestre_02 = ed.nextDouble();
//		double soma = semestre_01 + semestre_02;
//		if (soma < 60) {
//			System.out.printf("%nA sua nota anual � de: %.2f%n", soma);
//			System.out.println("Infelizmente voc� est� Reprovado.");
//		} else {
//			System.out.printf("%nA sua nota anual � de: %.2f%n", soma);
//			System.out.println("Felizmente voc� est� Aprovado.");
//		}
//		ed.close();

        //Exerc�cio Estrutura Condicional - 02 - Youtube
//		Locale.setDefault(Locale.US);
//		Scanner ed = new Scanner(System.in);
//		System.out.println("Diga um valor para A: ");
//		double a = ed.nextDouble();
//		System.out.println("Diga um valor para B: ");
//		double b = ed.nextDouble();
//		System.out.println("Diga um valor para C: ");
//		double c = ed.nextDouble();
//		double delta = Math.pow(b, 2) - (4 * a * c);
//		if (a == 0 || delta < 0.0) {
//			System.out.println("Imposs�vel calcular.");
//		} else {
//			double baskhara_01 = (-b + Math.sqrt(delta)) / (2 * a);
//			double baskhara_02 = (-b - Math.sqrt(delta)) / (2 * a);
//			System.out.printf("%nR1 = %.5f", baskhara_01);
//			System.out.printf("%nR2 = %.5f", baskhara_02);
//		}
//		ed.close();


        //Exerc�cio Estrutura Condicional - 03 - Youtube
//		Locale.setDefault(Locale.US);
//		Scanner ed = new Scanner(System.in);
//		int a, b, c;
//		System.out.println("Diga um valor para A: ");
//		a = ed.nextInt();
//		System.out.println("Diga um valor para B: ");
//		b = ed.nextInt();
//		System.out.println("Diga um valor para C: ");
//		c = ed.nextInt();
//		if (a < b && a < c) {
//			System.out.println("MENOR = " + a);
//		} else if (b < c) {
//			System.out.println("MENOR = " + b);
//		} else {
//			System.out.println("MENOR = " + c);
//		}
//		ed.close();


        //Exerc�cio Estrutura Condicional - 01 - PDF
//		Locale.setDefault(Locale.US);
//		Scanner ed = new Scanner(System.in);
//		System.out.println("Diga um n�mero: ");
//		double number = ed.nextDouble();
//		if (number < 0) {
//			System.out.println("NEGATIVO");
//		} else {
//			System.out.println("N�O NEGATIVO");
//		}

        //Exerc�cio Estrutura Condicional - 02 - PDF
//		Locale.setDefault(Locale.US);
//		Scanner ed = new Scanner(System.in);
//		System.out.println("Diga um valor: ");
//		int number = ed.nextInt();
//		if (number % 2 == 0) {
//			System.out.println("PAR");
//		} else {
//			System.out.println("�MPAR");
//		}


        //Exerc�cio Estrutura Condicional - 03 - PDF
//		Locale.setDefault(Locale.US);
//		Scanner ed = new Scanner(System.in);
//		System.out.println("Diga um valor para A: ");
//		int a = ed.nextInt();
//		System.out.println("Diga um valor para B: ");
//		int b = ed.nextInt();
//		if (a % b == 0 || b % a == 0) {
//			System.out.println("S�o Multiplos");
//		} else {
//			System.out.println("N�o s�o multiplos");
//		}

        //Exerc�cio Estrutura Condicional - 04 - PDF
//		Locale.setDefault(Locale.US);
//		Scanner ed = new Scanner(System.in);
//		int inicio, fim, duracao;
//		System.out.println("Que horas iniciou o jogo ? ");
//		inicio = ed.nextInt();
//		System.out.println("Que horas acabou o jogo ? ");
//		fim = ed.nextInt();
//		if (inicio < fim) {
//			duracao = fim - inicio;
//		} else {
//			duracao = 24 - inicio + fim;
//		}
//		System.out.println("O jogo teve a dura��o de " + duracao + " horas.");


//		//Exerc�cio Estrutura Condicional - 05 - PDF
//		Locale.setDefault(Locale.US);
//		Scanner ed = new Scanner(System.in);
//		System.out.println("C�digo\t Descri��o\t\t Valor");
//		System.out.println("  1\t Cachorro Quente\t R$ 4.00");
//		System.out.println("  2\t X-Salada       \t R$ 4.50");
//		System.out.println("  3\t X-Bacon        \t R$ 5.00");
//		System.out.println("  4\t Torrada Simples\t R$ 2.00");
//		System.out.println("  5\t Refrigerante   \t R$ 1.50");
//		System.out.printf("%nInsira o c�digo do seu pedido: ");
//		int codigo, quantidade;
//		double valor;
//		codigo = ed.nextInt();
//		System.out.printf("Qual a quantidade ? ");
//		quantidade = ed.nextInt();
//		if (codigo == 1) {
//			double total = 4.00 * quantidade;
//			System.out.printf("O seu pedido foi de %d Cachorro quente(s)", quantidade);
//			System.out.println("Totalizando " +  total + " reais");
//		} else if (codigo == 2) {
//			double total = 4.50 * quantidade;
//			System.out.printf("O seu pedido foi de %d X-Salada(s)", quantidade);
//			System.out.println("Totalizando " +  total + " reais");
//		} else if (codigo == 3) {
//			double total = 5.00 * quantidade;
//			System.out.printf("O seu pedido foi de %d X-Bacon(s)", quantidade);
//			System.out.println("Totalizando " +  total + " reais");
//		} else if (codigo == 4) {
//			double total = 2.0 * quantidade;
//			System.out.printf("O seu pedido foi de %d Torrada(s) Simples", quantidade);
//			System.out.println("Totalizando " +  total + " reais");
//		} else if (codigo == 5) {
//			double total = 1.50 * quantidade;
//			System.out.printf("O seu pedido foi de %d Refrigerante(s)", quantidade);
//			System.out.printf("%nTotalizando %.2f reais",  total);
//		} else {
//			System.out.println("C�digo do pedido inv�lido.");
//		}
//
//		ed.close();

        //Exerc�cio Estrutura Condicional - 06 - PDF
//		Locale.setDefault(Locale.US);
//		Scanner ed = new Scanner(System.in);
//		System.out.printf("Diga um valor: ");
//		double valor = ed.nextDouble();
//		if (valor >= 0 && valor <= 25) {
//			System.out.println("Intervalo (0,25]");
//		} else if (valor > 25 && valor <= 50) {
//			System.out.println("Intervalo (25,50]");
//		} else if (valor > 50 && valor <= 75) {
//			System.out.println("Intervalo (50,75]");
//		} else if (valor > 75 && valor <= 100) {
//			System.out.println("Intervalo (75,100]");
//		} else {
//			System.out.println("Fora de intervalo");
//		}
//		ed.close();

        //Exerc�cio Estrutura Condicional - 07 - PDF
//		Locale.setDefault(Locale.US);
//		Scanner ed = new Scanner(System.in);
//		System.out.printf("Diga um valor para X: ");
//		double x = ed.nextDouble();
//		System.out.printf("Diga um valor para Y: ");
//		double y = ed.nextDouble();
//		if (x == 0.0 && y == 0.0) {
//			System.out.println("Origem");
//		}
//		else if (x == 0.0) {
//			System.out.println("Eixo Y");
//		}
//		else if (y == 0.0) {
//			System.out.println("Eixo X");
//		}
//		else if (x > 0.0 && y > 0.0) {
//			System.out.println("Q1");
//		}
//		else if (x < 0.0 && y > 0.0) {
//			System.out.println("Q2");
//		}
//		else if (x < 0.0 && y < 0.0) {
//			System.out.println("Q3");
//		}
//		else {
//			System.out.println("Q4");
//		}
//		ed.close();

        //Exerc�cio Estrutura Condicional - 08 - PDF
//		Locale.setDefault(Locale.US);
//		Scanner ed = new Scanner(System.in);
//		System.out.printf("Digite o valor do seu sal�rio: ");
//		double salario = ed.nextDouble();
//		if (salario >= 0 && salario <= 2000) {
//			System.out.println("Isento de IR.");
//		} else if (salario > 2000 && salario <= 3000) {
//			double impostoDeRenda = (salario - 2000.0) * 0.08;
//			System.out.printf("Imposto incidente sobre o seu sal�rio � de %.2f", impostoDeRenda);
//		} else if (salario > 3000 && salario <= 4500) {
//			double impostoDeRenda = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
//			System.out.printf("Imposto incidente sobre o seu sal�rio � de %.2f", impostoDeRenda);
//		} else if (salario > 4500) {
//			double impostoDeRenda = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
//			System.out.printf("Imposto incidente sobre o seu sal�rio � de %.2f", impostoDeRenda);
//		}
//		ed.close();

        //Exerc�cio Estrutura Condicional - 01 - Aula 38
        Locale.setDefault(Locale.US);
        Scanner ed = new Scanner(System.in);
        System.out.printf("Insira quantos minutos voc� ir� consumir: ");
        int minutos = ed.nextInt();
        if (minutos <= 100) {
            System.out.println("Valor a pagar: R$ 50.00");
        } else if (minutos > 100) {
            double valorTotal = 50 + ((minutos - 100) * 2) ;
            System.out.printf("Valor a pagar: R$ %.2f", valorTotal);
        }



    }
}
