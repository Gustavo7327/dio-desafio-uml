package src.classes;

public class ReprodutorMusical{
    
    private String musicaAtual;
    
    public void selecionarMusica(String musica){
        this.musicaAtual = musica;
        System.out.println("A Musica " + musica + "Foi Selecionada");
    }

    public void tocar(){
        System.out.println("A Musica " + musicaAtual + "Esta Sendo Reproduzida");
    }

    public void pausar(){
        System.out.println("A Musica " + musicaAtual + "Foi Pausada");
    }
}