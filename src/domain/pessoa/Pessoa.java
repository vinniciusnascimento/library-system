package domain.pessoa;

public abstract class Pessoa {
    protected String nome;
    protected byte idade;

    public Pessoa(String nome, byte idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void exibirTipo();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }
}
