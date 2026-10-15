import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);
        Locale realBrasil = new Locale("pt", "BR");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(realBrasil);

        //Entrada do usuário//
        System.out.print("Digite seu salário: ");
        double salarioBruto = resposta.nextDouble();
        String salario = formatoMoeda.format(salarioBruto);

        //Lógica e Cálculo//
        double porcentagem = 15.0;
        double novoBruto = salarioBruto + ((porcentagem / 100) * salarioBruto);
        String novoSalario = formatoMoeda.format(novoBruto);

        double aumentoBruto = novoBruto - salarioBruto;
        String aumento = formatoMoeda.format(aumentoBruto);

        //Saída//
        System.out.println("Salário Atual: " + salario);
        System.out.println("Aumento: " + aumento);
        System.out.println("Novo Salário: " + novoSalario);

        resposta.close();
    }
}