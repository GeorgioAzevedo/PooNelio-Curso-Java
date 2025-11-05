package EstruturaRepetitiva;
import java.util.Scanner;

public class ForEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você quer até que número? ");
        int X = sc.nextInt();

        for (int i = 1; i <= X; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
