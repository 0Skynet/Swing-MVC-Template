/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MainController;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author skynet
 */
public class MainView extends JFrame  implements Runnable{
    JLabel txtChangeMe;
    JButton btShowTime;
    MainController controller;
    
    public MainView(MainController controller)
    {       
        this.controller = controller;
        
        txtChangeMe = new JLabel();
        btShowTime = new JButton();
    }
    
    @Override
    public void run() {
        setSize(400, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        btShowTime.setText("Show Time");
        btShowTime.addActionListener(controller);
        
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        
        add(txtChangeMe, BorderLayout.NORTH);
        add(btShowTime, BorderLayout.SOUTH);
        
        setVisible(true);
    }

    public String getTxtChangeMe() {
        return txtChangeMe.getText();
    }

    public void setTxtChangeMe(String value) {
        txtChangeMe.setText(value);
    }
}
