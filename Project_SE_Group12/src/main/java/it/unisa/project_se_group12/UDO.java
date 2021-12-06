/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.project_se_group12;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author PC MSI
 */
//NON CAMBIAREEEEE!!!!!!!!

public class UDO {
    
    HashMap<String, String> map;

    public UDO() {
        this.map = new HashMap<>();
    }
    
    public void insertUDO(String name,String operation){
        this.map.put(name, operation);
    }
    
    
    public HashMap<String, String> getMap() {
        return map;
    }

    @Override
    public String toString() {
        String str = "";
        Set<String> set =map.keySet();
        for(String s: set){
            str = str + s + '\n';
        }
        return str;
    }
    
    
    
    


}