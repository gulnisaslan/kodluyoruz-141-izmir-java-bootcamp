package org.kodluyoruz;


import java.util.LinkedList;
import java.util.List;


public class Resturant {
    LinkedList<Food> orderLinkedList = new LinkedList<>();
     LinkedList<Food> doneLinkedList = new LinkedList<>();
     LinkedList<Food> takeLinkedList = new LinkedList<>();

  

    List<Food> foods =  List.of(
        new Food(1,"Salata",200,300),
        new Food(2,"Çorba",250,300),
        new Food(3,"Köfte",250,400),
        new Food(4,"Makarna",150,250),
        new Food(5,"Tavuk Kanat",250,300),
        new Food(6,"Hamburger",300,500),
        new Food(7,"Paella",500,400),
        new Food(8,"Pizza",350,500),
        new Food(9, "Baklava",100,200),
        new Food(10,"Fanta",25,100)
    );




    





}
