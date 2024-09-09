package Iphone;
public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical reprodutoMusical = new ReprodutorMusical();
        AparelhoTelefonico aparelhoTelefone = new AparelhoTelefonico();
        NavegadorInternet navegadorInternet = new NavegadorInternet();
        
        reprodutoMusical.tocar();
        reprodutoMusical.pausar();
        reprodutoMusical.selecionarMusica("musica");
        aparelhoTelefone.ligar("990012131415");
        aparelhoTelefone.atender();
        aparelhoTelefone.iniciarCorreioVoz();
        navegadorInternet.exibirPagina("pagina");
        navegadorInternet.atualizarPagina();
        navegadorInternet.adicionarNovaAba();
    }
}
