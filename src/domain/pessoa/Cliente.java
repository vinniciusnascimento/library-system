package domain.pessoa;

import domain.livro.Livro;

public class Cliente extends Pessoa{
    private int livrosEmprestados;
    private Livro livro;

    public Cliente(String nome, byte idade) {
        super(nome, idade);
    }

    @Override
    public void exibirTipo() {
        System.out.println("Cliente");
    }

    public int getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(int livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
