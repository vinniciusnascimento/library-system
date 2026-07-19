package domain.livro;

import domain.interfaces.Emprestavel;

public class Livro implements Emprestavel {
    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    @Override
    public void emprestar() {
        if (this.emprestado){
            throw new RuntimeException("Livro já está emprestado.");
        } else{
            this.emprestado = true;
        }
    }
}
