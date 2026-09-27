import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        //Entrada do Usuário//
        System.out.println("Digite um valor em metros: ");
        double metros = resposta.nextDouble();

        //Lógica e Cálcula//
        double centimetros = metros * 100;
        double milimetros = metros * 1000;

        //Saída//
        System.out.println("Centímetros: " + (int) centimetros);
        System.out.println("Milímetros: " + (int) milimetros);

        resposta.close();
    }
}
