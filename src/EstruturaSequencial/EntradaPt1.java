package EstruturaSequencial;

import java.util.Scanner;
import java.util.Locale;

public class EntradaPt1 {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US); /// Para Usar o (.) nop lugar da vírgula
        Scanner sc = new Scanner(System.in);

        String  x;
        int  y;
        double  z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.print(z);


        sc.close();
    }
}
