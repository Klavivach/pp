import java.io.FileWriter;
import java.io.IOException;

public class AddItemShop{
    public static void main(String[]args) {
        addItemToFile("Logitech G333", 13.99);
    }
    public static void addItemToFile(String itemName, double price) {
        try {
            FileWriter writer = new FileWriter("items.txt", true);
            writer.write(itemName + "," + price + "\n");
            writer.close();
            System.out.println("Item added successfully!");
        } catch (IOException e) {
            System.out.println("Error writing item data.");
            e.printStackTrace();
        }
    }    
}    
