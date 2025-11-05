package TopicosJava;

public class FuncoeString {
    public static void main(String[] args) {

        // --- String Original ---
        // Esta é a string base que usaremos para todos os testes.
        // Note que ela tem letras maiúsculas, minúsculas, espaços no meio e um espaço no final.
        String original = " abcde FGHIJ ABC abc DEFG ";

        // --- toLowerCase() ---
        // Converte todos os caracteres da string para minúsculas.
        // O 'FGHIJ' e 'ABC' virarão 'fghij' e 'abc'.
        String s01 = original.toLowerCase();

        // --- toUpperCase() ---
        // Converte todos os caracteres da string para maiúsculas.
        // O 'abcde' e 'abc' virarão 'ABCDE' e 'ABC'.
        String s02 = original.toUpperCase();

        // --- trim() ---
        // Remove espaços em branco (whitespace) APENAS do começo e do fim da string.
        // O espaço no final de "DEFG " será removido. Não mexe nos espaços do meio.
        String s03 = original.trim();

        // --- substring(int inicio) ---
        // Cria uma nova string começando do índice 2 (que é o caractere 'c')
        // e indo até o final da string. (Lembrete: índice 0='a', 1='b', 2='c')
        String s04 = original.substring(2);

        // --- substring(int inicio, int fim) ---
        // Cria uma nova string começando do índice 2 (inclusivo)
        // e terminando ANTES do índice 9 (exclusivo).
        // Vai pegar os caracteres dos índices: 2, 3, 4, 5, 6, 7, 8.
        // (Resultado: "cde FGH")
        String s05 = original.substring(2, 9);

        // --- replace(char antigo, char novo) ---
        // Substitui TODAS as ocorrências do caractere 'a' (minúsculo)
        // pelo caractere 'x'. Não mexe no 'A' (maiúsculo).
        String s06 = original.replace('a', 'x');

        // --- replace(String antiga, String nova) ---
        // Substitui TODAS as ocorrências da string "abc"
        // pela string "xy".
        String s07 = original.replace("abc", "xy");

        // --- indexOf(String str) ---
        // Retorna o número do índice da PRIMEIRA ocorrência da string "bc".
        // Em "abcde...", "bc" começa no índice 1.
        int i = original.indexOf("bc");

        // --- lastIndexOf(String str) ---
        // Retorna o número do índice da ÚLTIMA ocorrência da string "bc".
        // Em "...ABC abc DEFG ", o último "bc" começa no índice 21.
        int j = original.lastIndexOf("bc");

        // --- Impressão dos Resultados ---
        // Os hífens são usados para vermos claramente os espaços no início ou fim (especialmente no trim).
        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);
    }
}
