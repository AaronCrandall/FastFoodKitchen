/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastfoodkitchen;

/**
 *
 * @author Owner
 */
public class BurgerOrder {
    private int numHamburgers = 0;
    private int numCheeseburgers = 0;
    private int numVeggieburgers = 0;
    private int numSodas = 0;
    private boolean orderToGo = false;
    private int orderNum = 3;
    private int numTotalBurger= 0;
    
    public BurgerOrder(int hamburgers, int cheeseburgers, int veggieburgers, int sodas, boolean toGo, int orderNumber)
    {
        numHamburgers = hamburgers;
        numCheeseburgers = cheeseburgers;
        numVeggieburgers = veggieburgers;
        numSodas = sodas;
        orderToGo = toGo;
        orderNum = orderNumber;
        
    }
    
    public void setNumHamburgers(int hamburgers)
    {
        if (hamburgers > 0)
            numHamburgers = hamburgers;
        else
            System.out.println("Please enter a number greater than 0!");
    }
    public int getNumHamburgers()
    {
        return numHamburgers;
    }
    public void setCheeseburgers(int hamburgers)
    {
        if (hamburgers > 0)
            numCheeseburgers = hamburgers;
        else
            System.out.println("Please enter a number greater than 0!");
    }
    public int getNumCheeseburgers()
    {
        return numCheeseburgers;
    }
    public void setNumVeggieburgers(int vegburgers)
    {
        if (vegburgers > 0)
            numVeggieburgers = vegburgers;
        else
            System.out.println("Please enter a number greater than 0!");
    }
    public int getNumVeggieburgers()
    {
        return numVeggieburgers;
    }
    public void setNumSodas(int soda)
    {
        if (soda > 0)
            numSodas = soda;
        else
            System.out.println("Please enter a number greater than 0!");
    }
    public int getNumSodas()
    {
        return numSodas;
    }
    public void setOrderToGo(boolean go)
    {
        orderToGo = go;
    }
    public boolean isOrderToGo()
    {
        return orderToGo;
    }
    public void setOrderNum(int order)
    {
        orderNum = order;
    }
    public int getOrderNum()
    {
        return orderNum;
    }
    public int getBurgerTotal()
    {
        numTotalBurger = numHamburgers + numCheeseburgers + numVeggieburgers;
        return numTotalBurger;
    }
    
}
