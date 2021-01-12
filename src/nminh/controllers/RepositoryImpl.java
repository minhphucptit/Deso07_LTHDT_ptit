/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nminh.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author nminh
 */
public class RepositoryImpl implements Repository{

    @Override
    public Object getData(String name) {
        File file =new File(name);
        Object object=new Object();
        try {
            file.createNewFile();
            ObjectInputStream os;
            FileInputStream fis=new FileInputStream(file);
            os=new ObjectInputStream(fis);
            object=os.readObject();
            os.close();
            fis.close();
        } catch (IOException ex) {
           // Logger.getLogger(RepositoryImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(RepositoryImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return object;
    }

    @Override
    public void saveData(Object object, String name) {
        File file =new File(name);
        try {
            file.createNewFile();
            ObjectOutputStream os;
            FileOutputStream fis=new FileOutputStream(file);
            os=new ObjectOutputStream(fis);
            os.writeObject(object);
            os.close();
            fis.close();
        } catch (IOException ex) {
           // Logger.getLogger(RepositoryImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
