/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test_code;

import it.unisa.project_se_group12.ComplexNumbers;
import it.unisa.project_se_group12.StackManage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author leo
 */
public class StackManageTest {
    StackManage stack = new StackManage();;
    
    public StackManageTest() {
    }
    
    @Test
    public void addIntoStackTest1() {
       String real = "2";
       String im = "1";
       stack.addIntoStack(real, im);
       assertEquals(new ComplexNumbers(2,1), stack.getStack().lastElement());
    }
    
    @Test
    public void addIntoStackTest2() {
       String real = "";
       String im = "1";
       stack.addIntoStack(real, im);
       assertEquals(new ComplexNumbers(0,1), stack.getStack().lastElement());
    }
    
    @Test
    public void addIntoStackTest3() {
       String real = "2";
       String im = "";
       stack.addIntoStack(real, im);
       assertEquals(new ComplexNumbers(2,0), stack.getStack().lastElement());
    }
    
    @Test
    public void sizeTest1() {
       String real = "2";
       String im = "1";
       stack.addIntoStack(real, im);
       assertEquals(1, stack.size());
    }
    
    @Test
    public void peekTest1(){
       String real = "2";
       String im = "1";
       stack.addIntoStack(real, im);
        assertEquals(new ComplexNumbers(2,1),stack.peek());
    }
    
    @Test
    public void popIntoStackTest1() {
       String real = "";
       String im = "1";
       stack.addIntoStack(real, im);
       stack.popFromStack();
       assertEquals(0, stack.size());
    }
    
    @Test
    public void popIntoStackTest2() {
       String real = "";
       String im = "1";
       stack.addIntoStack(real, im);
       ComplexNumbers num = stack.popFromStack();
       assertEquals(new ComplexNumbers(0,1), num);
    }
    
    @Test
    public void pushToStackTest1() {
       ComplexNumbers num = new ComplexNumbers(0,1);
       stack.pushtoStack(num);
       assertEquals(new ComplexNumbers(0,1),stack.getStack().lastElement());
    }
    
    @Test
    public void clearStackTest1() {
       ComplexNumbers num = new ComplexNumbers(0,1);
       stack.pushtoStack(num);
       stack.clearStack();
       assertEquals(0,stack.size());
    }
    
    
    @Test
    public void dupLastElementTest1() {
       ComplexNumbers num = new ComplexNumbers(0,1);
       stack.pushtoStack(num);
       stack.dupLastElement();
       ComplexNumbers res = stack.popFromStack();
       assertEquals(res,stack.getStack().lastElement());
    }
    
    @Test
    public void overTest1() {
       ComplexNumbers num1 = new ComplexNumbers(0,1);
       stack.pushtoStack(num1);
       ComplexNumbers num2 = new ComplexNumbers(1,0);
       stack.pushtoStack(num2);
       stack.over();
       assertEquals(num1,stack.getStack().lastElement());
    }
    
    @Test
    public void swapTest1(){
       ComplexNumbers num1 = new ComplexNumbers(0,1);
       stack.pushtoStack(num1);
       ComplexNumbers num2 = new ComplexNumbers(1,0);
       stack.pushtoStack(num2);
       stack.swap();
       assertEquals(num1,stack.getStack().lastElement());
    }
    
    @Test
    public void printStackTest(){
       ComplexNumbers num1 = new ComplexNumbers(1,1);
       stack.pushtoStack(num1);
       assertEquals("1.0+1.0i\n",stack.printStack());
    }
    
    @Test
    public void check2NumbersTest1(){
       ComplexNumbers num1 = new ComplexNumbers(1,1);
       stack.pushtoStack(num1);
        assertEquals(false, stack.check2Numbers());
    }
    
    @Test
    public void check2NumbersTest2(){
       ComplexNumbers num1 = new ComplexNumbers(1,1);
       stack.pushtoStack(num1);
       ComplexNumbers num2 = new ComplexNumbers(1,1);
       stack.pushtoStack(num2);
       assertEquals(true, stack.check2Numbers());
    }
    
    @Test
    public void isEmptyTest(){
        assertEquals(true, stack.isEmpty());
    }
    
    @Test
    public void addOperationTest(){
       ComplexNumbers num1 = new ComplexNumbers(1,1);
       stack.pushtoStack(num1);
       ComplexNumbers num2 = new ComplexNumbers(1,1);
       stack.pushtoStack(num2);
       stack.addOperation();
        assertEquals(new ComplexNumbers(2,2), stack.getStack().lastElement());
    }
    
    @Test
    public void subOperationTest(){
       ComplexNumbers num1 = new ComplexNumbers(1,1);
       stack.pushtoStack(num1);
       ComplexNumbers num2 = new ComplexNumbers(1,1);
       stack.pushtoStack(num2);
       stack.subOperation();
        assertEquals(new ComplexNumbers(0,0), stack.getStack().lastElement());
    }
    
    @Test
    public void multiplyOperationTest(){
       ComplexNumbers num1 = new ComplexNumbers(1,1);
       stack.pushtoStack(num1);
       ComplexNumbers num2 = new ComplexNumbers(1,1);
       stack.pushtoStack(num2);
       stack.multiplyOperation();
        assertEquals(new ComplexNumbers(0,2), stack.getStack().lastElement());
    }
    
    @Test
    public void divisionOperationTest(){
       ComplexNumbers num1 = new ComplexNumbers(1,1);
       stack.pushtoStack(num1);
       ComplexNumbers num2 = new ComplexNumbers(1,1);
       stack.pushtoStack(num2);
       stack.divisionOperation();
       assertEquals(new ComplexNumbers(0.99999999,0), stack.getStack().lastElement());
    }
    
    @Test
    public void invertSignOperationTest(){
       ComplexNumbers num1 = new ComplexNumbers(1,1);
       stack.pushtoStack(num1);
       stack.invertSignOperation();
       assertEquals(new ComplexNumbers(-1,-1), stack.getStack().lastElement());
    }
    
    @Test
    public void squareRootOperationTest1(){
       ComplexNumbers num1 = new ComplexNumbers(1,1);
       stack.pushtoStack(num1);
       stack.squareRootOperation();
       assertEquals(new ComplexNumbers(1.09868411,0.45508986), stack.getStack().lastElement());
    }
    
    @Test
    public void squareRootOperationTest2(){
       ComplexNumbers num1 = new ComplexNumbers(-4);
       stack.pushtoStack(num1);
       stack.squareRootOperation();
       assertEquals(new ComplexNumbers(0,2), stack.getStack().lastElement());
    }
    
    @Test
    public void squareRootOperationTest3(){
       ComplexNumbers num1 = new ComplexNumbers(4);
       stack.pushtoStack(num1);
       stack.squareRootOperation();
       assertEquals(new ComplexNumbers(2,0), stack.getStack().lastElement());
    }
}
