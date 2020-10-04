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
public abstract class items {

private String type;
private int price;
private int orderNum;
private int quantity;
  
public items() {}

   public items(String type,int price,int orderNum) {
        this.type = type;
        this.price=price;
        this.orderNum=orderNum;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }
     public int getquantity() {
        return quantity;
    }

    public void setquantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {//
        this.price = price;
    }

    public int getOrderNum() {//
        return orderNum;
    }

    public void setOrderNum(int orderNum) {//
        this.orderNum = orderNum;
    }

    @Override
    public String toString() {
        return "Type : "+type+"\n✦ Order number : "+orderNum+"quantity"+quantity+" \n";
}
}

