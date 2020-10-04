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

public abstract class Customer implements bill{
 private int CNum;
 private items items [];//aggregation
         
 public Customer() {}
 
 public Customer(int CNum) {
        this.CNum = CNum;
 }

    public int getCNum() {
        return CNum;
    }

    public void setCNum(int CNum) {
        this.CNum = CNum;
    }
    
    @Override
    public String toString() {
    return "Customer's Number : " + CNum+CalculatePrice();}
}