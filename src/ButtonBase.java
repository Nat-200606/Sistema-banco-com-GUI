import javax.swing.*;
import java.awt.*;

public class ButtonBase extends JButton {
    ButtonBase(String text){
        this.setBackground(Color.decode("#61A966"));
        this.setText(text);
        this.setBounds(170,50,250,50);
        this.setFocusable(false);
    }
}
