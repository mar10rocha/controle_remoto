package br.com.mar10rocha.ui;

import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;
import javax.swing.JLabel;
import java.awt.event.MouseEvent;

import br.com.mar10rocha.entities.*;

public class Content extends JPanel {
    int width = 735;
    int height = 550;
    int xPosition = 200;
    int yPosition = 150;
    JLabel backgroundBase;
    MouseInputAdapter mouseClick;
    public Content(Controller remoteController){
        this.setBounds(this.yPosition, this.xPosition, this.width, this.height);      
        backgroundBase = new JLabel();
        backgroundBase.setBounds(this.yPosition, this.xPosition, this.width, this.height);
        backgroundBase.setIcon(Imagens.powerOffImage);
        mouseClick = new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                if((e.getX() > 36 && e.getX() < 77) && (e.getY() > 27 && e.getY() < 60)){
                    remoteController.ligarDesligar();
                    if(remoteController.isPowerOn() == true){
                        backgroundBase.setIcon(Imagens.powerOnImage);
                    }else{
                        remoteController.falseMuted();
                        backgroundBase.setIcon(Imagens.powerOffImage);
                    }
                }else if((e.getX() > 132 && e.getX() < 172) && (e.getY() > 27 && e.getY() < 60)){
                    remoteController.muteAndUnmute();
                    if(remoteController.isPowerOn() == true && remoteController.isMute() == true){
                        backgroundBase.setIcon(Imagens.muteImage);
                    }else if(remoteController.isPowerOn() == true){
                        backgroundBase.setIcon(Imagens.powerOnImage);
                    }
                }
            }
        };
        backgroundBase.addMouseListener(mouseClick);
        this.add(backgroundBase);
        this.setVisible(true);
    }
}
