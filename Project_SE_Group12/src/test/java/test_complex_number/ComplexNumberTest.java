/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test_complex_number;

import it.unisa.project_se_group12.ComplexNumbers;
import it.unisa.project_se_group12.ComplexOperations;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author leo
 */
public class ComplexNumberTest {
    ComplexNumbers num1;
    ComplexNumbers num2;
    ComplexNumbers result;
    public ComplexNumberTest() {
       
    }

    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test 
    public void addTest1(){
        num1 =new ComplexNumbers(1, 3);
        num2 = new ComplexNumbers(1, 3);
        result = new ComplexNumbers(2,6);
        
        assertEquals(result,new ComplexOperations().add(num1, num2) );
    }
    
    @Test 
    public void addTest2(){
        num1 =new ComplexNumbers(1);
        num2 = new ComplexNumbers(1, 3);
        result = new ComplexNumbers(2,3);
        
        assertEquals(result,new ComplexOperations().add(num1, num2) );
    }
    
    @Test 
    public void addTest3(){
        num1 =new ComplexNumbers(1);
        num2 = new ComplexNumbers(1);
        result = new ComplexNumbers(2);
        
        assertEquals(result,new ComplexOperations().add(num1, num2) );
    }
    
    @Test 
    public void subtractTest1(){
        num1 =new ComplexNumbers(1, 3);
        num2 = new ComplexNumbers(1, 3);
        result = new ComplexNumbers(0,0);
        
        assertEquals(result,new ComplexOperations().subtract(num1, num2) );
    }
    
    @Test 
    public void subtractTest2(){
        num1 =new ComplexNumbers(1);
        num2 = new ComplexNumbers(1, 3);
        result = new ComplexNumbers(0,-3);
        
        assertEquals(result,new ComplexOperations().subtract(num1, num2) );
    }
    @Test 
    public void subtractTest3(){
        num1 =new ComplexNumbers(1);
        num2 = new ComplexNumbers(1);
        result = new ComplexNumbers(0);
        
        assertEquals(result,new ComplexOperations().subtract(num1, num2) );
    }
    
    @Test 
    public void multiplyTest1(){
        num1 =new ComplexNumbers(1, 3);
        num2 = new ComplexNumbers(1, 3);
        result = new ComplexNumbers(-8,6);
        
        assertEquals(result,new ComplexOperations().multiply(num1, num2) );
    }
    
    @Test 
    public void multiplyTest2(){
        num1 =new ComplexNumbers(1);
        num2 = new ComplexNumbers(1, 3);
        result = new ComplexNumbers(1,3);
        
        assertEquals(result,new ComplexOperations().multiply(num1, num2) );
    }
    
    
    @Test 
    public void multiplyTest3(){
        num1 =new ComplexNumbers(1);
        num2 = new ComplexNumbers(1);
        result = new ComplexNumbers(1);
        
        assertEquals(result,new ComplexOperations().multiply(num1, num2) );
    }
    
    @Test 
    public void divideTest1(){
        num1 =new ComplexNumbers(2,4);
        num2 = new ComplexNumbers(2,4);
        result = new ComplexNumbers(1);
        ComplexNumbers res = new ComplexOperations().divide(num1, num2);
        res.setReal(Math.round(res.getReal()));
        res.setImaginary(Math.round(res.getImaginary()));
        assertEquals(result, res);
    }
    
    @Test 
    public void divideTest2(){
        num1 =new ComplexNumbers(1);
        num2 = new ComplexNumbers(2,4);
        result = new ComplexNumbers(0.09,-0.2);
        ComplexNumbers res = new ComplexOperations().divide(num1, num2);
        res.setReal(Math.floor(res.getReal() * 100)/100);
        res.setImaginary(Math.floor(res.getImaginary()*100)/100);
        assertEquals(result, res);
    }
    
    @Test 
    public void divideTest3(){
        num1 =new ComplexNumbers(1);
        num2 = new ComplexNumbers(1);
        result = new ComplexNumbers(1);
        
        assertEquals(result,new ComplexOperations().divide(num1, num2) );
    }
    
    @Test 
    public void squareRootTest1(){
        num1 =new ComplexNumbers(4, 4);
        result = new ComplexNumbers(2.197 , 0.910);
        ComplexNumbers res = new ComplexOperations().squareRoot(num1);
        res.setReal(Math.floor(res.getReal() * 1000)/1000);
        res.setImaginary(Math.floor(res.getImaginary()*1000)/1000);
        assertEquals(result, res);
    }
    
    @Test 
    public void squareRootTest2(){
        num1 =new ComplexNumbers(0);
        result = new ComplexNumbers(0);
        ComplexNumbers res = new ComplexOperations().squareRoot(num1);
    
        assertEquals(result, res);
    }
    
    @Test 
    public void squareRootTest3(){
        num1 =new ComplexNumbers(4);
        result = new ComplexNumbers(2);
        ComplexNumbers res = new ComplexOperations().squareRoot(num1);
    
        assertEquals(result, res);
    }
    
    @Test 
    public void squareRootComplexTest1(){
        num1 =new ComplexNumbers(4, 4);
        result = new ComplexNumbers(2.197 , 0.910);
        ComplexNumbers res = new ComplexOperations().squareRootComplex(num1);
        res.setReal(Math.floor(res.getReal() * 1000)/1000);
        res.setImaginary(Math.floor(res.getImaginary()*1000)/1000);
        assertEquals(result, res);
    }
    
    @Test 
    public void conjugateTest1(){
        num1 =new ComplexNumbers(4 ,4);
        result = new ComplexNumbers(4,-4);
        ComplexNumbers res = new ComplexOperations().conjugate(num1);
    
        assertEquals(result, res);
    }
    
    @Test 
    public void conjugateTest2(){
        num1 =new ComplexNumbers(0);
        result = new ComplexNumbers(0);
        ComplexNumbers res = new ComplexOperations().conjugate(num1);
    
        assertEquals(result, res);
    }
    
    @Test 
    public void invertSignTest1(){
        num1 =new ComplexNumbers(4 ,4);
        result = new ComplexNumbers(-4,-4);
        ComplexNumbers res = new ComplexOperations().invertSign(num1);
    
        assertEquals(result, res);
    }
    
    @Test 
    public void invertSignTest2(){
        num1 =new ComplexNumbers(4);
        result = new ComplexNumbers(-4);
        ComplexNumbers res = new ComplexOperations().invertSign(num1);
    
        assertEquals(result, res);
    }
    
    @Test 
    public void invertSignTest3(){
        num1 =new ComplexNumbers(0);
        result = new ComplexNumbers(0);
        ComplexNumbers res = new ComplexOperations().invertSign(num1);
    
        assertEquals(result, res);
    }
    
    @Test 
    public void modTest1(){
        num1 =new ComplexNumbers(4 ,4);
        double result = 5.656;
        double res = Math.floor(new ComplexOperations().mod(num1) * 1000)/1000;
    
        assertEquals(result, res);
    }
    
    @Test 
    public void modTest2(){
        num1 =new ComplexNumbers(-4 ,-4);
        double result = 5.656;
        double res = Math.floor(new ComplexOperations().mod(num1) * 1000)/1000;
    
        assertEquals(result, res);
    }
    @Test 
    public void modTest3(){
        num1 =new ComplexNumbers(-4 ,4);
        double result = 5.656;
        double res = Math.floor(new ComplexOperations().mod(num1) * 1000)/1000;
    
        assertEquals(result, res);
    }
    
    @Test 
    public void modTest4(){
        num1 =new ComplexNumbers(-4);
        double result = 4;
        double res = Math.floor(new ComplexOperations().mod(num1));
    
        assertEquals(result, res);
    }
    
    @Test 
    public void modTest5(){
        num1 =new ComplexNumbers(0 ,-4);
        double result = 4;
        double res = Math.floor(new ComplexOperations().mod(num1));
    
        assertEquals(result, res);
    }
    
    @Test 
    public void modTest6(){
        num1 =new ComplexNumbers(0);
        double result = 0;
        double res = Math.floor(new ComplexOperations().mod(num1));
    
        assertEquals(result, res);
    }
    
}
