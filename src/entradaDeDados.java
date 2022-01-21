import java.util.Scanner;
import java.util.Locale;

public class entradaDeDados {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


//		System.out.println("Qual o seu nome ? ");
//		String a, b;
//		a = sc.next();
//		next ele ir� ler apenas a primeira palavra.
//		System.out.println("Qual o seu sobrenome ? ");
//		b = sc.next();
//		System.out.printf("%nBem vindo %s %s, prazer em te conhecer.%n", a, b);
//
//
//		int x;
//		System.out.println("Diga um número inteiro: ");
//		x = sc.nextInt();
//		System.out.println("O valor digitado foi: " + x);
//
//
//		double z;
//		System.out.println("Diga um número real: ");
//		z = sc.nextDouble();
//		System.out.printf("O número digitado foi: %.2f", z);


//		char m;
//		System.out.println("Diga uma letra: ");
//		m = sc.next().charAt(0);
//		System.out.printf("A letra digitada foi: %s", m);

//		String name;
//		int age;
//		double height;
//		System.out.println("Qual o seu nome ? ");
//		name = sc.next();
//		System.out.println("Qual a sua idade ? ");
//		age = sc.nextInt();
//		System.out.println("Qual a sua altura ? ");
//		height = sc.nextDouble();
//
//		System.out.println("Dados digitados: ");
//		System.out.println("Seu nome é: " + name);
//		System.out.println("Você tem " + age + " anos de idade.");
//		System.out.println("Sua altura é " + height + " metros.");

//		String s1, s2, s3;
//		System.out.println("Digite algo 01: ");
//		s1 = sc.nextLine();
////		nextLine ele irá ler todo o conjunto de string que voce escrever.
//		System.out.println("Digite algo 02: ");
//		s2 = sc.nextLine();
//		System.out.println("Digite algo 03: ");
//		s3 = sc.nextLine();
//
//		System.out.println("DADOS DIGITADOS: ");
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);


        int number = sc.nextInt();
        sc.nextLine(); // Sempre colocar esse sc.nextLine quando  voce utilizar algum comando
        //  diferente de nextLine
        String s4 = sc.nextLine();
        String s5 = sc.nextLine();
        String s6 = sc.nextLine();

        System.out.println("Dados digitados:");
        System.out.println(number + " " + s4 + " " + s5 + " " + s6);

        sc.close();
//		colocar ao final, quando não for mais necessário a entrada de dados.

    }
}
