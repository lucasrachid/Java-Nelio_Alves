import java.util.Locale;
import java.util.Scanner;

public class estruturaRepetitivaFor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ed = new Scanner(System.in);

        //Exercício Estrutura Repetitiva (For) - 01 - PDF
//        System.out.printf("Diga um número para X: ");
//        int x = ed.nextInt();
//        for (int number = 0; number <= x; number++ ) {
//            if (number % 2 != 0) {
//                System.out.println(number);
//            }
//        }

        //Exercício Estrutura Repetitiva (For) - 02 - PDF
//        int in = 0, out = 0;
//        System.out.printf("Diga um valor para X: ");
//        int x = ed.nextInt();
//        for(int y = 0; y < x; y++) {
//            System.out.printf("Diga um valor: ");
//            int valor = ed.nextInt();
//            if (valor >= 10 && valor <= 20) {
//                in += 1;
//            } else {
//                out += 1;
//            }
//        }
//        System.out.printf("%d in%n%d out", in, out);

        //Exercício Estrutura Repetitiva (For) - 03 - PDF
//        System.out.printf("Quantas vezes deseja realizar o teste ? ");
//        int n = ed.nextInt();
//        for (int i=0; i<n; i++) {
//            System.out.printf("Diga um valor para A: ");
//            double a = ed.nextDouble();
//            System.out.printf("Diga um valor para B: ");
//            double b = ed.nextDouble();
//            System.out.printf("Diga um valor para C: ");
//            double c = ed.nextDouble();
//
//            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
//
//            System.out.printf("%.1f%n", media);
//        }

        //Exercício Estrutura Repetitiva (For) - 04 - PDF
//        System.out.printf("Insira um valor para N: ");
//        int n = ed.nextInt();
//        for (int x = 0; x < n; x++) {
//            System.out.printf("Diga um valor para o numerador: ");
//            double numerador = ed.nextDouble();
//            System.out.printf("Diga um valor para o denominador: ");
//            double denominador = ed.nextDouble();
//            if (denominador == 0) {
//                System.out.println("Divisão impossível");
//            } else {
//                double divisao = numerador / denominador;
//                System.out.println(divisao);
//            }
//        }

        //Exercício Estrutura Repetitiva (For) - 05 - PDF
//        System.out.printf("Diga um valor: ");
//        int valor = ed.nextInt();
//        int fatorial = 1;
//        for (int i = 1; i <= valor; i++) {
//            fatorial = fatorial * i;
//        }
//        System.out.println(fatorial);

        //Exercício Estrutura Repetitiva (For) - 06 - PDF
//        System.out.printf("Insira um valor: ");
//        int value = ed.nextInt();
//        for (int i = 1; i <= value; i++) {
//            if (value % i == 0) {
//                System.out.println(i);
//            }
//        }

        //Exercício Estrutura Repetitiva (For) - 07 - PDF
        System.out.printf("Insira uma quantia de linhas: ");
        int line = ed.nextInt();
        for(int i = 1; i <= line; i++) {
            int multi = i * i;
            int cubo = (int) Math.pow(i, 3);
            System.out.println(i + " " + multi + " " + cubo);
//            System.out.printf("\t%d", i);
        }

    }
}
