package Application;
import Entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class StudentExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ed = new Scanner(System.in);

        Student student;
        student  = new Student();

        System.out.printf("Say your name: ");
        student.name = ed.nextLine();

        System.out.printf("Insert your first note: ");
        student.firstNote = ed.nextDouble();

        System.out.printf("Insert your second note: ");
        student.secondNote = ed.nextDouble();

        System.out.printf("Insert your third note: ");
        student.thirdNote = ed.nextDouble();

        System.out.printf(student.finalNote());


        ed.close();
    }
}
