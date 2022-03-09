import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelIngresoA extends JPanel implements ActionListener{
   private JButton btnIngresar, btnCancelar;
   private JTextField txtUser;
   private JPasswordField passContra;
   
   public PanelIngresoA(){
      setLayout(new GridLayout(3,2));
      JLabel lblUser = new JLabel("Usuario: ", JLabel.RIGHT);
      txtUser = new JTextField(15);
      add(lblUser);
      add(txtUser);
      JLabel lblContra = new JLabel("Contrase�a: ", JLabel.RIGHT);
      passContra=new JPasswordField(10);
      passContra.setToolTipText("Ingresa Contrase�a");
      add(lblContra);
      add(passContra);
      btnIngresar = new JButton("Ingresar");
      btnIngresar.addActionListener(this);
      btnCancelar = new JButton("Cancelar");
      btnCancelar.addActionListener(this);
      add(btnIngresar);
      add(btnCancelar);
   }
   
   public void actionPerformed(ActionEvent e){
      String usuario = txtUser.getText();
      String pass = new String (passContra.getPassword());
      if(e.getSource() == btnIngresar){
         if(usuario.isEmpty() && pass.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese su usuario y contrase�a");
            txtUser.requestFocus();
         }else{
            if(usuario.equals("Emmanuel") && pass.equals("L3un4mm319290939")){
               JOptionPane.showMessageDialog(null, "Bienvenido Adminstradora");
               JFrameMostrar datos = new JFrameMostrar();
            }else{
               JOptionPane.showMessageDialog(null, "Usuario o contrase�a incorrecto");
               txtUser.setText(null);
               passContra.setText(null);
               txtUser.requestFocus();
            }//else usuario
         }//else empty
      }//if btnIngresar
      if(e.getSource()==btnCancelar){
         System.exit(0);
      }
   }
}