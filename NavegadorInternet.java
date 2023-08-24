package main.java.basico.trilha;

import java.util.ArrayList;

public class NavegadorInternet {
    private ArrayList<String> abasAbertas;

    public NavegadorInternet() {
        abasAbertas = new ArrayList<>();
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba(String url) {
        abasAbertas.add(url);
        System.out.println("Nova aba adicionada: " + url);
    }

    public void atualizarPagina(String url) {
        System.out.println("Atualizar página: " + url);
    }
}
