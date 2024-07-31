package src.classes;

public class Iphone {
    public static void main(String[] args) {

        //criando classes
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorInternet navegador = new NavegadorInternet();
        ReprodutorMusical reprodutor = new ReprodutorMusical();

        //chamando funcoes
        telefone.ligar("40028922");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        navegador.exibirPagina("google.com");
        navegador.atualizarPagina();
        navegador.adicionarAba();

        reprodutor.selecionarMusica("musica.mp3");
        reprodutor.tocar();
        reprodutor.pausar();
    }
}
