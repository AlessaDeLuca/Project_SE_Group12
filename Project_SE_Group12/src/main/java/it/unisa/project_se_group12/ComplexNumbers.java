/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.project_se_group12;
/**
 *
 * @author leo
 */
/*the class ComplexNumbers allows us to create an object ComplexNumber with 2 attributes:
-double real (that represent the real part of the complex number);
-double immaginary (that represent the immaginary part of the complex number).
In this class there are also methods to compare, print and obtain class attributes.*/
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
