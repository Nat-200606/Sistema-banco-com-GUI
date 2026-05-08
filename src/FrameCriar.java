import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class FrameCriar extends FrameBase implements ActionListener {
    static JTextField criarconta;
    static ButtonBase criar;

    FrameCriar(){
        this.setSize(480,380);

        criarconta = new JTextField();
        criarconta.setFont(fonte);
        criarconta.setBounds(120,90,260,50);
        criarconta.setToolTipText("Numero da conta a ser criada");

        criar = new ButtonBase("Criar conta");
        criar.setFont(fonte);
        criar.addActionListener(this);
        criar.setLocation(120,150);

        this.add(criar);
        this.add(criarconta);

        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==criar && !Objects.equals(criarconta.getText(), "")){
            Main.contas[Main.pos] = Integer.parseInt(criarconta.getText());
            JOptionPane.showMessageDialog(null
                    ,"Conta de numero "+Main.contas[Main.pos]+" criada com sucesso");
            Main.pos++;
            this.dispose();
        }
    }
}
