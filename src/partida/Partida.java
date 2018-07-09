package partida;

import java.util.Random;

public class Partida {

    private final Time casa;
    private final Time visitante;
    private int golsCasa;
    private int golsVisitante;
    private Boolean penalti;
    private final String data;

    public Partida(Time casa, Time visitante, Data data) {
        this.casa = casa;
        this.visitante = visitante;
        this.golsCasa = 0;
        this.golsVisitante = 0;
        this.penalti = false;
        String ar = data.getDia() + " / " + data.getMes() + " / " + data.getAno();
        this.data = ar;
    }

    public String getData() {
        //RETORNA A DATA DA PARTIDA
        return this.data;
    }

    public void golCasa() {
        //LOOP ATÈ QUE UM JOGADOR QUE ESTEJA JOGANDO SEJA SORTEADO
        Random aleatorio = new Random();
        int num;
        do {
            num = aleatorio.nextInt(8) + 2;
        } while (!casa.getJogador(num).getJogando());
        casa.getJogador(num).somaGol();

        this.golsCasa++;
    }

    public void golVisitante() {
        //LOOP ATÈ QUE UM JOGADOR QUE ESTEJA JOGANDO SEJA SORTEADO
        Random aleatorio = new Random();
        int num;
        do {
            num = aleatorio.nextInt(8) + 2;
        } while (!visitante.getJogador(num).getJogando());
        visitante.getJogador(num).somaGol();

        this.golsVisitante++;
    }

    public void ganhar(Time time) {
        //ADICIONA UMA VITORIA E 3 PONTOS PARA O TIME
        time.somarVitoria();
    }

    public void perder(Time time) {
        //ADICIONA UMA DERROTA PARA O TIME
        time.somarDerrota();
    }

    public void empatar(Time time) {
        //ADICIONA UM EMPATE E 1 PONTO PARA O TIME
        time.somarEmpate();
    }

    public Time getCasa() {
        //RETORNA O TIME DA CASA
        return this.casa;
    }

    public Time getVisitante() {
        //RETORNA O TIME VISITANTE
        return this.visitante;
    }

    public int getGolsCasa() {
        //RETORNA A QUANTIDADE DE GOLS FEITO NA PARTIDA PELO TIME DA CASA
        return this.golsCasa;
    }

    public int getGolsVisitante() {
        //RETORNA A QUANTIDADE DE GOLS FEITO NA PARTIDA PELO TIME VISITANTE
        return this.golsVisitante;
    }

    public Boolean getPenalti() {
        return this.penalti;
    }

    public void setPenalti(Boolean penalti) {
        this.penalti = penalti;
    }

}
