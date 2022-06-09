
package src;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Patricio
 */
public class JFrameIngreso extends JFrame{
    JPanelIngreso ingreso = new JPanelIngreso();
    public JFrameIngreso(){
        componentes();
    }
    public void componentes(){     
        this.setTitle("Iniciar sesión");
        this.setSize(500, 260);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setContentPane(ingreso);
        
    }

}
