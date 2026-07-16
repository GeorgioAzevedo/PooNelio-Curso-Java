package ConstrutoresThisSobrecargaEncapsulamento.exercicioDeFixacao.application;

import ConstrutoresThisSobrecargaEncapsulamento.exercicioDeFixacao.entities.Count;

import javax.sound.sampled.Line;
import java.util.Locale;
import java.util.Scanner;

public class ProgramBanc {
    public void main (String [] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Count count;

        System.out.print("Enter account: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            count = new Count(number, holder, initialDeposit);
        } else {
            count = new Count(number, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(count);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        count.deposit(depositValue);
        System.out.println(count);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        count.withdraw(withdrawValue);
        System.out.println(count);

        sc.close();
    }
}
