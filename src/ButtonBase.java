import javax.swing.*;
import java.awt.*;

public class ButtonBase extends JButton {
    ButtonBase(String text){
        ImageIcon button = new ImageIcon("button.png");
        ImageIcon buttonPressed = new ImageIcon("button_pressed.png");
        this.setIcon(button);
        this.setPressedIcon(buttonPressed);
        this.setBorderPainted(false);
        this.setHorizontalAlignment(CENTER);
        this.setHorizontalTextPosition(CENTER);
        this.setBackground(null);
        //this.setBackground(Color.decode("#61A966"));
        this.setText(text);
        this.setBounds(190,70,255,115);
        this.setFocusable(false);
    }
}
