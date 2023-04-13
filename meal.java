/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nd3
 */
public class meal {
/**
     * get name and price 
 * @author aseelalansari
 * @return the name and price
 */

    String name;
    double price;

    public meal() {
    }

    public meal(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "meal{" + "name=" + name + ", price=" + price + '}';
    }
    
    

}
