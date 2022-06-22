package practicando;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mimarco extends JFrame
{

    public Mimarco() 
    {
        setSize(600,450);
        setLocation(400,200);
        setVisible(true);
        //SetTitle("Steven en su Moto");
        Lamina miLamina=new Lamina();
        add(miLamina);
    }

    
}

class Lamina extends JPanel
{
    public Lamina()
    {
        JButton miBoton=new JButton("Aceptar");
        add(miBoton);
    }    
}
    



