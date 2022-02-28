package Application;
import Entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ed = new Scanner(System.in);

        Employee employee;
        employee = new Employee(); // Instanciando

        System.out.print("Name: ");
        employee.name = ed.nextLine();

        System.out.print("Gross Salary: ");
        employee.GrossSalary = ed.nextDouble();

        System.out.print("Tax: ");
        employee.Tax = ed.nextDouble();

        System.out.printf(employee.toString());

        System.out.printf("%nWhich percentage to increase salary: ");
        double percentage = ed.nextDouble();

      System.out.println("Updated data: " + employee.name + ", $" + employee.increaseSalary(percentage));

        ed.close();
    }
}
