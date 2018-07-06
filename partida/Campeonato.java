package partida;

import jogadores.Jogador;
import java.util.ArrayList;
import java.util.Random;

public class Campeonato {

    public static ArrayList<Jogador> artilharia = new ArrayList<>();
    public static ArrayList<Time> tabelaGrupos = new ArrayList<>();

    public static void simulaJogo(Data data, Time casa, Time visitante) {
        Random aleatorio = new Random();
        Partida partida = new Partida(casa, visitante);
        int A, B;
        for (int i = 0; i < 10; i++) {
            A = (aleatorio.nextInt(10) * casa.mediaAtacantes()) / 100;
            B = (aleatorio.nextInt(10) * casa.mediaDefensores()) / 150;
            if (A > B) {
                partida.golCasa();
            }
            A = (aleatorio.nextInt(10) * visitante.mediaAtacantes()) / 100;
            B = (aleatorio.nextInt(10) * visitante.mediaDefensores()) / 150;
            if (A > B) {
                partida.golVisitante();
            }
        }

        if (partida.getGolsCasa() > partida.getGolsVisitante()) {
            partida.ganhar(partida.getCasa());
            partida.perder(partida.getVisitante());
        } else if (partida.getGolsCasa() < partida.getGolsVisitante()) {
            partida.ganhar(partida.getVisitante());
            partida.perder(partida.getCasa());
        } else {
            partida.empatar(partida.getCasa());
            partida.empatar(partida.getVisitante());
        }

        //TESTE
        String nomeCasa = partida.getCasa().getCodNome();
        String nomeVisitante = partida.getVisitante().getCodNome();
        int golsCasa = partida.getGolsCasa();
        int golsVisitante = partida.getGolsVisitante();
        String placar = nomeCasa + " " + golsCasa + " X " + golsVisitante + " " + nomeVisitante;
    }

    public static void faseGrupos(Time grupos[][]) {
        Data data = new Data(14, 6, 2018);
        //GRUPO A
        data.setData(14, 06, 2018);
        simulaJogo(data, grupos[0][0], grupos[0][1]);
        data.setData(15, 06, 2018);
        simulaJogo(data, grupos[0][2], grupos[0][3]);
        data.setData(19, 06, 2018);
        simulaJogo(data, grupos[0][0], grupos[0][2]);
        data.setData(20, 06, 2018);
        simulaJogo(data, grupos[0][3], grupos[0][1]);
        data.setData(25, 06, 2018);
        simulaJogo(data, grupos[0][3], grupos[0][0]);
        data.setData(25, 06, 2018);
        simulaJogo(data, grupos[0][1], grupos[0][2]);

        //GRUPO B
        data.setData(15, 06, 2018);
        simulaJogo(data, grupos[1][2], grupos[1][3]);
        data.setData(15, 06, 2018);
        simulaJogo(data, grupos[1][0], grupos[1][1]);
        data.setData(20, 06, 2018);
        simulaJogo(data, grupos[1][0], grupos[1][2]);
        data.setData(20, 06, 2018);
        simulaJogo(data, grupos[1][3], grupos[1][1]);
        data.setData(25, 06, 2018);
        simulaJogo(data, grupos[1][1], grupos[1][2]);
        data.setData(25, 06, 2018);
        simulaJogo(data, grupos[1][3], grupos[1][0]);

        //GRUPO C
        data.setData(16, 06, 2018);
        simulaJogo(data, grupos[2][0], grupos[2][1]);
        data.setData(16, 06, 2018);
        simulaJogo(data, grupos[2][2], grupos[2][3]);
        data.setData(21, 06, 2018);
        simulaJogo(data, grupos[2][3], grupos[2][1]);
        data.setData(21, 06, 2018);
        simulaJogo(data, grupos[2][0], grupos[2][2]);
        data.setData(26, 06, 2018);
        simulaJogo(data, grupos[2][3], grupos[2][0]);
        data.setData(26, 06, 2018);
        simulaJogo(data, grupos[2][1], grupos[2][2]);

        //GRUPO D
        data.setData(16, 06, 2018);
        simulaJogo(data, grupos[3][0], grupos[3][1]);
        data.setData(16, 06, 2018);
        simulaJogo(data, grupos[3][2], grupos[3][3]);
        data.setData(21, 06, 2018);
        simulaJogo(data, grupos[3][0], grupos[3][2]);
        data.setData(21, 06, 2018);
        simulaJogo(data, grupos[3][3], grupos[3][1]);
        data.setData(26, 06, 2018);
        simulaJogo(data, grupos[3][1], grupos[3][2]);
        data.setData(26, 06, 2018);
        simulaJogo(data, grupos[3][3], grupos[3][0]);

        //GRUPO E
        data.setData(17, 06, 2018);
        simulaJogo(data, grupos[4][2], grupos[4][3]);
        data.setData(17, 06, 2018);
        simulaJogo(data, grupos[4][0], grupos[4][1]);
        data.setData(22, 06, 2018);
        simulaJogo(data, grupos[4][0], grupos[4][2]);
        data.setData(22, 06, 2018);
        simulaJogo(data, grupos[4][3], grupos[4][1]);
        data.setData(27, 06, 2018);
        simulaJogo(data, grupos[4][3], grupos[4][0]);
        data.setData(27, 06, 2018);
        simulaJogo(data, grupos[4][1], grupos[4][2]);

        //GRUPO F
        data.setData(17, 06, 2018);
        simulaJogo(data, grupos[5][0], grupos[5][1]);
        data.setData(18, 06, 2018);
        simulaJogo(data, grupos[5][2], grupos[5][3]);
        data.setData(23, 06, 2018);
        simulaJogo(data, grupos[5][3], grupos[5][1]);
        data.setData(23, 06, 2018);
        simulaJogo(data, grupos[5][0], grupos[5][2]);
        data.setData(27, 06, 2018);
        simulaJogo(data, grupos[5][1], grupos[5][2]);
        data.setData(27, 06, 2018);
        simulaJogo(data, grupos[5][3], grupos[5][0]);

        //GRUPO G
        data.setData(18, 06, 2018);
        simulaJogo(data, grupos[6][0], grupos[6][1]);
        data.setData(18, 06, 2018);
        simulaJogo(data, grupos[6][2], grupos[6][3]);
        data.setData(23, 06, 2018);
        simulaJogo(data, grupos[6][0], grupos[6][2]);
        data.setData(24, 06, 2018);
        simulaJogo(data, grupos[6][3], grupos[6][1]);
        data.setData(28, 06, 2018);
        simulaJogo(data, grupos[6][3], grupos[6][0]);
        data.setData(28, 06, 2018);
        simulaJogo(data, grupos[6][1], grupos[6][2]);

        //GRUPO H
        data.setData(19, 06, 2018);
        simulaJogo(data, grupos[7][2], grupos[7][3]);
        data.setData(19, 06, 2018);
        simulaJogo(data, grupos[7][0], grupos[7][1]);
        data.setData(24, 06, 2018);
        simulaJogo(data, grupos[7][3], grupos[7][1]);
        data.setData(24, 06, 2018);
        simulaJogo(data, grupos[7][0], grupos[7][2]);
        data.setData(28, 06, 2018);
        simulaJogo(data, grupos[7][1], grupos[7][2]);
        data.setData(28, 06, 2018);
        simulaJogo(data, grupos[7][3], grupos[7][0]);

        for (int i = 0; i < 8; i++) {
            bubbleSort(grupos, i);
        }
    }

    private static void bubbleSort(Time vetor[][], int grupo) {
        boolean troca = true;
        Time aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < 4 - 1; i++) {
                if (vetor[grupo][i].getPontos() < vetor[grupo][i + 1].getPontos()) {
                    aux = vetor[grupo][i];
                    vetor[grupo][i] = vetor[grupo][i + 1];
                    vetor[grupo][i + 1] = aux;
                    troca = true;
                }
            }
        }
    }

    public static Time simulaJogoCopa(Data data, Time casa, Time visitante) {
        Random aleatorio = new Random();
        Partida partida = new Partida(casa, visitante);
        int A, B;
        int golPenaltiCasa, golPenaltiVisitante;

        for (int i = 0; i < 10; i++) {
            A = (aleatorio.nextInt(10) * casa.mediaAtacantes()) / 100;
            B = (aleatorio.nextInt(10) * casa.mediaDefensores()) / 150;
            if (A > B) {
                partida.golCasa();
            }
        }
        for (int i = 0; i < 10; i++) {
            A = (aleatorio.nextInt(10) * visitante.mediaAtacantes()) / 100;
            B = (aleatorio.nextInt(10) * visitante.mediaDefensores()) / 150;
            if (A > B) {
                partida.golVisitante();
            }
        }

        if (partida.getGolsCasa() > partida.getGolsVisitante()) {
            //partida.ganhar(partida.getCasa());
            //partida.perder(partida.getVisitante());      
            return casa;
        } else if (partida.getGolsCasa() < partida.getGolsVisitante()) {
            //partida.ganhar(partida.getVisitante());
            //partida.perder(partida.getCasa());    
            return visitante;
        } else {
            partida.setPenalti(true);
            do {
                golPenaltiCasa = golPenaltiVisitante = 0;
                for (int i = 0; i < 5; i++) {
                    A = (aleatorio.nextInt(10) * casa.mediaAtacantes()) / 100;
                    B = (aleatorio.nextInt(10) * casa.mediaDefensores()) / 150;
                    if (A > B) {
                        golPenaltiCasa++;
                    }

                    A = (aleatorio.nextInt(10) * visitante.mediaAtacantes()) / 100;
                    B = (aleatorio.nextInt(10) * visitante.mediaDefensores()) / 150;
                    if (A > B) {
                        golPenaltiVisitante++;
                    }
                }
            } while (golPenaltiCasa == golPenaltiVisitante);
        }

        if (golPenaltiCasa > golPenaltiVisitante) {
            //partida.ganhar(partida.getCasa());
            //partida.perder(partida.getVisitante());
            //partida.imprimirPlacarPenalti(golPenaltiCasa, golPenaltiVisitante);
            return casa;
        }
        //partida.ganhar(partida.getVisitante());
        //partida.perder(partida.getCasa());
        //partida.imprimirPlacarPenalti(golPenaltiCasa, golPenaltiVisitante);
        return visitante;
    }

    public static Time copa(Time grupos[][]) {
        Data data = new Data(30, 06, 2018);

        //OITAVAS DE FINAL
        ArrayList<Time> oitavas;
        oitavas = new ArrayList<>();
        data.setData(30, 06, 2018);
        oitavas.add(simulaJogoCopa(data, grupos[0][0], grupos[1][1]));
        oitavas.add(simulaJogoCopa(data, grupos[2][0], grupos[3][1]));
        data.setData(01, 07, 2018);
        oitavas.add(simulaJogoCopa(data, grupos[1][0], grupos[0][1]));
        oitavas.add(simulaJogoCopa(data, grupos[3][0], grupos[2][1]));
        data.setData(02, 07, 2018);
        oitavas.add(simulaJogoCopa(data, grupos[4][0], grupos[5][1]));
        oitavas.add(simulaJogoCopa(data, grupos[6][0], grupos[7][1]));
        data.setData(03, 07, 2018);
        oitavas.add(simulaJogoCopa(data, grupos[5][0], grupos[4][1]));
        oitavas.add(simulaJogoCopa(data, grupos[7][0], grupos[6][1]));

        //QUARTAS DE FINAL
        ArrayList<Time> quartas;
        quartas = new ArrayList<>();
        data.setData(06, 07, 2018);
        quartas.add(simulaJogoCopa(data, oitavas.get(0), oitavas.get(1)));
        quartas.add(simulaJogoCopa(data, oitavas.get(4), oitavas.get(5)));
        data.setData(07, 07, 2018);
        quartas.add(simulaJogoCopa(data, oitavas.get(2), oitavas.get(3)));
        quartas.add(simulaJogoCopa(data, oitavas.get(6), oitavas.get(7)));

        //SEMIFINAL
        ArrayList<Time> semi;
        semi = new ArrayList<>();
        data.setData(10, 07, 2018);
        semi.add(simulaJogoCopa(data, quartas.get(0), quartas.get(1)));
        data.setData(11, 07, 2018);
        semi.add(simulaJogoCopa(data, quartas.get(2), quartas.get(3)));

        //FINAL
        data.setData(15, 7, 2018);
        Time time = simulaJogoCopa(data, semi.get(0), semi.get(1));

        //RETORNA O TIME CAMPEÃO
        return time;
    }

    public static void artilharia(ArrayList<Time> time) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < 10; j++) {
                artilharia.add(count++, time.get(i).getJogador(j));
            }
        }
        boolean troca = true;
        Jogador aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < 320 - 1; i++) {
                if (artilharia.get(i).getGols() < artilharia.get(i + 1).getGols()) {
                    aux = artilharia.get(i);
                    artilharia.set(i, artilharia.get(i + 1));
                    artilharia.set(i + 1, aux);
                    troca = true;
                }
            }
        }
    }

    public static void criarTabelaGrupos(ArrayList<Time> time) {;
        for (int i = 0; i < 32; i++) {
            tabelaGrupos.add(time.get(i));
        }

        bubbleSortTabela(0, 4);
        bubbleSortTabela(4, 8);
        bubbleSortTabela(8, 12);
        bubbleSortTabela(12, 16);
        bubbleSortTabela(16, 20);
        bubbleSortTabela(20, 24);
        bubbleSortTabela(24, 28);
        bubbleSortTabela(28, 32);
    }

    public static void bubbleSortTabela(int tam1, int tam2) {
        boolean troca = true;
        Time aux;
        while (troca) {
            troca = false;
            for (int i = tam1; i < tam2 - 1; i++) {
                if (tabelaGrupos.get(i).getPontos() < tabelaGrupos.get(i + 1).getPontos()) {
                    aux = tabelaGrupos.get(i);
                    tabelaGrupos.set(i, tabelaGrupos.get(i + 1));
                    tabelaGrupos.set(i + 1, aux);
                    troca = true;
                }
            }
        }
    }
}

/*
    public static void imprimeArtilharia(int quant) {
        for (int i = 0; i < quant; i++) {
            System.out.println("Jogador : " + art.get(i).getNome() + "   " + art.get(i).getGols() + " gols");
        }
    }
    public static void imprimirTabela(Time grupos[][]) {
        for (int i = 0; i < 8; i++) {
            System.out.println("\nGrupo " + (char) (65 + i));
            for (int j = 0; j < 4; j++) {
                System.out.println(grupos[i][j].getNome() + " " + grupos[i][j].getPontos());
            }
        }
    }
 */
