/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.project_se_group12;

import java.util.HashMap;

/**
 *
 * @author PC MSI
 */
public class Variables {
    HashMap<String, ComplexNumbers> map = new HashMap<>();
    String [] key = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    public Variables() {
        for (int i=0; i<key.length-1; i++){
            this.map.put(this.key[i], null);
        } 
    }
    
    public HashMap<String, ComplexNumbers> getMap() {
        return map;
    }
    
    public void pushIntoVariable(String varKey, StackManage stack){
        this.map.replace(varKey, stack.popFromStack());
    }

    public void pushIntoStack(String varKey, StackManage stack){
        stack.getStack().push(this.map.get(varKey));
        this.map.put(varKey, null);
    }
    
    public void addWithStack(String varKey, StackManage stack){
        ComplexNumbers stackNum = stack.getStack().lastElement();
        ComplexNumbers mapNum = this.map.get(varKey);
        this.map.replace(varKey, new ComplexOperations().add(stackNum, mapNum));
    }
    
    public void subWithStack(String varKey, StackManage stack){
        ComplexNumbers stackNum = stack.getStack().lastElement();
        ComplexNumbers mapNum = this.map.get(varKey);
        this.map.replace(varKey, new ComplexOperations().subtract(mapNum, stackNum));
    }
}
