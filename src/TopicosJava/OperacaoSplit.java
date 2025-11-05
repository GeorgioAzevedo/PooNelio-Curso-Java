package TopicosJava;

public class OperacaoSplit {
    public static void main(String[] args) {

        String s = "potato apple lemon";

        String[] vect = s.split(" "); /// Usado para dividir o string.

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
