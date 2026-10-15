import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        //Entrada do Usuário//
        System.out.print("Nota 1: ");
        double num1 = resposta.nextDouble();

        System.out.print("Nota 2: ");
        double num2 = resposta.nextDouble();

        //Lógica e Cálculo//
        double media = (num1 + num2) / 2;
        String resultado = String.format("%.1f", media);

        //Saída//
        System.out.println("Média: " + resultado);


        resposta.close();
    }
}
