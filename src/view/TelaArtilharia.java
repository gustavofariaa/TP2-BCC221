package view;

import partida.Campeonato;

public class TelaArtilharia extends javax.swing.JFrame {

    public TelaArtilharia() {
        initComponents();

        //CRIAÇÃO DA TABELA DE ARTILHARIA
        String nome, uniforme, gols;

        nome = Campeonato.artilharia.get(0).getNome();
        uniforme = Campeonato.artilharia.get(0).getUniforme();
        gols = Campeonato.artilharia.get(0).getGols() + "";
        jogador1.setText(nome);
        gols1.setText(gols);
        camisa1.setIcon(new javax.swing.ImageIcon(getClass().getResource(uniforme)));

        nome = Campeonato.artilharia.get(1).getNome();
        uniforme = Campeonato.artilharia.get(1).getUniforme();
        gols = Campeonato.artilharia.get(1).getGols() + "";
        jogador2.setText(nome);
        gols2.setText(gols);
        camisa2.setIcon(new javax.swing.ImageIcon(getClass().getResource(uniforme)));

        nome = Campeonato.artilharia.get(2).getNome();
        uniforme = Campeonato.artilharia.get(2).getUniforme();
        gols = Campeonato.artilharia.get(2).getGols() + "";
        jogador3.setText(nome);
        gols3.setText(gols);
        camisa3.setIcon(new javax.swing.ImageIcon(getClass().getResource(uniforme)));

        nome = Campeonato.artilharia.get(3).getNome();
        uniforme = Campeonato.artilharia.get(3).getUniforme();
        gols = Campeonato.artilharia.get(3).getGols() + "";
        jogador4.setText(nome);
        gols4.setText(gols);
        camisa4.setIcon(new javax.swing.ImageIcon(getClass().getResource(uniforme)));

        nome = Campeonato.artilharia.get(4).getNome();
        uniforme = Campeonato.artilharia.get(4).getUniforme();
        gols = Campeonato.artilharia.get(4).getGols() + "";
        jogador5.setText(nome);
        gols5.setText(gols);
        camisa5.setIcon(new javax.swing.ImageIcon(getClass().getResource(uniforme)));

        nome = Campeonato.artilharia.get(5).getNome();
        uniforme = Campeonato.artilharia.get(5).getUniforme();
        gols = Campeonato.artilharia.get(5).getGols() + "";
        jogador6.setText(nome);
        gols6.setText(gols);
        camisa6.setIcon(new javax.swing.ImageIcon(getClass().getResource(uniforme)));

        nome = Campeonato.artilharia.get(6).getNome();
        uniforme = Campeonato.artilharia.get(6).getUniforme();
        gols = Campeonato.artilharia.get(6).getGols() + "";
        jogador7.setText(nome);
        gols7.setText(gols);
        camisa7.setIcon(new javax.swing.ImageIcon(getClass().getResource(uniforme)));

        nome = Campeonato.artilharia.get(7).getNome();
        uniforme = Campeonato.artilharia.get(7).getUniforme();
        gols = Campeonato.artilharia.get(7).getGols() + "";
        jogador8.setText(nome);
        gols8.setText(gols);
        camisa8.setIcon(new javax.swing.ImageIcon(getClass().getResource(uniforme)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        camisa1 = new javax.swing.JLabel();
        jogador1 = new javax.swing.JLabel();
        gols1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        camisa2 = new javax.swing.JLabel();
        jogador2 = new javax.swing.JLabel();
        gols2 = new javax.swing.JLabel();
        camisa3 = new javax.swing.JLabel();
        jogador3 = new javax.swing.JLabel();
        gols3 = new javax.swing.JLabel();
        gols4 = new javax.swing.JLabel();
        jogador4 = new javax.swing.JLabel();
        camisa4 = new javax.swing.JLabel();
        camisa5 = new javax.swing.JLabel();
        jogador5 = new javax.swing.JLabel();
        gols5 = new javax.swing.JLabel();
        jogador6 = new javax.swing.JLabel();
        camisa6 = new javax.swing.JLabel();
        camisa7 = new javax.swing.JLabel();
        jogador7 = new javax.swing.JLabel();
        camisa8 = new javax.swing.JLabel();
        jogador8 = new javax.swing.JLabel();
        gols8 = new javax.swing.JLabel();
        gols7 = new javax.swing.JLabel();
        gols6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximumSize(null);
        setMinimumSize(null);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        camisa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/uniformes/brazil.png"))); // NOI18N

        jogador1.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        jogador1.setText("Jogador");

        gols1.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        gols1.setText("0");

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 13)); // NOI18N
        jLabel8.setText("JOGADOR");

        jLabel9.setFont(new java.awt.Font("Cantarell", 1, 13)); // NOI18N
        jLabel9.setText("GOLS");

        camisa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/uniformes/brazil.png"))); // NOI18N

        jogador2.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        jogador2.setText("Jogador");

        gols2.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        gols2.setText("0");

        camisa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/uniformes/brazil.png"))); // NOI18N

        jogador3.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        jogador3.setText("Jogador");

        gols3.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        gols3.setText("0");

        gols4.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        gols4.setText("0");

        jogador4.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        jogador4.setText("Jogador");

        camisa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/uniformes/brazil.png"))); // NOI18N

        camisa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/uniformes/brazil.png"))); // NOI18N

        jogador5.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        jogador5.setText("Jogador");

        gols5.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        gols5.setText("0");

        jogador6.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        jogador6.setText("Jogador");

        camisa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/uniformes/brazil.png"))); // NOI18N

        camisa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/uniformes/brazil.png"))); // NOI18N

        jogador7.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        jogador7.setText("Jogador");

        camisa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/uniformes/brazil.png"))); // NOI18N

        jogador8.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        jogador8.setText("Jogador");

        gols8.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        gols8.setText("0");

        gols7.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        gols7.setText("0");

        gols6.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        gols6.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(camisa1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jogador1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(camisa5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jogador5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(camisa4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jogador4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(camisa3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jogador3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(camisa7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jogador7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(camisa8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jogador8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(camisa2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jogador2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(camisa6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jogador6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gols5)
                            .addComponent(gols3)
                            .addComponent(gols4)
                            .addComponent(gols2)
                            .addComponent(gols1)
                            .addComponent(gols6)
                            .addComponent(gols7)
                            .addComponent(gols8))
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(camisa1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(camisa2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jogador2)
                                    .addComponent(gols2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(camisa3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(camisa4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(camisa5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(camisa6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(camisa7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jogador7)
                                    .addComponent(gols7))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(camisa8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jogador8)
                                    .addComponent(gols8)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gols1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jogador1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jogador3)
                                            .addComponent(gols3))))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jogador4)
                                    .addComponent(gols4))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jogador5)
                                    .addComponent(gols5))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jogador6)
                                    .addComponent(gols6))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/x-button.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel15.setText("ARTILHARIA");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel16.setText("FIFA World Cup Russia™ 2018 ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel15)))
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //FECHA TELA DE ARTILHARIA
        this.setVisible(false);
        //NÃO DEIXA QUE OUTROS MENUS SEJA ACESSADO ATÉ QUE SAIA DA TELA DE ARTILHARIA
        Menu.controle = false;
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaArtilharia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new TelaArtilharia().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel camisa1;
    private javax.swing.JLabel camisa2;
    private javax.swing.JLabel camisa3;
    private javax.swing.JLabel camisa4;
    private javax.swing.JLabel camisa5;
    private javax.swing.JLabel camisa6;
    private javax.swing.JLabel camisa7;
    private javax.swing.JLabel camisa8;
    private javax.swing.JLabel gols1;
    private javax.swing.JLabel gols2;
    private javax.swing.JLabel gols3;
    private javax.swing.JLabel gols4;
    private javax.swing.JLabel gols5;
    private javax.swing.JLabel gols6;
    private javax.swing.JLabel gols7;
    private javax.swing.JLabel gols8;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jogador1;
    private javax.swing.JLabel jogador2;
    private javax.swing.JLabel jogador3;
    private javax.swing.JLabel jogador4;
    private javax.swing.JLabel jogador5;
    private javax.swing.JLabel jogador6;
    private javax.swing.JLabel jogador7;
    private javax.swing.JLabel jogador8;
    // End of variables declaration//GEN-END:variables
}
