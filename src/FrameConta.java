import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameConta extends FrameBase implements ActionListener {
    ButtonBase depositar;
    ButtonBase sacar;
    JLabel saldo;

    FrameConta(){
        this.setSize(600,560);

        saldo = new JLabel("Saldo da conta "+Main.contas[Main.posAtual]+" e de "+Main.saldo[Main.posAtual]);
        saldo.setBounds(160,50,300,50);
        saldo.setFont(fonte);
        saldo.setForeground(Color.decode("#61A966"));
        saldo.setFocusable(false);

        depositar = new ButtonBase("Depositar");
        depositar.setLocation(160,110);
        depositar.setFont(fonte);
        depositar.addActionListener(this);

        sacar = new ButtonBase("Sacar");
        sacar.setLocation(160,230);
        sacar.setFont(fonte);
        sacar.addActionListener(this);


        this.add(saldo);
        this.add(depositar);
        this.add(sacar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==depositar){
            Main.saldo[Main.posAtual] +=
                    Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que deseja depositar"));
            JOptionPane.showMessageDialog(null,"Deposito realizado com sucesso");
            saldo.setText("Saldo da conta "+Main.contas[Main.posAtual]+" e de "+Main.saldo[Main.posAtual]);
        }
        if (e.getSource()==sacar){
            int saque = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que deseja sacar"));
            if ((Main.saldo[Main.posAtual]-saque) >= 0) {
                Main.saldo[Main.posAtual] -=saque;
                JOptionPane.showMessageDialog(null, "Saque realizado com sucesso");
                saldo.setText("Saldo da conta " + Main.contas[Main.posAtual] + " e de " + Main.saldo[Main.posAtual]);
            }else {
                JOptionPane.showMessageDialog(null,"Saldo insuficiente");
            }
        }

    }
}
