/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sharmin calculators;

/**
 *
 * @author asus
 */
public class calculator extends javax.swing.JFrame {
 private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;

    
        private void getOperator(String btnText)
    {
    math_operator= btnText.charAt(0);
    total1 = total1 + Double.parseDouble( T_display.getText( ) ) ;
    T_display.setText("");
    
    }
    public calculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        T_display = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Bsin = new javax.swing.JButton();
        Bcos = new javax.swing.JButton();
        Btan = new javax.swing.JButton();
        Bpersent = new javax.swing.JButton();
        Bsqure = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Bone = new javax.swing.JButton();
        Btwo = new javax.swing.JButton();
        Bthree = new javax.swing.JButton();
        Bequal = new javax.swing.JButton();
        Bzero = new javax.swing.JButton();
        Bpoint = new javax.swing.JButton();
        Bfour = new javax.swing.JButton();
        Bfive = new javax.swing.JButton();
        Bsix = new javax.swing.JButton();
        Bseven = new javax.swing.JButton();
        Beight = new javax.swing.JButton();
        Bnine = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BDEL = new javax.swing.JButton();
        BC = new javax.swing.JButton();
        Bmul = new javax.swing.JButton();
        Bdiv = new javax.swing.JButton();
        Bplus = new javax.swing.JButton();
        Bminus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        T_display.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        T_display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        T_display.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Bsin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Bsin.setText("sin");
        Bsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsinActionPerformed(evt);
            }
        });

        Bcos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Bcos.setText("cos");
        Bcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcosActionPerformed(evt);
            }
        });

        Btan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btan.setText("tan");
        Btan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtanActionPerformed(evt);
            }
        });

        Bpersent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Bpersent.setText("%");
        Bpersent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BpersentActionPerformed(evt);
            }
        });

        Bsqure.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Bsqure.setText("2");
        Bsqure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsqureActionPerformed(evt);
            }
        });

        Bone.setBackground(new java.awt.Color(255, 204, 255));
        Bone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Bone.setText("1");
        Bone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoneActionPerformed(evt);
            }
        });

        Btwo.setBackground(new java.awt.Color(255, 204, 255));
        Btwo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Btwo.setText("2");
        Btwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtwoActionPerformed(evt);
            }
        });

        Bthree.setBackground(new java.awt.Color(255, 204, 255));
        Bthree.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Bthree.setText("3");
        Bthree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BthreeActionPerformed(evt);
            }
        });

        Bequal.setBackground(new java.awt.Color(255, 204, 255));
        Bequal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Bequal.setText("=");
        Bequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BequalActionPerformed(evt);
            }
        });

        Bzero.setBackground(new java.awt.Color(255, 204, 255));
        Bzero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Bzero.setText("0");
        Bzero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BzeroActionPerformed(evt);
            }
        });

        Bpoint.setBackground(new java.awt.Color(255, 204, 255));
        Bpoint.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Bpoint.setText(".");
        Bpoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BpointActionPerformed(evt);
            }
        });

        Bfour.setBackground(new java.awt.Color(255, 204, 255));
        Bfour.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Bfour.setText("4");
        Bfour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BfourActionPerformed(evt);
            }
        });

        Bfive.setBackground(new java.awt.Color(255, 204, 255));
        Bfive.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Bfive.setText("5");
        Bfive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BfiveActionPerformed(evt);
            }
        });

        Bsix.setBackground(new java.awt.Color(255, 204, 255));
        Bsix.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Bsix.setText("6");
        Bsix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsixActionPerformed(evt);
            }
        });

        Bseven.setBackground(new java.awt.Color(255, 204, 255));
        Bseven.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Bseven.setText("7");
        Bseven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsevenActionPerformed(evt);
            }
        });

        Beight.setBackground(new java.awt.Color(255, 204, 255));
        Beight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Beight.setText("8");
        Beight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeightActionPerformed(evt);
            }
        });

        Bnine.setBackground(new java.awt.Color(255, 204, 255));
        Bnine.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Bnine.setText("9");
        Bnine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Bnine, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(Bsix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Beight, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(Bfive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Bthree, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btwo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Bzero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Bseven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bfour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bequal, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bnine)
                    .addComponent(Beight)
                    .addComponent(Bseven))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bsix)
                        .addComponent(Bfive))
                    .addComponent(Bfour, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bone)
                    .addComponent(Btwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bthree))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bequal)
                    .addComponent(Bpoint)
                    .addComponent(Bzero))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        BDEL.setBackground(new java.awt.Color(255, 204, 255));
        BDEL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BDEL.setText("DEL");
        BDEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDELActionPerformed(evt);
            }
        });

        BC.setBackground(new java.awt.Color(255, 204, 255));
        BC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BC.setText("C");
        BC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCActionPerformed(evt);
            }
        });

        Bmul.setBackground(new java.awt.Color(255, 204, 255));
        Bmul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Bmul.setText("x");
        Bmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmulActionPerformed(evt);
            }
        });

        Bdiv.setBackground(new java.awt.Color(255, 204, 255));
        Bdiv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Bdiv.setText("/");
        Bdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdivActionPerformed(evt);
            }
        });

        Bplus.setBackground(new java.awt.Color(255, 204, 255));
        Bplus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Bplus.setText("+");
        Bplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BplusActionPerformed(evt);
            }
        });

        Bminus.setBackground(new java.awt.Color(255, 204, 255));
        Bminus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Bminus.setText("-");
        Bminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BminusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Bplus, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Bminus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Bmul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BDEL, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Bdiv, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BDEL, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(BC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Bmul)
                    .addComponent(Bdiv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bminus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bplus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Bsin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bcos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bpersent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bsqure)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bcos)
                    .addComponent(Btan)
                    .addComponent(Bpersent)
                    .addComponent(Bsin)
                    .addComponent(Bsqure))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(T_display, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(T_display, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcosActionPerformed
        total2 = Double.parseDouble(String.valueOf(T_display.getText()));
       T_display.setText("cosh(" + String.valueOf(total2) + ")");
       

          double out = Math.cosh(total2);

        T_display.setText(String.valueOf(out));
        out = 0;
       double op = 0;
    }//GEN-LAST:event_BcosActionPerformed

    private void BoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoneActionPerformed
         String BOneText = T_display.getText() + Bone.getText();
        T_display.setText(BOneText);
    }//GEN-LAST:event_BoneActionPerformed

    private void BtwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtwoActionPerformed
      String BtwoText = T_display.getText() + Btwo.getText();
        T_display.setText(BtwoText);
    }//GEN-LAST:event_BtwoActionPerformed

    private void BthreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BthreeActionPerformed
       String BthreeText = T_display.getText() + Bthree.getText();
        T_display.setText(BthreeText);
    }//GEN-LAST:event_BthreeActionPerformed

    private void BfourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BfourActionPerformed
        String BfourText = T_display.getText() + Bfour.getText();
        T_display.setText(BfourText);
    }//GEN-LAST:event_BfourActionPerformed

    private void BfiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BfiveActionPerformed
         String BfiveText = T_display.getText() + Bfive.getText();
        T_display.setText(BfiveText);
    }//GEN-LAST:event_BfiveActionPerformed

    private void BsixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsixActionPerformed
         String BsixText = T_display.getText() + Bsix.getText();
        T_display.setText(BsixText);
    }//GEN-LAST:event_BsixActionPerformed

    private void BsevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsevenActionPerformed
        String BsevenText = T_display.getText() + Bseven.getText();
        T_display.setText(BsevenText);
    }//GEN-LAST:event_BsevenActionPerformed

    private void BeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeightActionPerformed
          String BeightText = T_display.getText() + Beight.getText();
        T_display.setText(BeightText);
    }//GEN-LAST:event_BeightActionPerformed

    private void BnineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnineActionPerformed
          String BnineText = T_display.getText() + Bnine.getText();
        T_display.setText(BnineText);
    }//GEN-LAST:event_BnineActionPerformed

    private void BzeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BzeroActionPerformed
           String BzeroText = T_display.getText() + Bzero.getText();
        T_display.setText(BzeroText);
    }//GEN-LAST:event_BzeroActionPerformed

    private void BplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BplusActionPerformed
         String button_text = Bplus.getText();
        getOperator(button_text);
    }//GEN-LAST:event_BplusActionPerformed

    private void BequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BequalActionPerformed
         switch ( math_operator ) {
        case '+':
            total2 = total1 + Double.parseDouble(T_display.getText( ) );
        break;
        case '-':
            total2 = total1 - Double.parseDouble(T_display.getText( ) );
        break;
        case '/':
            total2 = total1 / Double.parseDouble(T_display.getText( ) );
        break;
        case 'x':
            total2 = total1 * Double.parseDouble(T_display.getText( ) );
          break;
        case '%':
       total2 = (total1*Double.parseDouble(T_display.getText( ) ))/100;
       break;
         
       
       //break;   
      
        }
      
    
        T_display.setText( Double.toString(total2) );
        total1 = 0;
 
    }//GEN-LAST:event_BequalActionPerformed

    private void BminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BminusActionPerformed
         String button_text = Bminus.getText();
        getOperator(button_text);
    }//GEN-LAST:event_BminusActionPerformed

    private void BCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCActionPerformed
          total2 = 0;
        T_display.setText("");
    }//GEN-LAST:event_BCActionPerformed

    private void BmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmulActionPerformed
        String button_text = Bmul.getText();
       getOperator(button_text);
    }//GEN-LAST:event_BmulActionPerformed

    private void BdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdivActionPerformed
        String button_text = Bdiv.getText();
        getOperator(button_text);
    }//GEN-LAST:event_BdivActionPerformed

    private void BpointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BpointActionPerformed
         String BpointText = T_display.getText() + Bpoint.getText();
        T_display.setText(BpointText);
    }//GEN-LAST:event_BpointActionPerformed

    private void BDELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDELActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BDELActionPerformed

    private void BpersentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BpersentActionPerformed
         String button_text = Bpersent.getText();
        getOperator(button_text);
    }//GEN-LAST:event_BpersentActionPerformed

    private void BsqureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsqureActionPerformed
          String button_text = Bsqure.getText();
        getOperator(button_text);
        total2 = total1*total1;
    }//GEN-LAST:event_BsqureActionPerformed

    private void BsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsinActionPerformed
             total2 = Double.parseDouble(String.valueOf(T_display.getText()));
        T_display.setText("sin(" + String.valueOf(total2) + ")");
               total2 = total2 * 0.0174532925;



         double out = Math.sin(total2);//using math library for sine function

 
 

       
    }//GEN-LAST:event_BsinActionPerformed

    private void BtanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtanActionPerformed
         total2 = Double.parseDouble(String.valueOf(T_display.getText()));
       T_display.setText("tanh(" + String.valueOf(total2) + ")");
       

          double out = Math.tanh(total2);

        T_display.setText(String.valueOf(out));
        out = 0;
       double op = 0;
    }//GEN-LAST:event_BtanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new calculator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BC;
    private javax.swing.JButton BDEL;
    private javax.swing.JButton Bcos;
    private javax.swing.JButton Bdiv;
    private javax.swing.JButton Beight;
    private javax.swing.JButton Bequal;
    private javax.swing.JButton Bfive;
    private javax.swing.JButton Bfour;
    private javax.swing.JButton Bminus;
    private javax.swing.JButton Bmul;
    private javax.swing.JButton Bnine;
    private javax.swing.JButton Bone;
    private javax.swing.JButton Bpersent;
    private javax.swing.JButton Bplus;
    private javax.swing.JButton Bpoint;
    private javax.swing.JButton Bseven;
    private javax.swing.JButton Bsin;
    private javax.swing.JButton Bsix;
    private javax.swing.JButton Bsqure;
    private javax.swing.JButton Btan;
    private javax.swing.JButton Bthree;
    private javax.swing.JButton Btwo;
    private javax.swing.JButton Bzero;
    private javax.swing.JTextField T_display;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
