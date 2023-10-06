public class Veiculo {
    String marca;
    String modelo;
    int anoFabricacao;

    public Veiculo(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public void imprimirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
    }
}

class Carro extends Veiculo {
    int numPortas;

    public Carro(String marca, String modelo, int anoFabricacao, int numPortas) {
        super(marca, modelo, anoFabricacao);
        this.numPortas = numPortas;
    }

    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("Número de Portas: " + numPortas);
    }
}

class Moto extends Veiculo {
    int cilindradas;

    public Moto(String marca, String modelo, int anoFabricacao, int cilindradas) {
        super(marca, modelo, anoFabricacao);
        this.cilindradas = cilindradas;
    }

    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("Cilindradas: " + cilindradas);
    }
}


