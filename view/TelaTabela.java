package view;

public class TelaTabela extends javax.swing.JFrame {

    private static int posicao;

    public TelaTabela() {
        initComponents();
        posicao = 4;
        this.tabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bProx = new javax.swing.JButton();
        bAnt = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        nomeGrupo = new javax.swing.JLabel();
        Tabela = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pontosTime1 = new javax.swing.JLabel();
        pontosTime2 = new javax.swing.JLabel();
        pontosTime3 = new javax.swing.JLabel();
        pontosTime4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        vitoriasTime1 = new javax.swing.JLabel();
        vitoriasTime2 = new javax.swing.JLabel();
        vitoriasTime3 = new javax.swing.JLabel();
        vitoriasTime4 = new javax.swing.JLabel();
        derrotasTime1 = new javax.swing.JLabel();
        derrotasTime2 = new javax.swing.JLabel();
        derrotasTime3 = new javax.swing.JLabel();
        derrotasTime4 = new javax.swing.JLabel();
        empatesTime1 = new javax.swing.JLabel();
        empatesTime2 = new javax.swing.JLabel();
        empatesTime3 = new javax.swing.JLabel();
        empatesTime4 = new javax.swing.JLabel();
        bandeiraTime1 = new javax.swing.JLabel();
        bandeiraTime2 = new javax.swing.JLabel();
        bandeiraTime3 = new javax.swing.JLabel();
        bandeiraTime4 = new javax.swing.JLabel();
        nomeTime1 = new javax.swing.JLabel();
        nomeTime2 = new javax.swing.JLabel();
        nomeTime3 = new javax.swing.JLabel();
        nomeTime4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Tabela");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(350, 420));
        setMinimumSize(new java.awt.Dimension(350, 420));
        setResizable(false);

        bProx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/next.png"))); // NOI18N
        bProx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProxActionPerformed(evt);
            }
        });

        bAnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/previous.png"))); // NOI18N
        bAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAntActionPerformed(evt);
            }
        });

        bSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/x-button.png"))); // NOI18N
        bSair.setText("Sair");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        nomeGrupo.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        nomeGrupo.setText("GRUPO A");

        Tabela.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setText("Equipe");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel7.setText("P");

        pontosTime1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        pontosTime1.setText("11");

        pontosTime2.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        pontosTime2.setText("11");

        pontosTime3.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        pontosTime3.setText("11");

        pontosTime4.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        pontosTime4.setText("11");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel12.setText("V");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel13.setText("D");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel14.setText("E");

        vitoriasTime1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        vitoriasTime1.setText("11");

        vitoriasTime2.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        vitoriasTime2.setText("11");

        vitoriasTime3.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        vitoriasTime3.setText("11");

        vitoriasTime4.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        vitoriasTime4.setText("11");

        derrotasTime1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        derrotasTime1.setText("11");

        derrotasTime2.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        derrotasTime2.setText("11");

        derrotasTime3.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        derrotasTime3.setText("11");

        derrotasTime4.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        derrotasTime4.setText("11");

        empatesTime1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        empatesTime1.setText("11");

        empatesTime2.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        empatesTime2.setText("11");

        empatesTime3.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        empatesTime3.setText("11");

        empatesTime4.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        empatesTime4.setText("11");

        bandeiraTime1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/russia-mini.png"))); // NOI18N
        bandeiraTime1.setText(" ");

        bandeiraTime2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/uruguay-mini.png"))); // NOI18N
        bandeiraTime2.setText(" ");

        bandeiraTime3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/egypt-mini.png"))); // NOI18N
        bandeiraTime3.setText(" ");

        bandeiraTime4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/saudi-arabia-mini.png"))); // NOI18N
        bandeiraTime4.setText(" ");

        nomeTime1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        nomeTime1.setText("AAA");

        nomeTime2.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        nomeTime2.setText("BBB");

        nomeTime3.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        nomeTime3.setText("CCC");

        nomeTime4.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        nomeTime4.setText("DDD");

        javax.swing.GroupLayout TabelaLayout = new javax.swing.GroupLayout(Tabela);
        Tabela.setLayout(TabelaLayout);
        TabelaLayout.setHorizontalGroup(
            TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabelaLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(TabelaLayout.createSequentialGroup()
                        .addComponent(bandeiraTime2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeTime2))
                    .addGroup(TabelaLayout.createSequentialGroup()
                        .addComponent(bandeiraTime3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeTime3))
                    .addGroup(TabelaLayout.createSequentialGroup()
                        .addComponent(bandeiraTime1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeTime1))
                    .addGroup(TabelaLayout.createSequentialGroup()
                        .addComponent(bandeiraTime4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeTime4)))
                .addGap(18, 18, 18)
                .addGroup(TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pontosTime1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(pontosTime2))
                            .addComponent(pontosTime3))
                        .addComponent(pontosTime4)))
                .addGap(18, 18, 18)
                .addGroup(TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vitoriasTime1)
                    .addComponent(jLabel12)
                    .addComponent(vitoriasTime2)
                    .addComponent(vitoriasTime3)
                    .addComponent(vitoriasTime4))
                .addGap(18, 18, 18)
                .addGroup(TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(derrotasTime1)
                    .addComponent(derrotasTime2)
                    .addComponent(derrotasTime3)
                    .addComponent(derrotasTime4))
                .addGap(18, 18, 18)
                .addGroup(TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(empatesTime1)
                    .addComponent(empatesTime2)
                    .addComponent(empatesTime3)
                    .addComponent(empatesTime4))
                .addGap(37, 37, 37))
        );
        TabelaLayout.setVerticalGroup(
            TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabelaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pontosTime1)
                    .addComponent(vitoriasTime1)
                    .addComponent(derrotasTime1)
                    .addComponent(empatesTime1)
                    .addComponent(bandeiraTime1)
                    .addComponent(nomeTime1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pontosTime2)
                    .addComponent(vitoriasTime2)
                    .addComponent(derrotasTime2)
                    .addComponent(empatesTime2)
                    .addComponent(bandeiraTime2)
                    .addComponent(nomeTime2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pontosTime3)
                    .addComponent(vitoriasTime3)
                    .addComponent(derrotasTime3)
                    .addComponent(empatesTime3)
                    .addComponent(bandeiraTime3)
                    .addComponent(nomeTime3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pontosTime4)
                    .addComponent(vitoriasTime4)
                    .addComponent(derrotasTime4)
                    .addComponent(empatesTime4)
                    .addComponent(bandeiraTime4)
                    .addComponent(nomeTime4))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(nomeGrupo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bAnt)
                                .addGap(18, 18, 18)
                                .addComponent(bProx)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(nomeGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bProx)
                    .addComponent(bAnt))
                .addGap(18, 18, 18)
                .addComponent(bSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bProxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProxActionPerformed
        if (posicao <= 28) {
            posicao += 4;
            this.tabela();
        } else {
            posicao = 4;
            this.tabela();
        }
    }//GEN-LAST:event_bProxActionPerformed

    private void bAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAntActionPerformed
        if (posicao > 4) {
            posicao -= 4;
            this.tabela();
        } else {
            posicao = 32;
            this.tabela();
        }
    }//GEN-LAST:event_bAntActionPerformed

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        this.setVisible(false);
        Menu.controle = false;
    }//GEN-LAST:event_bSairActionPerformed
    private void tabela() {
        int num = 64 + (posicao / 4);
        String linha;

        nomeGrupo.setText("GRUPO " + (char) num);

        nomeTime1.setText(TelaTime.times.get(posicao - 4).getCodNome());
        bandeiraTime1.setIcon(new javax.swing.ImageIcon(getClass().getResource(TelaTime.times.get(posicao - 4).getBandeiraMini())));
        linha = "" + TelaTime.times.get(posicao - 4).getPontos();
        pontosTime1.setText(linha);
        linha = "" + TelaTime.times.get(posicao - 4).getVitorias();
        vitoriasTime1.setText(linha);
        linha = "" + TelaTime.times.get(posicao - 4).getDerrotas();
        derrotasTime1.setText(linha);
        linha = "" + TelaTime.times.get(posicao - 4).getEmpates();
        empatesTime1.setText(linha);

        nomeTime2.setText(TelaTime.times.get(posicao - 3).getCodNome());
        bandeiraTime2.setIcon(new javax.swing.ImageIcon(getClass().getResource(TelaTime.times.get(posicao - 3).getBandeiraMini())));
        linha = "" + TelaTime.times.get(posicao - 3).getPontos();
        pontosTime2.setText(linha);
        linha = "" + TelaTime.times.get(posicao - 3).getVitorias();
        vitoriasTime2.setText(linha);
        linha = "" + TelaTime.times.get(posicao - 3).getDerrotas();
        derrotasTime2.setText(linha);
        linha = "" + TelaTime.times.get(posicao - 3).getEmpates();
        empatesTime2.setText(linha);

        nomeTime3.setText(TelaTime.times.get(posicao - 2).getCodNome());
        bandeiraTime3.setIcon(new javax.swing.ImageIcon(getClass().getResource(TelaTime.times.get(posicao - 2).getBandeiraMini())));
        linha = "" + TelaTime.times.get(posicao - 2).getPontos();
        pontosTime3.setText(linha);
        linha = "" + TelaTime.times.get(posicao - 2).getVitorias();
        vitoriasTime3.setText(linha);
        linha = "" + TelaTime.times.get(posicao - 2).getDerrotas();
        derrotasTime3.setText(linha);
        linha = "" + TelaTime.times.get(posicao - 2).getEmpates();
        empatesTime3.setText(linha);

        nomeTime4.setText(TelaTime.times.get(posicao - 1).getCodNome());
        bandeiraTime4.setIcon(new javax.swing.ImageIcon(getClass().getResource(TelaTime.times.get(posicao - 1).getBandeiraMini())));
        linha = "" + TelaTime.times.get(posicao - 1).getPontos();
        pontosTime4.setText(linha);
        linha = "" + TelaTime.times.get(posicao - 1).getVitorias();
        vitoriasTime4.setText(linha);
        linha = "" + TelaTime.times.get(posicao - 1).getDerrotas();
        derrotasTime4.setText(linha);
        linha = "" + TelaTime.times.get(posicao - 1).getEmpates();
        empatesTime4.setText(linha);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Tabela;
    private javax.swing.JButton bAnt;
    private javax.swing.JButton bProx;
    private javax.swing.JButton bSair;
    private javax.swing.JLabel bandeiraTime1;
    private javax.swing.JLabel bandeiraTime2;
    private javax.swing.JLabel bandeiraTime3;
    private javax.swing.JLabel bandeiraTime4;
    private javax.swing.JLabel derrotasTime1;
    private javax.swing.JLabel derrotasTime2;
    private javax.swing.JLabel derrotasTime3;
    private javax.swing.JLabel derrotasTime4;
    private javax.swing.JLabel empatesTime1;
    private javax.swing.JLabel empatesTime2;
    private javax.swing.JLabel empatesTime3;
    private javax.swing.JLabel empatesTime4;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel nomeGrupo;
    private javax.swing.JLabel nomeTime1;
    private javax.swing.JLabel nomeTime2;
    private javax.swing.JLabel nomeTime3;
    private javax.swing.JLabel nomeTime4;
    private javax.swing.JLabel pontosTime1;
    private javax.swing.JLabel pontosTime2;
    private javax.swing.JLabel pontosTime3;
    private javax.swing.JLabel pontosTime4;
    private javax.swing.JLabel vitoriasTime1;
    private javax.swing.JLabel vitoriasTime2;
    private javax.swing.JLabel vitoriasTime3;
    private javax.swing.JLabel vitoriasTime4;
    // End of variables declaration//GEN-END:variables
}
