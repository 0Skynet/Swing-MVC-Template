/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.MainController;
import model.MainModel;

/**
 *
 * @author skynet
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainController controller = new MainController();
        controller.exec();
    }
    
}
