package IntroducaoPoo.membrosEstaticos.exercicio.util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double dollarToReal(double dollarPrice, double dollarAmount){
        double dollarWithIof = dollarPrice * dollarAmount;
        return dollarWithIof + dollarWithIof * IOF;
    }
}
