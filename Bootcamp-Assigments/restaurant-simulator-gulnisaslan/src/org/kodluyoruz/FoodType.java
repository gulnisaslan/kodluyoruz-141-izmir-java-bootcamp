package org.kodluyoruz;



public enum FoodType {
    Salata(1,"Salata",200,300),
    Corba(2,"Corba",250,300),
    Kofte(3,"Kofte",250,400),
    Makarna(4,"Makarna",150,250),
    TavukKanat(5,"Tavuk Kanat",250,300),
    Hamburger(6,"Hamburger",300,500),
    Paela(7,"Paela",500,400),
    Pizza(8,"Pizza",350,500),
    Baklava(9,"Baklava",100,200),
    Fanta(10,"Fanta",25,100);

    private  int id;
    private  String foodName;
    private  int prepareFood;
    private int consumptionTime;
    public int getId() {
        return id;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getPrepareFood() {
        return prepareFood;
    }

    public int getConsumptionTime() {
        return consumptionTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setPrepareFood(int prepareFood) {
        this.prepareFood = prepareFood;
    }

    public void setConsumptionTime(int consumptionTime) {
        this.consumptionTime = consumptionTime;
    }

    FoodType(int id, String foodName, int prepareFood, int consumptionTime){
        this.id=id;
        this.foodName= foodName;
        this.prepareFood = prepareFood;
        this.consumptionTime = consumptionTime;
    }







    
}
