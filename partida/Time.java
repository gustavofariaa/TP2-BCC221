package partida;

import jogadores.JogadorAtacante;
import jogadores.Jogador;
import jogadores.JogadorDefesa;
import java.util.ArrayList;
import java.util.Random;

public class Time {

    private final String nome;
    private final String codNome;
    private final ArrayList<Jogador> jogadores;
    private final String bandeira;
    private final String bandeiraMini;
    private final String uniforme;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int pontos;
    private int tatica;
    private int defesa;
    private int ataque;

    public Time(String nome, String codNome, String bandeira, String bandeiraMini, String uniforme) {
        Random aleatorio = new Random();
        this.nome = nome;
        this.codNome = codNome;
        this.jogadores = new ArrayList<>();
        this.bandeira = bandeira;
        this.bandeiraMini = bandeiraMini;
        this.uniforme = uniforme;

        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
        //JOGADORES
        this.tatica = aleatorio.nextInt(3) + 1;
        switch (this.tatica) {
            case 1:
                //DEFENSIVO
                this.defesa = 3;
                this.ataque = 1;
                break;
            case 3:
                //OFENSIVO
                this.defesa = 1;
                this.ataque = 3;
                break;
            default:
                //EQUILIBRADO
                this.defesa = 2;
                this.ataque = 2;
                break;
        }
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void inserirJogador(Jogador jogador) {
        this.jogadores.add(jogador);
    }

    public void jogadoresJogando() {
        //COLOCA TRUE PARA JOGADORES QUE IRAM PARTICIPAR DA COPA
        Random aleatorio = new Random();
        int num;

        num = aleatorio.nextInt(2);
        this.jogadores.get(num).setJogando(true);

        for (int i = 0; i < this.defesa; i++) {
            do {
                num = aleatorio.nextInt(4) + 2;
            } while (this.jogadores.get(num).getJogando() == true);
            this.jogadores.get(num).setJogando(true);
        }
        for (int i = 0; i < this.ataque; i++) {
            do {
                num = aleatorio.nextInt(4) + 6;
            } while (this.jogadores.get(num).getJogando() == true);
            this.jogadores.get(num).setJogando(true);
        }
    }

    public void somarVitoria() {
        this.vitorias++;
        this.pontos += 3;
    }

    public void somarDerrota() {
        this.derrotas++;
    }

    public void somarEmpate() {
        this.empates++;
        this.pontos += 1;
    }

    public int mediaAtacantes() {
        JogadorAtacante atacante;
        atacante = new JogadorAtacante();
        int soma = 0, quantidade = 0;
        for (Jogador i : this.jogadores) {
            if (i.getClass() == atacante.getClass() && i.getJogando()) {
                i.setHabilidade();
                soma += i.getHabilidade();
                quantidade++;
            }
        }
        return (soma / quantidade);
    }

    public int mediaDefensores() {
        JogadorAtacante atacante;
        atacante = new JogadorAtacante();
        int soma = 0, quantidade = 0;
        for (Jogador i : this.jogadores) {
            if (i.getClass() != atacante.getClass() && i.getJogando()) {
                i.setHabilidade();
                soma += i.getHabilidade();
                quantidade++;
            }
        }
        return (soma / quantidade);
    }

    public void imprimirJogadores() {
        JogadorAtacante atacante;
        atacante = new JogadorAtacante();
        JogadorDefesa defensor;
        defensor = new JogadorDefesa();

        System.out.println(this.nome);
        this.jogadores.stream().map((i) -> {
            if (i.getClass() == atacante.getClass()) {
                System.out.println("Atacante");
            } else if (i.getClass() == defensor.getClass()) {
                System.out.println("Defensor");
            } else {
                System.out.println("Goleiro");
            }
            return i;
        }).forEachOrdered((i) -> {
            System.out.println(i.getNome());
        });
        System.out.print("\n");

    }

    public void imprimirResultados() {
        System.out.println("Vitórias: " + this.vitorias);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("Empates: " + this.empates);
    }

    public String getNome() {
        return this.nome;
    }

    public String getCodNome() {
        return this.codNome;
    }

    public Jogador getJogador(int n) {
        return this.jogadores.get(n);
    }

    public String getBandeira() {
        return this.bandeira;
    }

    public String getBandeiraMini() {
        return this.bandeiraMini;
    }

    public String getUniforme() {
        return this.uniforme;
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public int getPontos() {
        return pontos;
    }

    public void setTatica(int tatica) {
        this.tatica = tatica;
    }

    public int getTatica() {
        return tatica;
    }
}
