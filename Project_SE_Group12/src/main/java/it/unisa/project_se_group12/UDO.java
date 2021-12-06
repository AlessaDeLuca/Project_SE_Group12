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

public class UDO {
    
    HashMap<String, String> map;

    public UDO() {
        this.map = new HashMap<>();
    }
    
    public void insertUDO(String name,String operation){
        this.map.put(name, operation);
    }
    
    public void deleteUDO(String name){
        this.map.remove(name);
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
    
    public void executeOperation(String key, StackManage stack, javax.swing.JTextArea StackArea ){
        String operation = map.get(key);
        String[] step = operation.split(" ");
        
        for(int i=0;i<step.length;i++){
            if(step[i].equals("+")){
                ComplexNumbers num1 = stack.popFromStack();
                ComplexNumbers num2 = stack.popFromStack();
                ComplexNumbers res = new ComplexOperations().add(num1, num2);
                stack.pushtoStack(res);
                StackArea.setText(stack.pntStack());
            }if(step[i].equals("-")){
                ComplexNumbers num1 = stack.popFromStack();
                ComplexNumbers num2 = stack.popFromStack();
                ComplexNumbers res = new ComplexOperations().subtract(num1, num2);
                stack.pushtoStack(res);
                StackArea.setText(stack.pntStack());
            }
             if(step[i].equals("*")){
                ComplexNumbers num1 = stack.popFromStack();
                ComplexNumbers num2 = stack.popFromStack();
                ComplexNumbers res = new ComplexOperations().multiply(num1, num2);
                stack.pushtoStack(res);
                StackArea.setText(stack.pntStack());
            }
             if(step[i].equals("÷")){
                ComplexNumbers num1 = stack.popFromStack();
                ComplexNumbers num2 = stack.popFromStack();
                ComplexNumbers res = new ComplexOperations().divide(num1, num2);
                stack.pushtoStack(res);
                StackArea.setText(stack.pntStack());
            } 
             if(step[i].equals("√")){
                ComplexNumbers num1 = stack.popFromStack();
                ComplexNumbers res = new ComplexOperations().squareRoot(num1);
                stack.pushtoStack(res);
                StackArea.setText(stack.pntStack());
            }
             if(step[i].equals("+-")){
                ComplexNumbers num1 = stack.popFromStack();
                ComplexNumbers res = new ComplexOperations().invertSign(num1);
                stack.pushtoStack(res);
                StackArea.setText(stack.pntStack());
            }
             if(step[i].equals("Clear")){
                stack.clearStack();
                StackArea.setText("");
            }
             if(step[i].equals("Drop")){
                stack.popFromStack();
                //StackArea.setText(stack.pntStack());
            }if(step[i].equals("Dup")){
                stack.dupLastElement();
                //StackArea.setText(stack.pntStack());
            }if(step[i].equals("Swap")){
                stack.swap();
            }if(step[i].equals("Over")){
                stack.over();
                //StackArea.setText("");
            }if(map.containsKey(step[i])){
                this.executeOperation(step[i], stack, StackArea);
            }
             
                
        }
            
        
    }
    
}