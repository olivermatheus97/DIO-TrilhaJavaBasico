package main.java.basico.trilha;

import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {
    private Musica musicaAtual;
    private boolean emReproducao;

    public void Tocar(Musica musica) {
        if (!emReproducao) {
            musicaAtual = musica;
            emReproducao = true;
            System.out.println("Tocando: " + musica.getNome());
        }
    }

    public void pausar() {
        if (!emReproducao) {
            emReproducao = false;
            System.out.println("Pausado: " + musicaAtual.getNome());
        }
    }
    public void selecionarMusica(Musica musica) {
        if (!emReproducao || musica != musicaAtual) {
            if(emReproducao){
                pausar();
            }
            musicaAtual = musica;
            System.out.println("Selecionando: " + musica.getNome());
        }
    }
}
