import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private Wallet wallet;
    private List<Order> orderHistory = new ArrayList<>();

    public Customer(String name, String userID, String password) {
        super(name, userID, password);
        this.wallet = new Wallet();
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void placeOrder(Menu menu, String orderType, double deliveryFee) {
        if (wallet.getBalance() < menu.getPrice() + deliveryFee) {
            System.out.println("Insufficient balance.");
            return;
        }
        Order order = new Order(menu, orderType, deliveryFee);
        orderHistory.add(order);
        wallet.deduct(menu.getPrice() + deliveryFee);
        System.out.println("Order placed: " + menu.getDetails());
    }

    @Override
    public void login() {
        System.out.println("Customer logged in.");
    }
}
