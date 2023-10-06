//EXERCÍCIO 01
/*public class Main {
    public static void main(String[] args) {

        Carro meuCarro = new Carro("Toyota", "Corolla", 2022, 4);
        Moto minhaMoto = new Moto("Honda", "CBR 1000RR", 2021, 1000);

        System.out.println("Detalhes do Carro:");
        meuCarro.imprimirDetalhes();

        System.out.println("\nDetalhes da Moto:");
        minhaMoto.imprimirDetalhes();

    }
}*/

//EXERCÍCIO 02
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Gerente("João", 5000.0, "Vendas");
        Funcionario funcionario2 = new Diretor("Maria", 8000.0, 1000);

        funcionario1.exibirDados();
        System.out.println("Bônus do Gerente: R$" + ((Gerente) funcionario1).calcularBonus());

        funcionario2.exibirDados();
    }
}