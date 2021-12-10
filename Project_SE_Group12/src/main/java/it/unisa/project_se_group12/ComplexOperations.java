/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.project_se_group12;

import static java.lang.Math.sqrt;
import java.util.Stack;

/**
 * The class ComplexOperation allows us to manage all the operations with complex number.
 * e.g. addiction, difference, product, division etc...
 * (Function are studied to perform with complex number and also with real number)
 * @author PC MSI
 */
public class ComplexOperations {
    
    /**
     * This function create the instance of the class.
     */
    public ComplexOperations() {
    }
    
    /**
     * This function checks if the stack contains at least 2 elements
     * @param stack
     * @return true if the check was succesfull, false otherwise.
     */
    public boolean check2Numbers(Stack<ComplexNumbers> stack){
        if(stack.size()<=1){
            return false;
        }else
            return true;
    }
    
    /**
     * Addition between 2 complex numbers.
     * @param n1 the first complex number
     * @param n2 the second complex number
     * @return a ComplexNumbers that represents the result of the addition
     */
    public ComplexNumbers add(ComplexNumbers n1, ComplexNumbers n2){
        return new ComplexNumbers(n1.getReal() + n2.getReal(), n1.getImaginary() + n2.getImaginary());
    }
    
    /**
     * Difference between 2 complex numbers.
     * @param n1 the first complex number
     * @param n2 the second complex number
     * @return 
     */
    public ComplexNumbers subtract(ComplexNumbers n1, ComplexNumbers n2){
        return new ComplexNumbers(n1.getReal() - n2.getReal(), n1.getImaginary() - n2.getImaginary());
    }
    
    /**
     * Product between 2 complex numbers.
     * @param n1
     * @param n2
     * @return 
     */
    public ComplexNumbers multiply(ComplexNumbers n1, ComplexNumbers n2){
        double _real = n1.getReal() * n2.getReal() - n1.getImaginary() *n2.getImaginary();
        double _imaginary = n1.getReal() * n2.getImaginary() + n1.getImaginary() * n2.getReal();
	return new ComplexNumbers(_real,_imaginary);
    }
    
    /**
     * Division between 2 complex numbers.
     * @param n1
     * @param n2
     * @return 
     */
    public ComplexNumbers divide(ComplexNumbers n1, ComplexNumbers n2){
        ComplexNumbers output = multiply(n1, conjugate(n2));
	double div = Math.pow(mod(n2),2);
	return new ComplexNumbers(output.getReal()/div,output.getImaginary()/div);
    }
   
    /**
     * Square root of a number. If the number is a real negative number, the function returns a complex number with imaginary part equals to the square root of the module
     * of the real part of the starting number. Instead if the number is a complex number the function return a complex number that have a real part equals to r*cos(theta)
     * the module of the real part of the starting number and theta is equals to arctangent of the imaginary part of the starting number over the real part of the starting 
     * number.
     * @param n1
     * @return 
     */
   public ComplexNumbers squareRootComplex(ComplexNumbers n1){
       double r=Math.sqrt(mod(n1));
        if(n1.getReal()<0 && n1.getImaginary()==0){
            return new ComplexNumbers(0,r);
        }else{
            double theta=Math.atan2(n1.getImaginary(),n1.getReal())/2;
            return new ComplexNumbers(r*Math.cos(theta),r*Math.sin(theta));
        }       
    }

   /**
    * This function allows to conjugate of a complex number.
    * @param n1
    * @return 
    */
    public ComplexNumbers conjugate(ComplexNumbers n1){
        return new ComplexNumbers(n1.getReal(),-n1.getImaginary());
    }
   
    /**
     * This function allows to invert sign of a complex number.
     * @param n1
     * @return 
     */
    public ComplexNumbers invertSign(ComplexNumbers n1){
        if(n1.getImaginary()==0 && n1.getReal()!=0){
            return new ComplexNumbers(-n1.getReal());
        }else{            
            return new ComplexNumbers(-n1.getReal(),-n1.getImaginary());
        }
    }
    
    /**
     * This function check if the number is real. If is a negative real number or a complex numberthen invoke the function squareRootComplex instead if is a positive
     * real number returns sqrt(real number).
     * @param n1
     * @return 
     */
    public ComplexNumbers squareRoot(ComplexNumbers n1){
        ComplexNumbers n;
       if(n1.getReal()<0){
           n = squareRootComplex(n1);
       }else if(n1.getReal()>=0 && n1.getImaginary()!=0){
           n = squareRootComplex(n1);
       } 
       else {
          n = new ComplexNumbers(sqrt(n1.getReal()));
       }
       return n;
    }
    
    /**
     * This function allows to obtain a module of a complex number.
     * @param n1
     * @return 
     */
    public double mod(ComplexNumbers n1){
        return Math.sqrt(Math.pow(n1.getReal(),2) + Math.pow(n1.getImaginary(),2));
    }
       
}
