/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.project_se_group12;

import java.util.HashMap;

/**
 * this class allows us to manage variables and the structure where they are stored. The attributes of this class are the structure 
 * (another hash map) and a string that contains all possible alphabetic variable
 */
public class Variables {
    HashMap<String, ComplexNumbers> map = new HashMap<>();
    String [] key = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    /**
     * create a structure in wich variables are used as keys
     */
    public Variables() {
        for (int i=0; i<key.length-1; i++){
            this.map.put(this.key[i], null);
        } 
    }
 
    /**
     * return map
     * @return HashMap
     */
    public HashMap<String, ComplexNumbers> getMap() {
        return map;
    }
 
    /**
     * push value from stack into a variable
     * @param varKey the key of the Variables
     * @param stack stack into push
     */
    public void pushIntoVariable(String varKey, StackManage stack){
        this.map.replace(varKey, stack.popFromStack());
    }

    /**
     * push variable from variable into stack
     * @param varKey the key of the Variables
     * @param stack stack into push
     */
    public void pushIntoStack(String varKey, StackManage stack){
        stack.getStack().push(this.map.get(varKey));
        this.map.put(varKey, null);
    }
 
    /**
     * add the value into the variable with the last value of the stack
     * @param varKey the key of the Variables
     * @param stack stack into push
     */
    public void addWithStack(String varKey, StackManage stack){
        ComplexNumbers stackNum = stack.getStack().lastElement();
        ComplexNumbers mapNum = this.map.get(varKey);
        this.map.replace(varKey, new ComplexOperations().add(stackNum, mapNum));
    }
 
    /**
     * subtract the value of a variable at the last value of the stack
     * @param varKey the key of the Variables
     * @param stack stack into push
     */
    public void subWithStack(String varKey, StackManage stack){
        ComplexNumbers stackNum = stack.getStack().lastElement();
        ComplexNumbers mapNum = this.map.get(varKey);
        this.map.replace(varKey, new ComplexOperations().subtract(mapNum, stackNum));
    }
}
