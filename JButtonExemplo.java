import java.awt.*;
import javax.swing.*;

public class JButtonExemplo extends JFrame{
    JButton Button1 = new JButton("Abrir");
    JButton Button2 = new JButton("Novo");
    JButton Button3 = new JButton("Fechar");

    public JButtonExemplo(){

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        pane.add(Button1);
        pane.add(Button2);
        pane.add(Button3);

        this.setSize(300,150);
        this.setVisible(true);
    }
    public static void main(String[] args){
        JButtonExemplo teste = new JButtonExemplo();
    }
}