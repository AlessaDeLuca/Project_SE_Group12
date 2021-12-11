/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test_code;

import it.unisa.project_se_group12.ComplexNumbers;
import it.unisa.project_se_group12.StackManage;
import it.unisa.project_se_group12.UDO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author leo
 */
public class UDOTest {
    UDO map = new UDO();
    String name;
    String operation;
    StackManage stack = new StackManage();
    String filePath = new File("udo.txt").getAbsolutePath();
    String line;
    
    public UDOTest() {
    }
    
    @Test
    public void insertUDOTest() {
       name = "pitagora";
       operation = "Dup * Swap Dup * + √ ";
       map.insertUDO(name, operation);
       assertEquals("Dup * Swap Dup * + √ ", map.getMap().get("pitagora"));
        
    }
    
    @Test
    public void deleteUDOTest(){
       name = "pitagora";
       operation = "Dup * Swap Dup * + √ ";
       map.insertUDO(name, operation);
       map.deleteUDO(name);
       assertEquals(0, map.getMap().keySet().size());
    }
    
    @Test
    public void toStringTest(){
       name = "pitagora";
       operation = "Dup * Swap Dup * + √ ";
       map.insertUDO(name, operation);
       assertEquals("pitagora\n", map.toString());
    }
    
    @Test
    public void executeOperationTest(){
       name = "pitagora";
       operation = "Dup * Swap Dup * + √ ";
       map.insertUDO(name, operation);
       stack.addIntoStack("5", "0");
       stack.addIntoStack("4", "0");
       map.executeOperation(name, stack);
       
       assertEquals(new ComplexNumbers(6.40312423,0), stack.getStack().lastElement());
    }
    
    @Test
    public void saveToFileTest(){
       name = "pitagora";
       operation = "Dup * Swap Dup * + √ ";
       map.insertUDO(name, operation);
       
       map.saveToFile();
       
       BufferedReader br = null;
        try {
            File file = new File(filePath);
            br = new BufferedReader(new FileReader(file));
            
            while ((line=br.readLine()) != null) {
               assertEquals("pitagora:Dup * Swap Dup * + √ ", line);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (br != null) {
                try {
                    br.close();
                }
                catch (Exception e) {
                    
                }
            }
        }
        
    }
    
    @Test
    public void loadFromFileTest(){
       name = "pitagora";
       operation = "Dup * Swap Dup * + √ ";
       map.insertUDO(name, operation);
       
       map.saveToFile();
       map.deleteUDO("pitagora");
       map.loadFromFile();
       
        assertEquals("Dup * Swap Dup * + √", map.getMap().get("pitagora"));
    }
}
