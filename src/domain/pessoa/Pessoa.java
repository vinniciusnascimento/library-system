package domain.pessoa;

public abstract class Pessoa {
    protected String nome;
    protected byte idade;

    public Pessoa(String nome, byte idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void exibirTipo();
}
