import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);
        Locale realBrasil = new Locale("pt", "BR");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(realBrasil);

        //Entrada do Usuário//
        System.out.print("Preço Unitário: ");
        double precoBruto = resposta.nextDouble();
        String preco = formatoMoeda.format(precoBruto);

        System.out.print("Quantidade: ");
        double quantify = resposta.nextDouble();

        System.out.print("Digite o valor do frete: ");
        double freteBruto = resposta.nextDouble();
        String frete = formatoMoeda.format(freteBruto);

        //Lógica e Cálculo//
        double subtotalB = quantify * precoBruto;
        String subtotal = formatoMoeda.format(subtotalB);

        double totalB = subtotalB + freteBruto;
        String total = formatoMoeda.format(totalB);

        //Saída//
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Total: " + total);

        resposta.close();
    }
}
