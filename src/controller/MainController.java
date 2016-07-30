/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Calendar;
import java.util.Observable;
import java.util.Observer;
import javax.swing.SwingUtilities;
import model.MainModel;
import view.MainView;

/**
 *
 * @author skynet
 */
public class MainController implements Observer{
    
    MainModel model;
    MainView view;
    
    public MainController()
    {
        model = new MainModel();
        view = new MainView();
                
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
                        model.setChangeme(Calendar.getInstance().getTime().toString());
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
        view.setTxtChangeMe(model.getChangeme());
    }    
}
