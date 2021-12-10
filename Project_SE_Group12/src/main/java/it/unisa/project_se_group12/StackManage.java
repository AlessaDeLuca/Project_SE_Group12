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
/*this stack allows us to manage the stack where the numbers are stored*/
public class StackManage {
    Stack<ComplexNumbers> stack;
/*create empty stack*/
    public StackManage() {
        this.stack= new Stack<ComplexNumbers>();
    }
/*create stack*/
    public StackManage(Stack<ComplexNumbers> stack) {
        this.stack = stack;
    }
    
    /**
     * insert numbers
     * @param real
     * @param im 
     */
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
    /*return stack's size*/
    public int size(){
        return this.stack.size();
    }
    
    public ComplexNumbers peek(){
        return this.stack.peek();
    }
    /*this function allows us to obtain the last element of the stack*/
    public ComplexNumbers popFromStack(){
        return this.stack.pop();
    }
    /*this function allows us to push values into the stack*/
    public void pushtoStack(ComplexNumbers c){
        c.setReal(Math.floor(c.getReal()*Math.pow(10, 8))/Math.pow(10, 8));
        c.setImaginary(Math.floor(c.getImaginary()*Math.pow(10, 8))/Math.pow(10, 8));
        this.stack.push(c);
    }
    /*this function allows us to clear the stack*/
    public void clearStack(){
       this.stack.clear();
    }
    /*this function allows us to iterate the stack*/
    public Iterator<ComplexNumbers> iteratorStack(){
       return this.stack.iterator();
    }
    /*this function allows us to duplicate last element into the stack*/
    public boolean dupLastElement(){
        if(!this.isEmpty()){
            this.stack.push(this.stack.lastElement());
            return true;
        }else
            return false;
    }
    /*this function allows us to swap the last value with the value before*/
    public boolean swap(){
        if(this.check2Numbers()){
            ComplexNumbers num1=this.stack.pop();
            ComplexNumbers num2=this.stack.pop();
            this.stack.push(num1);
            this.stack.push(num2);
            return true;
        }else
            return false;
    }
    /*this function allows us to duplicatethe second-last element into the stack*/
    public boolean over(){
        if(this.check2Numbers()){
            ComplexNumbers num1=this.stack.get(this.stack.size()-2);
            this.stack.push(num1);
            return true;
        }else
            return false;
    }
/*return the stack*/
    public Stack<ComplexNumbers> getStack() {
        return stack;
    }
    
 /*print the stack as a string*/   
    public String printStack(){
        String str="";
        Iterator<ComplexNumbers> iter = stack.iterator();
        
        while(iter.hasNext()){
            str = str + iter.next().toString() ;
        }
        return str;
    }
        
    //this function checks that the stack contains at least 2 elements
    public boolean check2Numbers(){
        if(this.size()<=1){
            return false;
        }else
            return true;
    }
    
    public boolean isEmpty(){
        if(this.size()<=0){
            return true;
        }else
            return false;
    }
    
    public boolean addOperation(){
        ComplexOperations op = new ComplexOperations();
        if(this.check2Numbers()){
            ComplexNumbers num1 = this.popFromStack();
            ComplexNumbers num2 = this.popFromStack();
            ComplexNumbers res = op.add(num1, num2);
            this.pushtoStack(res);
            return true;
        }else
            return false;
    }
    
    public boolean subOperation(){
        ComplexOperations op = new ComplexOperations();
        if(this.check2Numbers()){
            ComplexNumbers num2 = this.popFromStack();
            ComplexNumbers num1 = this.popFromStack();
            ComplexNumbers res = op.subtract(num1, num2);
            this.pushtoStack(res);
            return true;
        }else
            return false;
    }
    
    public boolean multiplyOperation(){
        ComplexOperations op = new ComplexOperations();
        if(this.check2Numbers()){
            ComplexNumbers num2 = this.popFromStack();
            ComplexNumbers num1 = this.popFromStack();
            ComplexNumbers res = op.multiply(num1, num2);
            this.pushtoStack(res);
            return true;
        }else
            return false;
    }
    
    public boolean divisionOperation(){
        ComplexOperations op = new ComplexOperations();
        if(this.check2Numbers()){
            ComplexNumbers num2 = this.popFromStack();
            ComplexNumbers num1 = this.popFromStack();
            if(num1.getReal()==0){
                return false;
            }else{
                ComplexNumbers res = op.divide(num1, num2);
                this.pushtoStack(res);
                return true;
            }
        }else
            return false;
    }
    
    public boolean invertSignOperation(){
       ComplexOperations op = new ComplexOperations();
        if(!this.isEmpty()){
            ComplexNumbers num1 = this.popFromStack();
            ComplexNumbers res = op.invertSign(num1);
            this.pushtoStack(res);
            return true;
        }else
            return false;
    }
    
    public boolean squareRootOperation(){
       ComplexOperations op = new ComplexOperations();
        if(!this.isEmpty()){
            ComplexNumbers num1 = this.popFromStack();
            ComplexNumbers res = op.squareRoot(num1);
            this.pushtoStack(res);
            return true;
        }else
            return false;
    }
}
