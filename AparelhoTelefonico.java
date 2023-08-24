package main.java.basico.trilha;

public class AparelhoTelefonico {
    private boolean chamadaAtiva;
    private boolean correioDeVozAtivo;

    public void fazerLigacao(String numero) {
        if (!chamadaAtiva) {
            System.out.println("Ligando para: " + numero);
            chamadaAtiva = true;
        }
    }

    public void atenderChamada() {
        if (chamadaAtiva) {
            System.out.println("Chamada atendida.");
            chamadaAtiva = false;
        }
    }

    public void finalizarChamada() {
        if (chamadaAtiva) {
            System.out.println("Chamada finalizada.");
            chamadaAtiva = false;
            if (!correioDeVozAtivo) {
                iniciarCorreioVoz();
            }
        }
    }

    private void iniciarCorreioVoz() {
        System.out.println("Correio de voz ativado.");
        correioDeVozAtivo = true;
    }
}