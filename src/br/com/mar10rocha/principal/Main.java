package br.com.mar10rocha.principal;

import javax.swing.JFrame;
import br.com.mar10rocha.ui.*;

public class Main{
    public static void main(String args[]){
        JFrame mainFrame = new JFrame();
        Content mainContent = new Content();
        mainFrame.setBounds(mainContent.getBounds());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //mainFrame.setResizable(false);
        mainFrame.add(mainContent);
        mainFrame.setVisible(true);
    }
}