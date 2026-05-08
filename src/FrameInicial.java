import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameInicial extends FrameBase implements ActionListener {
    static ButtonBase entrar;
    static JTextField entrarconta;
    static ButtonBase criar;
    FrameInicial() {
        entrarconta = new JTextField();
        entrarconta.setFont(fonte);
        entrarconta.setBounds(160,160,260,50);
        entrarconta.setToolTipText("numero da conta");

        entrar = new ButtonBase("entrar em uma conta");
        entrar.setFont(fonte);
        entrar.addActionListener(this);
        entrar.setBounds(160,100,260,50);

        criar = new ButtonBase("criar uma conta");
        criar.setFont(fonte);
        criar.addActionListener(this);
        criar.setBounds(160,250,260,50);

        this.setSize(600,560);

        this.add(criar);
        this.add(entrar);
        this.add(entrarconta);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==entrar){
            int numero = Integer.parseInt(entrarconta.getText());
            for (int y = 0 ; y < 10; y++){
                if (Main.contas[y] == numero){
                    Main.posAtual = y;
                    FrameConta conta = new FrameConta();
                    break;
                }else if (y >= 9){
                    JOptionPane.showMessageDialog(null,"Erro:Conta nao encontrada");
                }
            }
        }

        if (e.getSource()==criar){
            FrameCriar frameCriar = new FrameCriar();
        }
    }
}
