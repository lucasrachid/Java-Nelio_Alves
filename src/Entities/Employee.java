package Entities;

public class Employee {
    public String name;
    public double GrossSalary;
    public double Tax;

    public double netSalary() {
        return GrossSalary - Tax;
    }

    public double increaseSalary(double tax) {
//        return (GrossSalary * (tax / 100)) + GrossSalary - this.Tax;
        return netSalary() + (GrossSalary * (tax / 100));
    }

    public String toString() {
        return "Employee: " +
                name +
                ", $ " +
                String.format("%.2f", netSalary());
    }
}
