/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nd3
 */
public class drink extends meal{
    
/**
 * this class inherit from meal class 
 * @author aseelalansari
 * @return drink with cup size
 */

    char cupSize;

    public drink() {
    }

    public drink(char cupSize) {
        this.cupSize = cupSize;
    }

    public drink(char cupSize, String name, double price) {
        super(name, price);
        this.cupSize = cupSize;
    }

    public void setCupSize(char cupSize) {
        this.cupSize = cupSize;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getCupSize() {
        return cupSize;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "drink{" + "cupSize=" + cupSize + '}';
    }
    
    
    

}
