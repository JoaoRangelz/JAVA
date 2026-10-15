import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);
        Locale realBrasil = new Locale("pt", "BR");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(realBrasil);

        //Entrada do usuário//
        System.out.print("Digite um preço: ");
        double precoBruto = resposta.nextDouble();
        String preco = formatoMoeda.format(precoBruto);

        //Lógica e Cálculo//
        double porcentagem = 10.0;
        double descontoBruto = (precoBruto * porcentagem) / 100;
        String desconto = formatoMoeda.format(descontoBruto);

        double resultado = precoBruto - descontoBruto;
        String valorFinal = formatoMoeda.format(resultado);

        //Saída//
        System.out.println("Preço: " + preco);
        System.out.println("Desconto: " + desconto);
        System.out.println("Valor Final: " + valorFinal);

        resposta.close();
    }
}
