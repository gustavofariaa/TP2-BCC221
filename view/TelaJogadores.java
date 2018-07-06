package view;

import java.beans.PropertyVetoException;
import static java.lang.Boolean.TRUE;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public final class TelaJogadores extends javax.swing.JInternalFrame {

    public TelaJogadores() {
        initComponents();

        this.tatica(TelaTime.times.get(TelaTime.posicao).getTatica());

        String uniforme = TelaTime.times.get(TelaTime.posicao).getUniforme();
        camisaD.setIcon(new javax.swing.ImageIcon(getClass().getResource(uniforme)));
        camisaA.setIcon(new javax.swing.ImageIcon(getClass().getResource(uniforme)));

        for (int i = 0; i < 10; i++) {
            if (i < 2) {
                cbGoleiro.addItem(TelaTime.times.get(TelaTime.posicao).getJogador(i).getNome());
            } else if (i < 6) {
                cbDefesa1.addItem(TelaTime.times.get(TelaTime.posicao).getJogador(i).getNome());
                cbDefesa2.addItem(TelaTime.times.get(TelaTime.posicao).getJogador(i).getNome());
                cbDefesa3.addItem(TelaTime.times.get(TelaTime.posicao).getJogador(i).getNome());
            } else {
                cbAtaque1.addItem(TelaTime.times.get(TelaTime.posicao).getJogador(i).getNome());
                cbAtaque2.addItem(TelaTime.times.get(TelaTime.posicao).getJogador(i).getNome());
                cbAtaque3.addItem(TelaTime.times.get(TelaTime.posicao).getJogador(i).getNome());
            }
        }

        this.setarComboBox();

        for (int i = 0; i < 10; i++) {
            TelaTime.times.get(TelaTime.posicao).getJogador(i).setJogando(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bDefesa = new javax.swing.JButton();
        bMeio = new javax.swing.JButton();
        bAtaque = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bConcluir = new javax.swing.JButton();
        cbDefesa1 = new javax.swing.JComboBox<>();
        cbGoleiro = new javax.swing.JComboBox<>();
        cbAtaque1 = new javax.swing.JComboBox<>();
        cbDefesa2 = new javax.swing.JComboBox<>();
        cbDefesa3 = new javax.swing.JComboBox<>();
        cbAtaque2 = new javax.swing.JComboBox<>();
        cbAtaque3 = new javax.swing.JComboBox<>();
        tGoleiro = new javax.swing.JLabel();
        tDefesa = new javax.swing.JLabel();
        tAtaque = new javax.swing.JLabel();
        luva = new javax.swing.JLabel();
        camisaD = new javax.swing.JLabel();
        camisaA = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(600, 421));
        setMinimumSize(new java.awt.Dimension(600, 421));
        setPreferredSize(new java.awt.Dimension(600, 421));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        bDefesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/tatica-defesa.png"))); // NOI18N
        bDefesa.setText("Recuado");
        bDefesa.setMaximumSize(new java.awt.Dimension(180, 78));
        bDefesa.setMinimumSize(new java.awt.Dimension(180, 78));
        bDefesa.setPreferredSize(new java.awt.Dimension(180, 78));
        bDefesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDefesaActionPerformed(evt);
            }
        });

        bMeio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/tatica-meio.png"))); // NOI18N
        bMeio.setText("Equilibrado");
        bMeio.setMaximumSize(new java.awt.Dimension(180, 78));
        bMeio.setMinimumSize(new java.awt.Dimension(180, 78));
        bMeio.setPreferredSize(new java.awt.Dimension(180, 78));
        bMeio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMeioActionPerformed(evt);
            }
        });

        bAtaque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/tatica-ataque.png"))); // NOI18N
        bAtaque.setText("Avançado");
        bAtaque.setMaximumSize(new java.awt.Dimension(180, 78));
        bAtaque.setMinimumSize(new java.awt.Dimension(180, 78));
        bAtaque.setPreferredSize(new java.awt.Dimension(180, 78));
        bAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtaqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(bMeio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMeio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel1.setText("GERENCIE SUA SELEÇÃO");

        bConcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/checked.png"))); // NOI18N
        bConcluir.setText("CONCLUIR");
        bConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConcluirActionPerformed(evt);
            }
        });

        cbDefesa1.setMaximumSize(new java.awt.Dimension(160, 25));
        cbDefesa1.setMinimumSize(new java.awt.Dimension(160, 25));
        cbDefesa1.setPreferredSize(new java.awt.Dimension(160, 25));

        cbGoleiro.setMaximumSize(new java.awt.Dimension(160, 25));
        cbGoleiro.setMinimumSize(new java.awt.Dimension(160, 25));
        cbGoleiro.setPreferredSize(new java.awt.Dimension(160, 25));
        cbGoleiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGoleiroActionPerformed(evt);
            }
        });

        cbAtaque1.setMaximumSize(new java.awt.Dimension(160, 25));
        cbAtaque1.setMinimumSize(new java.awt.Dimension(160, 25));
        cbAtaque1.setPreferredSize(new java.awt.Dimension(160, 25));

        cbDefesa2.setMaximumSize(new java.awt.Dimension(160, 25));
        cbDefesa2.setMinimumSize(new java.awt.Dimension(160, 25));
        cbDefesa2.setPreferredSize(new java.awt.Dimension(160, 25));

        cbDefesa3.setMaximumSize(new java.awt.Dimension(160, 25));
        cbDefesa3.setMinimumSize(new java.awt.Dimension(160, 25));
        cbDefesa3.setPreferredSize(new java.awt.Dimension(160, 25));

        cbAtaque2.setMaximumSize(new java.awt.Dimension(160, 25));
        cbAtaque2.setMinimumSize(new java.awt.Dimension(160, 25));
        cbAtaque2.setPreferredSize(new java.awt.Dimension(160, 25));

        cbAtaque3.setMaximumSize(new java.awt.Dimension(160, 25));
        cbAtaque3.setMinimumSize(new java.awt.Dimension(160, 25));
        cbAtaque3.setPreferredSize(new java.awt.Dimension(160, 25));

        tGoleiro.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        tGoleiro.setText("GOLEIRO");

        tDefesa.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        tDefesa.setText("DEFESA");

        tAtaque.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        tAtaque.setText("ATAQUE");

        luva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/uniformes/luva1.png"))); // NOI18N

        camisaD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/uniformes/brazil.png"))); // NOI18N

        camisaA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/uniformes/brazil.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(luva)
                                .addGap(18, 18, 18)
                                .addComponent(tGoleiro))
                            .addComponent(cbGoleiro, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbDefesa3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbDefesa2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbDefesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(camisaD)
                                .addGap(18, 18, 18)
                                .addComponent(tDefesa)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(camisaA)
                                .addGap(18, 18, 18)
                                .addComponent(tAtaque))
                            .addComponent(cbAtaque1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbAtaque2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbAtaque3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(bConcluir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(luva)
                            .addComponent(camisaD)
                            .addComponent(camisaA)
                            .addComponent(tDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbGoleiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbAtaque1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbDefesa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbDefesa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbAtaque2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbDefesa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbAtaque3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tGoleiro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(bConcluir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConcluirActionPerformed
        if (this.jogadoresPartida(TelaTime.times.get(TelaTime.posicao).getTatica())) {
            try {
                Menu.ePartida = true;
                Menu.eJogadores = true;
                this.setClosed(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaJogadores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bConcluirActionPerformed

    private void bAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtaqueActionPerformed
        this.tatica(3);
    }//GEN-LAST:event_bAtaqueActionPerformed

    private void bMeioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMeioActionPerformed
        this.tatica(2);
    }//GEN-LAST:event_bMeioActionPerformed

    private void bDefesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDefesaActionPerformed
        this.tatica(1);
    }//GEN-LAST:event_bDefesaActionPerformed

    private void cbGoleiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGoleiroActionPerformed
        String uniforme = TelaTime.times.get(TelaTime.posicao).getJogador(cbGoleiro.getSelectedIndex()).getUniforme();
        luva.setIcon(new javax.swing.ImageIcon(getClass().getResource(uniforme)));
    }//GEN-LAST:event_cbGoleiroActionPerformed

    private void tatica(int n) {
        switch (n) {
            case 1:
                tGoleiro.setVisible(true);
                tDefesa.setVisible(true);
                tAtaque.setVisible(true);

                cbGoleiro.setVisible(true);
                cbDefesa1.setVisible(true);
                cbDefesa2.setVisible(true);
                cbDefesa3.setVisible(true);
                cbAtaque1.setVisible(true);

                cbAtaque2.setVisible(false);
                cbAtaque3.setVisible(false);
                break;

            case 2:
                tGoleiro.setVisible(true);
                tDefesa.setVisible(true);
                tAtaque.setVisible(true);

                cbGoleiro.setVisible(true);
                cbDefesa1.setVisible(true);
                cbDefesa2.setVisible(true);
                cbAtaque1.setVisible(true);
                cbAtaque2.setVisible(true);

                cbAtaque3.setVisible(false);
                cbDefesa3.setVisible(false);
                break;

            case 3:
                tGoleiro.setVisible(true);
                tDefesa.setVisible(true);
                tAtaque.setVisible(true);

                cbGoleiro.setVisible(true);
                cbDefesa1.setVisible(true);
                cbAtaque1.setVisible(true);
                cbAtaque2.setVisible(true);
                cbAtaque3.setVisible(true);

                cbDefesa2.setVisible(false);
                cbDefesa3.setVisible(false);
                break;

            default:
                tGoleiro.setVisible(false);
                tDefesa.setVisible(false);
                tAtaque.setVisible(false);

                cbGoleiro.setVisible(false);
                cbAtaque1.setVisible(false);
                cbAtaque2.setVisible(false);
                cbAtaque3.setVisible(false);
                cbDefesa1.setVisible(false);
                cbDefesa2.setVisible(false);
                cbDefesa3.setVisible(false);
                break;
        }
        TelaTime.times.get(TelaTime.posicao).setTatica(n);
    }

    private Boolean jogadoresPartida(int n) {
        ArrayList<Integer> jogadoresJogando;
        jogadoresJogando = new ArrayList<>();

        switch (n) {
            case 1:
                jogadoresJogando.add(0, cbGoleiro.getSelectedIndex());
                jogadoresJogando.add(1, cbDefesa1.getSelectedIndex() + 2);
                jogadoresJogando.add(2, cbDefesa2.getSelectedIndex() + 2);
                jogadoresJogando.add(3, cbDefesa3.getSelectedIndex() + 2);
                jogadoresJogando.add(4, cbAtaque1.getSelectedIndex() + 6);

                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (i == j) {
                        } else if (Objects.equals(jogadoresJogando.get(i), jogadoresJogando.get(j))) {
                            JOptionPane.showMessageDialog(null, "Jogador repetido na DEFESA.\n  Escolha outro defensor");
                            return false;
                        }
                    }
                }
                break;

            case 2:
                jogadoresJogando.add(0, cbGoleiro.getSelectedIndex());
                jogadoresJogando.add(1, cbDefesa1.getSelectedIndex() + 2);
                jogadoresJogando.add(2, cbDefesa2.getSelectedIndex() + 2);
                jogadoresJogando.add(3, cbAtaque1.getSelectedIndex() + 6);
                jogadoresJogando.add(4, cbAtaque2.getSelectedIndex() + 6);

                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (i == j) {
                        } else if (Objects.equals(jogadoresJogando.get(i), jogadoresJogando.get(j))) {
                            if (jogadoresJogando.get(i) < 3) {
                                JOptionPane.showMessageDialog(null, "Jogador repetido na DEFESA.\n  Escolha outro defensor");
                            } else {
                                JOptionPane.showMessageDialog(null, "Jogador repetido no ATAQUE.\n  Escolha outro atacante");
                            }
                            return false;
                        }
                    }
                }
                break;

            case 3:
                jogadoresJogando.add(0, cbGoleiro.getSelectedIndex());
                jogadoresJogando.add(1, cbDefesa1.getSelectedIndex() + 2);
                jogadoresJogando.add(2, cbAtaque1.getSelectedIndex() + 6);
                jogadoresJogando.add(3, cbAtaque2.getSelectedIndex() + 6);
                jogadoresJogando.add(4, cbAtaque3.getSelectedIndex() + 6);

                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (i == j) {
                        } else if (Objects.equals(jogadoresJogando.get(i), jogadoresJogando.get(j))) {
                            JOptionPane.showMessageDialog(null, "Jogador repetido no ATAQUE.\n  Escolha outro atacante");
                            return false;
                        }
                    }
                }
                break;

            default:
                return false;
        }

        for (int i = 0; i < 5; i++) {
            TelaTime.times.get(TelaTime.posicao).getJogador(jogadoresJogando.get(i)).setJogando(TRUE);
        }

        //TESTE
        //colocar nome dentro do metodo media
        int media;
        media = TelaTime.times.get(TelaTime.posicao).mediaAtacantes();
        System.out.println(media);
        media = TelaTime.times.get(TelaTime.posicao).mediaDefensores();
        System.out.println(media);

        return true;
    }

    public void setarComboBox() {
        //COMBOBOX GOLEIRO
        for (int i = 0; i < 2; i++) {
            if (TelaTime.times.get(TelaTime.posicao).getJogador(i).getJogando()) {
                cbGoleiro.setSelectedIndex(i);
            }
        }
        
        //COMBOBOX DEFESA
        int cont;
        for (int i = 2; i < 6; i++) {
            if (TelaTime.times.get(TelaTime.posicao).getJogador(i).getJogando()) {
                cbDefesa1.setSelectedIndex(i - 2);
                break;
            }
        }
        cont = 0;
        for (int i = 2; i < 6; i++) {
            if (TelaTime.times.get(TelaTime.posicao).getJogador(i).getJogando()) {
                cont++;
                if (cont == 2) {
                    cbDefesa2.setSelectedIndex(i - 2);
                    break;
                }
            }
        }
        cont = 0;
        for (int i = 2; i < 6; i++) {
            if (TelaTime.times.get(TelaTime.posicao).getJogador(i).getJogando()) {
                cont++;
                if (cont == 3) {
                    cbDefesa3.setSelectedIndex(i - 2);
                    break;
                }
            }
        }
        
        //COMBOBOX ATAQUE
        for (int i = 6; i < 10; i++) {
            if (TelaTime.times.get(TelaTime.posicao).getJogador(i).getJogando()) {
                cbAtaque1.setSelectedIndex(i - 6);
                break;
            }
        }
        cont = 0;
        for (int i = 6; i < 10; i++) {
            if (TelaTime.times.get(TelaTime.posicao).getJogador(i).getJogando()) {
                cont++;
                if (cont == 2) {
                    cbAtaque2.setSelectedIndex(i - 6);
                    break;
                }
            }
        }
        cont = 0;
        for (int i = 6; i < 10; i++) {
            if (TelaTime.times.get(TelaTime.posicao).getJogador(i).getJogando()) {
                cont++;
                if (cont == 3) {
                    cbAtaque3.setSelectedIndex(i - 6);
                    break;
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtaque;
    private javax.swing.JButton bConcluir;
    private javax.swing.JButton bDefesa;
    private javax.swing.JButton bMeio;
    private javax.swing.JLabel camisaA;
    private javax.swing.JLabel camisaD;
    private javax.swing.JComboBox<String> cbAtaque1;
    private javax.swing.JComboBox<String> cbAtaque2;
    private javax.swing.JComboBox<String> cbAtaque3;
    private javax.swing.JComboBox<String> cbDefesa1;
    private javax.swing.JComboBox<String> cbDefesa2;
    private javax.swing.JComboBox<String> cbDefesa3;
    private javax.swing.JComboBox<String> cbGoleiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel luva;
    private javax.swing.JLabel tAtaque;
    private javax.swing.JLabel tDefesa;
    private javax.swing.JLabel tGoleiro;
    // End of variables declaration//GEN-END:variables
}
