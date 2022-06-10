/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP PAVILION
 */
public class Conexion {
    
    Connection cn = null;
    public Statement st=null;
    public Connection Entrar(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn=DriverManager.getConnection("jdbc:sqlserver://;database=Uber;integratedSecurity=true;");
            System.out.println("Conectado");
            
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Error en: " + e);
        }
        return cn;
    }
    
    public Statement Conectar(){
        try {
            cn=DriverManager.getConnection("jdbc:sqlserver://;database=Uber;integratedSecurity=true;");
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException i) {
            JOptionPane.showMessageDialog(null, i);
        }
        return st;
    }
}
