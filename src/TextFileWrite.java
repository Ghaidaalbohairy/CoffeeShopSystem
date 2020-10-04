/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeshop;
/**
 *
 * @author Apple
 */
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;

public class TextFileWrite {
    private Formatter output;
    
    public void openFile(String FileName){
       try{
       output=new Formatter(FileName);
      
       }catch(SecurityException e){
           System.err.print("");
           System.exit(1);
       
       }
       catch(FileNotFoundException e){
        System.err.print("");
           System.exit(1);
       }}
    
    public void addRecords(Drinks Record){
     try{
     output.format("%s : %d  %d  %d",Record.gettype(),Record.getPrice(),Record.getOrderNum(),Record.getquantity());
     }
     catch (FormatterClosedException f){
            System.err.print("Error Writing to the file ");
            return;
     }}
        
     
    public void closeFile(){
        if (output!=null)
            output.close();
    }}
    
    
    




