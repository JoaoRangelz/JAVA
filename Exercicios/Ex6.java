import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        //Entrada do usuário//
        System.out.print("Digite a largura: ");
        double largura = resposta.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = resposta.nextDouble();

        //Lógica e Cálculo//
        double area = largura * altura;
        double perimetro = 2 * (largura + altura);

        //Saída//
        System.out.println("Área: " + (int) area);
        System.out.println("Perímetro: " + (int) perimetro);

        resposta.close();
    }
}
