import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        //Entrada do Usuário//
        System.out.print("Digite a temperatura em C°: ");
        int celsius = resposta.nextInt();

        //Lógica e Cálculo//
        int fahrenheit = celsius * 9 / 5 + 32;

        //Saída//
        System.out.println("Temperatura em C°: " + celsius);
        System.out.println("Temperatura em F°: " + fahrenheit);

        resposta.close();
    }
}