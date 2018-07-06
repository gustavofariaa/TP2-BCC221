package view;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.plaf.metal.MetalButtonUI;

public class Menu extends javax.swing.JFrame {

    public static Boolean eTime;
    public static Boolean eJogadores;
    public static Boolean ePartida;
    public static Boolean eArtilharia;
    public static Boolean eTabela;

    public static Boolean controle;

    public Menu() {
        initComponents();
        eTime = false;
        eJogadores = false;
        ePartida = false;
        eArtilharia = false;
        eTabela = false;
        controle = false;
        bInfo.setUI(new MetalButtonUI());
        bInfo.setBackground(new Color(0, 0, 0, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDMenu = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        bTime = new javax.swing.JButton();
        bJogadores = new javax.swing.JButton();
        bSimular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("2018 FIFA World Cup Russia™");
        setResizable(false);

        jDMenu.setMaximumSize(new java.awt.Dimension(600, 400));
        jDMenu.setMinimumSize(new java.awt.Dimension(600, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));

        bTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/escolherTime.png"))); // NOI18N
        bTime.setText("ESCOLHER TIME");
        bTime.setMaximumSize(new java.awt.Dimension(280, 80));
        bTime.setMinimumSize(new java.awt.Dimension(280, 80));
        bTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTimeActionPerformed(evt);
            }
        });

        bJogadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/strategy.png"))); // NOI18N
        bJogadores.setText("GERENCIAR TIME");
        bJogadores.setMaximumSize(new java.awt.Dimension(280, 80));
        bJogadores.setMinimumSize(new java.awt.Dimension(280, 80));
        bJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJogadoresActionPerformed(evt);
            }
        });

        bSimular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/simular.png"))); // NOI18N
        bSimular.setText("SIMULAR COPA");
        bSimular.setMaximumSize(new java.awt.Dimension(280, 80));
        bSimular.setMinimumSize(new java.awt.Dimension(280, 80));
        bSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimularActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/menu.jpg"))); // NOI18N

        bInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/info.png"))); // NOI18N
        bInfo.setMaximumSize(new java.awt.Dimension(38, 38));
        bInfo.setMinimumSize(new java.awt.Dimension(38, 38));
        bInfo.setPreferredSize(new java.awt.Dimension(100, 38));
        bInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bSimular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)
                        .addComponent(bInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSimular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jDMenu.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDMenuLayout = new javax.swing.GroupLayout(jDMenu);
        jDMenu.setLayout(jDMenuLayout);
        jDMenuLayout.setHorizontalGroup(
            jDMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDMenuLayout.setVerticalGroup(
            jDMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimularActionPerformed
        if (ePartida) {
            TelaSimulacao a = new TelaSimulacao();
            jDMenu.add(a);
            a.setVisible(true);
        } else {
            if (eTime) {
                JOptionPane.showMessageDialog(null, "Escolha seus jogadores");
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um time primeiro");
            }
        }
    }//GEN-LAST:event_bSimularActionPerformed

    private void bJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bJogadoresActionPerformed
        if (eJogadores || eTime) {
            TelaJogadores a = new TelaJogadores();
            jDMenu.add(a);
            a.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um time primeiro");
        }
    }//GEN-LAST:event_bJogadoresActionPerformed

    private void bTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTimeActionPerformed
        if (!eTime || !eJogadores) {
            TelaTime a = new TelaTime();
            jDMenu.add(a);
            a.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, TelaTime.times.get(TelaTime.posicao).getNome());
        }
    }//GEN-LAST:event_bTimeActionPerformed

    private void bInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInfoActionPerformed
        TelaInfo a = new TelaInfo();
        jDMenu.add(a);
        a.setVisible(true);
    }//GEN-LAST:event_bInfoActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bInfo;
    private javax.swing.JButton bJogadores;
    private javax.swing.JButton bSimular;
    private javax.swing.JButton bTime;
    private javax.swing.JDesktopPane jDMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
