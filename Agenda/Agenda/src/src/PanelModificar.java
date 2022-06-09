package src;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class PanelModificar extends JPanel implements ActionListener{
    Acciones ac = new Acciones();
    JLabel nombre, telefono, correo, cumple;
    JTextField txtNombre, txtTelefono, txtCorreo, txtCumple;
    JButton btnBuscar, btnModificar;

    public PanelModificar(){
        //this.setBackground(Color.pink);
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
        
        btnModificar = new JButton("Modificar");
        btnModificar.addActionListener(this);
        btnModificar.setEnabled(false);
        this.add(btnModificar);
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
            txtTelefono.setEditable(true);
            txtCorreo.setEditable(true);
            txtCumple.setEditable(true);
            btnModificar.setEnabled(true);
        
        }else {
            JOptionPane.showMessageDialog(null, " No se encuentro ninguna persona con ese nombre");
        }
     }
      
    if(e.getSource()== btnModificar){
            nombre=txtNombre.getText();
            celda  = ac.getCasilla(nombre);

            telefono=txtTelefono.getText();
            correo=txtCorreo.getText();
            cumple=txtCumple.getText();
         
            p= new Persona(nombre, telefono, correo, cumple);
         
            ac.modificar(celda,p);
            JOptionPane.showMessageDialog(null, "Se ha modificado a la persona");
            txtNombre.setText("");
            txtTelefono.setText("");
            txtCorreo.setText("");    
            txtCumple.setText("");
         
            txtNombre.setEditable(true);
            txtTelefono.setEditable(false);
            txtCorreo.setEditable(false);
            txtCumple.setEditable(false);
            btnModificar.setEnabled(false);
    }

    }
}
