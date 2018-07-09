package view;

import java.beans.PropertyVetoException;
import java.io.File;
import java.io.FileNotFoundException;
import partida.Time;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import jogadores.Jogador;
import jogadores.JogadorAtacante;
import jogadores.JogadorDefesa;
import jogadores.JogadorGoleiro;

public class TelaTime extends javax.swing.JInternalFrame {

    public static ArrayList<Time> times;
    public static int posicao;

    public TelaTime() {
        initComponents();
        times = new ArrayList<>();
        gerarTimes(times);
        posicao = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bAnt = new javax.swing.JButton();
        bSel = new javax.swing.JButton();
        bPro = new javax.swing.JButton();
        iBandeira = new javax.swing.JLabel();
        iTime = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(600, 421));
        setMinimumSize(new java.awt.Dimension(600, 421));
        setPreferredSize(new java.awt.Dimension(600, 421));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("ESCOLHA SUA SELEÇÃO");

        bAnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/previous.png"))); // NOI18N
        bAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAntActionPerformed(evt);
            }
        });

        bSel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/checked.png"))); // NOI18N
        bSel.setText("ESCOLHER");
        bSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSelActionPerformed(evt);
            }
        });

        bPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/next.png"))); // NOI18N
        bPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProActionPerformed(evt);
            }
        });

        iBandeira.setBackground(new java.awt.Color(255, 255, 255));
        iBandeira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras/russia.png"))); // NOI18N

        iTime.setText("RÚSSIA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(iTime)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(191, 191, 191))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(iBandeira))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(bAnt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bPro))
                            .addComponent(bSel))))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(iBandeira, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bPro)
                    .addComponent(bAnt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSel)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSelActionPerformed
        try {
            Menu.eTime = true;
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaTime.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bSelActionPerformed

    private void bProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProActionPerformed
        //EXIBE PROXIMO TIME
        if (posicao < 32) {
            posicao++;
        }
        try {
            iBandeira.setIcon(new javax.swing.ImageIcon(getClass().getResource(times.get(posicao).getBandeira())));
            iTime.setText(times.get(posicao).getNome());
        } catch (IndexOutOfBoundsException exception) {
            posicao = 0;
            iBandeira.setIcon(new javax.swing.ImageIcon(getClass().getResource(times.get(posicao).getBandeira())));
            iTime.setText(times.get(posicao).getNome());
        }
    }//GEN-LAST:event_bProActionPerformed

    private void bAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAntActionPerformed
        //EXIBE TIME ANTERIOR
        if (posicao > -1) {
            posicao--;
        }
        try {
            iBandeira.setIcon(new javax.swing.ImageIcon(getClass().getResource(times.get(posicao).getBandeira())));
            iTime.setText(times.get(posicao).getNome());
        } catch (ArrayIndexOutOfBoundsException exception) {
            posicao = 31;
            iBandeira.setIcon(new javax.swing.ImageIcon(getClass().getResource(times.get(posicao).getBandeira())));
            iTime.setText(times.get(posicao).getNome());
        }
    }//GEN-LAST:event_bAntActionPerformed

    public static void gerarTimes(ArrayList<Time> time) {
        //GERA TODOS OS TIMES
        Random aleatorio = new Random();
        int numTimes = 32;
        //LEITURA DE ARQUIVOS COM DADOS DOS TIMES
        try {
            Scanner entrada;
            entrada = new Scanner(new File("times.txt"));
            Jogador jogador;
            //TIMES
            String nome, linha, bandeira, bandeiraMini, uniforme;
            for (int i = 0; i < numTimes; i++) {
                //LE DADOS E CONSTROI TIME
                nome = entrada.nextLine();
                linha = entrada.nextLine();
                bandeira = entrada.nextLine();
                bandeiraMini = entrada.nextLine();
                uniforme = entrada.nextLine();
                time.add(new Time(nome, linha, bandeira, bandeiraMini, uniforme));
                //JOGADORES
                for (int j = 0; j < 10; j++) {
                    linha = entrada.nextLine();
                    if (j < 2) {
                        //CONSTROI GOLEIROS
                        String luva = "/imagens/uniformes/luva" + aleatorio.nextInt(8) + ".png";
                        jogador = new JogadorGoleiro(linha, aleatorio.nextInt(17) + 18, luva, aleatorio.nextInt(100),
                                aleatorio.nextInt(100), (aleatorio.nextInt(30) / 100) + 1.7);
                    } else if (j < 6) {
                        //CONSTROI DEFENSORES
                        jogador = new JogadorDefesa(linha, aleatorio.nextInt(17) + 18, uniforme, aleatorio.nextInt(100),
                                aleatorio.nextInt(100), aleatorio.nextInt(100));
                    } else {
                        //CONSTROI ATACANTES
                        jogador = new JogadorAtacante(linha, aleatorio.nextInt(17) + 18, uniforme, aleatorio.nextInt(100),
                                aleatorio.nextInt(100), aleatorio.nextInt(100));
                    }
                    //ADICIONA JOGAR NO TIME
                    time.get(i).inserirJogador(jogador);
                }
                //DEFINE QUAIS JOGADORES VÃO JOGAR
                time.get(i).jogadoresJogando();
            }
            entrada.close();
        } catch (FileNotFoundException entrada) {
            System.out.println("Erro no arquivo!\n"+entrada);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAnt;
    private javax.swing.JButton bPro;
    private javax.swing.JButton bSel;
    private javax.swing.JLabel iBandeira;
    private javax.swing.JLabel iTime;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
