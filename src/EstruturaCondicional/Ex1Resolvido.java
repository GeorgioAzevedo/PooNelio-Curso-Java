package EstruturaCondicional;
import java.util.Scanner;
import java.util.Locale;

public class Ex1Resolvido {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double firstNote = sc.nextDouble();
        double secondNote = sc.nextDouble();
        double sumOfGrades = firstNote + secondNote;

        System.out.printf("Nota final: %.1f%n", sumOfGrades);

        if(sumOfGrades < 60.00){
            System.out.println("Reprovado!");
            } else {
            System.out.println("Aprovado");
        }
        sc.close();
    }
}
