package cafeshop;
/**
 *
 * @author Apple
 */
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Formatter;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.FormatterClosedException;
        
public class cafeshop {
static Scanner input = new Scanner(System.in);
static int choice;
static int order;
static int choicee;
static int choiceee;
static boolean continu= false;
static int counter=25;

public static int firstMenu() {
    System.out.println();
    System.out.println("\n Hello how can I help you ");
    System.out.println();
    System.out.println("1- Would you like to order ");
    System.out.println("-----------------------------------");
    System.out.println("2- Cancel a previous order ");
    System.out.println("-----------------------------------");
    System.out.println("3- print my bill ");
    System.out.println("-----------------------------------");
    System.out.println("4- to exit ");
    System.out.println("-----------------------------------");
    System.out.println(" tell me your choice, please :");
    choice = input.nextInt();
    return choice; }


public static int Choose1() {
    String[] array = new String[2];
    array[0] = "\n1- order a DRINK";
    array[1] = "2- order a BAKED";
    for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
    System.out.println("-----------------------------------"); }
    System.out.println(" tell me your choice :");
    order = input.nextInt();
    return order;} //new order


public static int Choose2() {
    System.out.println("\n Please select one");
    System.out.println("-----------------------------------");
    System.out.println("1-HOT DRINKS ");
    System.out.println("-----------------------------------");
    System.out.println("2-COLD DRINKS");
    System.out.println("-----------------------------------");
    System.out.println(" tell me your choice:");
    choicee = input.nextInt();
    return choicee;}//drinks


public static int Choose3() {
    System.out.println("\n Please select one");
    System.out.println("-----------------------------------");
    System.out.println("1- MUFFIN ");
    System.out.println("-----------------------------------");
    System.out.println("2- SANDWICH");
    System.out.println("-----------------------------------");
    System.out.println(" tell me your choice:");
    choiceee = input.nextInt();
    return choiceee;}//baked

 
public static int restock (){
  if (counter !=25)
 return counter=25;
 return 25;
} 

public static void main(String[] args) {
    
    TextFileWrite test =new TextFileWrite();
    test.openFile("CAFESHOP.txt"); //open
    
    test.addRecords(new Drinks("latte",6,1,4)); //write
    TextFileRead Test=new TextFileRead();
    
    test.closeFile();
    ArrayList<Drinks> Drink= new ArrayList<>(); //file
    
    
    
    ArrayList<Drinks> HotDrink = new ArrayList<Drinks>(); 
    ArrayList<Drinks> ColdDrink = new ArrayList<Drinks>(); 
    ArrayList<Baked> Baked = new ArrayList<Baked>();
    ArrayList<Baked> sandwich = new ArrayList<Baked>();
    
    
    ArrayList<items> list = new ArrayList<items>();//add order
   
    ArrayList<Drinks> prevDrink = new ArrayList<Drinks>();//prev
    ArrayList<Baked> prevBaked = new ArrayList<Baked>();//prev
    
    
    HotDrink.add(new Drinks("1- CAPPUCCINO",10,0,0));//1
    HotDrink.add(new Drinks("2- CAFE AMERCANO",10,0,0));//2
    HotDrink.add(new Drinks("3- CAFE LATTE",10,0,0));//3
    HotDrink.add(new Drinks("4- CAFE MOCHA",10,0,0));//4
    
    ColdDrink.add(new Drinks("1- ICED MOCHA",15,0,0));
    ColdDrink.add(new Drinks("2- ICED AMERCANO",15,0,0));
    ColdDrink.add(new Drinks("3- ICED LATTE",15,0,0));
    ColdDrink.add(new Drinks("4- WATER",15,0,0));
    ColdDrink.add(new Drinks("5- SOFT DRINKS",15,0,0));
    
    Baked.add(new Baked("1- DOUNUTS",6,0,0));
    Baked.add(new Baked("2- MUFFIN",6,0,0));
    Baked.add(new Baked("3- CUPCAKE",6,0,0));
    Baked.add(new Baked("4- SOUFFLE",6,0,0));
    
    sandwich.add(new Baked("1- TURKEY SANDWICH",13,0,0));
    sandwich.add(new Baked("2- CHIKEN SANDWICH",13,0,0));
    sandwich.add(new Baked("3- CHEESE SANDWICH",13,0,0));
    
   JFrame frame = new JFrame();
  JOptionPane.showMessageDialog(frame, "Hello sir, WELCOME to GHAIDA's CAFE SHOP :)");
  
do { //first
  do{ 
 firstMenu();
 
     try{
 switch (choice){
  case 1: // menu
 Choose1();//new order
  
 switch (order) { //baked or drink 
  case 1:Choose2();//drink
 
 switch (choicee) {//hot or cold
     case 1://Add hot
   JOptionPane.showMessageDialog(frame, "We have the best COFFEE");
     for (int i = 0; i < HotDrink.size(); i++) {
    System.out.println("____________________________________");
    System.out.println(HotDrink.get(i));}//print menu
   
    System.out.println("Your order please ");
    String type = input.next();
    System.out.println("How many ?");
    int quantity= input.nextInt();
    int price=10;
    int orderNum=1;
    
    Drinks c=new Drinks(type,price*quantity,orderNum,quantity);
    list.add(c);
    JOptionPane.showMessageDialog(frame,c);//bill
    break;
         
   case 2://Add cold
         JOptionPane.showMessageDialog(frame,"The best saller is ICED LATTE");
         for (int i = 0; i < ColdDrink.size(); i++) {
    System.out.println("____________________________________");
    System.out.println(ColdDrink.get(i)); }//print menu
       
    System.out.println("Your order please ");
    type = input.next();
    System.out.println("How many ?");
    quantity= input.nextInt();
    price=15;
    orderNum=1;
    
    Drinks h=new Drinks(type,price*quantity,orderNum,quantity);
    list.add(h);
    JOptionPane.showMessageDialog(frame,h);//bill
    break;
      default:   
     } 
 break;
     
 case 2: //muffin or sandwich
     Choose3();
 switch (choiceee) {
     
 case 1: //Add Muffin
           JOptionPane.showMessageDialog(frame, "The best saller is SOUFFLE");
          for (int i = 0; i < Baked.size(); i++) {
    System.out.println("____________________________________");
    System.out.println(Baked.get(i)); }//print menu
          
    System.out.println("Your order please ");
    String type = input.next();
    System.out.println("How many ?");
    int quantity= input.nextInt();
    int price=6;
    int orderNum=1;
    
    Baked m=new Baked(type,price*quantity,orderNum,quantity);//bill
    list.add(m);
    JOptionPane.showMessageDialog(frame,m);//bill
 break;
     
     case 2: //Add sandwich
      JOptionPane.showMessageDialog(frame, "The best saller is TURKEY SANDWICH ");
      for (int i = 0; i < sandwich.size(); i++) {
    System.out.println("____________________________________");
    System.out.println(sandwich.get(i)); }//print menu
      
    System.out.println("Your order please ");
    type = input.next();
    System.out.println("How many ?");
    quantity= input.nextInt();
    price=13;
    orderNum=1;
    
    Baked s=new Baked(type,price*quantity,orderNum,quantity);
    
    if(quantity!=25){//restock
    counter-=quantity;
    }
    else if (counter==0)
    restock();// class sandwich
    
    System.out.println(counter); //how many I have
    list.add(s);
    JOptionPane.showMessageDialog(frame, s);//bill
 break;
    default: 
  }
 } //end order
 break;
  case 2: //menu
     
    System.out.println("____________________________________");
    System.out.println("-Canceling a previous order ");
    System.out.println("____________________________________");
    System.out.println("What was your order number ?");
    double OrNum = input.nextDouble();//orderNumber
    
    for (int i = 0; i < prevDrink.size(); i++) {
    if (prevDrink.get(i).getOrderNum()==(OrNum)) {
    HotDrink.add(prevDrink.get(i));
    prevDrink.remove(i);  }}
   
     for (int i = 0; i < prevDrink.size(); i++) {
    if (prevDrink.get(i).getOrderNum()==(OrNum)) {
    ColdDrink.add(prevDrink.get(i));
    prevDrink.remove(i);  }}
    
    System.out.println("✦ Your order was cancled \n");
    break;
 
    case 3: //menu
     for (items print: list){//polymor My bill
         System.out.println(print.toString());    
     }
    break;
 
    case 4: //menu    
    System.out.println("EXIT!");
    break;
        
  } } catch(InputMismatchException inputMismatchException ){
       System.err.printf("The eror in  !!", inputMismatchException);  
         input.nextLine();
         System.out.println("Try again !");
  
  }} while(continu!=true );
} while (choice != 4); //end loop
 
//read file
    Test.openFile("CAFESHOP.txt");
    ArrayList<Drinks> d=Test.readRecords();
    for (Drinks s:d )
        System.out.println(s);
    test.closeFile();
    
//} while(continu!=true );  

    } //end of main
} 
