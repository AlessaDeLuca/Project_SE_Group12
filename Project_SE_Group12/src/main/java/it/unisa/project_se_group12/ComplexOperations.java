/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.project_se_group12;

import static java.lang.Math.sqrt;

/**
 *
 * @author PC MSI
 */
public class ComplexOperations {

    public ComplexOperations() {
    }

    public ComplexNumbers add(ComplexNumbers n1, ComplexNumbers n2){
        return new ComplexNumbers(n1.getReal() + n2.getReal(), n1.getImaginary() + n2.getImaginary());
    }
    
    public ComplexNumbers subtract(ComplexNumbers n1, ComplexNumbers n2){
        return new ComplexNumbers(n1.getReal() - n2.getReal(), n1.getImaginary() - n2.getImaginary());
    }
    
    public ComplexNumbers multiply(ComplexNumbers n1, ComplexNumbers n2){
        double _real = n1.getReal() * n2.getReal() - n1.getImaginary() *n2.getImaginary();
        double _imaginary = n1.getReal() * n2.getImaginary() + n1.getImaginary() * n2.getReal();
	return new ComplexNumbers(_real,_imaginary);
    }
    
    public ComplexNumbers divide(ComplexNumbers n1, ComplexNumbers n2){
        ComplexNumbers output = multiply(n1, conjugate(n2));
	double div = Math.pow(mod(n2),2);
	return new ComplexNumbers(output.getReal()/div,output.getImaginary()/div);
    }
    
   public ComplexNumbers squareRootComplex(ComplexNumbers n1){
       double r=Math.sqrt(mod(n1));
        if(n1.getReal()<0 && n1.getImaginary()==0){
            return new ComplexNumbers(0,r);
        }else{
            double theta=Math.atan2(n1.getImaginary(),n1.getReal())/2;
            return new ComplexNumbers(r*Math.cos(theta),r*Math.sin(theta));
        }       
    }
    
    public ComplexNumbers conjugate(ComplexNumbers n1){
        return new ComplexNumbers(n1.getReal(),-n1.getImaginary());
    }
    
    public ComplexNumbers invertSign(ComplexNumbers n1){
        if(n1.getImaginary()==0 && n1.getReal()!=0){
            return new ComplexNumbers(-n1.getReal());
        }else{            
            return new ComplexNumbers(-n1.getReal(),-n1.getImaginary());
        }
    }
    
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
    
    public double mod(ComplexNumbers n1){
        return Math.sqrt(Math.pow(n1.getReal(),2) + Math.pow(n1.getImaginary(),2));
    }
       
}
