package FusionMarket.VIEW;

import java.awt.Frame;

public class Starting 
{
    public static void main(String[] args) 
    {
        TelaPrincipal tela_principal  = new TelaPrincipal();
        tela_principal.setVisible(true);
        tela_principal.setExtendedState(Frame.MAXIMIZED_BOTH);
    }
}
