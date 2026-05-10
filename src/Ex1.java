import java.util.Scanner;

public class Ex1 {
    static class Numero {
        int Valor;

        public int dobro() {
            return Valor * 2;
        }
    }

    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        System.out.print("Digite um número: ");

        Numero n1 = new Numero();
        n1.Valor = resposta.nextInt();
        System.out.print("o número " + n1.Valor + " dobrado é " + n1.dobro());

        resposta.close();
    }
}
