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
/*this class allows us to manage custom operation that user can create and
the structure where they are stored. The attribute of the class is the structure
that we have described before that is an hash map*/
public class UDO {
    
    HashMap<String, String> map;
/*create an empty hash map*/
    public UDO() {
        this.map = new HashMap<>();
    }
 /*insert into a map a name that we use like a key of the map and a custom operation
    that is associated to that name*/   
    public void insertUDO(String name,String operation){
        this.map.put(name, operation);
    }
    /*remove an element by key*/
    public void deleteUDO(String name){
        this.map.remove(name);
    }
    /*return map*/
    public HashMap<String, String> getMap() {
        return map;
    }
/*print the hash map as a string*/
    @Override
    public String toString() {
        String str = "";
        Set<String> set =map.keySet();
        for(String s: set){
            str = str + s + '\n';
        }
        return str;
    }
    
    // True = operation completed
    // False = operation failed
    public boolean executeOperation(String key, StackManage stack){
        String operation = map.get(key);
        String[] step = operation.split(" ");
        
        ComplexOperations op = new ComplexOperations();
        
        for(int i=0;i<step.length;i++){
            if(step[i].equals("+")){
                stack.addOperation();
            }else if(step[i].equals("-")){
                stack.divisionOperation();
            }else if(step[i].equals("*")){
                stack.multiplyOperation();
            }else if(step[i].equals("÷")){
                stack.divisionOperation();
            }else if(step[i].equals("√")){
                stack.squareRootOperation();
            }else if(step[i].equals("+-")){
                stack.invertSignOperation();
            }else if(step[i].equals("Clear")){
                stack.clearStack();
            }else if(step[i].equals("Drop")){
                 if(!stack.isEmpty()){
                    stack.popFromStack();
                 }else{
                     return false;
                 }
            }else if(step[i].equals("Dup")){
               stack.dupLastElement();
            }else if(step[i].equals("Swap")){
               stack.swap();
            }else if(step[i].equals("Over")){
                stack.over();
            }else if(map.containsKey(step[i])){
                this.executeOperation(step[i], stack);
            }else
                return false;
        }
        return true;
    }  
}