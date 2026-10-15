import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        //Entrada do Usuário//
        System.out.print("Digite um número: ");
        double num = resposta.nextDouble();

        //Lógica e Cálculo//
        double dob = num * 2;
        String dobro = String.format("%.1f", dob);

        double trip= num * 3;
        String triplo = String.format("%.1f", trip);

        double met = num / 2;
        String metade = String.format("%.1f", met);

        //Saída//
        System.out.println("Dobro: " + dobro);
        System.out.println("Triplo: " + triplo);
        System.out.println("Metade: " + metade);

        resposta.close();
    }
}
