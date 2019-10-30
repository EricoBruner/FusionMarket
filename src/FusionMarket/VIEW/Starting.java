package FusionMarket.VIEW;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Starting 
{
    public static void main(String[] args) 
    {
        Vazio variavel  = new Vazio(); // Coloque aqui a tela principal que vai iniciar
        variavel.setVisible(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        variavel.setSize((int)dimension.getWidth(), (int)dimension.getHeight());  
        Vazio internal = new Vazio(); // Coloque aqui o primeiro internal
        nomedaaredetrabalho.add(internal);
        internal.setVisible(true);
    }
}
