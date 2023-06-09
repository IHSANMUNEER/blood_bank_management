/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sufyan
 */
public class UpdateDonor extends javax.swing.JDialog {

    /**
     * Creates new form UpdateDonor1
     */
    public void update()
    {
        String name= txtName.getText();
        String id= txtID.getText();
        String height= txtHeight.getText();
        String weight= txtWeight.getText();
        String address= txtAddress.getText();
        String phone= txtPhone.getText();
        String email= txtEmail.getText();
        String age=txtAge.getSelectedItem().toString();
        String grp=txtGrpp.getSelectedItem().toString();
        String gender=txtGender.getSelectedItem().toString();

        if(name.equals("") || id.equals("") || height.equals("") || weight.equals("") || address.equals("") || phone.equals("") || email.equals("") || txtGrpp.getSelectedItem().equals("--SELECT--") || txtAge.getSelectedItem().equals("--SELECT--") || txtGender.getSelectedItem().equals("--SELECT--")) 
        {
            JOptionPane.showMessageDialog(this, "ALL FIELDS ARE MANDATORY", "WARNING", JOptionPane.ERROR_MESSAGE);
        } 
        else if(txtPhone.getText().length()<=9)
        {
            JOptionPane.showMessageDialog(null, "ENTER VALID MOBILE NUMBER");
        }
        else
        {
            
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","root","");
            
                String sql="UPDATE `donors` SET `Bloodgrp`='"+grp+"',`Name`='"+name+"',`Age`='"+age+"',`Gender`='"+gender+"',`Height`='"+height+"',`Weight`='"+weight+"',`Address`='"+address+"',`Phone`='"+phone+"',`Email`='"+email+"' WHERE id='"+id+"'";
            
                Statement st=con.createStatement();
                st.executeUpdate(sql);
            
                
            
                JOptionPane.showMessageDialog(null, "DONOR UPDATED SUCCESSFULLY");
            
          
              
            
            
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
   
        }
    }
    
    
    public UpdateDonor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtGrpp = new javax.swing.JComboBox<>();
        txtAge = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtGender = new javax.swing.JComboBox<>();
        kButton7 = new keeptoo.KButton();
        kButton8 = new keeptoo.KButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel2.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));
        kGradientPanel2.setkBorderRadius(0);
        kGradientPanel2.setkEndColor(new java.awt.Color(153, 0, 0));
        kGradientPanel2.setkFillBackground(false);
        kGradientPanel2.setkStartColor(new java.awt.Color(153, 51, 0));
        kGradientPanel2.setLayout(null);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BLOOD GROUP :");
        kGradientPanel2.add(jLabel5);
        jLabel5.setBounds(20, 210, 193, 32);

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        txtID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        kGradientPanel2.add(txtID);
        txtID.setBounds(607, 125, 282, 40);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Age :");
        kGradientPanel2.add(jLabel6);
        jLabel6.setBounds(90, 290, 70, 32);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("HEIGHT :");
        kGradientPanel2.add(jLabel7);
        jLabel7.setBounds(40, 380, 105, 32);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("WEIGHT :");
        kGradientPanel2.add(jLabel8);
        jLabel8.setBounds(40, 460, 120, 32);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("GENDER :");
        kGradientPanel2.add(jLabel9);
        jLabel9.setBounds(30, 540, 121, 32);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("NAME :");
        kGradientPanel2.add(jLabel11);
        jLabel11.setBounds(60, 130, 90, 32);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ID :");
        kGradientPanel2.add(jLabel12);
        jLabel12.setBounds(542, 125, 60, 32);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("EMAIL :");
        kGradientPanel2.add(jLabel13);
        jLabel13.setBounds(492, 285, 110, 32);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ADDRESS :");
        kGradientPanel2.add(jLabel14);
        jLabel14.setBounds(435, 373, 130, 32);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("PHONE :");
        kGradientPanel2.add(jLabel15);
        jLabel15.setBounds(484, 210, 110, 32);

        txtName.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        kGradientPanel2.add(txtName);
        txtName.setBounds(162, 125, 282, 40);

        txtGrpp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtGrpp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--", "A +", "A -", "B +", "B -", "AB +", "AB -", "O +", "O -" }));
        txtGrpp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtGrpp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtGrpp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrppActionPerformed(evt);
            }
        });
        kGradientPanel2.add(txtGrpp);
        txtGrpp.setBounds(230, 210, 200, 33);

        txtAge.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtAge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75" }));
        txtAge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtAge.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        kGradientPanel2.add(txtAge);
        txtAge.setBounds(160, 290, 140, 40);

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        txtAddress.setRows(5);
        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane2.setViewportView(txtAddress);

        kGradientPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(599, 365, 323, 141);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UPDATE DONOR");
        kGradientPanel2.add(jLabel1);
        jLabel1.setBounds(322, 23, 301, 47);

        txtPhone.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        txtPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        kGradientPanel2.add(txtPhone);
        txtPhone.setBounds(606, 210, 282, 40);

        txtHeight.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        txtHeight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        kGradientPanel2.add(txtHeight);
        txtHeight.setBounds(160, 380, 158, 40);

        txtWeight.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        txtWeight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        kGradientPanel2.add(txtWeight);
        txtWeight.setBounds(160, 450, 158, 40);

        txtEmail.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        kGradientPanel2.add(txtEmail);
        txtEmail.setBounds(607, 285, 282, 40);

        txtGender.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--", "MALE", "FEMALE", "OTHERS" }));
        txtGender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtGender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        kGradientPanel2.add(txtGender);
        txtGender.setBounds(160, 540, 162, 40);

        kButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        kButton7.setText("CLOSE");
        kButton7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        kButton7.setkBorderRadius(0);
        kButton7.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton7.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton7.setkHoverColor(new java.awt.Color(0, 0, 0));
        kButton7.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        kButton7.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton7.setkHoverStartColor(new java.awt.Color(0, 0, 0));
        kButton7.setkIndicatorColor(new java.awt.Color(0, 0, 0));
        kButton7.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton7.setkStartColor(new java.awt.Color(255, 255, 255));
        kButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton7ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(kButton7);
        kButton7.setBounds(50, 720, 140, 45);

        kButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        kButton8.setText("UPDATE");
        kButton8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        kButton8.setkBorderRadius(0);
        kButton8.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton8.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton8.setkHoverColor(new java.awt.Color(0, 0, 0));
        kButton8.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        kButton8.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton8.setkHoverStartColor(new java.awt.Color(0, 0, 0));
        kButton8.setkIndicatorColor(new java.awt.Color(0, 0, 0));
        kButton8.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton8.setkStartColor(new java.awt.Color(255, 255, 255));
        kButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton8ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(kButton8);
        kButton8.setBounds(770, 610, 150, 45);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sufyan\\Downloads\\cassi-josh-lhnOvu72BM8-unsplash.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        kGradientPanel2.add(jLabel2);
        jLabel2.setBounds(0, -11, 960, 1830);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtGrppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrppActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrppActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void kButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton7ActionPerformed

        this.dispose();

    }//GEN-LAST:event_kButton7ActionPerformed

    private void kButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton8ActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_kButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateDonor dialog = new UpdateDonor(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    public keeptoo.KButton kButton7;
    public keeptoo.KButton kButton8;
    private keeptoo.KGradientPanel kGradientPanel2;
    public javax.swing.JTextArea txtAddress;
    public javax.swing.JComboBox<String> txtAge;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JComboBox<String> txtGender;
    public javax.swing.JComboBox<String> txtGrpp;
    public javax.swing.JTextField txtHeight;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtName;
    public javax.swing.JTextField txtPhone;
    public javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
