
public class CalculadoraIMC {
    private double peso;
    private double altura;

    public CalculadoraIMC() {
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Peso inválido. Deve ser um valor positivo.");
        }
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida. Deve ser um valor positivo.");
        }
    }

    public double calcularIMC() {
        if (peso > 0 && altura > 0) {
            return peso / (altura * altura);
        } else {
            System.out.println("Impossível calcular o IMC. Peso e/ou altura não válidos.");
            return 0.0;
        }
    }
}


