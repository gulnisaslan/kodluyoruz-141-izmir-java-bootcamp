package org.kodluyoruz;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Waiter implements Runnable {

    public  int waiter= 3;
    Resturant resturant;

    FoodType[] foodTypes =  FoodType.values();





    public Waiter(int waiter, Resturant resturant) {
        this.waiter = waiter;
        this.resturant = resturant;
    }
    public void takeOrder(){
        for (int i = 0; i < foodTypes.length; i++) {
           
        }


        for (int i = 0; i < waiter; i++) {
            resturant.orderLinkedList.add(null);
        }

    }

    @Override
    public void run() {


    }
}
