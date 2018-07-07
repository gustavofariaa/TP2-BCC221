package view;

import partida.Campeonato;
import partida.Partida;

public final class TelaResultados extends javax.swing.JFrame {

    private static int fase;

    public TelaResultados() {
        initComponents();
        fase = 1;
        exibir();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bSair = new javax.swing.JButton();
        bProx = new javax.swing.JButton();
        bAnt = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tData01 = new javax.swing.JLabel();
        tResultado01 = new javax.swing.JLabel();
        bandeira02 = new javax.swing.JLabel();
        bandeira01 = new javax.swing.JLabel();
        bandeira03 = new javax.swing.JLabel();
        tResultado02 = new javax.swing.JLabel();
        tData02 = new javax.swing.JLabel();
        bandeira04 = new javax.swing.JLabel();
        tData03 = new javax.swing.JLabel();
        tResultado03 = new javax.swing.JLabel();
        bandeira05 = new javax.swing.JLabel();
        bandeira06 = new javax.swing.JLabel();
        tData04 = new javax.swing.JLabel();
        tResultado04 = new javax.swing.JLabel();
        bandeira07 = new javax.swing.JLabel();
        bandeira08 = new javax.swing.JLabel();
        tData05 = new javax.swing.JLabel();
        tResultado05 = new javax.swing.JLabel();
        bandeira09 = new javax.swing.JLabel();
        bandeira10 = new javax.swing.JLabel();
        tData06 = new javax.swing.JLabel();
        tResultado06 = new javax.swing.JLabel();
        bandeira11 = new javax.swing.JLabel();
        bandeira12 = new javax.swing.JLabel();
        bandeira14 = new javax.swing.JLabel();
        tResultado07 = new javax.swing.JLabel();
        tData07 = new javax.swing.JLabel();
        bandeira13 = new javax.swing.JLabel();
        bandeira16 = new javax.swing.JLabel();
        tResultado08 = new javax.swing.JLabel();
        tData08 = new javax.swing.JLabel();
        bandeira15 = new javax.swing.JLabel();
        tData14 = new javax.swing.JLabel();
        bandeira26 = new javax.swing.JLabel();
        tResultado15 = new javax.swing.JLabel();
        bandeira32 = new javax.swing.JLabel();
        tData15 = new javax.swing.JLabel();
        bandeira27 = new javax.swing.JLabel();
        tData16 = new javax.swing.JLabel();
        bandeira30 = new javax.swing.JLabel();
        bandeira28 = new javax.swing.JLabel();
        bandeira29 = new javax.swing.JLabel();
        bandeira31 = new javax.swing.JLabel();
        tResultado16 = new javax.swing.JLabel();
        tResultado14 = new javax.swing.JLabel();
        tResultado13 = new javax.swing.JLabel();
        bandeira25 = new javax.swing.JLabel();
        bandeira24 = new javax.swing.JLabel();
        tData13 = new javax.swing.JLabel();
        bandeira23 = new javax.swing.JLabel();
        tResultado12 = new javax.swing.JLabel();
        tData12 = new javax.swing.JLabel();
        bandeira22 = new javax.swing.JLabel();
        bandeira21 = new javax.swing.JLabel();
        tResultado11 = new javax.swing.JLabel();
        tData11 = new javax.swing.JLabel();
        bandeira20 = new javax.swing.JLabel();
        tData10 = new javax.swing.JLabel();
        tResultado10 = new javax.swing.JLabel();
        bandeira19 = new javax.swing.JLabel();
        bandeira17 = new javax.swing.JLabel();
        bandeira18 = new javax.swing.JLabel();
        tResultado09 = new javax.swing.JLabel();
        tData09 = new javax.swing.JLabel();
        tFase = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        bSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/x-button.png"))); // NOI18N
        bSair.setText("Sair");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tData01.setText("00 / 00 / 0000");

        tResultado01.setText("MMM 00 X 00 MMM");

        bandeira02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/default.png"))); // NOI18N

        bandeira01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/default.png"))); // NOI18N

        bandeira03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/default.png"))); // NOI18N

        tResultado02.setText("MMM 00 X 00 MMM");

        tData02.setText("00 / 00 / 0000");

        bandeira04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/default.png"))); // NOI18N

        tData03.setText("00 / 00 / 0000");

        tResultado03.setText("MMM 00 X 00 MMM");

        bandeira05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/default.png"))); // NOI18N

        bandeira06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/default.png"))); // NOI18N

        tData04.setText("00 / 00 / 0000");

        tResultado04.setText("MMM 00 X 00 MMM");

        bandeira07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/default.png"))); // NOI18N

        bandeira08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/default.png"))); // NOI18N

        tData05.setText("00 / 00 / 0000");

        tResultado05.setText("MMM 00 X 00 MMM");

        bandeira09.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/argentina-mini.png"))); // NOI18N

        bandeira10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/argentina-mini.png"))); // NOI18N

        tData06.setText("00 / 00 / 0000");

        tResultado06.setText("MMM 00 X 00 MMM");

        bandeira11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/argentina-mini.png"))); // NOI18N

        bandeira12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/argentina-mini.png"))); // NOI18N

        bandeira14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/argentina-mini.png"))); // NOI18N

        tResultado07.setText("MMM 00 X 00 MMM");

        tData07.setText("00 / 00 / 0000");

        bandeira13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/argentina-mini.png"))); // NOI18N

        bandeira16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/argentina-mini.png"))); // NOI18N

        tResultado08.setText("MMM 00 X 00 MMM");

        tData08.setText("00 / 00 / 0000");

        bandeira15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/argentina-mini.png"))); // NOI18N

        tData14.setText("00 / 00 / 0000");

        bandeira26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/argentina-mini.png"))); // NOI18N

        tResultado15.setText("MMM 00 X 00 MMM");

        bandeira32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/argentina-mini.png"))); // NOI18N

        tData15.setText("00 / 00 / 0000");

        bandeira27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/argentina-mini.png"))); // NOI18N

        tData16.setText("00 / 00 / 0000");

        bandeira30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/argentina-mini.png"))); // NOI18N

        bandeira28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/argentina-mini.png"))); // NOI18N

        bandeira29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/argentina-mini.png"))); // NOI18N

        bandeira31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/argentina-mini.png"))); // NOI18N

        tResultado16.setText("MMM 00 X 00 MMM");

        tResultado14.setText("MMM 00 X 00 MMM");

        tResultado13.setText("MMM 00 X 00 MMM");

        bandeira25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/argentina-mini.png"))); // NOI18N

        bandeira24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/default.png"))); // NOI18N

        tData13.setText("00 / 00 / 0000");

        bandeira23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/default.png"))); // NOI18N

        tResultado12.setText("MMM 00 X 00 MMM");

        tData12.setText("00 / 00 / 0000");

        bandeira22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/default.png"))); // NOI18N

        bandeira21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/default.png"))); // NOI18N

        tResultado11.setText("MMM 00 X 00 MMM");

        tData11.setText("00 / 00 / 0000");

        bandeira20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/default.png"))); // NOI18N

        tData10.setText("00 / 00 / 0000");

        tResultado10.setText("MMM 00 X 00 MMM");

        bandeira19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/default.png"))); // NOI18N

        bandeira17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/default.png"))); // NOI18N

        bandeira18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras-mini/default.png"))); // NOI18N

        tResultado09.setText("MMM 00 X 00 MMM");

        tData09.setText("00 / 00 / 0000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bandeira01)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tResultado01)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(tData01)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bandeira02))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bandeira03)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tResultado02)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(tData02)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bandeira04))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bandeira05)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tResultado03)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(tData03)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bandeira06))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bandeira07)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tResultado04)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(tData04)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bandeira08))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bandeira09)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tResultado05)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(tData05)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bandeira10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bandeira11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tResultado06)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(tData06)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bandeira12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bandeira13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tResultado07)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(tData07)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bandeira14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bandeira15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tResultado08)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(tData08)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bandeira16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bandeira17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tResultado09)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(tData09)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bandeira18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bandeira19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tResultado10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(tData10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bandeira20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bandeira21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tResultado11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(tData11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bandeira22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bandeira23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tResultado12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(tData12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bandeira24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bandeira25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tResultado13)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(tData13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bandeira26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bandeira27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tResultado14)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(tData14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bandeira28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bandeira29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tResultado15)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(tData15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bandeira30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bandeira31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tResultado16)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(tData16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bandeira32)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bandeira01)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tData01)
                                .addGap(6, 6, 6)
                                .addComponent(tResultado01))
                            .addComponent(bandeira02))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bandeira03)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tData02)
                                .addGap(6, 6, 6)
                                .addComponent(tResultado02))
                            .addComponent(bandeira04))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bandeira05)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tData03)
                                .addGap(6, 6, 6)
                                .addComponent(tResultado03))
                            .addComponent(bandeira06))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bandeira07)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tData04)
                                .addGap(6, 6, 6)
                                .addComponent(tResultado04))
                            .addComponent(bandeira08))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bandeira09)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tData05)
                                .addGap(6, 6, 6)
                                .addComponent(tResultado05))
                            .addComponent(bandeira10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bandeira11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tData06)
                                .addGap(6, 6, 6)
                                .addComponent(tResultado06))
                            .addComponent(bandeira12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bandeira13)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tData07)
                                .addGap(6, 6, 6)
                                .addComponent(tResultado07))
                            .addComponent(bandeira14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bandeira15)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tData08)
                                .addGap(6, 6, 6)
                                .addComponent(tResultado08))
                            .addComponent(bandeira16)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bandeira17)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tData09)
                                .addGap(6, 6, 6)
                                .addComponent(tResultado09))
                            .addComponent(bandeira18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bandeira19)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tData10)
                                .addGap(6, 6, 6)
                                .addComponent(tResultado10))
                            .addComponent(bandeira20))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bandeira21)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tData11)
                                .addGap(6, 6, 6)
                                .addComponent(tResultado11))
                            .addComponent(bandeira22))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bandeira23)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tData12)
                                .addGap(6, 6, 6)
                                .addComponent(tResultado12))
                            .addComponent(bandeira24))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bandeira25)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tData13)
                                .addGap(6, 6, 6)
                                .addComponent(tResultado13))
                            .addComponent(bandeira26))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bandeira27)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tData14)
                                .addGap(6, 6, 6)
                                .addComponent(tResultado14))
                            .addComponent(bandeira28))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bandeira29)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tData15)
                                .addGap(6, 6, 6)
                                .addComponent(tResultado15))
                            .addComponent(bandeira30))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bandeira31)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tData16)
                                .addGap(6, 6, 6)
                                .addComponent(tResultado16))
                            .addComponent(bandeira32))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tFase.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tFase.setText("FASE DE GRUPOS 1/3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(tFase)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bAnt)
                        .addGap(18, 18, 18)
                        .addComponent(bProx)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tFase)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bProx)
                    .addComponent(bAnt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSair)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        //FECHA TELA DE RESULTADOS
        this.setVisible(false);
        //NÃO DEIXA QUE OUTROS MENUS SEJA ACESSADO ATÉ QUE SAIA DA TELA DE RESULTADOS
        Menu.controle = false;
    }//GEN-LAST:event_bSairActionPerformed

    public void exibir() {
        Partida p1;
        switch (fase) {
            case 4:
                tFase.setText("OITAVAS DE FINAL");

                tResultado03.setVisible(true);
                p1 = Campeonato.partidas.get(48);
                tResultado03.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData03.setText(p1.getData());
                bandeira05.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira06.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                tResultado11.setVisible(true);
                p1 = Campeonato.partidas.get(49);
                tResultado11.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData11.setText(p1.getData());
                bandeira21.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira22.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                tResultado04.setVisible(true);
                p1 = Campeonato.partidas.get(50);
                tResultado04.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData04.setText(p1.getData());
                bandeira07.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira08.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                tResultado12.setVisible(true);
                p1 = Campeonato.partidas.get(51);
                tResultado12.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData12.setText(p1.getData());
                bandeira23.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira24.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                tResultado05.setVisible(true);
                p1 = Campeonato.partidas.get(52);
                tResultado05.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData05.setText(p1.getData());
                bandeira09.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira10.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                tResultado13.setVisible(true);
                p1 = Campeonato.partidas.get(53);
                tResultado13.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData13.setText(p1.getData());
                bandeira25.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira26.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                tResultado06.setVisible(true);
                p1 = Campeonato.partidas.get(54);
                tResultado06.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData06.setText(p1.getData());
                bandeira11.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira12.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                tResultado14.setVisible(true);
                p1 = Campeonato.partidas.get(55);
                tResultado14.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData14.setText(p1.getData());
                bandeira27.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira28.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                tResultado03.setVisible(true);
                tResultado04.setVisible(true);
                tResultado05.setVisible(true);
                tResultado06.setVisible(true);
                tResultado11.setVisible(true);
                tResultado12.setVisible(true);
                tResultado13.setVisible(true);
                tResultado14.setVisible(true);

                tData03.setVisible(true);
                tData04.setVisible(true);
                tData05.setVisible(true);
                tData06.setVisible(true);
                tData11.setVisible(true);
                tData12.setVisible(true);
                tData13.setVisible(true);
                tData14.setVisible(true);

                bandeira05.setVisible(true);
                bandeira06.setVisible(true);
                bandeira07.setVisible(true);
                bandeira08.setVisible(true);
                bandeira09.setVisible(true);
                bandeira10.setVisible(true);
                bandeira11.setVisible(true);
                bandeira12.setVisible(true);
                bandeira21.setVisible(true);
                bandeira22.setVisible(true);
                bandeira23.setVisible(true);
                bandeira24.setVisible(true);
                bandeira25.setVisible(true);
                bandeira26.setVisible(true);
                bandeira27.setVisible(true);
                bandeira28.setVisible(true);

                tResultado01.setVisible(false);
                tResultado02.setVisible(false);
                tResultado07.setVisible(false);
                tResultado08.setVisible(false);
                tResultado09.setVisible(false);
                tResultado10.setVisible(false);
                tResultado15.setVisible(false);
                tResultado16.setVisible(false);

                tData01.setVisible(false);
                tData02.setVisible(false);
                tData07.setVisible(false);
                tData08.setVisible(false);
                tData09.setVisible(false);
                tData10.setVisible(false);
                tData15.setVisible(false);
                tData16.setVisible(false);

                bandeira01.setVisible(false);
                bandeira02.setVisible(false);
                bandeira03.setVisible(false);
                bandeira04.setVisible(false);
                bandeira13.setVisible(false);
                bandeira14.setVisible(false);
                bandeira15.setVisible(false);
                bandeira16.setVisible(false);
                bandeira17.setVisible(false);
                bandeira18.setVisible(false);
                bandeira19.setVisible(false);
                bandeira20.setVisible(false);
                bandeira29.setVisible(false);
                bandeira30.setVisible(false);
                bandeira31.setVisible(false);
                bandeira32.setVisible(false);
                break;
            case 5:
                tFase.setText("QUARTAS DE FINAL");

                tResultado03.setVisible(true);
                p1 = Campeonato.partidas.get(56);
                tResultado03.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData03.setText(p1.getData());
                bandeira05.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira06.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                tResultado11.setVisible(true);
                p1 = Campeonato.partidas.get(57);
                tResultado11.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData11.setText(p1.getData());
                bandeira21.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira22.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                tResultado04.setVisible(true);
                p1 = Campeonato.partidas.get(58);
                tResultado04.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData04.setText(p1.getData());
                bandeira07.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira08.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                tResultado12.setVisible(true);
                p1 = Campeonato.partidas.get(59);
                tResultado12.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData12.setText(p1.getData());
                bandeira23.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira24.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                tData03.setVisible(true);
                tData04.setVisible(true);
                tData11.setVisible(true);
                tData12.setVisible(true);

                bandeira05.setVisible(true);
                bandeira06.setVisible(true);
                bandeira07.setVisible(true);
                bandeira08.setVisible(true);
                bandeira21.setVisible(true);
                bandeira22.setVisible(true);
                bandeira23.setVisible(true);
                bandeira24.setVisible(true);

                tResultado01.setVisible(false);
                tResultado02.setVisible(false);
                tResultado05.setVisible(false);
                tResultado06.setVisible(false);
                tResultado07.setVisible(false);
                tResultado08.setVisible(false);
                tResultado09.setVisible(false);
                tResultado10.setVisible(false);
                tResultado13.setVisible(false);
                tResultado14.setVisible(false);
                tResultado15.setVisible(false);
                tResultado16.setVisible(false);

                tData01.setVisible(false);
                tData02.setVisible(false);
                tData05.setVisible(false);
                tData06.setVisible(false);
                tData07.setVisible(false);
                tData08.setVisible(false);
                tData09.setVisible(false);
                tData10.setVisible(false);
                tData13.setVisible(false);
                tData14.setVisible(false);
                tData15.setVisible(false);
                tData16.setVisible(false);

                bandeira01.setVisible(false);
                bandeira02.setVisible(false);
                bandeira03.setVisible(false);
                bandeira04.setVisible(false);
                bandeira09.setVisible(false);
                bandeira10.setVisible(false);
                bandeira11.setVisible(false);
                bandeira12.setVisible(false);
                bandeira13.setVisible(false);
                bandeira14.setVisible(false);
                bandeira15.setVisible(false);
                bandeira16.setVisible(false);
                bandeira17.setVisible(false);
                bandeira18.setVisible(false);
                bandeira19.setVisible(false);
                bandeira20.setVisible(false);
                bandeira25.setVisible(false);
                bandeira26.setVisible(false);
                bandeira27.setVisible(false);
                bandeira28.setVisible(false);
                bandeira29.setVisible(false);
                bandeira30.setVisible(false);
                bandeira31.setVisible(false);
                bandeira32.setVisible(false);
                break;
            case 6:
                tFase.setText("SEMI FINAL");

                tResultado03.setVisible(true);
                p1 = Campeonato.partidas.get(60);
                tResultado03.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData03.setText(p1.getData());
                bandeira05.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira06.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                tResultado11.setVisible(true);
                p1 = Campeonato.partidas.get(61);
                tResultado11.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData11.setText(p1.getData());
                bandeira21.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira22.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                tData03.setVisible(true);
                tData11.setVisible(true);

                bandeira05.setVisible(true);
                bandeira06.setVisible(true);
                bandeira21.setVisible(true);
                bandeira22.setVisible(true);

                tResultado01.setVisible(false);
                tResultado02.setVisible(false);
                tResultado04.setVisible(false);
                tResultado05.setVisible(false);
                tResultado06.setVisible(false);
                tResultado07.setVisible(false);
                tResultado08.setVisible(false);
                tResultado09.setVisible(false);
                tResultado10.setVisible(false);
                tResultado12.setVisible(false);
                tResultado13.setVisible(false);
                tResultado14.setVisible(false);
                tResultado15.setVisible(false);
                tResultado16.setVisible(false);

                tData01.setVisible(false);
                tData02.setVisible(false);
                tData04.setVisible(false);
                tData05.setVisible(false);
                tData06.setVisible(false);
                tData07.setVisible(false);
                tData08.setVisible(false);
                tData09.setVisible(false);
                tData10.setVisible(false);
                tData12.setVisible(false);
                tData13.setVisible(false);
                tData14.setVisible(false);
                tData15.setVisible(false);
                tData16.setVisible(false);

                bandeira01.setVisible(false);
                bandeira02.setVisible(false);
                bandeira03.setVisible(false);
                bandeira04.setVisible(false);
                bandeira07.setVisible(false);
                bandeira08.setVisible(false);
                bandeira09.setVisible(false);
                bandeira10.setVisible(false);
                bandeira11.setVisible(false);
                bandeira12.setVisible(false);
                bandeira13.setVisible(false);
                bandeira14.setVisible(false);
                bandeira15.setVisible(false);
                bandeira16.setVisible(false);
                bandeira17.setVisible(false);
                bandeira18.setVisible(false);
                bandeira19.setVisible(false);
                bandeira20.setVisible(false);
                bandeira23.setVisible(false);
                bandeira24.setVisible(false);
                bandeira25.setVisible(false);
                bandeira26.setVisible(false);
                bandeira27.setVisible(false);
                bandeira28.setVisible(false);
                bandeira29.setVisible(false);
                bandeira30.setVisible(false);
                bandeira31.setVisible(false);
                bandeira32.setVisible(false);
                break;
            case 7:
                tFase.setText("FINAL");

                tResultado03.setVisible(true);
                p1 = Campeonato.partidas.get(62);
                tResultado03.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData03.setText(p1.getData());
                bandeira05.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira06.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                tData03.setVisible(true);

                bandeira05.setVisible(true);
                bandeira06.setVisible(true);

                tResultado01.setVisible(false);
                tResultado02.setVisible(false);
                tResultado04.setVisible(false);
                tResultado05.setVisible(false);
                tResultado06.setVisible(false);
                tResultado07.setVisible(false);
                tResultado08.setVisible(false);
                tResultado09.setVisible(false);
                tResultado10.setVisible(false);
                tResultado11.setVisible(false);

                tResultado12.setVisible(false);
                tResultado13.setVisible(false);
                tResultado14.setVisible(false);
                tResultado15.setVisible(false);
                tResultado16.setVisible(false);

                tData01.setVisible(false);
                tData02.setVisible(false);
                tData04.setVisible(false);
                tData05.setVisible(false);
                tData06.setVisible(false);
                tData07.setVisible(false);
                tData08.setVisible(false);
                tData09.setVisible(false);
                tData10.setVisible(false);
                tData11.setVisible(false);

                tData12.setVisible(false);
                tData13.setVisible(false);
                tData14.setVisible(false);
                tData15.setVisible(false);
                tData16.setVisible(false);

                bandeira01.setVisible(false);
                bandeira02.setVisible(false);
                bandeira03.setVisible(false);
                bandeira04.setVisible(false);
                bandeira07.setVisible(false);
                bandeira08.setVisible(false);
                bandeira09.setVisible(false);
                bandeira10.setVisible(false);
                bandeira11.setVisible(false);
                bandeira12.setVisible(false);
                bandeira13.setVisible(false);
                bandeira14.setVisible(false);
                bandeira15.setVisible(false);
                bandeira16.setVisible(false);
                bandeira17.setVisible(false);
                bandeira18.setVisible(false);
                bandeira19.setVisible(false);
                bandeira20.setVisible(false);
                bandeira21.setVisible(false);
                bandeira22.setVisible(false);
                bandeira23.setVisible(false);
                bandeira24.setVisible(false);
                bandeira25.setVisible(false);
                bandeira26.setVisible(false);
                bandeira27.setVisible(false);
                bandeira28.setVisible(false);
                bandeira29.setVisible(false);
                bandeira30.setVisible(false);
                bandeira31.setVisible(false);
                bandeira32.setVisible(false);
                break;

            case 1: {
                tFase.setText("FASE DE GRUPOS " + fase + "/3");

                p1 = Campeonato.partidas.get(0);
                tResultado01.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData01.setText(p1.getData());
                bandeira01.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira02.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(1);
                tResultado09.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData09.setText(p1.getData());
                bandeira17.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira18.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(6);
                tResultado02.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData02.setText(p1.getData());
                bandeira03.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira04.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(7);
                tResultado10.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData10.setText(p1.getData());
                bandeira19.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira20.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(12);
                tResultado03.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData03.setText(p1.getData());
                bandeira05.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira06.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(13);
                tResultado11.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData11.setText(p1.getData());
                bandeira21.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira22.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(18);
                tResultado04.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData04.setText(p1.getData());
                bandeira07.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira08.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(19);
                tResultado12.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData12.setText(p1.getData());
                bandeira23.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira24.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(24);
                tResultado05.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData05.setText(p1.getData());
                bandeira09.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira10.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(25);
                tResultado13.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData13.setText(p1.getData());
                bandeira25.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira26.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(30);
                tResultado06.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData06.setText(p1.getData());
                bandeira11.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira12.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(31);
                tResultado14.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData14.setText(p1.getData());
                bandeira27.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira28.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(36);
                tResultado07.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData07.setText(p1.getData());
                bandeira13.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira14.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(37);
                tResultado15.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData15.setText(p1.getData());
                bandeira29.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira30.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(42);
                tResultado08.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData08.setText(p1.getData());
                bandeira15.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira16.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(43);
                tResultado16.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData16.setText(p1.getData());
                bandeira31.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira32.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                tResultado01.setVisible(true);
                tResultado02.setVisible(true);
                tResultado03.setVisible(true);
                tResultado04.setVisible(true);
                tResultado05.setVisible(true);
                tResultado06.setVisible(true);
                tResultado07.setVisible(true);
                tResultado08.setVisible(true);
                tResultado09.setVisible(true);
                tResultado10.setVisible(true);
                tResultado11.setVisible(true);
                tResultado12.setVisible(true);
                tResultado13.setVisible(true);
                tResultado13.setVisible(true);
                tResultado14.setVisible(true);
                tResultado15.setVisible(true);
                tResultado16.setVisible(true);

                tData01.setVisible(true);
                tData02.setVisible(true);
                tData03.setVisible(true);
                tData04.setVisible(true);
                tData05.setVisible(true);
                tData06.setVisible(true);
                tData07.setVisible(true);
                tData08.setVisible(true);
                tData09.setVisible(true);
                tData10.setVisible(true);
                tData11.setVisible(true);
                tData12.setVisible(true);
                tData13.setVisible(true);
                tData14.setVisible(true);
                tData15.setVisible(true);
                tData16.setVisible(true);

                bandeira01.setVisible(true);
                bandeira02.setVisible(true);
                bandeira03.setVisible(true);
                bandeira04.setVisible(true);
                bandeira05.setVisible(true);
                bandeira06.setVisible(true);
                bandeira07.setVisible(true);
                bandeira08.setVisible(true);
                bandeira09.setVisible(true);
                bandeira10.setVisible(true);
                bandeira11.setVisible(true);
                bandeira12.setVisible(true);
                bandeira13.setVisible(true);
                bandeira14.setVisible(true);
                bandeira15.setVisible(true);
                bandeira16.setVisible(true);
                bandeira17.setVisible(true);
                bandeira18.setVisible(true);
                bandeira19.setVisible(true);
                bandeira20.setVisible(true);
                bandeira21.setVisible(true);
                bandeira22.setVisible(true);
                bandeira23.setVisible(true);
                bandeira24.setVisible(true);
                bandeira25.setVisible(true);
                bandeira26.setVisible(true);
                bandeira27.setVisible(true);
                bandeira28.setVisible(true);
                bandeira29.setVisible(true);
                bandeira30.setVisible(true);
                bandeira31.setVisible(true);
                bandeira32.setVisible(true);
                break;
            }
            case 2: {
                tFase.setText("FASE DE GRUPOS " + fase + "/3");

                p1 = Campeonato.partidas.get(2);
                tResultado01.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData01.setText(p1.getData());
                bandeira01.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira02.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(3);
                tResultado09.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData09.setText(p1.getData());
                bandeira17.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira18.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(8);
                tResultado02.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData02.setText(p1.getData());
                bandeira03.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira04.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(9);
                tResultado10.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData10.setText(p1.getData());
                bandeira19.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira20.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(14);
                tResultado03.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData03.setText(p1.getData());
                bandeira05.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira06.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(15);
                tResultado11.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData11.setText(p1.getData());
                bandeira21.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira22.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(20);
                tResultado04.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData04.setText(p1.getData());
                bandeira07.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira08.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(21);
                tResultado12.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData12.setText(p1.getData());
                bandeira23.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira24.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(26);
                tResultado05.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData05.setText(p1.getData());
                bandeira09.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira10.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(27);
                tResultado13.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData13.setText(p1.getData());
                bandeira25.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira26.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(32);
                tResultado06.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData06.setText(p1.getData());
                bandeira11.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira12.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(33);
                tResultado14.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData14.setText(p1.getData());
                bandeira27.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira28.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(38);
                tResultado07.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData07.setText(p1.getData());
                bandeira13.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira14.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(39);
                tResultado15.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData15.setText(p1.getData());
                bandeira29.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira30.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(44);
                tResultado08.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData08.setText(p1.getData());
                bandeira15.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));

                bandeira16.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(45);
                tResultado16.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData16.setText(p1.getData());
                bandeira31.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira32.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                tResultado01.setVisible(true);
                tResultado02.setVisible(true);
                tResultado03.setVisible(true);
                tResultado04.setVisible(true);
                tResultado05.setVisible(true);
                tResultado06.setVisible(true);
                tResultado07.setVisible(true);
                tResultado08.setVisible(true);
                tResultado09.setVisible(true);
                tResultado10.setVisible(true);
                tResultado11.setVisible(true);
                tResultado12.setVisible(true);
                tResultado13.setVisible(true);
                tResultado13.setVisible(true);
                tResultado14.setVisible(true);
                tResultado15.setVisible(true);
                tResultado16.setVisible(true);

                tData01.setVisible(true);
                tData02.setVisible(true);
                tData03.setVisible(true);
                tData04.setVisible(true);
                tData05.setVisible(true);
                tData06.setVisible(true);
                tData07.setVisible(true);
                tData08.setVisible(true);
                tData09.setVisible(true);
                tData10.setVisible(true);
                tData11.setVisible(true);
                tData12.setVisible(true);
                tData13.setVisible(true);
                tData14.setVisible(true);
                tData15.setVisible(true);
                tData16.setVisible(true);

                bandeira01.setVisible(true);
                bandeira02.setVisible(true);
                bandeira03.setVisible(true);
                bandeira04.setVisible(true);
                bandeira05.setVisible(true);
                bandeira06.setVisible(true);
                bandeira07.setVisible(true);
                bandeira08.setVisible(true);
                bandeira09.setVisible(true);
                bandeira10.setVisible(true);
                bandeira11.setVisible(true);
                bandeira12.setVisible(true);
                bandeira13.setVisible(true);
                bandeira14.setVisible(true);
                bandeira15.setVisible(true);
                bandeira16.setVisible(true);
                bandeira17.setVisible(true);
                bandeira18.setVisible(true);
                bandeira19.setVisible(true);
                bandeira20.setVisible(true);
                bandeira21.setVisible(true);
                bandeira22.setVisible(true);
                bandeira23.setVisible(true);
                bandeira24.setVisible(true);
                bandeira25.setVisible(true);
                bandeira26.setVisible(true);
                bandeira27.setVisible(true);
                bandeira28.setVisible(true);
                bandeira29.setVisible(true);
                bandeira30.setVisible(true);
                bandeira31.setVisible(true);
                bandeira32.setVisible(true);
                break;
            }
            case 3: {
                tFase.setText("FASE DE GRUPOS " + fase + "/3");

                p1 = Campeonato.partidas.get(4);
                tResultado01.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData01.setText(p1.getData());
                bandeira01.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira02.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(5);
                tResultado09.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData09.setText(p1.getData());
                bandeira17.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira18.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(10);
                tResultado02.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData02.setText(p1.getData());
                bandeira03.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira04.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(11);
                tResultado10.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData10.setText(p1.getData());
                bandeira19.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira20.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(16);
                tResultado03.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData03.setText(p1.getData());
                bandeira05.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira06.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(17);
                tResultado11.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData11.setText(p1.getData());
                bandeira21.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira22.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(22);
                tResultado04.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData04.setText(p1.getData());
                bandeira07.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira08.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(23);
                tResultado12.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData12.setText(p1.getData());
                bandeira23.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira24.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(28);
                tResultado05.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData05.setText(p1.getData());
                bandeira09.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira10.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(29);
                tResultado13.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData13.setText(p1.getData());
                bandeira25.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira26.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(34);
                tResultado06.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData06.setText(p1.getData());
                bandeira11.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira12.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(35);
                tResultado14.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData14.setText(p1.getData());
                bandeira27.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira28.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(40);
                tResultado07.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData07.setText(p1.getData());
                bandeira13.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira14.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(41);
                tResultado15.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData15.setText(p1.getData());
                bandeira29.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira30.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(46);
                tResultado08.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData08.setText(p1.getData());
                bandeira15.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira16.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                p1 = Campeonato.partidas.get(47);
                tResultado16.setText(p1.getCasa().getCodNome() + " " + p1.getGolsCasa() + " X " + p1.getGolsVisitante() + " " + p1.getVisitante().getCodNome());
                tData16.setText(p1.getData());
                bandeira31.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getCasa().getBandeiraMini())));
                bandeira32.setIcon(new javax.swing.ImageIcon(getClass().getResource(p1.getVisitante().getBandeiraMini())));

                tResultado01.setVisible(true);
                tResultado02.setVisible(true);
                tResultado03.setVisible(true);
                tResultado04.setVisible(true);
                tResultado05.setVisible(true);
                tResultado06.setVisible(true);
                tResultado07.setVisible(true);
                tResultado09.setVisible(true);
                tResultado08.setVisible(true);
                tResultado10.setVisible(true);
                tResultado11.setVisible(true);
                tResultado12.setVisible(true);
                tResultado13.setVisible(true);
                tResultado13.setVisible(true);
                tResultado14.setVisible(true);
                tResultado15.setVisible(true);
                tResultado16.setVisible(true);

                tData01.setVisible(true);
                tData02.setVisible(true);
                tData03.setVisible(true);
                tData04.setVisible(true);
                tData05.setVisible(true);
                tData06.setVisible(true);
                tData07.setVisible(true);
                tData08.setVisible(true);
                tData09.setVisible(true);
                tData10.setVisible(true);
                tData11.setVisible(true);
                tData12.setVisible(true);
                tData13.setVisible(true);
                tData14.setVisible(true);
                tData15.setVisible(true);
                tData16.setVisible(true);

                bandeira01.setVisible(true);
                bandeira02.setVisible(true);
                bandeira03.setVisible(true);
                bandeira04.setVisible(true);
                bandeira05.setVisible(true);
                bandeira06.setVisible(true);
                bandeira07.setVisible(true);
                bandeira08.setVisible(true);
                bandeira09.setVisible(true);
                bandeira10.setVisible(true);
                bandeira11.setVisible(true);
                bandeira12.setVisible(true);
                bandeira13.setVisible(true);
                bandeira14.setVisible(true);
                bandeira15.setVisible(true);
                bandeira16.setVisible(true);
                bandeira17.setVisible(true);
                bandeira18.setVisible(true);
                bandeira19.setVisible(true);
                bandeira20.setVisible(true);
                bandeira21.setVisible(true);
                bandeira22.setVisible(true);
                bandeira23.setVisible(true);
                bandeira24.setVisible(true);
                bandeira25.setVisible(true);
                bandeira26.setVisible(true);
                bandeira27.setVisible(true);
                bandeira28.setVisible(true);
                bandeira29.setVisible(true);
                bandeira30.setVisible(true);
                bandeira31.setVisible(true);
                bandeira32.setVisible(true);
                break;
            }
        }

    }
    private void bAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAntActionPerformed
        //LOGICA PARA EXIBIÇÃO DA TELA DE RESULTADOS ANTERIOR
        if (fase > 1) {
            fase--;
        }
        exibir();

    }//GEN-LAST:event_bAntActionPerformed

    private void bProxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProxActionPerformed
        //LOGICA PARA EXIBIÇÃO DA TELA DE RESULTADOS SEGUINTE
        if (fase < 8) {
            fase++;
        }
        exibir();

    }//GEN-LAST:event_bProxActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new TelaResultados().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAnt;
    private javax.swing.JButton bProx;
    private javax.swing.JButton bSair;
    private javax.swing.JLabel bandeira01;
    private javax.swing.JLabel bandeira02;
    private javax.swing.JLabel bandeira03;
    private javax.swing.JLabel bandeira04;
    private javax.swing.JLabel bandeira05;
    private javax.swing.JLabel bandeira06;
    private javax.swing.JLabel bandeira07;
    private javax.swing.JLabel bandeira08;
    private javax.swing.JLabel bandeira09;
    private javax.swing.JLabel bandeira10;
    private javax.swing.JLabel bandeira11;
    private javax.swing.JLabel bandeira12;
    private javax.swing.JLabel bandeira13;
    private javax.swing.JLabel bandeira14;
    private javax.swing.JLabel bandeira15;
    private javax.swing.JLabel bandeira16;
    private javax.swing.JLabel bandeira17;
    private javax.swing.JLabel bandeira18;
    private javax.swing.JLabel bandeira19;
    private javax.swing.JLabel bandeira20;
    private javax.swing.JLabel bandeira21;
    private javax.swing.JLabel bandeira22;
    private javax.swing.JLabel bandeira23;
    private javax.swing.JLabel bandeira24;
    private javax.swing.JLabel bandeira25;
    private javax.swing.JLabel bandeira26;
    private javax.swing.JLabel bandeira27;
    private javax.swing.JLabel bandeira28;
    private javax.swing.JLabel bandeira29;
    private javax.swing.JLabel bandeira30;
    private javax.swing.JLabel bandeira31;
    private javax.swing.JLabel bandeira32;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tData01;
    private javax.swing.JLabel tData02;
    private javax.swing.JLabel tData03;
    private javax.swing.JLabel tData04;
    private javax.swing.JLabel tData05;
    private javax.swing.JLabel tData06;
    private javax.swing.JLabel tData07;
    private javax.swing.JLabel tData08;
    private javax.swing.JLabel tData09;
    private javax.swing.JLabel tData10;
    private javax.swing.JLabel tData11;
    private javax.swing.JLabel tData12;
    private javax.swing.JLabel tData13;
    private javax.swing.JLabel tData14;
    private javax.swing.JLabel tData15;
    private javax.swing.JLabel tData16;
    private javax.swing.JLabel tFase;
    private javax.swing.JLabel tResultado01;
    private javax.swing.JLabel tResultado02;
    private javax.swing.JLabel tResultado03;
    private javax.swing.JLabel tResultado04;
    private javax.swing.JLabel tResultado05;
    private javax.swing.JLabel tResultado06;
    private javax.swing.JLabel tResultado07;
    private javax.swing.JLabel tResultado08;
    private javax.swing.JLabel tResultado09;
    private javax.swing.JLabel tResultado10;
    private javax.swing.JLabel tResultado11;
    private javax.swing.JLabel tResultado12;
    private javax.swing.JLabel tResultado13;
    private javax.swing.JLabel tResultado14;
    private javax.swing.JLabel tResultado15;
    private javax.swing.JLabel tResultado16;
    // End of variables declaration//GEN-END:variables
}
