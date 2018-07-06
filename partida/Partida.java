package partida;

import java.util.Random;

public class Partida {

    private final Time casa;
    private final Time visitante;
    private int golsCasa;
    private int golsVisitante;
    private Boolean penalti;

    public Partida(Time casa, Time visitante) {
        this.casa = casa;
        this.visitante = visitante;
        this.golsCasa = 0;
        this.golsVisitante = 0;
        this.penalti = false;
    }

    public void golCasa() {
        //LOOP ATÈ QUE UM JOGADOR DE ESTEJA JOGANDO SEJA SORTEADO
        Random aleatorio = new Random();
        int num;
        do {
            num = aleatorio.nextInt(8) + 2;
        } while (!casa.getJogador(num).getJogando());
        casa.getJogador(num).somaGol();

        this.golsCasa++;
    }

    public void golVisitante() {
        //LOOP ATÈ QUE UM JOGADOR DE ESTEJA JOGANDO SEJA SORTEADO
        Random aleatorio = new Random();
        int num;
        do {
            num = aleatorio.nextInt(8) + 2;
        } while (!visitante.getJogador(num).getJogando());
        visitante.getJogador(num).somaGol();

        this.golsVisitante++;
    }

    public void ganhar(Time time) {
        time.somarVitoria();
    }

    public void perder(Time time) {
        time.somarDerrota();
    }

    public void empatar(Time time) {
        time.somarEmpate();
    }

    public Time getCasa() {
        return this.casa;
    }

    public Time getVisitante() {
        return this.visitante;
    }

    public int getGolsCasa() {
        return this.golsCasa;
    }

    public int getGolsVisitante() {
        return this.golsVisitante;
    }

    public Boolean getPenalti() {
        return this.penalti;
    }

    public void setPenalti(Boolean penalti) {
        this.penalti = penalti;
    }

}
