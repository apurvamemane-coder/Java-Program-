import java.util.ArrayList;

public class CollectionExample {
    public static void main(String[] args) {
        // Creating a collection (ArrayList)
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Displaying elements
        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
