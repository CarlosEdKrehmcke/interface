import java.awt.*;
import javax.swing.*;


public class Teste extends JFrame{
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4; 

    JTextField textoNome = new JTextField(20);
    JTextField textoUserName = new JTextField(20);
    JTextField textoSenha = new JTextField(20);
    JTextField textoObs = new JTextField(20);

    public Teste(){

        label1 = new JLabel("nome", JLabel.LEFT);
        JTextField textoNome = new JTextField(10);

        label2 = new JLabel("user name", JLabel.LEFT);
        JTextField textoUserName = new JTextField(10);

        label3 = new JLabel("senha", JLabel.LEFT);
        JTextField textoSenha = new JTextField(10);

        label4 = new JLabel("Obs", JLabel.LEFT);
        JTextField textoObs = new JTextField(10);

        Container pane = this.getContentPane();
        pane.setLayout((new GridLayout(4,2)));
        pane.add(label1);
        pane.add(textoNome);

        pane.add(label2);
        pane.add(textoUserName);

        pane.add(label3);
        pane.add(textoSenha);

        pane.add(label4);
        pane.add(textoObs);

        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,200);
        this.setVisible(true);
    }

    public static void main(String[] args){
        Teste batata = new Teste();
    }

}