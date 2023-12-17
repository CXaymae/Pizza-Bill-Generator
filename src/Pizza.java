public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 50;
    private int extraTopinsPrice = 80;
    private int backPack = 10;
    private int basePizzaPrice;
    private Boolean isExtraCheeseAdded = false;
    private Boolean isExtraTopinsAdded = false;
    private Boolean isTookAway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg){
            this.price = 200;
        }else{
            this.price = 300;
        }
        basePizzaPrice = this.price;
    }
  public void addExtraCheese(){
        isExtraCheeseAdded = true;
      System.out.println("Extra cheese added");
      this.price += extraCheesePrice;

  }

    public void addExtraTopins(){
        isExtraTopinsAdded = true;
        System.out.println("Extra topins added");
        this.price += extraTopinsPrice;
    }

    public void takeAway(){
        isTookAway = true;
        System.out.println("Took away");
        this.price += backPack;
    }

    public void getBill(){
        String Bill = "";
        System.out.println("Pizza: "+basePizzaPrice);
        if (isExtraTopinsAdded){
            Bill += "Extra cheese added : "+ extraCheesePrice + "\n";
        }
        if (isExtraTopinsAdded){
            Bill += "Extra topins added : "+ extraTopinsPrice + "\n";
        }
        if (isTookAway){
            Bill += "Take away : "+ backPack + "\n";
        }
        Bill += "Bill:" + this.price + "\n";
        System.out.println(Bill);

    }
}
