package Entities;

public class Student {
    public String name;
    public double firstNote;
    public double secondNote;
    public double thirdNote;

    public String finalNote() {
        double averageNote = firstNote + secondNote + thirdNote;
        if (averageNote >= 60 && averageNote <= 100) {
            return "FINAL GRADE = " + averageNote + "\nPASS";
        } else {
            double missingPoints = 60 - averageNote;
            return "FINAL GRADE = " + averageNote + "\nFAILED\nMISSING " + missingPoints + " POINTS";
        }
    }
}
