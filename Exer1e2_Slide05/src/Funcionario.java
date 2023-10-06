public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + salario);
    }
}

class Gerente extends Funcionario {
    String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public double calcularBonus() {
        return salario * 0.10;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Departamento: " + departamento);
    }
}

class Diretor extends Funcionario {
    int acoes;

    public Diretor(String nome, double salario, int acoes) {
        super(nome, salario);
        this.acoes = acoes;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Ações: " + acoes);
    }
}

