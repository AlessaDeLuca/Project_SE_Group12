/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.project_se_group12;

import static java.lang.Math.*;
/**
 *
 * @author leo
 */
public class ComplexNumbers {
    private double real;
    private double imaginary;
    
    public ComplexNumbers(){
        
    }
    
    public ComplexNumbers(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public ComplexNumbers(double real) {
        this.real = real;
        this.imaginary = 0;
    }
    
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
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
        double theta=Math.atan2(n1.getImaginary(),n1.getReal())/2;
        return new ComplexNumbers(r*Math.cos(theta),r*Math.sin(theta));
    }
    
    public ComplexNumbers conjugate(ComplexNumbers n1){
        return new ComplexNumbers(n1.getReal(),-n1.getImaginary());
    }
    
    public ComplexNumbers invertSign(ComplexNumbers n1){
        if(n1.imaginary==0 && n1.real!=0){
            return new ComplexNumbers(-n1.getReal());
        }else{            
            return new ComplexNumbers(-n1.getReal(),-n1.getImaginary());
        }
    }
    
    public ComplexNumbers squareRoot(ComplexNumbers n1){
        ComplexNumbers n;
       if(n1.real<0){
           n = squareRootComplex(n1);
       }else if(n1.real>0 && n1.imaginary!=0){
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
    
    
    @Override
    public String toString() {
        String re = this.real+"";
        String im = "";
        if(this.imaginary < 0)
                im = this.imaginary+"i\n";
        else if (this.imaginary >0)
                im = "+"+this.imaginary+"i\n";
        else
            im ="\n";
        
        return re+im;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ComplexNumbers))
            return false;
        ComplexNumbers a = (ComplexNumbers) obj;
        return (real == a.real) && (imaginary == a.imaginary);
    }
    
    

}
