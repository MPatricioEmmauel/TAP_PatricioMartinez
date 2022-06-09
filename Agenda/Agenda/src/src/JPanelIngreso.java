/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author Patricio 
 */
public class JPanelIngreso extends JPanel implements ActionListener {
    JButton btnAceptar, btnSalir;
    JLabel lblUsuario, lblContra;
    JTextField txtUsuario;
    JPasswordField passContra;
    public JPanelIngreso(){
        setLayout(new GridLayout(3,2));
        JLabel lblUsuario = new JLabel("Usuario: ", JLabel.RIGHT);
        txtUsuario = new JTextField(12);
        add(lblUsuario);
        add(txtUsuario);
     
        lblContra = new JLabel("Contrase�a: ", JLabel.RIGHT);
        passContra = new JPasswordField(15);
        passContra.setToolTipText("Ingrese Contrase�a");
        add(lblContra);
        add(passContra);
     
        btnAceptar = new JButton("Ingresar");
        btnAceptar.addActionListener(this);
        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(this);
    
        add(btnAceptar);
        add(btnSalir);
    
    }

    public void actionPerformed(ActionEvent e){
        String usuario = txtUsuario.getText();
        String contra = new String(passContra.getPassword());
   
        if(e.getSource() == btnAceptar){
            if(usuario.isEmpty() && contra.isEmpty()){
                JOptionPane.showMessageDialog(null, "Ingrese usuario y contrasena");
                txtUsuario.requestFocus();
            }else{
                if(usuario.equals("Oswa") && contra.equals("1234")){ 
                    JOptionPane.showMessageDialog(null, "Bienvenido Guapo");
                    JFrameMenu menu = new JFrameMenu();
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario o contrasena equivocada");
                    txtUsuario.setText(null);
                    passContra.setText(null);
                    txtUsuario.requestFocus();
                }//else usuario
            }//else empty
        }//if boton Ingresar
        if(e.getSource() == btnSalir){
            System.exit(0);
        }        
    }
}
