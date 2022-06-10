/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Principal;

import Vistas.Principal.InicioSeccionU;
import Vistas.Principal.Conexion;
import Vistas.info.InfoU;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class CrearCuentaU extends javax.swing.JFrame {

    Conexion conecion = new Conexion();
    Connection cin = conecion.Entrar();
    PreparedStatement ps;
    public CrearCuentaU() {
        initComponents();
        CrearCuentaU.this.setBackground(new Color(0, 0, 0, 0));
    }
    
    void Registrar(){
        
        String insertar = "insert into Usuarios (Nombre,Apellidos,NumCel,Correo,NumBanco,Passw)values (?,?,?,?,?,?)";
        try {
            ps = cin.prepareCall(insertar);
            //ps.setString(1,IdUsuario );
            ps.setString(1, Nombre.getText());
            ps.setString(2, Apellidos.getText());
            ps.setString(3, NumCel.getText());
            ps.setString(4, Correo.getText());
            ps.setString(5, NumBanco.getText());
            ps.setString(6, PassW.getText());
           
            int registro = ps.executeUpdate();
            
            if(registro > 0){
                JOptionPane.showMessageDialog(this, "Usuario registrado con exito", "Bien", JOptionPane.QUESTION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,"El usuario no se registro con exito", "Atencion", JOptionPane.ERROR_MESSAGE);
            }
        } catch(Exception E){
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NumCel = new LIB.JTexfieldPH_FielTex();
        Correo = new LIB.JTexfieldPH_FielTex();
        Nombre = new LIB.JTexfieldPH_FielTex();
        NumBanco = new LIB.JTexfieldPH_FielTex();
        PassW = new LIB.JTexfieldPH_Password();
        Apellidos = new LIB.JTexfieldPH_FielTex();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fSGradientPanel1 = new LIB.FSGradientPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Uber");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 150, -1));

        NumCel.setToolTipText("");
        NumCel.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        NumCel.setPlaceholder("Numero Celular");
        NumCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumCelActionPerformed(evt);
            }
        });
        jPanel1.add(NumCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));
        NumCel.getAccessibleContext().setAccessibleName("");

        Correo.setPlaceholder("Correo (Opcional)");
        Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoActionPerformed(evt);
            }
        });
        jPanel1.add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        Nombre.setPlaceholder("Nombre");
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        NumBanco.setPlaceholder("Numero de Cuenta Bancaria");
        NumBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumBancoActionPerformed(evt);
            }
        });
        jPanel1.add(NumBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        PassW.setPlaceholder("Contraseña");
        jPanel1.add(PassW, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        Apellidos.setPlaceholder("Apellidos");
        jPanel1.add(Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jButton1.setBackground(new java.awt.Color(18, 18, 18));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Siguiente");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 180, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel4.setText("Registrate ahora");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 200, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Back.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 22, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 300, 390));

        fSGradientPanel1.setFSEndColor(new java.awt.Color(18, 18, 18));
        fSGradientPanel1.setFSGradientFocus(100);
        fSGradientPanel1.setFSStartColor(new java.awt.Color(9, 9, 26));
        fSGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/close.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        fSGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 24, -1, 40));

        getContentPane().add(fSGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 303, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NumCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumCelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumCelActionPerformed

    private void CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void NumBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumBancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumBancoActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        InicioSeccionU isu = new InicioSeccionU();
        isu.show();
        
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Registrar();
        InfoU iu = new InfoU();
        iu.show();
        
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(CrearCuentaU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCuentaU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCuentaU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCuentaU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCuentaU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.JTexfieldPH_FielTex Apellidos;
    private LIB.JTexfieldPH_FielTex Correo;
    private LIB.JTexfieldPH_FielTex Nombre;
    private LIB.JTexfieldPH_FielTex NumBanco;
    private LIB.JTexfieldPH_FielTex NumCel;
    private LIB.JTexfieldPH_Password PassW;
    private LIB.FSGradientPanel fSGradientPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
