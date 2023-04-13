/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nd3
 */
public class coustomer implements Comparable<coustomer> {

    String name;
    int ID;

     public coustomer(){
         
     }
    public coustomer(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String toString() {
        return "Customer{" + "name=" + name + ", ID=" + ID + '}';
    }
    
/**
 *
 * @author kanaribabhair
 * @param name to let the user enter his/her name 
 * @param Id   to give the id to the customer
 * @return the id and name of the user
 * 
 */
    
      public int compareTo(coustomer o) {
        return this.ID>o.ID ?1 :this.ID<o.ID?-1 : 0;
    }
    
}
