/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.Bank.src.main.java.Controller;

import org.example.Bank.src.main.java.Views.LoginView;

/**
 *
 * @author llait
 */
public class Main {
    
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new CadastroView().setVisible(true);
                new LoginView().setVisible(true);
                //abrir a tela de login
                
            }
        });
    }
}
