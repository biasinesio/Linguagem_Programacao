import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CalculadoraIMC calculadora = new CalculadoraIMC();

        System.out.print("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();
        calculadora.setPeso(peso);

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();
        calculadora.setAltura(altura);

        double imc = calculadora.calcularIMC();
        if (imc > 0) {
            System.out.println("O IMC é: " + imc);
        }
    }
}