package navegador;

public class NavegadorInternetImpl implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo uma página web.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba de navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página web.");
    }
}
