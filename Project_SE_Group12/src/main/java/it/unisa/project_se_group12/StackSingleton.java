/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.project_se_group12;

/**
 * The implementation of the sigleton pattern for the StackManage class
 * 
 */
public class StackSingleton {
    static private StackManage instance=null;
    
    public static StackManage getStack() {
        if (instance == null)
            instance = new StackManage();
        
            return instance;
    }
}
