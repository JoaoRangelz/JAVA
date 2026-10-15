import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        //Entrada do usuário//
        System.out.print("Digite o 1° número: ");
        int num1 = resposta.nextInt();

        System.out.print("Digite o 2° número: ");
        int num2 = resposta.nextInt();

        //Lógica e Cálculo//
        int auxnum = num1;
        num1 = num2;
        num2 = auxnum;

        //Saída//
        System.out.println("Depois da troca:");
        System.out.println("A: " + num1);
        System.out.println("B: " + num2);

        resposta.close();
    }
}
