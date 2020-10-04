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
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;

public class TextFileRead {
   private Scanner input ;
    
    
    public void openFile(String FileName){
       try{
       input=new Scanner(new File(FileName));
       }  catch(FileNotFoundException e){
        System.err.print("");
           System.exit(1);
       }
    }
    
    public ArrayList<Drinks> readRecords(){     
      ArrayList<Drinks> D=new ArrayList();
      String type;
      int price,orderNum;
      int quantity;
      try{
      while (input.hasNext()){  
         type=input.nextLine();
         price=input.nextInt();
         orderNum=input.nextInt();
         quantity=input.nextInt();
         
         D.add(new Drinks(type,price,orderNum,quantity));
         System.out.print("Succesfully addd");
          
            }}
     
     catch (NoSuchElementException t){
                 System.err.print("No Such Element Exception ");
           input.close();
           System.exit(1);
         
     }catch (IllegalStateException t){
                 System.err.print("Illegal State Exception ");
           System.exit(1);
     }
        System.out.print(D.size());
        return D; 
     }  
     
    public void closeFile(){
        if (input!=null)
            input.close();
    }
   
      
}

