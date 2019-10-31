package FusionMarket.VIEW;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Starting 
{
    public static void main(String[] args) 
    {
        telaPrincipal telaprincipal  = new telaPrincipal();
        telaprincipal.setVisible(true);
        telaprincipal.setExtendedState(Frame.MAXIMIZED_BOTH);
    }
}
