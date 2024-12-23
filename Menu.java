public class Menu {
    private String menuID;
    private String details;
    private double price;

    public Menu(String menuID, String details, double price) {
        this.menuID = menuID;
        this.details = details;
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public double getPrice() {
        return price;
    }
}
