/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.project_se_group12;

import java.util.Iterator;
import java.util.Stack;

/**
 * This class Stack allows us to manage the stack where the numbers are stored
 * @author PC MSI
 */
public class StackManage {
    Stack<ComplexNumbers> stack;

    /**
     * create empty stack
     */
    public StackManage() {
        this.stack= new Stack<ComplexNumbers>();
    }
    
    /**
     * create stack
     * @param stack
     */
    public StackManage(Stack<ComplexNumbers> stack) {
        this.stack = stack;
    }
    
    /**
     * Pushes an item onto the top of this stack. It check if the real part is empty or not, to distinguish the cases.
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
    
    /**
     * Returns the current capacity of this stack.
     * @return 
     */
    public int size(){
        return this.stack.size();
    }
    
    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     * @return 
     */
    public ComplexNumbers peek(){
        return this.stack.peek();
    }
    
    /**
     * Returns the last element of the stack.
     * @return 
     */
    public ComplexNumbers popFromStack(){
        return this.stack.pop();
    }
    
    /**
     * This function allows us to push a complex number into the stack.
     * @param c : ComplexNumbers
     */
    public void pushtoStack(ComplexNumbers c){
        c.setReal(Math.floor(c.getReal()*Math.pow(10, 8))/Math.pow(10, 8));
        c.setImaginary(Math.floor(c.getImaginary()*Math.pow(10, 8))/Math.pow(10, 8));
        this.stack.push(c);
    }
    
    /**
     * Removes all of the elements from this stack. 
     */
    public void clearStack(){
       this.stack.clear();
    }
    
    /**
     * Returns an iterator over the elements in this list in proper sequence.
     * @return 
     */
    public Iterator<ComplexNumbers> iteratorStack(){
       return this.stack.iterator();
    }
    
    /**
     * This function allows us to duplicate last element into the stack.
     * @return 
     */
    public boolean dupLastElement(){
        if(!this.isEmpty()){
            this.stack.push(this.stack.lastElement());
            return true;
        }else
            return false;
    }
   
    /**
     * This function allows us to swap the last value with the value before.
     * @return 
     */
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
    
    /**
     * This function allows us to duplicatethe second-last element into the stack
     * @return 
     */
    public boolean over(){
        if(this.check2Numbers()){
            ComplexNumbers num1=this.stack.get(this.stack.size()-2);
            this.stack.push(num1);
            return true;
        }else
            return false;
    }

    /**
     * return the stack
     * @return 
     */
    public Stack<ComplexNumbers> getStack() {
        return stack;
    }
     
    /**
     * Print the stack as a string.
     * @return 
     */
    public String printStack(){
        String str="";
        Iterator<ComplexNumbers> iter = stack.iterator();
        
        while(iter.hasNext()){
            str = str + iter.next().toString() ;
        }
        return str;
    }
        
    /**
     * This function checks if the stack contains at least 2 elements.
     * @return 
     */
    public boolean check2Numbers(){
        if(this.size()<=1){
            return false;
        }else
            return true;
    }
    
    /**
     * This function checks if the stack is empty.
     * @return 
     */
    public boolean isEmpty(){
        if(this.size()<=0){
            return true;
        }else
            return false;
    }
    
    /**
     * This function applies the addition between 2 complex numbers.
     * @return 
     */
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
    
    /**
     * This function applies the subtraction between 2 complex numbers.
     * @return 
     */
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
    
    /**
     * This function applies the multiplication between 2 complex numbers.
     * @return 
     */
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
    
    /**
     * This function applies the division between 2 complex numbers.
     * @return 
     */
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
    
    /**
     * This function applies the invert sign of a complex numbers.
     * @return 
     */
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
    
    /**
     * This function applies the square root of a complex numbers.
     * @return 
     */
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
