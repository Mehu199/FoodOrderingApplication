public class Order {
    private Menu menu;
    private String orderType;
    private double deliveryFee;

    public Order(Menu menu, String orderType, double deliveryFee) {
        this.menu = menu;
        this.orderType = orderType;
        this.deliveryFee = deliveryFee;
    }

    public Menu getMenu() {
        return menu;
    }

    public double getTotalAmount() {
        return menu.getPrice() + deliveryFee;
    }
}
