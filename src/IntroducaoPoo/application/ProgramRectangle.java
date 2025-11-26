package IntroducaoPoo.application;

import IntroducaoPoo.entities.Rectangle;
import java.util.Scanner;
import java.util.Locale;

public class ProgramRectangle {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rect  = new Rectangle();

        System.out.print("Enter rectangle width: ");
        rect.width = sc.nextDouble();
        System.out.print("Enter rectangle height: ");
        rect.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", rect.area());
        System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());

        sc.close();

    }
}
