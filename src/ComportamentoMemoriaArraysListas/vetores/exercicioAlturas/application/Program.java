package ComportamentoMemoriaArraysListas.vetores.exercicioAlturas.application;

import ComportamentoMemoriaArraysListas.vetores.exercicioAlturas.entities.person;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double sumHeight, avg, percentageUnder16;

        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();

        person[] vect = new person[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.print("Dados da " + (i + 1) + "ª pessoa:");

            System.out.print("\nNome: ");
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int age = sc.nextInt();

            System.out.print("Altura: ");
            double height = sc. nextDouble();

            vect[i] = new person(name, age, height);
        }

        sumHeight = 0;
        for (int i = 0; i < vect.length; i++){
            sumHeight +=  vect[i].getHeight();
        }

        avg = sumHeight / vect.length;

        int countUnder16 = 0;
        for(int i = 0; i < vect.length; i++){
            if (vect[i].getAge() < 16){
                countUnder16++;
            }
        }

        percentageUnder16 = countUnder16 * 100.0 / vect.length;

        System.out.println();
        System.out.printf("Altura média: %.2f%n", avg);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentageUnder16);

        for (int i = 0; i < vect.length; i++){
            if (vect[i].getAge() < 16 ){
                System.out.println(vect[i].getName());
            }
        }
        sc.close();
    }
}
