/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.project_se_group12;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author PC MSI
 */
public class StackManage {
    Stack<ComplexNumbers> stack;

    public StackManage() {
        this.stack= new Stack<ComplexNumbers>();
    }

    public StackManage(Stack<ComplexNumbers> stack) {
        this.stack = stack;
    }
 
    public void addIntoStack(String real, String im){
        ComplexNumbers num;
        if (real.isEmpty()){
            real = "0";
            num = new ComplexNumbers(Double.parseDouble(real),Double.parseDouble(im));
        }
        else if (im.isEmpty()){
            num = new ComplexNumbers(Double.parseDouble(real));
            }
        else{
            num = new ComplexNumbers(Double.parseDouble(real),Double.parseDouble(im));
        }

        this.stack.push(num);
    }
    
    public int size(){
        return this.stack.size();
    }
    
    public ComplexNumbers popFromStack(){
        return this.stack.pop();
    }
    
    public void pushtoStack(ComplexNumbers c){
        c.setReal(Math.floor(c.getReal()*Math.pow(10, 8))/Math.pow(10, 8));
        c.setImaginary(Math.floor(c.getImaginary()*Math.pow(10, 8))/Math.pow(10, 8));
        this.stack.push(c);
    }
    
    public void clearStack(){
       this.stack.clear();
    }
    
    public Iterator<ComplexNumbers> iteratorStack(){
       return this.stack.iterator();
    }
}
