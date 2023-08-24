package main.java.basico.trilha;

public class Main {
    public static void main(String[] args) {


             // Teste para ligação
        AparelhoTelefonico telefone = new AparelhoTelefonico();

        telefone.fazerLigacao("123321123"); //Faz uma ligação
        telefone.atenderChamada(); // Atende a Chamada
        telefone.finalizarChamada(); //Finaliza a chamada e ativa o correio

            // Teste de ReprodutorMusical
        Musica musica1 = new Musica("Música 1", "Artista 1", 180);
        Musica musica2 = new Musica("Música 2", "Artista 2", 380);

        ReprodutorMusical reprodutor = new ReprodutorMusical();

        reprodutor.Tocar(musica1);  // Toca a primeira música
        reprodutor.pausar(); // Pausa a música
        reprodutor.Tocar(musica2); // Toca a segunda música
        reprodutor.selecionarMusica(musica1); // Seleciona novamente a primeira música

            //Teste para o NavegadorInternet

        NavegadorInternet navegador = new NavegadorInternet();

        navegador.exibirPagina("https://web.dio.me"); //exibir uma página
        navegador.adicionarNovaAba("https://www.google.com"); // Adiciona uma nova aba
        navegador.atualizarPagina("https://github.com"); // Atualiza a página


    }
}
