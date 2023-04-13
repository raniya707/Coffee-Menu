/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nd3
 */
import java.util.ArrayList;
import java.util.Scanner;
public class bill {


/**
 * this class shows the bill 
 * @author aseelalansari
 */


    ArrayList<meal> orderdetails = new ArrayList<meal>();
    double total=0;
/**
 * empty constructor
 */
    public bill() {

    }
/**
 * 
 * @return order details
 */
    public ArrayList<meal> getorderdetails() {
        return orderdetails;
    }

    public void setorderdetails(ArrayList<meal> orderdetails) {
        this.orderdetails = orderdetails;
    }

    public void showbillDetails() {
        System.out.println("Meals in your order");
        int i=0;
        for (meal m : orderdetails) {
            System.out.println(i + ":" + m.toString());
            i++;
        }

    }
    
    /**
     * this method if the customer wants to delete meals from the order 
     */
 public void deletemeal(){
        System.out.println("Please Choose meal to delete");
      int i=0;
      for(meal m:orderdetails)
      {
      System.out.println(i+":"+m.toString());
      i++;
      }
      Scanner s= new Scanner(System.in);  
      int c= s.nextInt();
       orderdetails.remove(c);
      
      
  }
 
 /**
  * if the customer wants to add meals to the order
  * @param men 
  */
 public void addMeal(menu_ men)
 {System.out.println("Please Choose meal");
      int i=0;
      for(meal m :men.getAllmeals())
      {
      System.out.println(i+":"+m.toString());
      i++;
      }
      Scanner s= new Scanner(System.in);  
      int c= s.nextInt();
       orderdetails.add(men.getAllmeals().get(c)) ;
 }
 
 /**
  * calculate the order total price
  * @return total price 
  */
 public double calculateBill(){
      total=0;
      for (meal m : orderdetails) {
           total+=m.getPrice();
        }
     return total;
 }
 

}
