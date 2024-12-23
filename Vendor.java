import java.util.ArrayList;
import java.util.List;

public class Vendor extends User {
    private List<Menu> menus = new ArrayList<>();

    public Vendor(String name, String userID, String password) {
        super(name, userID, password);
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
        System.out.println("Menu added: " + menu.getDetails());
    }

    public void acceptOrder(Order order) {
        System.out.println("Order accepted: " + order.getMenu().getDetails());
    }

    public void declineOrder(Order order, Customer customer) {
        customer.getWallet().topUp(order.getTotalAmount());
        System.out.println("Order declined. Refund issued.");
    }

    @Override
    public void login() {
        System.out.println("Vendor logged in.");
    }
}
