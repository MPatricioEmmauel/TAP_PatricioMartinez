package src;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javafx.scene.paint.Color;
import javax.swing.*;

public class JFrameMenu extends JFrame implements ActionListener{
    Acciones ac = new Acciones();
    PanelAgregar pagregar;
    PanelConsultar pconsulta;
    PanelModificar pmodificar;
    PanelEliminar peliminar;
    
    JPanel contenedor;
    JMenuBar barra;
    JMenu acciones, ayuda, opciones;
    JMenuItem agregar, consultar, modificar, eliminar, info, salir, prueba;
    
    public JFrameMenu(){
        //Contenedor
        contenedor = new JPanel();
        contenedor.setLayout(new BorderLayout());
        //contenedor.add(mostrar);
        this.add(contenedor);
        
       //Barra
        barra = new JMenuBar();
        setJMenuBar(barra);

        acciones = new JMenu("Acciones");
        barra.add(acciones);
        ayuda = new JMenu("Ayuda");
        barra.add(ayuda);
        opciones = new JMenu("Opciones");
        barra.add(opciones);
        
        agregar = new JMenuItem("Agregar");
        acciones.add(agregar);
        agregar.addActionListener(this);

        consultar = new JMenuItem("Consultar");
        acciones.add(consultar);
        consultar.addActionListener(this);

        modificar = new JMenuItem("Modificar");
        modificar.addActionListener(this);
        acciones.add(modificar);

        eliminar = new JMenuItem("Eliminar");
        acciones.add(eliminar);
        eliminar.addActionListener(this);

        info = new JMenuItem("Acerca de");
        ayuda.add(info);
        info.addActionListener(this);
        componentes();

        salir = new JMenuItem("Salir");
        opciones.add(salir);
        salir.addActionListener(this);

        prueba = new JMenuItem("Prueba");
        opciones.add(prueba);
        prueba.addActionListener(this);
    }
    public void componentes(){
        this.setSize(700, 400);
        
        this.setTitle("Menu Principal");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==agregar){ //Agregar
            pagregar = new PanelAgregar();
            contenedor.removeAll();
            contenedor.add(pagregar);
            pagregar.setVisible(true);
            contenedor.revalidate(); 
            contenedor.repaint();
            
        }
        if(e.getSource()==consultar){ //Consultar
            pconsulta = new PanelConsultar();
            contenedor.removeAll();
            contenedor.add(pconsulta);
            pconsulta.setVisible(true);
            contenedor.revalidate(); 
            contenedor.repaint();
        }
        if(e.getSource()==modificar){ //Modificar
            pmodificar = new PanelModificar();
            contenedor.removeAll();
            contenedor.add(pmodificar);
            contenedor.revalidate(); 
            contenedor.repaint();
        }
        if(e.getSource()==eliminar){ //Eliminar
            peliminar = new PanelEliminar();
            contenedor.removeAll();
            contenedor.add(peliminar);
            contenedor.revalidate(); 
            contenedor.repaint();
        }
        if(e.getSource()==info){ //Acerca de: 
            JOptionPane.showMessageDialog(this, 
                "Agenda realizada por José Oswaldo Valencia Moreno (El guapo)",
                "Alumno",
                JOptionPane.INFORMATION_MESSAGE);
        }
        if(e.getSource()==salir){ //Salir
            System.exit(0);
        }
        if(e.getSource()==prueba){ //Salir
          
        } 
    }
 
}
