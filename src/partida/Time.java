package partida;

import jogadores.JogadorAtacante;
import jogadores.Jogador;
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

    public void inserirJogador(Jogador jogador) {
        //INSERE UM JOGADOR NO TIME
        this.jogadores.add(jogador);
    }

    public ArrayList<Jogador> getJogadores() {
        //RETORNA LISTA DE JOGADORES
        return jogadores;
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
        //SOMA UMA VITORIA E 3 PONTOS PARA O TIME
        this.vitorias++;
        this.pontos += 3;
    }

    public void somarDerrota() {
        //SOMA UMA DERTOTA PARA O TIME
        this.derrotas++;
    }

    public void somarEmpate() {
        //SOMA UM EMPATE E 1 PONTOS PARA O TIME
        this.empates++;
        this.pontos += 1;
    }

    public int mediaAtacantes() {
        //MEDIA DE HABILIDADE DOS JOGADORES DO ATAQUE
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
        //MEDIA DE HABILIDADE DOS JOGADORES DA DEFESA
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

    public String getNome() {
        //RETORNA NOME DO TIME
        return this.nome;
    }

    public String getCodNome() {
        //RETORNA NOME DO TIME EM FORMATO DE EXIBIÇÃO EM PLACAR
        return this.codNome;
    }

    public Jogador getJogador(int n) {
        //RETORNA UM JOGADOR EM UMA POSICAO ESPECIFICA DA LISA DE JOGADORES
        return this.jogadores.get(n);
    }

    public String getBandeira() {
        //RETORNA O CAMINHO PARA A IMAGEM DA BANDEIRA DO TIME
        return this.bandeira;
    }

    public String getBandeiraMini() {
        //RETORNA O CAMINHO PARA A IMAGEM DA MINI BANDEIRA DO TIME
        return this.bandeiraMini;
    }

    public String getUniforme() {
        //RETORNA O CAMINHO PARA A IMAGEM DO UNIFORME DO TIME
        return this.uniforme;
    }

    public int getVitorias() {
        //RETORNA A QUANTIDADE DE VITORIAS DO TIME
        return this.vitorias;
    }

    public int getDerrotas() {
        //RETORNA A QUANTIDADE DE DERROTAS DO TIME
        return this.derrotas;
    }

    public int getEmpates() {
        //RETORNA A QUANTIDADE DE EMPATES DO TIME
        return this.empates;
    }

    public int getPontos() {
        //RETORNA A QUANTIDADE DE PONTOS DO TIME
        return pontos;
    }

    public void setTatica(int tatica) {
        //ATRIBUI O CODIGO (0 ~ 2) DA TATICA AO TIME
        this.tatica = tatica;
    }

    public int getTatica() {
        //RETORNA A O NUMERO DA TATICA DO TIME
        return tatica;
    }
}
