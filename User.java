import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private List<String> cart;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.cart = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<String> getCart() {
        return cart;
    }

    public void addItemToCart(String item) {
        cart.add(item);
    }

    public void clearCart() {
        cart.clear();
    }

    public double getBalance() {
        return 0;
    }

    public void setBalance(double d) {
    }
}