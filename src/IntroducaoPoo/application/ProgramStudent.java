package IntroducaoPoo.application;

import IntroducaoPoo.entities.Student;

import java.util.Scanner;
import java.util.Locale;

public class ProgramStudent {
    public static void main (String [] Args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Student student = new Student();

        System.out.println("Enter your name: ");
        student.name = sc.nextLine();
        System.out.println("Enter the first grade: ");
        student.grade1 = sc.nextDouble();
        System.out.println("Enter the second grade: ");
        student.grade2 = sc.nextDouble();
        System.out.println("Enter the third grade: ");
        student.grade3 = sc.nextDouble();

        System.out.printf("Final Grade = %.2f%n", student.finalGrade());
        if (student.finalGrade() < 60.0) {
            System.out.println("Failed!");
            System.out.printf("Missing %.2f Points%n", student.missingPoints());
        } else {
            System.out.println("Pass!");
        }
        sc.close();
    }
}
