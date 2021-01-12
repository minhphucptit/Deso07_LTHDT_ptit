/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nminh.controllers;

/**
 *
 * @author nminh
 */
public interface Repository {
    public Object getData(String name);
    public void saveData(Object object,String name);
}
