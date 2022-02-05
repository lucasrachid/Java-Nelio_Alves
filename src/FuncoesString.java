import java.util.Locale;
import java.util.Scanner;

public class FuncoesString {
    public static void main(String[] args) {
        Scanner ed = new Scanner(System.in);
        System.out.printf("Diga algo: ");
        String saySomething = ed.next();
        System.out.println("Você digitou: " + saySomething);
        System.out.println("Toda minúscula: " + saySomething.toLowerCase());
        System.out.println("Toda maiúscula: " + saySomething.toUpperCase());
        System.out.println("Retirando os espaços da String " + saySomething.trim());
        System.out.println("Criando uma nova String a partir do indice 02: " + saySomething.substring(2));
        System.out.println("Criando uma nova String a partir do indice 02 terminando no indice 05: " + saySomething.substring(2, 5));

        String saySomething02 = "Lucas Rachid Martins";
        System.out.println("Substituindo letras: " + saySomething02.replace('a', 'b'));

        String saySomething03 = "Joaozinho foi ali pegar a espingarda";
        System.out.println("Substituindo palavras: " + saySomething03.replace("espingarda", "bola"));
        System.out.println("Primeiro indice da palavra A: " + saySomething03.indexOf('a'));
        System.out.println("Último indice da palavra A: " + saySomething03.lastIndexOf('a'));

        // String
        String frutas = "Maçã,Banana,Limão,Uva";
        // Separando as palavras por vírgula e salvando em um array
        String[] vetor = frutas.split(",");
        // Criando váriaveis, definindo o valor como um indice do array criado
        String fruta01 = vetor[0];
        String fruta02 = vetor[1];
        String fruta03 = vetor[2];
        String fruta04 = vetor[3];
        // Renderizando valores das váriaveis em tela
        System.out.println("Fruta 01: " + fruta01);
        System.out.println("Fruta 02: " + fruta02);
        System.out.println("Fruta 03: " + fruta03);
        System.out.println("Fruta 04: " + fruta04);






    }
}
