package IntroducaoPoo.membrosEstaticos.exercicio.application;

import IntroducaoPoo.membrosEstaticos.exercicio.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bougth? ");
        double dollarAmount = sc.nextDouble();

        double amountToBePaid = CurrencyConverter.dollarToReal(dollarPrice, dollarAmount);

        System.out.printf("Amount to be paid in real: %.2f%n", amountToBePaid);

    }
}
