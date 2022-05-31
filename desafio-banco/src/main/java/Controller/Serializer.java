/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.Bank.src.main.java.Controller;

import org.example.Bank.src.main.java.Views.CadastroView;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author llait
 */
public class Serializer {
    
    public static void serializeToFile(Object obj, String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            
            fos.close();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CadastroView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CadastroView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Object deserialize(String fileName){
        try {
            //procurar arquivo
            //ler arquivo
            //comparar senha digitada com a salva
            var fis = new FileInputStream(fileName);
            var ois = new ObjectInputStream(fis);
            
            var obj = ois.readObject();
            
            ois.close();
            fis.close();
            
            return obj;
                        
        } catch (FileNotFoundException ex) {
            System.out.println("Cadastro não encontrado");
            
        } catch (IOException ex) {
            Logger.getLogger(Serializer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Serializer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
