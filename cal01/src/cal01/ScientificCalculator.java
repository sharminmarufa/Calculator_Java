
package cal01;
//@author ;

public class ScientificCalculator extends javax.swing.JFrame {
    private boolean zerodisp;
    private boolean decdisp;
    private boolean dgrrad;
    private boolean sh;
    private byte op;
    
    private double ina;
    private double inb;
    private double out;
   
    
    public ScientificCalculator() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        display1 = new javax.swing.JTextField();
        cos = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        add = new javax.swing.JButton();
        multply = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        subtract = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        five = new javax.swing.JButton();
        four = new javax.swing.JButton();
        one = new javax.swing.JButton();
        six = new javax.swing.JButton();
        three = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        two = new javax.swing.JButton();
        decpoint = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        equals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scientific Calculator Made By shomi");
        setIconImage(getIconImage());
        setResizable(false);

        display1.setBackground(new java.awt.Color(204, 255, 204));
        display1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        display1.setForeground(new java.awt.Color(102, 0, 102));
        display1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        display1.setFocusable(false);
        display1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display1ActionPerformed(evt);
            }
        });

        cos.setBackground(new java.awt.Color(204, 255, 204));
        cos.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cos.setForeground(new java.awt.Color(102, 0, 102));
        cos.setText("Cos");
        cos.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        cos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cos.setFocusable(false);
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        sin.setBackground(new java.awt.Color(204, 255, 204));
        sin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sin.setForeground(new java.awt.Color(102, 0, 102));
        sin.setText("Sin");
        sin.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        sin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sin.setFocusable(false);
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        tan.setBackground(new java.awt.Color(204, 255, 204));
        tan.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        tan.setForeground(new java.awt.Color(102, 0, 102));
        tan.setText("Tan");
        tan.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        tan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tan.setFocusable(false);
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(204, 255, 204));
        add.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        add.setForeground(new java.awt.Color(102, 0, 102));
        add.setText("+");
        add.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.setFocusable(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        multply.setBackground(new java.awt.Color(204, 255, 204));
        multply.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        multply.setForeground(new java.awt.Color(102, 0, 102));
        multply.setText("*");
        multply.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        multply.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        multply.setFocusable(false);
        multply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multplyActionPerformed(evt);
            }
        });

        seven.setBackground(new java.awt.Color(204, 255, 204));
        seven.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        seven.setForeground(new java.awt.Color(102, 0, 102));
        seven.setText("7");
        seven.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        seven.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seven.setFocusable(false);
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setBackground(new java.awt.Color(204, 255, 204));
        eight.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        eight.setForeground(new java.awt.Color(102, 0, 102));
        eight.setText("8");
        eight.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        eight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eight.setFocusable(false);
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        subtract.setBackground(new java.awt.Color(204, 255, 204));
        subtract.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        subtract.setForeground(new java.awt.Color(102, 0, 102));
        subtract.setText("-");
        subtract.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        subtract.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subtract.setFocusable(false);
        subtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractActionPerformed(evt);
            }
        });

        nine.setBackground(new java.awt.Color(204, 255, 204));
        nine.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        nine.setForeground(new java.awt.Color(102, 0, 102));
        nine.setText("9");
        nine.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        nine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nine.setFocusable(false);
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        five.setBackground(new java.awt.Color(204, 255, 204));
        five.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        five.setForeground(new java.awt.Color(102, 0, 102));
        five.setText("5");
        five.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        five.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        five.setFocusable(false);
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        four.setBackground(new java.awt.Color(204, 255, 204));
        four.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        four.setForeground(new java.awt.Color(102, 0, 102));
        four.setText("4");
        four.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        four.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        four.setFocusable(false);
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        one.setBackground(new java.awt.Color(204, 255, 204));
        one.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        one.setForeground(new java.awt.Color(102, 0, 102));
        one.setText("1");
        one.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        one.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        one.setFocusable(false);
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(204, 255, 204));
        six.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        six.setForeground(new java.awt.Color(102, 0, 102));
        six.setText("6");
        six.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        six.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        six.setFocusable(false);
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        three.setBackground(new java.awt.Color(204, 255, 204));
        three.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        three.setForeground(new java.awt.Color(102, 0, 102));
        three.setText("3");
        three.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        three.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        three.setFocusable(false);
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        zero.setBackground(new java.awt.Color(204, 255, 204));
        zero.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        zero.setForeground(new java.awt.Color(102, 0, 102));
        zero.setText("0");
        zero.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        zero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zero.setFocusable(false);
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        two.setBackground(new java.awt.Color(204, 255, 204));
        two.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        two.setForeground(new java.awt.Color(102, 0, 102));
        two.setText("2");
        two.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        two.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        two.setFocusable(false);
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        decpoint.setBackground(new java.awt.Color(204, 255, 204));
        decpoint.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        decpoint.setForeground(new java.awt.Color(102, 0, 102));
        decpoint.setText(".");
        decpoint.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        decpoint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        decpoint.setFocusable(false);
        decpoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decpointActionPerformed(evt);
            }
        });

        divide.setBackground(new java.awt.Color(204, 255, 204));
        divide.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        divide.setForeground(new java.awt.Color(102, 0, 102));
        divide.setText("/");
        divide.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        divide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        divide.setFocusable(false);
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(204, 255, 204));
        reset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        reset.setForeground(new java.awt.Color(102, 0, 102));
        reset.setText("C");
        reset.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.setFocusable(false);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        equals.setBackground(new java.awt.Color(204, 255, 204));
        equals.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        equals.setForeground(new java.awt.Color(102, 0, 102));
        equals.setText("=");
        equals.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        equals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equals.setFocusable(false);
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(display1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(equals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(165, 165, 165)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(decpoint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(multply, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(4, 4, 4)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(one, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                .addComponent(seven, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                .addComponent(four, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(five, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)))
                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(eight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(two, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(one, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(multply, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(zero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(decpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText()));
     if(!sh){
         if(!dgrrad){
              display1.setText(String.valueOf(inb));
             inb = inb * 0.0174532925;
         }
         out = Math.cos(inb);
     }
     else{
         display1.setText( String.valueOf(inb));
           out = Math.cosh(inb);
     }
     
     display1.setText(String.valueOf(out));
     out = 0;
     op = 0;
    }//GEN-LAST:event_cosActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
     inb = Double.parseDouble(String.valueOf(display1.getText()));
     if(!sh){
         if(!dgrrad){
              display1.setText(String.valueOf(inb));
             inb = inb * 0.0174532925;
         }
         out = Math.sin(inb);
     }
     else{
         display1.setText(String.valueOf(inb));
           out = Math.sinh(inb);
     }
     
     display1.setText(String.valueOf(out));
     out = 0;
     op = 0;
    }//GEN-LAST:event_sinActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        if(!zerodisp && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"4");
       zerodisp =true;
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        if(!zerodisp && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"5");
       zerodisp =true;
    }//GEN-LAST:event_fiveActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
       if(!zerodisp && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"0");
  
    }//GEN-LAST:event_zeroActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
         if(!zerodisp && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"1");
       zerodisp =true;
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        if(!zerodisp && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"2");
       zerodisp =true;
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
         if(!zerodisp && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"3");
       zerodisp =true;
    }//GEN-LAST:event_threeActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
         if(!zerodisp && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"6");
       zerodisp =true;
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        if(!zerodisp && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"7");
       zerodisp =true;
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        if(!zerodisp && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"8");
       zerodisp =true;
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        if(!zerodisp && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"9");
       zerodisp =true;
    }//GEN-LAST:event_nineActionPerformed

    private void decpointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decpointActionPerformed
     if(! decdisp){
        display1.setText(display1.getText()+".");  
     }
    }//GEN-LAST:event_decpointActionPerformed
     
    
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
       display1.setText("0");
       display1.setText(null);
       zerodisp = false;  
       decdisp = false;  
       ina = 0;
       inb = 0; 
       out = 0;
        
    }//GEN-LAST:event_resetActionPerformed

    private void display1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display1ActionPerformed
        
    }//GEN-LAST:event_display1ActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
         inb = Double.parseDouble(String.valueOf(display1.getText()));
     if(!sh){
         if(!dgrrad){
              display1.setText(String.valueOf(inb));
             inb = inb * 0.0174532925;
         }
         out = Math.tan(inb);
     }
     else{
         display1.setText(String.valueOf(inb));
           out = Math.tanh(inb);
     }
     
     display1.setText(String.valueOf(out));
     out = 0;
     op = 0;
    }//GEN-LAST:event_tanActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(op ==0){
            ina =Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
              inb =Double.parseDouble(String.valueOf(display1.getText()));
        }
        if( op == 1 ){
            ina = ina + inb;
        }
         if( op == 2 ){
            ina = ina - inb;
        }
         if( op == 3 ){
            ina = ina * inb;
        }
         if( op == 4 ){
            ina = ina / inb;
        }
         if( op == 5 ){
            ina = ina * inb / 100;
        }
         display1.setText("0");;
         display1.setText(String.valueOf(ina));
         op = 1;
         decdisp = false;
         zerodisp = false;
         
    }//GEN-LAST:event_addActionPerformed

    private void subtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractActionPerformed
         if(op ==0){
            ina =Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
              inb =Double.parseDouble(String.valueOf(display1.getText()));
        }
        if( op == 1 ){
            ina = ina + inb;
        }
         if( op == 2 ){
            ina = ina - inb;
        }
         if( op == 3 ){
            ina = ina * inb;
        }
         if( op == 4 ){
            ina = ina / inb;
        }
         if( op == 5 ){
            ina = ina * inb / 100;
        }
         display1.setText("0");;
         display1.setText(String.valueOf(ina));
         op = 2;
         decdisp = false;
         zerodisp = false;
    }//GEN-LAST:event_subtractActionPerformed

    private void multplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multplyActionPerformed
        if(op ==0){
            ina =Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
              inb =Double.parseDouble(String.valueOf(display1.getText()));
        }
        if( op == 1 ){
            ina = ina + inb;
        }
         if( op == 2 ){
            ina = ina - inb;
        }
         if( op == 3 ){
            ina = ina * inb;
        }
         if( op == 4 ){
            ina = ina / inb;
        }
         if( op == 5 ){
            ina = ina * inb / 100;
        }
         display1.setText("0");;
         display1.setText(String.valueOf(ina));
         op = 3;
         decdisp = false;
         zerodisp = false;
    }//GEN-LAST:event_multplyActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
      if(op ==0){
            ina =Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
              inb =Double.parseDouble(String.valueOf(display1.getText()));
        }
        if( op == 1 ){
            ina = ina + inb;
        }
         if( op == 2 ){
            ina = ina - inb;
        }
         if( op == 3 ){
            ina = ina * inb;
        }
         if( op == 4 ){
            ina = ina / inb;
        }
         if( op == 5 ){
            ina = ina * inb / 100;
        }
         display1.setText("0");;
         display1.setText(String.valueOf(ina));
         op = 4;
         decdisp = false;
         zerodisp = false;
    }//GEN-LAST:event_divideActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
      inb =Double.parseDouble(String.valueOf(display1.getText()));
      if( op == 0){
          out = inb;
          display1.setText(String.valueOf(inb));
      }
      if( op == 1){
          out = ina + inb;
          display1.setText(display1.getText() + String.valueOf(inb));
      }
      if( op == 2){
          out = ina - inb;
          display1.setText(display1.getText() + String.valueOf(inb));
      }
      if( op == 3){
          out = ina * inb;
          display1.setText(display1.getText() + String.valueOf(inb));
      }
      if( op == 4){
          out = ina / inb;
          display1.setText(display1.getText() + String.valueOf(inb));
      }
      if( op == 5){
          out = ina + inb / 100;
          display1.setText(display1.getText() + String.valueOf(inb));
      }
        if( out > -100000000 && out < 100000000 ){
           display1.setText(String.valueOf(out));
       }
       else{
              display1.setText("Error");
       }
        ina = 0;
        inb = 0;
        out = 0;
        decdisp = false;
        zerodisp = false;
    }//GEN-LAST:event_equalsActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScientificCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cos;
    private javax.swing.JButton decpoint;
    private javax.swing.JTextField display1;
    private javax.swing.JButton divide;
    private javax.swing.JButton eight;
    private javax.swing.JButton equals;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton multply;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton reset;
    private javax.swing.JButton seven;
    private javax.swing.JButton sin;
    private javax.swing.JButton six;
    private javax.swing.JButton subtract;
    private javax.swing.JButton tan;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
