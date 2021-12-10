/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.project_se_group12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * this class allows us to manage custom operation that user can create and the structure where they are stored. The attribute of the class is the structure
 * that we have described before that is an hash map
 * @author PC MSI
 */
public class UDO {
    //C:\\Users\\PC MSI\\Documents\\NetBeansProject\\Project_SE\\Project_SE_Group12_\\Project_SE_Group12\\src\\main\\java\\it\\unisa\\project_se_group12
    HashMap<String, String> map;
    
    final static String filePath = new File("udo.txt").getAbsolutePath();

    /**
     * create an empty hash map
     */
    public UDO() {
        this.map = new HashMap<>();
    }
 
    /**
     * insert into a map a name that we use like a key of the map and a custom operation that is associated to that name
     * @param name
     * @param operation 
     */
    public void insertUDO(String name,String operation){
        this.map.put(name, operation);
    }
  
    /**
     * remove an element by key
     * @param name 
     */
    public void deleteUDO(String name){
        this.map.remove(name);
    }
   
    /**
     * return map
     * @return 
     */
    public HashMap<String, String> getMap() {
        return map;
    }

    /**
     * print the hash map as a string
     * @return 
     */
    @Override
    public String toString() {
        String str = "";
        Set<String> set =map.keySet();
        for(String s: set){
            str = str + s + '\n';
        }
        return str;
    }
    
    /**
     * True = operation completed
     * False = operation failed
     * @param key
     * @param stack
     * @return 
     */
    public boolean executeOperation(String key, StackManage stack){
        String operation = map.get(key);
        String[] step = operation.split(" ");
        
        ComplexOperations op = new ComplexOperations();
        
        for(int i=0;i<step.length;i++){
            if(step[i].equals("+")){
                stack.addOperation();
            }else if(step[i].equals("-")){
                stack.divisionOperation();
            }else if(step[i].equals("*")){
                stack.multiplyOperation();
            }else if(step[i].equals("÷")){
                stack.divisionOperation();
            }else if(step[i].equals("√")){
                stack.squareRootOperation();
            }else if(step[i].equals("+-")){
                stack.invertSignOperation();
            }else if(step[i].equals("Clear")){
                stack.clearStack();
            }else if(step[i].equals("Drop")){
                 if(!stack.isEmpty()){
                    stack.popFromStack();
                 }else{
                     return false;
                 }
            }else if(step[i].equals("Dup")){
               stack.dupLastElement();
            }else if(step[i].equals("Swap")){
               stack.swap();
            }else if(step[i].equals("Over")){
                stack.over();
            }else if(map.containsKey(step[i])){
                this.executeOperation(step[i], stack);
            }else
                return false;
        }
        return true;
    }  
    
    public boolean saveToFile(){
        File file = new File(filePath);
        BufferedWriter bf = null;
  
        try {
  
            // create new BufferedWriter for the output file
            bf = new BufferedWriter(new FileWriter(file));
  
            // iterate map entries
            for (Map.Entry<String, String> entry :
                 map.entrySet()) {
  
                // put key and value separated by a colon
                bf.write(entry.getKey() + ":"
                         + entry.getValue());
  
                // new line
                bf.newLine();
            }
  
            bf.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        finally {
  
            try {
  
                // always close the writer
                bf.close();
            }
            catch (Exception e) {
                return false;
            }
        }
        return true;
    }
    
    public boolean loadFromFile(){
        BufferedReader br = null;
  
        try {
  
            // create file object
            File file = new File(filePath);
  
            // create BufferedReader object from the File
            br = new BufferedReader(new FileReader(file));
  
            String line = null;
  
            // read file line by line
            while ((line = br.readLine()) != null) {
  
                // split the line by :
                String[] parts = line.split(":");
  
                // first part is nameOperation, second is udoOperation
                String nameOperadion = parts[0].trim();
                String udoOperation = parts[1].trim();
  
                // put name, udo in HashMap if they are
                // not empty
                if (!nameOperadion.equals("") && !udoOperation.equals(""))
                    map.put(nameOperadion, udoOperation);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        finally {
  
            // Always close the BufferedReader
            if (br != null) {
                try {
                    br.close();
                }
                catch (Exception e) {
                    return false;
                }
            }
        }
        return true;
    }
    
    
}