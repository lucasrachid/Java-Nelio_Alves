package Application;
import Entities.Value;
import java.util.Locale;
import java.util.Scanner;

public class ValueExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ed = new Scanner(System.in);

        Value randomNumber = new Value();

        System.out.printf("Insert any Number: ");
        randomNumber.number = ed.nextDouble();

        System.out.println("Circumference: " + randomNumber.circumference());
        System.out.println("Volume: " + randomNumber.volume());
        System.out.printf("Pi Value: %.2f", randomNumber.pi);



        ed.close();
    }
}
