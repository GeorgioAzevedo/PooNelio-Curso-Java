package EstruturaCondicional;
import java.util.Scanner;
import java.util.Locale;

public class Ex1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        while(true) {
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }

        System.out.println(numero);
        }

    }
}
