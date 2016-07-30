/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author skynet
 */
public class MainView extends JFrame  implements Runnable{
    JLabel txtChangeMe;
    
    public MainView()
    {
        txtChangeMe = new JLabel();
    }
    
    @Override
    public void run() {
        setSize(400, 100);
        
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        
        add(txtChangeMe);
        
        setVisible(true);
    }

    public String getTxtChangeMe() {
        return txtChangeMe.getText();
    }

    public void setTxtChangeMe(String value) {
        txtChangeMe.setText(value);
    }
}
