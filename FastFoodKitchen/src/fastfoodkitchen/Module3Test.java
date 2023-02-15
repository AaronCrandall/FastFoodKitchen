/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fastfoodkitchen;
import java.util.*;
/**
 *
 * @author Owner
 */
public class Module3Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FastFoodKitchenSimulation kitchen = new FastFoodKitchenSimulation();
        kitchen.addOrder(1, 8, 0, 0, true);
        kitchen.addOrder(0, 0, 15, 0, true);
        kitchen.addOrder(2, 10, 0, 0, true);
        kitchen.addOrder(1, 1, 0, 0, true);
        int orderPosition = kitchen.findOrderSeq(4);
        System.out.println("Using sequential search >> order position is: "+orderPosition);
        //kitchen.selectionSort();
        //kitchen.insertionSort();
        ArrayList<BurgerOrder> sortedOrders = kitchen.getOrderList();
        
        int orderSize = 0;
        for (BurgerOrder order : sortedOrders)
        {
            orderSize = order.getBurgerTotal();
            System.out.println(order.getOrderNum()+" has "+ orderSize + "Burgers");
        }
        orderPosition = kitchen.findOrderBin(3);
        System.out.println("Using binary search >> order position is "+ orderPosition);
     
        
    }
    
}
