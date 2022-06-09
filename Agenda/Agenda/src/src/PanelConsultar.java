package src;
import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;


public class PanelConsultar extends JPanel implements ActionListener{
  JTable tabla;
  JScrollPane scroll = new JScrollPane();
  JButton salir;
  Acciones ac = new Acciones();
  ArrayList<Persona> datosPer = new ArrayList<Persona>();
  
  public PanelConsultar(){
     datosPer = ac.Datos();
     String titulos [] = {"Nombre", "Telefono", "Correo", "Cumpleanos"};
     String info [][] = obtenerDatos();//detalle
     setLayout (new GridLayout(1,1));
     
     tabla = new JTable(info, titulos);
     tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
     scroll.setViewportView(tabla);
     add(scroll);
  }
  
  private String[][] obtenerDatos(){
    int x=0;
    String informacion[][] = new String[datosPer.size()][4];
    Iterator<Persona> itrPersona = datosPer.iterator();
    while(itrPersona.hasNext()){
       Persona persona = itrPersona.next();
       informacion[x][0] = persona.getNombre();
       informacion[x][1] = persona.getTelefono();
       informacion[x][2] = persona.getCorreo();
       informacion[x][3] = persona.getCumple();
       x++;
    }
   return informacion;
  }
    public void actionPerformed(ActionEvent e){
    }
}

/*
*/
//////////////////////////////////////////////////////////
/*
Acciones ac = new Acciones();
    JScrollPane scroll = new JScrollPane();
    JTable tabla;
    JButton salir, modificar;
    ArrayList<Persona> datosPer = new ArrayList<Persona>();

    public PanelConsultar(){
        datosPer = ac.Datos();
        String titulos[] = {"Nombre", "Telefono", "Correo", "Cumpleaños"};
        String info[][] = obtenerDdatos();
        this.setLayout(new BorderLayout());
        salir = new JButton("Salir");
        tabla = new JTable(info, titulos);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        scroll.setViewportView(tabla);
        this.add(scroll);
    }
    private String[][] obtenerDdatos(){
        int x = 0;
        String informacion[][] = new String[datosPer.size()][4];
        Iterator<Persona> itrPersona = datosPer.iterator();

        while(itrPersona.hasNext()){
            Persona persona = itrPersona.next();
            informacion[x][0] = persona.getNombre();
            informacion[x][1] = persona.getTelefono();
            informacion[x][2] = persona.getCorreo();
            informacion[x][3] = persona.getCumpleaños();
            
            x++;
        }        
        return informacion;
    }
*/
