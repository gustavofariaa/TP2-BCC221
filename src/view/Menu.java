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
        jPanel2.setVisible(false);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FIFA World Cup Russia™ 2018 ");
        setResizable(false);

        jDMenu.setMaximumSize(new java.awt.Dimension(600, 400));
        jDMenu.setMinimumSize(new java.awt.Dimension(600, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/escolherTime.png"))); // NOI18N
        bTime.setText("ESCOLHER TIME");
        bTime.setMaximumSize(new java.awt.Dimension(280, 80));
        bTime.setMinimumSize(new java.awt.Dimension(280, 80));
        bTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTimeActionPerformed(evt);
            }
        });
        jPanel1.add(bTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 164, 280, -1));

        bJogadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/strategy.png"))); // NOI18N
        bJogadores.setText("GERENCIAR TIME");
        bJogadores.setMaximumSize(new java.awt.Dimension(280, 80));
        bJogadores.setMinimumSize(new java.awt.Dimension(280, 80));
        bJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJogadoresActionPerformed(evt);
            }
        });
        jPanel1.add(bJogadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 244, 280, -1));

        bSimular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/simular.png"))); // NOI18N
        bSimular.setText("SIMULAR COPA");
        bSimular.setMaximumSize(new java.awt.Dimension(280, 80));
        bSimular.setMinimumSize(new java.awt.Dimension(280, 80));
        bSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimularActionPerformed(evt);
            }
        });
        jPanel1.add(bSimular, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 324, 280, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/menu.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 21, -1, -1));

        bInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/info.png"))); // NOI18N
        bInfo.setMaximumSize(new java.awt.Dimension(38, 38));
        bInfo.setMinimumSize(new java.awt.Dimension(38, 38));
        bInfo.setPreferredSize(new java.awt.Dimension(100, 38));
        bInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInfoActionPerformed(evt);
            }
        });
        jPanel1.add(bInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 360, 38, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 0));
        jLabel4.setText("Trabalho Prático 2 - BCC221");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 0));
        jLabel2.setText("Gustavo Faria Amorim");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 0));
        jLabel3.setText("Gabriel de Oliveira Ribeiro");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/checked.png"))); // NOI18N
        jButton1.setText("CONCLUIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 140, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 380, 210));

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
            bTime.setVisible(false);
            bJogadores.setVisible(false);
            bSimular.setVisible(false);
            bInfo.setVisible(false);
            jPanel2.setVisible(true);
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);        // TODO add your handling code here:
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
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
