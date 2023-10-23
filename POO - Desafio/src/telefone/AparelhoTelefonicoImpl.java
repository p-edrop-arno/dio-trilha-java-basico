package telefone;

public class AparelhoTelefonicoImpl implements AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Fazendo uma ligação.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz.");
    }
}
