package main.java.basico.trilha;

public class Musica {
    private String nome;
    private String artista;
    private int duracao;

    public Musica(String nome, String artista, int duracao) {
        this.nome = nome;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }
}
