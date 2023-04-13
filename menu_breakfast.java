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

public class menu_breakfast {
    

/**
 * this class shows the menu with prices 
 * @author aseelalansari
 * menu shows all menu either meals and drinks
 * @return what was chosen from the menu
 */
public class menu {
    ArrayList<meal>Allmeals = new ArrayList<meal>();

    public menu() {
      meal m1 = new meal("Cheese Croissant ",30);
      meal m2 = new meal("Cheese & Thyme Croissant ",60);
      meal m3 = new meal("Butter Croissant ",20);
      drink d1 = new drink('L',"Tea",10);
      drink d2 = new drink('M',"Orange juice ",30);
      drink d3 = new drink('S',"Lemon juice ",15);
      Allmeals.add(m1);
      Allmeals.add(m2);      
      Allmeals.add(m3);      
      Allmeals.add(d1);      
      Allmeals.add(d2);      
      Allmeals.add(d3);      
      
    }

    public ArrayList<meal> getAllmeals() {
        return Allmeals;
    }

    public void setAllmeals(ArrayList<meal> Allmeals) {
        this.Allmeals = Allmeals;
    }
        
 
  public meal showMenu(){
        System.out.println("Please Choose meal");
      int i=0;
      for(meal m:Allmeals)
      {
      System.out.println(i+":"+m.toString());
      i++;
      }
      Scanner s= new Scanner(System.in);  
      int c= s.nextInt();
      return Allmeals.get(c);
  }
}
}
