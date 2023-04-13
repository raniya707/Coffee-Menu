/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nd3
 */
public class coponCode {
    
    int numberofcups;
    coustomer c;
    double price;

    public coponCode() {
    }

    public coponCode(int numberofcups, coustomer c, double price) {
        this.numberofcups = numberofcups;
        this.c = c;
        this.price = price;
    }

    public int getNumberofcups() {
        return numberofcups;
    }

    public coustomer getC() {
        return c;
    }

    public double getPrice() {
        return price;
    }

    public void setNumberofcups(int numberofcups) {
        this.numberofcups = numberofcups;
    }

    public void setC(coustomer c) {
        this.c = c;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CoponCode{" + "numberofcups=" + numberofcups + ", c=" + c + ", price=" + price + '}';
    }
    
    public double caculateprice () {
        System.out.println("how many cups you want?");
        java.util.Scanner in=new java.util.Scanner(System.in);
        int numOfcups=in.nextInt();
        
        if (numOfcups==3)
            System.out.println(" you bought 3 cups so you will have one cup for free.. ");
        
        if (numOfcups== 5)
            System.out.println(" you bought 5 cups so you will have two cups for free.. ");
        
        this.price = numberofcups *numOfcups;
                return this.price;
    }
    
/**
 * to give the user copon code 
 * @author kanaribabhair
 * @param numberOfcups to let the user enter the number of cups
 * @param coustomer 
 * @param price to let the user enter the price
 * @return to return the price and number of cups
 */
}
