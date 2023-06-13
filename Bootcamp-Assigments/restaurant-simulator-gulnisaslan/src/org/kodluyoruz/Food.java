package org.kodluyoruz;

public class Food {
    private int id;
    private String name; 
    private int preparationTime; 
    private int consumptionTime;

  public Food(int id, String name, int preparationTime, int consumptionTime) {
    this.id = id;
    this.name = name;
    this.preparationTime = preparationTime;
    this.consumptionTime = consumptionTime;
  }

  public Food() {
  }
   

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPreparationTime() {
    return this.preparationTime;
  }

  public void setPreparationTime(int preparationTime) {
    this.preparationTime = preparationTime;
  }

  public int getConsumptionTime() {
    return this.consumptionTime;
  }

  public void setConsumptionTime(int consumptionTime) {
    this.consumptionTime = consumptionTime;
  }

    
}
