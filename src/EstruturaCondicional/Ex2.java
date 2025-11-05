package EstruturaCondicional;
import java.util.Scanner;
import java.util.Locale;

public class Ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }
    }
}
