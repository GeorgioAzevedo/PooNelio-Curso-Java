package IntroducaoPoo.application;

import IntroducaoPoo.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaTrianglePoo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("_____Enter the measures of triangle X:_____\n");
        System.out.print("Enter the length of the first side of the triangle X: ");
        x.a = sc.nextDouble();
        System.out.print("Enter the length of the second side of the triangle X: ");
        x.b = sc.nextDouble();
        System.out.print("Enter the length of the third side of the triangle X: ");
        x.c = sc.nextDouble();
        System.out.println("______Enter the measures of triangle Y:______\n");
        System.out.print("Enter the length of the first side of the triangle Y: ");
        y.a = sc.nextDouble();
        System.out.print("Enter the length of the second side of the triangle Y: ");
        y.b = sc.nextDouble();
        System.out.print("Enter the length of the third side of the triangle Y: ");
        y.c = sc.nextDouble();


        double areaX = x.area();

        double areaY = y.area();

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