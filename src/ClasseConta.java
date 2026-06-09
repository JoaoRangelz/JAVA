import java.util.Scanner;

public class ClasseConta {

    //Adição da Classe Conta//
    static class Conta {
        String titular;
        double saldo;

    //Adição do métod de depósito //
       public void depositar(double valor){
           saldo += valor;
       }

    //Adição do métod de saque//
       public void sacar(double valor){
         saldo -= valor;
       }

       public double MostrarSaldo(){
           return saldo;
       }
    }

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

       Conta NovaConta = new Conta();

       System.out.print("Digite o nome do Titular: ");
       NovaConta.titular = tcl.nextLine();

       System.out.print("Quanto quer depositar: ");
       double deposito = tcl.nextDouble();
       NovaConta.depositar(deposito);

       System.out.print("Quanto quer sacar: ");
       double saque = tcl.nextDouble();
       NovaConta.sacar(saque);

       System.out.print("Seu saldo é: " + NovaConta.MostrarSaldo());


       tcl.close();
    }
}
