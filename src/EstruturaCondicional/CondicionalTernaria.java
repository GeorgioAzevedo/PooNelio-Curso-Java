package EstruturaCondicional;

public class CondicionalTernaria {
    public static void main(String[] args) {

        double preco = 34.5;
        double desconto;
        if (preco < 20.0){
            desconto = preco * 0.1;
        } else {
            desconto = preco *0.05;
        }
       /* OUTRA FORMA DE FAZER ( Expressão condicional ternária )
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;*/
    }
}
