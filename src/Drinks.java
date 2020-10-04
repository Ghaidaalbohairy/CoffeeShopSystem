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
public class Drinks extends items {

   public Drinks() { 
    }
   
    public Drinks(String type,int price,int orderNum,int quantity) {
        super(type,price,orderNum);
    }
    
    public double CalculatePrice(){
        return getPrice()*getquantity();  
    }
    
    @Override
    public String toString(){
    return "Drinks Type: "+gettype() +" |Drink price "+getPrice()+" S.R";
    }
    
}
