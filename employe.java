/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nd3
 */
public class employe {
    String name;
    int ID;
    double salary;

    public employe(String name, int ID, double salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Employee{" + "salary=" + salary + '}';
    }
    
    

}
