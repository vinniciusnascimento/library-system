package domain.livro;

import domain.interfaces.Emprestavel;
import domain.pessoa.Cliente;

public class Livro implements Emprestavel {
    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    /**
     *
     * @param cliente (Not Null)
     * @throws RuntimeException Se o Livro ja estiver emprestado
     */
    @Override
    public void emprestar(Cliente cliente) throws RuntimeException {
        if (this.emprestado){
            throw new RuntimeException("Livro já está emprestado.");
        } else{
            cliente.setLivro(this);
            cliente.setLivrosEmprestados(cliente.getLivrosEmprestados() + 1);
            this.emprestado = true;
            System.out.println("Livro emprestado com sucesso.");
        }
    }
}
