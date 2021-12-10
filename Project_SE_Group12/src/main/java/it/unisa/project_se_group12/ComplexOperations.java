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
    
    //this function create the instance of the class
    public ComplexOperations() {
    }
    
    //this function checks that the stack contains at least 2 elements
    public boolean check2Numbers(Stack<ComplexNumbers> stack){
        if(stack.size()<=1){
            return false;
        }else
            return true;
    }
    
    //Sum between 2 complex numbers
    public ComplexNumbers add(ComplexNumbers n1, ComplexNumbers n2){
        return new ComplexNumbers(n1.getReal() + n2.getReal(), n1.getImaginary() + n2.getImaginary());
    }
    
    //difference between 2 complex number
    public ComplexNumbers subtract(ComplexNumbers n1, ComplexNumbers n2){
        return new ComplexNumbers(n1.getReal() - n2.getReal(), n1.getImaginary() - n2.getImaginary());
    }
    
    //product between 2 complex numbers
    public ComplexNumbers multiply(ComplexNumbers n1, ComplexNumbers n2){
        double _real = n1.getReal() * n2.getReal() - n1.getImaginary() *n2.getImaginary();
        double _imaginary = n1.getReal() * n2.getImaginary() + n1.getImaginary() * n2.getReal();
	return new ComplexNumbers(_real,_imaginary);
    }
    
    //division between 2 complex numbers
    public ComplexNumbers divide(ComplexNumbers n1, ComplexNumbers n2){
        ComplexNumbers output = multiply(n1, conjugate(n2));
	double div = Math.pow(mod(n2),2);
	return new ComplexNumbers(output.getReal()/div,output.getImaginary()/div);
    }
    /*square root of a number. If the number is a real negative number, the function
    return a complex number with imaginary part equals to the square root of the module
    of the real part of the starting number. Instead if the number is a complex number
    the function return a complex number that have a real part equals to r*cos(theta)
    and imaginary part equals to r*sin(theta) where r is equals to the square root of
    the module of the real part of the starting number and theta is equals to arctangent
    of the imaginary part of the starting number over the real part of the starting number*/
   public ComplexNumbers squareRootComplex(ComplexNumbers n1){
       double r=Math.sqrt(mod(n1));
        if(n1.getReal()<0 && n1.getImaginary()==0){
            return new ComplexNumbers(0,r);
        }else{
            double theta=Math.atan2(n1.getImaginary(),n1.getReal())/2;
            return new ComplexNumbers(r*Math.cos(theta),r*Math.sin(theta));
        }       
    }
    //conjugate of a complex number
    public ComplexNumbers conjugate(ComplexNumbers n1){
        return new ComplexNumbers(n1.getReal(),-n1.getImaginary());
    }
    //this function allows us to invert sign of a complex number
    public ComplexNumbers invertSign(ComplexNumbers n1){
        if(n1.getImaginary()==0 && n1.getReal()!=0){
            return new ComplexNumbers(-n1.getReal());
        }else{            
            return new ComplexNumbers(-n1.getReal(),-n1.getImaginary());
        }
    }
    /*this function check if the number is real. If is a negative real number or a 
    complex numberthen invoke the function squareRootComplex instead if is a positive
    real number returns sqrt(real number).*/
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
    //Module of a complex number
    public double mod(ComplexNumbers n1){
        return Math.sqrt(Math.pow(n1.getReal(),2) + Math.pow(n1.getImaginary(),2));
    }
       
}
