import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameBase extends JFrame{
    Font fonte = new Font("MV Boli",Font.PLAIN,21);
    FrameBase(){
        ImageIcon icon = new ImageIcon("money.png");


        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setResizable(false);
        this.setTitle("Banco");

    }
}
