/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import model.MainModel;
import view.MainView;

/**
 *
 * @author skynet
 */
public class MainController implements Observer, ActionListener{
    
    MainModel model;
    MainView view;
    
    public MainController()
    {
        model = new MainModel();
        view = new MainView(this);
                
        model.addObserver(this);
        
        startTimer();
    }
    
    public void startTimer()
    {
        (new Thread(new Runnable() {
            @Override
            public void run() {
                while(true)
                {
                    try
                    {
                        Thread.sleep(1000);
                        model.setCurrentTime(Calendar.getInstance().getTime());
                    }catch(Exception ex)
                    {
                        ex.printStackTrace();
                    }                    
                }
            }
        })).start();
    }
    
    public void exec()
    {
        SwingUtilities.invokeLater(view);
    }
    
    @Override
    public void update(Observable o, Object o1) {
        view.setTxtChangeMe(model.getCurrentTime().toString());
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand())
        {
            case "Show Time":
               JOptionPane.showMessageDialog(view, model.getCurrentTime().toString(), view.getTitle(), 0);
            break;
            default:
                System.out.println("Unimplemented ActionCommand: " + e.getActionCommand());
        }
    }
}
