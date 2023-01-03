public class Pizza{
    private int price;
    private boolean veg;
    private int extraCheesePrice =100;
    private  int extraToopingsAdded = 150;
    private int backPackPrice =50;
    private  int basePizzaPrise;

    private boolean isExtraCheeseAdded= false;
    private boolean isExtraToopingAdded= false;
    private boolean isOptedForTakeAwaby = false;

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg){
            this.price = 300;
        }else{
        this.price = 400;
        }
        basePizzaPrise = this.price;
    }
    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price +=extraCheesePrice;
    }
    public void addExtraToppings(){
        isExtraToopingAdded = true;
        this.price+= extraToopingsAdded;

    }
    public void takeAway(){
        isOptedForTakeAwaby = true;
        this.price+= backPackPrice;

    }
    public void getBill(){
        String bill = "";
        System.out.println("Pizza : " + basePizzaPrise);
        if (isExtraCheeseAdded){
            bill += "Extra chese addes: " +extraCheesePrice + "\n";
        }
        if (isExtraToopingAdded){
            bill+= "Extra Tooping Added: " + extraToopingsAdded + "\n";
        }
        if (isOptedForTakeAwaby){
            bill+= "Take away: " + backPackPrice + "\n";
        }
        bill+= "Bill: " + this.price + "\n";
        System.out.println(bill);
    }
}


