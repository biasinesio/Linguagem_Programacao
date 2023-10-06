public class Produto {
    String nome;
    double preco;
    int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEmEstoque += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque de " + nome);
        } else {
            System.out.println("Quantidade inválida para adicionar ao estoque.");
        }
    }

    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            System.out.println(quantidade + " unidades de " + nome + " vendidas.");
        } else {
            System.out.println("Quantidade inválida para venda.");
        }
    }

    public void exibirEstoque() {
        System.out.println("Estoque de " + nome + ": " + quantidadeEmEstoque + " unidades.");
    }
}
