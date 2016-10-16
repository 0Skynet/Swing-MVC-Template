/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.Observable;

/**
 *
 * @author skynet
 */
public class MainModel extends Observable{
    private Date currentTime;

    public MainModel() {
        this.currentTime = new Date();
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
                
        setChanged();
        notifyObservers();
    }    
}
