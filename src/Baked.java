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
public class Baked extends items {

public Baked() {}
 
public Baked(String type,int price,int orderNum,int quantity) {
        super(type,price,orderNum);//
}

 public double CalculatePrice(){
        return getPrice()*getquantity();  
    }
    
     @Override
    public String toString(){
    return "Baked Type: "+gettype()+" |Baked price "+getPrice()+" S.R";
    }
}