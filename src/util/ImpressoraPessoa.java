package util;

import domain.pessoa.Pessoa;

public class ImpressoraPessoa {
    public static void imprimirPessoa(Pessoa pessoa){
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        pessoa.exibirTipo();
    }
}
