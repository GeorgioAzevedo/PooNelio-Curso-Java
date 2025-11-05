package EstruturaCondicional;
import java.util.Scanner;
import java.util.Locale;

public class Ex3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        if (A % B == 0 || B % A == 0){
        System.out.println("São Multiplos");
        } else {
            System.out.println("Não São Multiplos");
        }
        sc.close();
    }
}
