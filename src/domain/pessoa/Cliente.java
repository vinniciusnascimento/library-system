package domain.pessoa;

public class Cliente extends Pessoa{
    public Cliente(String nome, byte idade) {
        super(nome, idade);
    }

    @Override
    public void exibirTipo() {
        //
    }
}
