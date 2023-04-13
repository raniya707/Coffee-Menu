/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nd3
 */
public abstract class Additional_order {
     String addSugar;
    String addMilk;
    String addHotmilk;
    String addice;
    String addCaramel;
    String whatToadd;
    
    public abstract void addition();

    public Additional_order(String addSugar, String addMilk, String addHotmilk, String addAce, String addCaramel, String whatToadd) {
        this.addSugar = addSugar;
        this.addMilk = addMilk;
        this.addHotmilk = addHotmilk;
        this.addice = addAce;
        this.addCaramel = addCaramel;
        this.whatToadd = whatToadd;
    }


    public String getAddSugar() {
        return addSugar;
    }

    public void setAddSugar(String addSugar) {
        this.addSugar = addSugar;
    }

    public String getAddMilk() {
        return addMilk;
    }

    public void setAddMilk(String addMilk) {
        this.addMilk = addMilk;
    }

    public String getAddHotmilk() {
        return addHotmilk;
    }

    public void setAddHotmilk(String addHotmilk) {
        this.addHotmilk = addHotmilk;
    }

    public String getAddAce() {
        return addice;
    }

    public void setAddAce(String addAce) {
        this.addice = addAce;
    }

    public String getAddCaramel() {
        return addCaramel;
    }

    public void setAddCaramel(String addCaramel) {
        this.addCaramel = addCaramel;
    }

    public String getWhatToadd() {
        return whatToadd;
    }

    public void setWhatToadd(String whatToadd) {
        this.whatToadd = whatToadd;
    }

    @Override
    public String toString() {
        return "what do you want in your additional order ? \n{" + "\n add Sugar=" + addSugar + "\n addMilk=" + addMilk + "\n add hot milk=" + addHotmilk + "\n add Ace=" + addAce + "\n add Caramel=" + addCaramel + "\n what to add=" + whatToadd + "\n"+'}';
    }

    /**
     * ask the coustomer to add aditinoal things to its order
     * @author raniya
     * @param addSugar to add sugar to his\her order
     * @param addMilk to add milk to his\her order
     * @param addAce to add ace to his\her order
     * @param addCaramel to add caramel sauce to his\her order
     * @return to return the additional thing to his\her order either sugar,milk,ace,etc..
     */
    

}
