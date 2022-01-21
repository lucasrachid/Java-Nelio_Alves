import java.util.Locale;
import java.util.Scanner;

public class estruturaRepetitivaEnquanto {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Locale.setDefault(Locale.US);
        Scanner ed = new Scanner(System.in);

        //Exercício Estrutura Repetitiva (While) - 01 - PDF
//        System.out.printf("Crie uma senha: ");
//        int senha = ed.nextInt();
//        System.out.printf("Insira sua senha de acesso: ");
//        int senha_02 = ed.nextInt();
//        if (senha == senha_02) {
//            System.out.println("Acesso Permitido.");
//        } else {
//            while (senha != senha_02) {
//                System.out.println("Senha Inválida");
//                System.out.printf("Insira novamente sua senha de acesso: ");
//                senha_02 = ed.nextInt();
//            }
//            System.out.println("Acesso Permitido.");
//        }

        //Exercício Estrutura Repetitiva (While) - 03 - PDF
        int combustivel = 0;
        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;
        System.out.printf("Qual combustível você gostaria de abastecer ? ");
        System.out.printf("%n1. Gasolina%n2. Alcool%n3. Diesel%n4. Finalizar%n");
        System.out.printf("Opção: ");
        combustivel = ed.nextInt();
        while(combustivel != 4) {
            if (combustivel == 1) {
                gasolina += 1;
            } else if (combustivel == 2) {
                alcool += 1;
            } else if (combustivel == 3) {
                diesel += 1;
            } else if(combustivel == 4){
                break;
            } else {
                System.out.println("Opção inválida, insira novamente.");
            }
            System.out.printf("Opção: ");
            combustivel = ed.nextInt();
        }
        System.out.println("Muito obrigado.");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        ed.close();

    }

}
