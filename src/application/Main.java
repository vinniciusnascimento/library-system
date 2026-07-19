package application;

import domain.livro.Livro;
import domain.pessoa.Cliente;
import domain.pessoa.Funcionario;
import util.ImpressoraPessoa;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Sherlock Holmes: Um estudo em vermelho", "Artur Conan Doyle");
        Cliente cliente = new Cliente("Joãozinho", (byte) 12);
        Funcionario funcionario = new Funcionario("Maria", (byte) 24, 2000);

        try{
            ImpressoraPessoa.imprimirPessoa(funcionario);
            livro.emprestar(cliente);
            livro.emprestar(cliente);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}