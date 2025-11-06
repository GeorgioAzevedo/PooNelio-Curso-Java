package IntroducaoPoo.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaTriangleSemPoo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("_____Enter the measures of triangle X:_____\n");
        System.out.print("Enter the length of the first side of the triangle X: ");
        xA = sc.nextDouble();
        System.out.print("Enter the length of the second side of the triangle X: ");
        xB = sc.nextDouble();
        System.out.print("Enter the length of the third side of the triangle X: ");
        xC = sc.nextDouble();
        System.out.println("______Enter the measures of triangle Y:______\n");
        System.out.print("Enter the length of the first side of the triangle Y: ");
        yA = sc.nextDouble();
        System.out.print("Enter the length of the second side of the triangle Y: ");
        yB = sc.nextDouble();
        System.out.print("Enter the length of the third side of the triangle Y: ");
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Lager area: X");
        } else if (areaY > areaX) {
            System.out.println("Lager area: Y");
        } else {
            System.out.println("The areas of the two triangles are equal");
        }

        sc.close();
    }
}

