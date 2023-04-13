/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nd3
 */
public class aditional extends Additional_order {
    
   
    public aditional(String addSugar, String addMilk, String addHotmilk, String addAce, String addCaramel, String whatToadd) {
        super(addSugar, addMilk, addHotmilk, addAce, addCaramel, whatToadd);
    }


    
      public void addition(){
          System.out.println("anything else wanna add to your order?");
          java.util.Scanner in =new java.util.Scanner(System.in);
          String n=in.next();
      }

   
    
}
