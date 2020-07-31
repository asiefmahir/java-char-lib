public class CoffeeMaker {
    private int sugar;
    private int milk;
    private int coffeeMate;
    private int water;
    private int coffee;

    public CoffeeMaker(int sugar, int milk, int coffeeMate, int water, int coffee){
        this.sugar = sugar;
        this.milk = milk;
        this.coffeeMate = coffeeMate;
        this.water = water;
        this.coffee = coffee;
    }

    public int getCoffee(){
        return coffee;
    };
    public int getSugar(){
        return sugar;
    };
    public int getMilk(){
        return milk;
    };
    public int getCoffeeMate(){
        return coffeeMate;
    };
    public int getWater(){
        return water;
    };

    public void addCoffee(int extraCoffee) throws Exception {
        if(extraCoffee>2){
            throw new Exception("You are an idiot");
        }
        coffee += extraCoffee;
    }

    public void addCoffeeMate(int extraCoffeeMate) throws Exception {
        if(extraCoffeeMate>2){
            throw new Exception("You are an idiot");
        }
        coffeeMate += extraCoffeeMate;
    }
    public void addMilk (int extraMilk) throws Exception{
        if(extraMilk>2){
            throw new Exception("You are an idiot");
        }
        milk += extraMilk;
    }
    public void addWater (int extraWater) throws Exception{
        if(extraWater>2){
            throw new Exception("You are an idiot");
        }
        milk += extraWater;
    };
    public void addExtraSugar (int extraSugar) throws Exception{
        if(extraSugar>2){
            throw new Exception("You are an idiot");
        }
        milk += extraSugar;
    }

    @Override
    public String toString() {
        return "CoffeeMaker {" +
                "sugar=" + sugar +
                ", milk=" + milk +
                ", coffeeMate=" + coffeeMate +
                ", water=" + water +
                ", coffee=" + coffee +
                '}';
    }
}
/*
* int Sugar
* int Milk
* int CoffeeMate
* int Water
*
* add CoffeeMate
* add Milk
* add Water
* add Sugar
*
* */