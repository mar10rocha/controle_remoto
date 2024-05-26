package br.com.mar10rocha.ui;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Content extends JPanel {
    int width = 735;
    int height = 550;
    int xPosition = 200;
    int yPosition = 150;
    JLabel backgroundBase;
    JLabel power;// Unused
    JLabel mute;// Unused
    JLabel menu;// Unused
    JLabel back;// Unused
    public Content(){
        this.setBounds(this.yPosition, this.xPosition, this.width, this.height);
        backgroundBase = new JLabel();
        backgroundBase.setBounds(this.yPosition, this.xPosition, this.width, this.height);
        // O JLabel terá uma imagem como conteudo, não texto. Ela será o Background!
        backgroundBase.setIcon(new ImageIcon(Content.class.getResource("/br/com/mar10rocha/imagens/mainBackground.jpg")));
        this.add(backgroundBase);
        // Criação das labels dos botoes.
        power = new JLabel();
        power.setBounds(0, 0, 40, 40);
        power.setIcon(new ImageIcon(Content.class.getResource("/br/com/mar10rocha/imagens/power.png")));
        this.add(power);
        this.setVisible(true);
    }
}
