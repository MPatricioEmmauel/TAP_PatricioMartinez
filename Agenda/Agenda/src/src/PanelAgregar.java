package src;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class PanelAgregar extends JPanel implements ActionListener{
    Acciones ac;
    
    JLabel nombre, telefono, correo, cumple;
    JTextField txtNombre, txtTelefono, txtCorreo, txtCumple;
    JButton btnAgregar, btnCancelar;   
        public PanelAgregar(){
        //this.setBackground(Color.DARK_GRAY);
        this.setLayout(new GridLayout(6,2, 10, 10));

        nombre = new JLabel("Nombre", JLabel.RIGHT);
        txtNombre = new JTextField(15);
        this.add(nombre);
        this.add(txtNombre);
        
        telefono = new JLabel("Telefono", JLabel.RIGHT);
        txtTelefono = new JTextField(15);
        this.add(telefono);
        this.add(txtTelefono);

        
        correo = new JLabel("Correo", JLabel.RIGHT);
        txtCorreo = new JTextField(15);
        this.add(correo);
        this.add(txtCorreo);

        cumple = new JLabel("Cumpleaños", JLabel.RIGHT);
        txtCumple = new JTextField(15);
        this.add(cumple);
        this.add(txtCumple);

        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        this.add(btnAgregar);
        
        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(this);
        this.add(btnCancelar);
        
    }
    public void actionPerformed(ActionEvent e){
        /*
        String nombre = txtNombre.getText();
        String telefono = txtTelefono.getText();
        String correo = txtCorreo.getText();
        String cumple = txtCumpleaños.getText();
*/
        if(e.getSource()==btnAgregar){
            if(txtNombre.getText()==null || txtNombre.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Debes colocar al menos el nombre "+txtNombre.getText(),
                "Aviso", JOptionPane.ERROR_MESSAGE);
                txtNombre.requestFocus();
            }else{
                String Nombre, Telefono, Correo, Cumple;
                Nombre = txtNombre.getText();
                Telefono = txtTelefono.getText();
                Correo = txtCorreo.getText();
                Cumple = txtCumple.getText();

                System.out.println(txtNombre.getText());
                System.out.println(txtTelefono.getText());
                System.out.println(txtCorreo.getText());
                System.out.println(txtCumple.getText()); //hasta aqui todo bien
                
                ac = new Acciones();
                ac.agregar(Nombre, Telefono, Correo, Cumple);
                JOptionPane.showMessageDialog(null, "Se a gurdado con exito",
                "Aviso", JOptionPane.INFORMATION_MESSAGE);
                txtNombre.requestFocus();

                txtNombre.setText(null);
                txtTelefono.setText(null);
                txtCorreo.setText(null);
                txtCumple.setText(null);
            }
        }    
        if(e.getSource()==btnCancelar){
            this.setVisible(false);
        }

    }
}
