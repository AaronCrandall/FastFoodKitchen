/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastfoodkitchen;
import java.util.*;
/**
 * Fast food kitchen simulation allows you to input 3 orders to start the class and then allows for the adding or removal of other orders.
 * you can also check how many orders are left.
 * @author Aaron Crandall
 */
public class FastFoodKitchenSimulation {
    private ArrayList<BurgerOrder> orderList = new ArrayList<>();
    private static int nextOrderNum = 1;
    public FastFoodKitchenSimulation()
    {
        
    }
    /**
     * Constructor method that takes in 3 orders to start
     * @param order1
     * @param order2
     * @param order3 
     */
    public FastFoodKitchenSimulation(BurgerOrder order1, BurgerOrder order2, BurgerOrder order3)
    {
        orderList.add(order1);
        incrementNextOrderNum();
        orderList.add(order2);
        incrementNextOrderNum();
        orderList.add(order3);
        incrementNextOrderNum();
    }
    /**
     * Takes in all of the parameters and creates another order and sets it to the last order in the list.
     * @param ham
     * @param cheese
     * @param veggie
     * @param soda
     * @param toGo
     * @return returns the number for the order that was just created 
     */
    public int addOrder(int ham, int cheese, int veggie, int soda, boolean toGo)
    {
        BurgerOrder newBurgerOrder = new BurgerOrder(ham, cheese, veggie, soda, toGo, nextOrderNum); //bullet 1
        orderList.add(newBurgerOrder); // bullet 2
        incrementNextOrderNum(); //bullet 3
        return nextOrderNum - 1; //bullet 4
    }
    /**
     * removes the last order from the list and removes the order number associated with that order
     * @return true if the order is cancelled and removed from the orderlist count otherwise returns false if there are no current pending orders
     */
    public boolean cancelLastOrder()
    {
        if (!orderList.isEmpty())
        {
            int count = orderList.size();
            orderList.remove(count-1);
            nextOrderNum--;
            return true;
        }
        else
            return false;
    }
    /**
     * is used to increase the order number by 1
     */
    private void incrementNextOrderNum()
    {
        nextOrderNum++;
    }
    /**
     * gets the numbers of orders by checking the orderList size and returning that
     * @return number of orders pending
     */
    public int getNumOrdersPending()
    {
        int size = orderList.size();
        return size;
    }

    /**
     * checks to see if an order number is still in the queue to be cooked. If order number is not there we assume the order has been completed
     * @param orderID
     * @return true if the order is no longer in the queue returns false if the order is still in the queue
     */
    public boolean isOrderDone(int orderID)
    {
        boolean result = true;
        for(int i = 0; i < orderList.size(); i++)
        {
            int order = orderList.get(i).getOrderNum();
            if (order == orderID)
            {
                result = false;
            }
        }
        return result;
    }
    /**
     * checks to see if an order is in the queue, if that order is in the queue it is cancelled and the order id number is deleted
     * @param orderID
     * @return flase if the order is not in the queue, returns true if the order was in the queue and the order is deleted
     */
    public boolean cancelOrder(int orderID)
    {
        boolean result = false;
        for(int i = 0; i < orderList.size(); i++)
        {
            int order = orderList.get(i).getOrderNum();
            if (order == orderID)
            {
                orderList.remove(i);
                result = true;
            }
        }
        return result;
    }
    public int findOrderSeq (int orderID)
    {
        int order;
        for(int i = 0; i < orderList.size(); i++)
        {
            order = orderList.get(i).getOrderNum();
            if (order == orderID)
            {
                return i;
            }
        }
        
        return -1;
    }
    public void selectionSort(){  
        for(int j = 0; j < orderList.size() - 1; j++)
        {
            int minIndex = j;
            BurgerOrder lower = new BurgerOrder(0,0,0,0,true,0);
            BurgerOrder temp = new BurgerOrder(0,0,0,0,true,0);
            for(int k = j+1; k < orderList.size(); k++)
            {
                if (orderList.get(k).getBurgerTotal() < orderList.get(minIndex).getBurgerTotal())
                {
                    minIndex = k;
                }
            }
            lower = orderList.get(minIndex);
            temp = orderList.get(j);
            orderList.set(j, lower);
            orderList.set(minIndex, temp);
            
            
            
            
        }
    }
    public void insertionSort()
    {
        for ( int j = 1; j < orderList.size(); j++)
        {
        BurgerOrder temp = new BurgerOrder(0,0,0,0,false,0);
        temp = orderList.get(j);
        int possibleIndex = j;
        while (possibleIndex > 0 && temp.getBurgerTotal() < orderList.get(possibleIndex - 1).getBurgerTotal())
        {
            orderList.set(possibleIndex, orderList.get(possibleIndex - 1));
            possibleIndex--;
        }
        orderList.set(possibleIndex, temp);
               
        }
    }
    public ArrayList<BurgerOrder> getOrderList()
    {
        return orderList;
    }
    
    public int findOrderBin(int orderID)
    {
        int start = 0;
        int end = orderList.size()-1;
        while ( start <= end)
        {
            
            int middle = (start + end) / 2;
            if ( orderID < orderList.get(middle).getOrderNum())
            {
                end = middle - 1;
            }
            else if (orderID > orderList.get(middle).getOrderNum())
            {
                start = middle + 1;
            }
            else
            {
                return middle;
            }
        }
        return -1;
    }
}
