import java.util.Scanner;

/*public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto("Produto A", 10.0, 50);

        produto.adicionarEstoque(20);
        produto.vender(15);
        produto.exibirEstoque();
    }
}*/
public class Main {
    public static void main(String[] args) {
        SistemaBancario cliente = new SistemaBancario();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cliente.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor a depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    cliente.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor a sacar: ");
                    double valorSaque = scanner.nextDouble();
                    cliente.sacar(valorSaque);
                    break;
                case 4:
                    System.out.print("Digite o valor a transferir: ");
                    double valorTransferencia = scanner.nextDouble();
                    SistemaBancario destino = new SistemaBancario();
                    cliente.transferir(valorTransferencia, destino);
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }
}

