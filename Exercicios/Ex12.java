import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        //Entrada do Usuário//
        System.out.print("Digite um número: ");
        int num = resposta.nextInt();

        //Lógica, Cálculo e Saída//
        if (num > 0){
            System.out.println(num + " é Positivo");
        } else if (num == 0){
            System.out.println(num + " é Zero");
        } else {
            System.out.println(num + " é Negativo");
        }

        resposta.close();
    }
}
