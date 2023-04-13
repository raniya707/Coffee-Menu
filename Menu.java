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
import java.util.Collections;
public class Menu  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    System.out.println("*********************** coustomer information ************************");
     System.out.println("welcome to my lovely coffe could give us your name?");
     java.util.Scanner in =new java.util.Scanner(System.in);
      String name=in.next();
      String name2=in.next();
      String name3=in.next();
    coustomer a1=new coustomer(name,3);
    coustomer a2=new coustomer(name2,2);
    coustomer a3=new coustomer(name3,1);
    
    ArrayList <coustomer> c1=new ArrayList<>();
    c1.add(a1);
    c1.add(a2);
    c1.add(a3);
    
    Collections.sort(c1);
    
    for(coustomer r2:c1 ){
        System.out.println(r2);
    }
   
     /*  coustomer []array={a1,a2,a3};
       for(int i=0;i<array.length;i++){
           System.out.println(array[i]);
           */
       
       
        System.out.println(" \ntake a look at the menu : ");

        System.out.println("********************** My lovely coffe ***************************");
        Menu m1 = new Menu();
        m1.menu();
        System.out.println(15);
        System.out.println(m1.getPrice(15));
        System.out.println();
        Menu m2 = new Menu();
        m2.hotDrinkMenu();
        System.out.println(4);
        System.out.println(m2.getPrice(4));
        System.out.println();
        Menu m3 = new Menu();
        m3.coldDrinkMenu();
        System.out.println(5);
        System.out.println(m3.getPrice(5));
        System.out.println();
        Menu m4 = new Menu();
        m4.cakeMenu();
             System.out.println(6);
   System.out.println(m4.getPrice(6));
   
   
        System.out.println("---------------------------------------------------------");
        System.out.println("\nso... what do you want to order ? :");
        String order = in.next();

        if(order.equals("mocha")){
            System.out.println("it takes only 14.0 ");
        }
        else if (order.equals("spanish latte")){
            System.out.println("it takes only 16.0");
    }
        else if(order.equals("espresso")){
            System.out.println("it takes only 12.0"); 
        }
           else if(order.equals("americano")){
               System.out.println("it takes only 12.0");
            
        }
              else if(order.equals("cappucion")){
                  System.out.println("it takes only 14.0");
        }
                 else if(order.equals("flat White")){
            System.out.println("it takes only 14.0");
        }
        else{
            System.out.println("sorry we dont have this in our menu ");
        }
        /*
        employe e1=new employe("aseel",1,1550);
        employe e2=new employe("kanari",2,1550);
     
        employe array2[]={e1,e2};
        
        for(int j =0;j<array2.length;j++){
            System.out.println(array2[j]);
        }
*/
        System.out.println("-----------------------------------------------------");
        
         boolean isCorrect=true;
     while(isCorrect){
      isCorrect=false;
     try{
        System.out.println("wanna add some aditional stuff to your order");
        String yes=in.next();
           
    
        
        if(yes.equals("yes")){
         System.out.println("then what do u want to add :");
         aditional w1=new aditional("yes","yes","no","no","no","no");
         w1.addition();
         System.out.println(w1);
        }
     }
         catch(Exception e){
         System.out.println("you entered the wrong data! \nplease try again");
        isCorrect=true;
         
     }
    }
     
        System.out.println("****************************************************");
     
        System.out.println("we have an offer for you dear "+name);
        System.out.println("if you pick up 3 or 5 cups you will get one by free");
        
        coponCode c =new coponCode();
        c.caculateprice();
     
    }
    
// Menu   S
// Hot drinks:
    final private ArrayList<String> hotDrinkList;
    final private ArrayList<Double> hotDrinkPrices;
// Cold drinks:
    final private ArrayList<String> coldDrinkList;
    final private ArrayList<Double> coldDrinkPrices;
// Cake & individual bars:
    final private ArrayList<String> cakeList;
    final private ArrayList<Double> cakePrices;
    private int selectedMenu;

    public Menu(int selectedMenu) {
        this();
        if (selectedMenu >= 0 && selectedMenu <= 3) {
            this.selectedMenu = selectedMenu;
        }
        runSelectdMenu();
    }

    public Menu() {
        this.cakePrices = new ArrayList<>(20);
        this.cakeList = new ArrayList<>(20);
        this.coldDrinkPrices = new ArrayList<>(20);
        this.coldDrinkList = new ArrayList<>(20);
        this.hotDrinkPrices = new ArrayList<>(20);
        this.hotDrinkList = new ArrayList<>(20);

// Hot drinks:            
        hotDrinkList.add("Mocha");
        hotDrinkList.add("Spanish Latte");
        hotDrinkList.add("Espresso");
        hotDrinkList.add("Americano");
        hotDrinkList.add("Cappucino");
        hotDrinkList.add("Flat White");

// Hot drinks:            
        hotDrinkPrices.add(14.0);
        hotDrinkPrices.add(16.0);
        hotDrinkPrices.add(12.0);
        hotDrinkPrices.add(12.0);
        hotDrinkPrices.add(14.0);
        hotDrinkPrices.add(14.0);

// Cold drinks: 
        coldDrinkList.add("Ice white mocha");
        coldDrinkList.add("Ice latte");
        coldDrinkList.add("Matcha latte");
        coldDrinkList.add("Caramel Frappuccino");
        coldDrinkList.add("Iced Caramel Macchiato");
        coldDrinkList.add("Cold Brew");

// Cold drinks: 
        coldDrinkPrices.add(14.0);
        coldDrinkPrices.add(14.0);
        coldDrinkPrices.add(16.0);
        coldDrinkPrices.add(16.0);
        coldDrinkPrices.add(16.0);
        coldDrinkPrices.add(14.0);

// Cake & individual bars: 
        cakeList.add("Teramiau");
        cakeList.add("Chocolate fudge cake");
        cakeList.add("English cake");
        cakeList.add("Swiss Roll");
        cakeList.add("Apple pie");
        cakeList.add("Blueberry cheesecake");

// Cake & individual bars: 
        cakePrices.add(20.0);
        cakePrices.add(25.0);
        cakePrices.add(12.0);
        cakePrices.add(20.0);
        cakePrices.add(25.0);
        cakePrices.add(25.0);
    }

    private void runSelectdMenu() {
        switch (selectedMenu) {
            case 0:
                menu();
                break;
            case 1:
                hotDrinkMenu();
                break;
            case 2:
                coldDrinkMenu();
                break;
            case 3:
                cakeMenu();
                break;
            default:
                System.out.println("Wrong Menu");
        }
    }

    public void hotDrinkMenu() {
        selectedMenu = 1;
        System.out.println("Hot drink Menu:");
        for (int i = 0; i < hotDrinkList.size(); i++) {
            System.out.println((i + 1) + ":      " + hotDrinkPrices.get(i) + "  " + hotDrinkList.get(i));
        }
        System.out.println();
    }

public void coldDrinkMenu() {
        selectedMenu = 2;
        System.out.println("Cold drink Menu:");
        for (int i = 0; i < coldDrinkList.size(); i++) {
            System.out.println((i + 1) + ":      " + coldDrinkPrices.get(i) + "  " + coldDrinkList.get(i));
        }
        System.out.println();
    }

    public void cakeMenu() {
        selectedMenu = 3;
        System.out.println("Cake Menu:");
        for (int i = 0; i < cakeList.size(); i++) {
            System.out.println((i + 1) + ":      " + cakePrices.get(i) + "  " + cakeList.get(i));
        }
        System.out.println();
    }

    public void menu() {
        selectedMenu = 0;
        int count = 1;
        System.out.println("Hot drink Menu");
        for (int i = 0; i < hotDrinkList.size(); i++) {
            System.out.println((count++) + ":      " + hotDrinkPrices.get(i) + "  " + hotDrinkList.get(i));
        }
        System.out.println();
        System.out.println("Cold drink Menu:");
        for (int i = 0; i < coldDrinkList.size(); i++) {
            System.out.println((count++) + ":      " + coldDrinkPrices.get(i) + "  " + coldDrinkList.get(i));
        }
        System.out.println();
        System.out.println("Cake Menu:");
        for (int i = 0; i < cakeList.size(); i++) {
            System.out.println((count++) + ":      " + cakePrices.get(i) + "  " + cakeList.get(i));
        }
        System.out.println();
    }

    double getPrice(int number) {
        int hotDrinkListSize = hotDrinkList.size();
        int coldDrinkListSize = coldDrinkList.size();
        int cakeListSize = cakeList.size();
        if (number > hotDrinkListSize + coldDrinkListSize + cakeListSize || number < 1) {
            System.out.println("Wrong Entry");
            return 0;
        }
        switch (selectedMenu) {
            case 0:
                if (number > hotDrinkListSize + coldDrinkListSize) {
                    System.out.println(cakeList.get(number - hotDrinkListSize - coldDrinkListSize - 1));
                    return cakePrices.get(number - hotDrinkListSize - coldDrinkListSize - 1);
                } else if (number > hotDrinkListSize) {
                    System.out.println(coldDrinkList.get(number - hotDrinkListSize - 1));
                    return coldDrinkPrices.get(number - hotDrinkListSize - 1);
                } else {
                    System.out.println(hotDrinkList.get(number - 1));
                    return hotDrinkPrices.get(number - 1);
                }
            case 1:
                if (number > hotDrinkListSize) {
                    System.out.println("Wrong Entry");
                    return 0;
                }
                System.out.println(hotDrinkList.get(number - 1));
                return hotDrinkPrices.get(number - 1);

            case 2:
                if (number > coldDrinkListSize) {
                    System.out.println("Wrong Entry");
                    return 0;
                }
                System.out.println(coldDrinkList.get(number - 1));
                return coldDrinkPrices.get(number - 1);

            case 3:
                if (number > cakeListSize) {
                    System.out.println("Wrong Entry");
                    return 0;
                }
                System.out.println(cakeList.get(number - 1));
                return cakePrices.get(number - 1);
        }
        return 0;
    }

    void addHotDrink(String hotDrinkName, double price) {
        hotDrinkList.add(hotDrinkName);
        hotDrinkPrices.add(price);
    }

    void dropHotDrink(String hotDrinkName) {
        int index = hotDrinkList.indexOf(hotDrinkName);
        hotDrinkList.remove(index);
        hotDrinkPrices.remove(index);
    }

    void addColdDrink(String coldDrinkName, double price) {
        coldDrinkList.add(coldDrinkName);
        coldDrinkPrices.add(price);

    }

    void dropColdDrink(String coldDrinkName) {
        int index = coldDrinkList.indexOf(coldDrinkName);
        coldDrinkList.remove(index);
        coldDrinkPrices.remove(index);

    }

void addCake(String cakeName, double price) {
        cakeList.add(cakeName);
        cakePrices.add(price);

    }

    void dropCake(String cakeName) {
        int index = cakeList.indexOf(cakeName);
        cakeList.remove(index);
        cakePrices.remove(index);

    }
  
  
}
  



