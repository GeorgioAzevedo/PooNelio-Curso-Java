package EstruturaRepetitiva;
import java.util.Scanner;

public class ExResolvFor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("De qual número você quer a tabuada? ");
        int N = sc.nextInt();

        System.out.println("\nTABUADA DO " + N + ":");
        for (int i = 0; i <= 10; i++) {
            int produto = i * N;
            System.out.println(i + " x " + N + " = " + produto);
        }

        sc.close();
    }
}
