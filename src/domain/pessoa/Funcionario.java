package domain.pessoa;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome, byte idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    @Override
    public void exibirTipo() {
        System.out.println("Funcionário");

    }

    public double getSalario() {
        return salario;
    }
}
