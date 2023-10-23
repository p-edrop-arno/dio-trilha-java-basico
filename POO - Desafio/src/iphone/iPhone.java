package iphone;
import reprodutor.ReprodutorMusical;
import reprodutor.ReprodutorMusicalImpl;
import telefone.AparelhoTelefonico;
import telefone.AparelhoTelefonicoImpl;
import navegador.NavegadorInternet;
import navegador.NavegadorInternetImpl;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhone() {
        reprodutorMusical = new ReprodutorMusicalImpl();
        aparelhoTelefonico = new AparelhoTelefonicoImpl();
        navegadorInternet = new NavegadorInternetImpl();
    }

    @Override
    public void tocar() {
        reprodutorMusical.tocar();
    }

    @Override
    public void pausar() {
        reprodutorMusical.pausar();
    }

    @Override
    public void selecionarMusica() {
        reprodutorMusical.selecionarMusica();
    }

    @Override
    public void ligar() {
        aparelhoTelefonico.ligar();
    }

    @Override
    public void atender() {
        aparelhoTelefonico.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    @Override
    public void exibirPagina() {
        navegadorInternet.exibirPagina();
    }

    @Override
    public void adicionarNovaAba() {
        navegadorInternet.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }
}
