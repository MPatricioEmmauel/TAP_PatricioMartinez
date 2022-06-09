package src;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class PanelEliminar extends JPanel implements ActionListener{
    Acciones ac = new Acciones();
    JLabel nombre, telefono, correo, cumple;
    JTextField txtNombre, txtTelefono, txtCorreo, txtCumple;
    JButton btnBuscar, btnEliminar;
    public PanelEliminar(){
        //this.setBackground(Color.ORANGE);
         this.setLayout(new GridLayout(6,2, 10, 10));

        nombre = new JLabel("Nombre", JLabel.RIGHT);
        txtNombre = new JTextField(15);
        
        this.add(nombre);
        this.add(txtNombre);
        
        telefono = new JLabel("Telefono", JLabel.RIGHT);
        txtTelefono = new JTextField(15);
        txtTelefono.setEditable(false);
        this.add(telefono);
        this.add(txtTelefono);
        
        correo = new JLabel("Correo", JLabel.RIGHT);
        txtCorreo = new JTextField(15);
        txtCorreo.setEditable(false);
        this.add(correo);
        this.add(txtCorreo);

        cumple = new JLabel("Cumpleaños", JLabel.RIGHT);
        txtCumple = new JTextField(15);
        txtCumple.setEditable(false);
        this.add(cumple);
        this.add(txtCumple);

        btnBuscar = new JButton("Buscar");
        btnBuscar.addActionListener(this);
        this.add(btnBuscar);
        
        btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(this);
        btnEliminar.setEnabled(false);
        this.add(btnEliminar);
    }
    public void actionPerformed(ActionEvent e){
      String nombre, telefono, correo, cumple;
      int celda;
      Persona p;
      
      if(e.getSource()== btnBuscar){
      nombre = txtNombre.getText();
      celda  = ac.getCasilla(nombre);
      if (celda != -1) {
          p = ac.consultar(celda);
          txtTelefono.setText(p.getTelefono());
          txtCorreo.setText(p.getCorreo());
          txtCumple.setText(p.getCumple());
          
          txtNombre.setEditable(false);
          txtTelefono.setEditable(false);
          txtCorreo.setEditable(false);
          txtCumple.setEditable(true);
          btnEliminar.setEnabled(true);
        
         }else {
         JOptionPane.showMessageDialog(null, " No se encuentro ninguna persona con ese nombre");
         }
      }
      
      if(e.getSource()== btnEliminar){
      nombre = txtNombre.getText();
      celda  = ac.getCasilla(nombre);
      ac.eliminar(celda);
      JOptionPane.showMessageDialog(null, " Persona Eliminada");

      }
   }   
}
