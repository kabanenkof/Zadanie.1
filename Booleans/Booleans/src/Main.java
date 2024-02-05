
public class Main {
    public static void main(String[] args) {
        int milkAmount = 1000; // ml
        int powderAmount = 500; // g
        int eggsCount = 260; // items
        int sugarAmount = 310; // g
        int oilAmount = 300; // ml
        int appleCount = 700; // items

        // Example
        // apples - 5
        if (appleCount >= 5) {
            System.out.println("Apple juice");
        }
        if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1 && oilAmount >= 30) {
            // powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
            System.out.println("You can make a Pancakes");
        }
        if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            // milk - 300 ml, powder - 5 g, eggs - 5
            System.out.println("You can make a Omelette");
        }
        if (appleCount >= 3 && milkAmount >= 100 & powderAmount >= 300 && eggsCount >= 4) {
            // apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
            System.out.println("You can make a Apple pie");
        }
    }
}