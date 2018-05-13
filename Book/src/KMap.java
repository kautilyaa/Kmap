import java.awt.*;
//import java.util.Arrays;
import javax.swing.*;
public class KMap extends javax.swing.JFrame {

    /**
     * Creates new form KMap
     */
    
    public KMap() {
  setTitle("Karnaugh Map © Book_Programmers");
  setSize(580, 580);
  setVisible(true);
  setLocation(440,80);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setResizable(false);
  setLayout(null);
  setIconImage(Toolkit.getDefaultToolkit().getImage("src/k.jpg"));
        initComponents();
        
    JOptionPane.showMessageDialog(null,"In this application, to get the\nSum of Product expression,\nyou need to select the required\ncells, as per the requirement.");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B1 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        B12 = new javax.swing.JButton();
        B13 = new javax.swing.JButton();
        B14 = new javax.swing.JButton();
        B15 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B10 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B11 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        Compute = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Display = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        hj = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(102, 102, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B1.setBackground(new java.awt.Color(204, 0, 0));
        B1.setText("0");
        B1.setToolTipText("1");
        B1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 80, 50));

        B3.setBackground(new java.awt.Color(204, 0, 0));
        B3.setText("0");
        B3.setToolTipText("2");
        B3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        getContentPane().add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 80, 50));

        B2.setBackground(new java.awt.Color(204, 0, 0));
        B2.setText("0");
        B2.setToolTipText("3");
        B2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        getContentPane().add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 80, 50));

        B0.setBackground(new java.awt.Color(204, 0, 0));
        B0.setText("0");
        B0.setToolTipText("0");
        B0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });
        getContentPane().add(B0, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 80, 50));

        B12.setBackground(new java.awt.Color(204, 0, 0));
        B12.setText("0");
        B12.setToolTipText("8");
        B12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B12ActionPerformed(evt);
            }
        });
        getContentPane().add(B12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 80, 50));

        B13.setBackground(new java.awt.Color(204, 0, 0));
        B13.setText("0");
        B13.setToolTipText("9");
        B13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B13ActionPerformed(evt);
            }
        });
        getContentPane().add(B13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 80, 50));

        B14.setBackground(new java.awt.Color(204, 0, 0));
        B14.setText("0");
        B14.setToolTipText("11");
        B14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B14ActionPerformed(evt);
            }
        });
        getContentPane().add(B14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 80, 50));

        B15.setBackground(new java.awt.Color(204, 0, 0));
        B15.setText("0");
        B15.setToolTipText("10");
        B15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B15ActionPerformed(evt);
            }
        });
        getContentPane().add(B15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 80, 50));

        B8.setBackground(new java.awt.Color(204, 0, 0));
        B8.setText("0");
        B8.setToolTipText("12");
        B8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        getContentPane().add(B8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 80, 50));

        B10.setBackground(new java.awt.Color(204, 0, 0));
        B10.setText("0");
        B10.setToolTipText("15");
        B10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B10ActionPerformed(evt);
            }
        });
        getContentPane().add(B10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 80, 50));

        B9.setBackground(new java.awt.Color(204, 0, 0));
        B9.setText("0");
        B9.setToolTipText("13");
        B9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        getContentPane().add(B9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 80, 50));

        B11.setBackground(new java.awt.Color(204, 0, 0));
        B11.setText("0");
        B11.setToolTipText("14");
        B11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B11ActionPerformed(evt);
            }
        });
        getContentPane().add(B11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 80, 50));

        B4.setBackground(new java.awt.Color(204, 0, 0));
        B4.setText("0");
        B4.setToolTipText("4");
        B4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        getContentPane().add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 80, 50));

        B6.setBackground(new java.awt.Color(204, 0, 0));
        B6.setText("0");
        B6.setToolTipText("7");
        B6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B6.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                B6HierarchyChanged(evt);
            }
        });
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        getContentPane().add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 80, 50));

        B5.setBackground(new java.awt.Color(204, 0, 0));
        B5.setText("0");
        B5.setToolTipText("5");
        B5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        getContentPane().add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 80, 50));

        B7.setBackground(new java.awt.Color(204, 0, 0));
        B7.setText("0");
        B7.setToolTipText("6");
        B7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        getContentPane().add(B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 80, 50));

        Compute.setBackground(new java.awt.Color(0, 0, 51));
        Compute.setForeground(new java.awt.Color(255, 255, 255));
        Compute.setText("Compute");
        Compute.setToolTipText("Press to compute the SOP form of expression.");
        Compute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputeActionPerformed(evt);
            }
        });
        getContentPane().add(Compute, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 80, 40));

        Reset.setBackground(new java.awt.Color(0, 0, 51));
        Reset.setForeground(new java.awt.Color(255, 255, 255));
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        getContentPane().add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 80, 40));

        Display.setBackground(new java.awt.Color(0, 0, 0));
        Display.setForeground(new java.awt.Color(255, 255, 255));
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });
        getContentPane().add(Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 240, 30));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("10");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 20, 20));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AB'");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 30, 20));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("A'B");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 30, 20));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("01");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 20, 20));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("AB");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 30, 20));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("11");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 20, 20));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("A'B'");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 30, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("00");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 20, 20));

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("C'D'");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 30, 20));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("00");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 20, 20));

        jLabel11.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("C'D");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 30, 20));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("01");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 20, 20));

        jLabel13.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CD");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 30, 20));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("11");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 20, 20));

        jLabel15.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("CD'");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 30, 20));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("10");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 20, 20));

        hj.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        hj.setForeground(new java.awt.Color(255, 255, 255));
        hj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hj.setText("4x4 Karnaugh Map Calculator");
        getContentPane().add(hj, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 450, 30));

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("NOTES");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 50, 30));

        textArea1.setBackground(new java.awt.Color(0, 0, 0));
        textArea1.setFont(new java.awt.Font("Gabriola", 0, 14)); // NOI18N
        textArea1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(textArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 240, 90));

        jButton2.setBackground(new java.awt.Color(0, 0, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Feedback");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 90, 40));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/black.jpg"))); // NOI18N
        jLabel18.setToolTipText("Clear the selections in the K-Map");
        jLabel18.setDoubleBuffered(true);
        jLabel18.setMaximumSize(new java.awt.Dimension(2700, 1600));
        jLabel18.setMinimumSize(new java.awt.Dimension(2700, 1600));
        jLabel18.setPreferredSize(new java.awt.Dimension(2700, 1600));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 490, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static int value[]=new int[16];
    static String output="";
    static int A[][]=new int[4][4];
    static int checked[][]=new int[4][4];
    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
    value[0]++;
    value[0]%=2;
    if(value[0]==0)
    {
     B0.setText("0");
     B0.setBackground(Color.RED);
    }
    if(value[0]==1)
    {
     B0.setText("1");
     B0.setBackground(Color.GREEN);
    }
    /*if(value[0]==2)
    {
     B0.setText("x");
     B0.setBackground(Color.YELLOW);
    }*/
    }//GEN-LAST:event_B0ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
value[4]++;
    value[4]%=2;
    if(value[4]==0)
    {
     B4.setText("0");
     B4.setBackground(Color.RED);
    }
    if(value[4]==1)
    {
     B4.setText("1");
     B4.setBackground(Color.GREEN);
    }
    }//GEN-LAST:event_B4ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
    value[1]++;
    value[1]%=2;
    if(value[1]==0)
    {
     B1.setText("0");
     B1.setBackground(Color.RED);
    }
    if(value[1]==1)
    {
     B1.setText("1");
     B1.setBackground(Color.GREEN);
    }
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
     value[2]++;
    value[2]%=2;
    if(value[2]==0)
    {
     B2.setText("0");
     B2.setBackground(Color.RED);
    }
    if(value[2]==1)
    {
     B2.setText("1");
     B2.setBackground(Color.GREEN);
    }
       // TODO add your handling code here:
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
value[3]++;
    value[3]%=2;
    if(value[3]==0)
    {
     B3.setText("0");
     B3.setBackground(Color.RED);
    }
    if(value[3]==1)
    {
     B3.setText("1");
     B3.setBackground(Color.GREEN);
    }
            // TODO add your handling code here:
    }//GEN-LAST:event_B3ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
value[5]++;
    value[5]%=2;
    if(value[5]==0)
    {
     B5.setText("0");
     B5.setBackground(Color.RED);
    }
    if(value[5]==1)
    {
     B5.setText("1");
     B5.setBackground(Color.GREEN);
    }
            // TODO add your handling code here:
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
value[6]++;
    value[6]%=2;
    if(value[6]==0)
    {
     B6.setText("0");
     B6.setBackground(Color.RED);
    }
    if(value[6]==1)
    {
     B6.setText("1");
     B6.setBackground(Color.GREEN);
    }
            // TODO add your handling code here:
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
value[7]++;
    value[7]%=2;
    if(value[7]==0)
    {
     B7.setText("0");
     B7.setBackground(Color.RED);
    }
    if(value[7]==1)
    {
     B7.setText("1");
     B7.setBackground(Color.GREEN);
    }
            // TODO add your handling code here:
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
value[8]++;
    value[8]%=2;
    if(value[8]==0)
    {
     B8.setText("0");
     B8.setBackground(Color.RED);
    }
    if(value[8]==1)
    {
     B8.setText("1");
     B8.setBackground(Color.GREEN);
    }     // TODO add your handling code here:
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
value[9]++;
    value[9]%=2;
    if(value[9]==0)
    {
     B9.setText("0");
     B9.setBackground(Color.RED);
    }
    if(value[9]==1)
    {
     B9.setText("1");
     B9.setBackground(Color.GREEN);
    }// TODO add your handling code here:
    }//GEN-LAST:event_B9ActionPerformed

    private void B10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B10ActionPerformed
value[10]++;
    value[10]%=2;
    if(value[10]==0)
    {
     B10.setText("0");
     B10.setBackground(Color.RED);
    }
    if(value[10]==1)
    {
     B10.setText("1");
     B10.setBackground(Color.GREEN);
    }
            // TODO add your handling code here:
    }//GEN-LAST:event_B10ActionPerformed

    private void B11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B11ActionPerformed
value[11]++;
    value[11]%=2;
    if(value[11]==0)
    {
     B11.setText("0");
     B11.setBackground(Color.RED);
    }
    if(value[11]==1)
    {
     B11.setText("1");
     B11.setBackground(Color.GREEN);
    }
            
    }//GEN-LAST:event_B11ActionPerformed

    private void B12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B12ActionPerformed
        value[12]++;
    value[12]%=2;
    if(value[12]==0)
    {
     B12.setText("0");
     B12.setBackground(Color.RED);
    }
    if(value[12]==1)
    {
     B12.setText("1");
     B12.setBackground(Color.GREEN);
    }
    }//GEN-LAST:event_B12ActionPerformed

    private void B13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B13ActionPerformed
        value[13]++;
    value[13]%=2;
    if(value[13]==0)
    {
     B13.setText("0");
     B13.setBackground(Color.RED);
    }
    if(value[13]==1)
    {
     B13.setText("1");
     B13.setBackground(Color.GREEN);
    }
    }//GEN-LAST:event_B13ActionPerformed

    private void B14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B14ActionPerformed
        value[14]++;
    value[14]%=2;
    if(value[14]==0)
    {
     B14.setText("0");
     B14.setBackground(Color.RED);
    }
    if(value[14]==1)
    {
     B14.setText("1");
     B14.setBackground(Color.GREEN);
    }
    }//GEN-LAST:event_B14ActionPerformed

    private void B15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B15ActionPerformed
        value[15]++;
    value[15]%=2;
    if(value[15]==0)
    {
     B15.setText("0");
     B15.setBackground(Color.RED);
    }
    if(value[15]==1)
    {
     B15.setText("1");
     B15.setBackground(Color.GREEN);
    }
    }//GEN-LAST:event_B15ActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
    Display.setText("");
    textArea1.setText("");
    output="";
    for(int i=0;i<16;i++)
    {
     value[i]=0;
    }
    B0.setText("0");
    B1.setText("0");
    B2.setText("0");
    B3.setText("0");
    B4.setText("0");
    B5.setText("0");
    B6.setText("0");
    B7.setText("0");
    B8.setText("0");
    B9.setText("0");
    B10.setText("0");
    B11.setText("0");
    B12.setText("0");
    B13.setText("0");
    B14.setText("0");
    B15.setText("0");
    B0.setBackground(Color.RED);
    B1.setBackground(Color.RED);
    B2.setBackground(Color.RED);
    B3.setBackground(Color.RED);
    B4.setBackground(Color.RED);
    B5.setBackground(Color.RED);
    B6.setBackground(Color.RED);
    B7.setBackground(Color.RED);
    B8.setBackground(Color.RED);
    B9.setBackground(Color.RED);
    B10.setBackground(Color.RED);
    B11.setBackground(Color.RED);
    B12.setBackground(Color.RED);
    B13.setBackground(Color.RED);
    B14.setBackground(Color.RED);
    B15.setBackground(Color.RED);
    }//GEN-LAST:event_ResetActionPerformed

    private void ComputeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComputeActionPerformed
        compute();
        if(output.length()==0)
            Display.setText("SOP=0");
        else
        {
        if(0==output.substring(1).compareTo("A'+A"))
            Display.setText("SOP=1");
        else Display.setText("SOP="+output.substring(1));
        }
        output="";
    }//GEN-LAST:event_ComputeActionPerformed

    private void B6HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_B6HierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_B6HierarchyChanged

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisplayActionPerformed
/**private static void vsible(boolean b)
{
    setVisible(b);
}*/
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Feedback ob1=new Feedback();
        ob1.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

 static void compute()
 {
  initialize();
  // algo bigins
  
  for(int i=0;i<4;i++)
  {
   for(int j=0;j<4;j++)
   {
    if(A[i][j]==1&&checked[i][j]==0)
    {
     int pass8=check8(i,j);
     if(pass8==0)
     {
      int pass4=check4(i,j);
      if(pass4==0)
      {
       int pass2=check2(i,j);
       if(pass2==0)
       {
        nogrouping(i,j);
       }
      }
     }
    }
   }
  }
  
 }
 //algo ends
 //function for checking 8
 static int check8(int r,int c)
 {
  int result=0;
  //case1
  if(A[r][0]==1&&A[r][1]==1&&A[r][2]==1&&A[r][3]==1&&A[(r+1)%4][0]==1&&A[(r+1)%4][1]==1&&A[(r+1)%4][2]==1&&A[(r+1)%4][3]==1)
  {
   String local="";
   if(r==0)
   {
     local="A'";
   }
   if(r==1)
   {
     local="B";
   }
   if(r==2)
   {
     local="A";
   }
   if(r==3)
   {
     local="B'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][0]=1;checked[r][1]=1;checked[r][2]=1;checked[r][3]=1;
   checked[(r+1)%4][0]=1;checked[(r+1)%4][1]=1;checked[(r+1)%4][2]=1;checked[(r+1)%4][3]=1;
   // make it color
  // makecolor(r,c);
  }else
  //case2
  if(A[r][0]==1&&A[r][1]==1&&A[r][2]==1&&A[r][3]==1&&A[(4+(r-1))%4][0]==1&&A[(4+(r-1))%4][1]==1&&A[(4+(r-1))%4][2]==1&&A[(4+(r-1))%4][3]==1)
  {
   String local="";
   if(r==0)
   {
     local="B'";
   }
   if(r==1)
   {
     local="A'";
   }
   if(r==2)
   {
     local="B";
   }
   if(r==3)
   {
     local="A";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][0]=1;checked[r][1]=1;checked[r][2]=1;checked[r][3]=1;
   checked[(4+(r-1))%4][0]=1;checked[(4+(r-1))%4][1]=1;checked[(4+(r-1))%4][2]=1;checked[(4+(r-1))%4][3]=1;
  }else
  //case3
  if(A[0][c]==1&&A[1][c]==1&&A[2][c]==1&&A[3][c]==1&&A[0][(c+1)%4]==1&&A[1][(c+1)%4]==1&&A[2][(c+1)%4]==1&&A[3][(c+1)%4]==1)
  {
   String local="";
   if(c==0)
   {
     local="C'";
   }
   if(c==1)
   {
     local="D";
   }
   if(c==2)
   {
     local="C";
   }
   if(c==3)
   {
     local="D'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[0][c]=1;checked[1][c]=1;checked[2][c]=1;checked[3][c]=1;
   checked[0][(c+1)%4]=1;checked[1][(c+1)%4]=1;checked[2][(c+1)%4]=1;checked[3][(c+1)%4]=1;
  }else
  //case 4
  if(A[0][c]==1&&A[1][c]==1&&A[2][c]==1&&A[3][c]==1&&A[0][(4+(c-1))%4]==1&&A[1][(4+(c-1))%4]==1&&A[2][(4+(c-1))%4]==1&&A[3][(4+(c-1))%4]==1)
  {
   String local="";
   if(c==0)
   {
     local="D'";
   }
   if(c==1)
   {
     local="C'";
   }
   if(c==2)
   {
     local="D";
   }
   if(c==3)
   {
     local="C";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[0][c]=1;checked[1][c]=1;checked[2][c]=1;checked[3][c]=1;
   checked[0][(4+(c-1))%4]=1;checked[1][(4+(c-1))%4]=1;checked[2][(4+(c-1))%4]=1;checked[3][(4+(c-1))%4]=1;
  }
  
 return result;
 }
 //ends of check8
 //check4 start
 static int check4(int r,int c)
 {
  int result=0;
  String local="";
  //case1
  if(A[r][0]==1&&A[r][1]==1&&A[r][2]==1&&A[r][3]==1)
  {
   if(r==0)
   {
    local="A'B'";
   }
   if(r==1)
   {
    local="A'B";
   }
   if(r==2)
   {
    local="AB";
   }
   if(r==3)
   {
    local="AB'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][0]=1;checked[r][1]=1;checked[r][2]=1;checked[r][3]=1;
  }else
  //case2
  if(A[0][c]==1&&A[1][c]==1&&A[2][c]==1&&A[3][c]==1)
  {
   if(c==0)
   {
    local="C'D'";
   }
   if(c==1)
   {
    local="C'D";
   }
   if(c==2)
   {
    local="CD";
   }
   if(c==3)
   {
    local="CD'";
    
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[0][c]=1;checked[1][c]=1;checked[2][c]=1;checked[3][c]=1;
  }else
  //case3 row+ col+
  if(A[r][c]==1&&A[r][(c+1)%4]==1&&A[(r+1)%4][c]==1&&A[(r+1)%4][(c+1)%4]==1)
  {
   if(r==0)
   {
    local="A'";
   }
   if(r==1)
   {
    local="B";
   }
   if(r==2)
   {
    local="A";
   }
   if(r==3)
   {
    local="B'";
   }
   if(c==0)
   {
    local=local+"C'";
   }
   if(c==1)
   {
    local=local+"D";
   }
   if(c==2)
   {
    local=local+"C";
   }
   if(c==3)
   {
    local=local+"D'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][c]=1;checked[r][(c+1)%4]=1;checked[(r+1)%4][c]=1;checked[(r+1)%4][(c+1)%4]=1;
  }else
  //case4 row+ col--
  if(A[r][(4+(c-1))%4]==1&&A[r][c]==1&&A[(r+1)%4][(4+(c-1))%4]==1&&A[(r+1)%4][c]==1)
  {
   if(r==0)
   {
    local="A'";
   }
   if(r==1)
   {
    local="B";
   }
   if(r==2)
   {
    local="A";
   }
   if(r==3)
   {
    local="B'";
   }
   if(c==0)
   {
    local=local+"D'";
   }
   if(c==1)
   {
    local=local+"C'";
   }
   if(c==2)
   {
    local=local+"D";
   }
   if(c==3)
   {
    local=local+"C'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][(4+(c-1))%4]=1;checked[r][c]=1;checked[(r+1)%4][(4+(c-1))%4]=1;checked[(r+1)%4][c]=1;
   
  }else
  //case5 row - and col -
  if(A[(4+(r-1))%4][(4+(c-1))%4]==1&&A[(4+(r-1))%4][c]==1&&A[r][(4+(c-1))%4]==1&&A[r][c]==1)
  {
   if(r==0)
   {
    local="B'";
   }
   if(r==1)
   {
    local="A'";
   }
   if(r==2)
   {
    local="B";
   }
   if(r==3)
   {
    local="A";
   }
   if(c==0)
   {
    local=local+"D'";
   }
   if(c==1)
   {
    local=local+"C'";
   }
   if(c==2)
   {
    local=local+"D";
   }
   if(c==3)
   {
    local=local+"C'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[(4+(r-1))%4][(4+(c-1))%4]=1;checked[(4+(r-1))%4][c]=1;checked[r][(4+(c-1))%4]=1;checked[r][c]=1;
  }else
  //case6 row- col+
  if(A[(4+(r-1))%4][c]==1&&A[(4+(r-1))%4][(c+1)%4]==1&&A[r][c]==1&&A[r][(c+1)%4]==1)
  {
   if(r==0)
   {
    local="B'";
   }
   if(r==1)
   {
    local="A'";
   }
   if(r==2)
   {
    local="B";
   }
   if(r==3)
   {
    local="A";
   }
   if(c==0)
   {
    local=local+"C'";
   }
   if(c==1)
   {
    local=local+"D";
   }
   if(c==2)
   {
    local=local+"C";
   }
   if(c==3)
   {
    local=local+"D'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[(4+(r-1))%4][c]=1;checked[(4+(r-1))%4][(c+1)%4]=1;checked[r][c]=1;checked[r][(c+1)%4]=1;
  }
  
 return result;
 }
 //check for 2 check2
 static int check2(int r,int c)
 {
  int result=0;
  String local="";
  //case 1 col++
  if(A[r][c]==1&&A[r][(c+1)%4]==1)
  {
   if(r==0)
   {
    local="A'B'";
   }
   if(r==1)
   {
    local="A'B";
   }
   if(r==2)
   {
    local="AB";
   }
   if(r==3)
   {
    local="AB'";
   }
   if(c==0)
   {
    local=local+"C'";
   }
   if(c==1)
   {
    local=local+"D";
   }
   if(c==2)
   {
    local=local+"C";
   }
   if(c==3)
   {
    local=local+"D'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][c]=1;checked[r][(c+1)%4]=1;
   
  }else
  //case 2 col--
  if(A[r][(4+(c-1))%4]==1&&A[r][c]==1)
  {
   if(r==0)
   {
    local="A'B'";
   }
   if(r==1)
   {
    local="A'B";
   }
   if(r==2)
   {
    local="AB";
   }
   if(r==3)
   {
    local="AB'";
   }
   if(c==0)
   {
    local=local+"D'";
   }
   if(c==1)
   {
    local=local+"C'";
   }
   if(c==2)
   {
    local=local+"D";
   }
   if(c==3)
   {
    local=local+"C";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][(4+(c-1))%4]=1;checked[r][c]=1;  
  }else
  //case3 row++
  if(A[r][c]==1&&A[(r+1)%4][c]==1)
  {
   if(r==0)
   {
    local="A'";
   }
   if(r==1)
   {
    local="B";
   }
   if(r==2)
   {
    local="A";
   }
   if(r==3)
   {
    local="B'";
   }
   if(c==0)
   {
    local=local+"C'D'";
   }
   if(c==1)
   {
    local=local+"C'D";
   }
   if(c==2)
   {
    local=local+"CD";
   }
   if(c==3)
   {
    local=local+"CD'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][c]=1;checked[(r+1)%4][c]=1;
   }else
  // case4 row--
  if(A[r][c]==1&&A[(4+(r-1))%4][c]==1)
  {
   if(r==0)
   {
    local="B'";
   }
   if(r==1)
   {
    local="A'";
   }
   if(r==2)
   {
    local="B";
   }
   if(r==3)
   {
    local="A";
   }
   if(c==0)
   {
    local=local+"C'D'";
   }
   if(c==1)
   {
    local=local+"C'D";
   }
   if(c==2)
   {
    local=local+"CD";
   }
   if(c==3)
   {
    local=local+"CD'";
   }
   output=output+"+"+local;
   result=1;
   //make checked
   checked[r][c]=1;checked[(4+(r-1))%4][c]=1;
   }
 return result;
 }
 // no grouping
 static void nogrouping(int r, int c)
 {  String local="";
  if(r==0)
  {
   local="A'B'";
  }
  if(r==1)
  {
   local="A'B";
  }
  if(r==2)
  {
   local="AB";
  }
  if(r==3)
  {
   local="AB'";
  }
  if(c==0)
  {
   local=local+"C'D'";
  }
  if(c==1)
  {
   local=local+"C'D";
  }
  if(c==2)
  {
   local=local+"CD";
  }
  if(c==3)
  {
   local=local+"CD'";
  }
  output=output+"+"+local;
  
  checked[r][c]=1;
 }
 
 // initialize 2D-Array
 static void initialize()
 {
  int count=0;
  for(int i=0;i<4;i++)
  {
   for(int j=0;j<4;j++)
   {
    A[i][j]=value[count];
    checked[i][j]=0;
    count++;
   }
  }
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws Exception {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        long startTime=System.nanoTime();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new KMap().setVisible(true);
        });
        
        final long duration=System.nanoTime()-startTime;
        System.out.println("The time taken is "+duration+" ns.");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B10;
    private javax.swing.JButton B11;
    private javax.swing.JButton B12;
    private javax.swing.JButton B13;
    private javax.swing.JButton B14;
    private javax.swing.JButton B15;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton Compute;
    private javax.swing.JTextField Display;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel hj;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
