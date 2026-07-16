package ConstrutoresThisSobrecargaEncapsulamento.exercicioDeFixacao.entities;

public class Count {

    private int number;
    private String holder;
    private double balance;

    public Count (int number, String holder, double initialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit); /// Protege o construtor caso a regra de deposito mude.
    }

    public Count(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public int getNumber(int number) {
        return number;
    }
    public String getHolder(String holder) {
        return holder;
    }
    public void setHolder(String holder){
        this.holder = holder;
    }
    public double getBalance (double balance){
        return balance;
    }

    public void  deposit (double amount){
        this.balance += amount;
    }
    public void withdraw (double amount){
        this.balance -= amount + 5.0;
    }

    public String toString (){
       return "Account "
               + number
               + ", Holder: "
               + holder
               + ", Balance: $"
               + String.format("%.2f", balance);
    }
}
