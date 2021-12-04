/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test_complex_number;


import it.unisa.project_se_group12.ComplexNumbers;
import it.unisa.project_se_group12.StackManage;
import it.unisa.project_se_group12.Variables;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author leo
 */
public class VariablesTest {
    StackManage stack = new StackManage();
    Variables variables = new Variables();
    
    public VariablesTest() {
    }
    
    @Test
    public void pushIntoVariableTest() {
        stack.addIntoStack("2", "1");
        variables.pushIntoVariable("a", stack);
        assertEquals(new ComplexNumbers(2,1), variables.getMap().get("a"));
    }
    
    @Test
    public void pushIntoStackTest() {
        stack.addIntoStack("2", "1");
        variables.pushIntoVariable("a", stack);
        variables.pushIntoStack("a", stack);
        assertEquals(new ComplexNumbers(2,1), variables.getMap().get("a"));
    }
    
    @Test
    public void addWithStackTest() {
        stack.addIntoStack("2", "1");
        variables.pushIntoVariable("a", stack);
        variables.addWithStack("a", stack);
        assertEquals(new ComplexNumbers(4,2), variables.getMap().get("a"));
    }
    
    @Test
    public void subWithStackTest() {
        stack.addIntoStack("2", "1");
        variables.pushIntoVariable("a", stack);
        variables.subWithStack("a", stack);
        assertEquals(new ComplexNumbers(0,0), variables.getMap().get("a"));
    }
    
}
