package view;

import java.beans.PropertyVetoException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import partida.Campeonato;
import partida.Time;

public class TelaSimulacao extends javax.swing.JInternalFrame {

    public TelaSimulacao() {
        initComponents();
        //EXIBI GIF ALEATORIO
        Random aleatorio = new Random();
        String texto;
        texto = "/imagens/gols/" + aleatorio.nextInt(3) + ".gif";
        tGol.setIcon(new javax.swing.ImageIcon(getClass().getResource(texto)));
        //CONVERTE ARRAYLIST DE TIMES EM MATRIZ
        Time[][] grupos = new Time[8][4];
        int k = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                grupos[i][j] = TelaTime.times.get(k);
                k++;
            }
        }
        //COPA DO MUNDO RUSSIA 2018
        Campeonato.faseGrupos(grupos);
        Time vencedor = Campeonato.copa(grupos);
        //CAMPEAO DA COPA DO MUNDO
        campeao.setText(vencedor.getNome());
        bandeiraCampeao.setIcon(new javax.swing.ImageIcon(getClass().getResource(vencedor.getBandeiraMini())));
        //GERA TABELA DE ARTILHARIA
        Campeonato.artilharia(TelaTime.times);
        //GERA TABELA DE GRUPOS
        Campeonato.criarTabelaGrupos(TelaTime.times);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campeao = new javax.swing.JLabel();
        bandeiraCampeao = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tGol = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bTabela = new javax.swing.JButton();
        bResultados = new javax.swing.JButton();
        bMenu = new javax.swing.JButton();
        bArtilharia = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(600, 421));
        setMinimumSize(new java.awt.Dimension(600, 421));
        setPreferredSize(new java.awt.Dimension(600, 421));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        campeao.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        campeao.setText("AAAAAA");

        bandeiraCampeao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/russia-mini.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel2.setText("CAMPEÃO FIFA World Cup Russia™ 2018 ");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/world-cup-mini.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(bandeiraCampeao)
                        .addGap(6, 6, 6)
                        .addComponent(campeao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bandeiraCampeao)
                        .addComponent(campeao))
                    .addComponent(jLabel3))
                .addGap(8, 8, 8))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tGol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gols/1.gif"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Melhor momento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tGol)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel6)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tGol)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        bTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/playoff.png"))); // NOI18N
        bTabela.setText("Tabela");
        bTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTabelaActionPerformed(evt);
            }
        });

        bResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/match.png"))); // NOI18N
        bResultados.setText("Resultados");
        bResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResultadosActionPerformed(evt);
            }
        });

        bMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/previous2.png"))); // NOI18N
        bMenu.setText("Tela Principal");
        bMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenuActionPerformed(evt);
            }
        });

        bArtilharia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/soccer.png"))); // NOI18N
        bArtilharia.setText("Artilharia");
        bArtilharia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bArtilhariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bArtilharia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(bTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bArtilharia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(bMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenuActionPerformed
        //VOLTA PARA O MENU CASO NENHUMA OUTRA TELA ESTEJA ABERTA
        if (Menu.controle) {
            JOptionPane.showMessageDialog(null, "      Você deixou algum menu aberto.\nPor favor, feche para voltar a tela principal.");
        } else {
            try {
                this.setClosed(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaSimulacao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bMenuActionPerformed

    private void bTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTabelaActionPerformed
        //EXIBI TELA DE TABELAS CASO NENHUMA OUTRA TELA ESTEJA ABERTA
        if (Menu.controle); else {
            new TelaTabela().setVisible(true);
            Menu.controle = true;
        }
    }//GEN-LAST:event_bTabelaActionPerformed

    private void bArtilhariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bArtilhariaActionPerformed
        //EXIBI TELA DE ARTILHARIA CASO NENHUMA OUTRA TELA ESTEJA ABERTA
        if (Menu.controle); else {
            new TelaArtilharia().setVisible(true);
            Menu.controle = true;
        }
    }//GEN-LAST:event_bArtilhariaActionPerformed

    private void bResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResultadosActionPerformed
        //EXIBI TELA DE RESULTADOS CASO NENHUMA OUTRA TELA ESTEJA ABERTA
        if (Menu.controle); else {
            new TelaResultados().setVisible(true);
            Menu.controle = true;
        }
    }//GEN-LAST:event_bResultadosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bArtilharia;
    private javax.swing.JButton bMenu;
    private javax.swing.JButton bResultados;
    private javax.swing.JButton bTabela;
    private javax.swing.JLabel bandeiraCampeao;
    private javax.swing.JLabel campeao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel tGol;
    // End of variables declaration//GEN-END:variables
}
