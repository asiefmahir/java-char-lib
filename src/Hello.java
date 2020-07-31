import java.util.Stack;

public class Hello {
    public static void main(String[] args) throws Exception {
        CoffeeMaker cm = new CoffeeMaker(1,2,1, 50, 2);
        System.out.println(cm);
        System.out.println(cm.getMilk());
        cm.addCoffeeMate(2);
        System.out.println(cm);
        cm.addCoffeeMate(1);
        System.out.println(cm);
    }
}
