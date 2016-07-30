/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Observable;

/**
 *
 * @author skynet
 */
public class MainModel extends Observable{
    private String changeme;

    public MainModel() {
        this.changeme = "changeme";
    }

    public String getChangeme() {
        return changeme;
    }

    public void setChangeme(String changeme) {
        this.changeme = changeme;
        
        setChanged();
        notifyObservers();
    }
}
