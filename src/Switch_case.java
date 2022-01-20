import java.util.Locale;
import java.util.Scanner;

public class Switch_case {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Locale.setDefault(Locale.US);
        Scanner ed = new Scanner(System.in);
        System.out.printf("Insira um número para o dia da semana: ");
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
                diaSemana = "Terça-Feira";
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
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Valor inválido";
                break;

        }
        System.out.printf("Hoje é: %s", diaSemana);


    }

}
