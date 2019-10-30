package FusionMarket.VIEW;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Starting 
{
    public static void main(String[] args) 
    {
        telaPrincipal telaprincipal  = new telaPrincipal(); // Coloque aqui a tela principal que vai iniciar
        telaprincipal.setVisible(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        telaprincipal.setSize((int)dimension.getWidth(), (int)dimension.getHeight());  
    }
}
