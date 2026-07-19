package domain.pessoa;

public class Cliente extends Pessoa{
    private int livrosEmprestados;

    public Cliente(String nome, byte idade) {
        super(nome, idade);
    }

    @Override
    public void exibirTipo() {
        //
    }

    public int getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(int livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
}
