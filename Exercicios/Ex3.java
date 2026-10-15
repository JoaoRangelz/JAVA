import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        //Entrada do usuário//
        System.out.print("Digite um número: ");
        int num = resposta.nextInt();

        //Lógica e Cálculo//
        int antecessor = num - 1;
        int sucessor = num +1;

        //Saída//
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Número: " + num);
        System.out.println("Sucessor: " + sucessor);

        resposta.close();
        }
    }
