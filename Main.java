public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin("Admin", "admin01", "password");
        Customer customer = new Customer("John Doe", "cust01", "pass123");
        Vendor vendor = new Vendor("Pizza Place", "vend01", "vendorpass");
        Delivery runner = new Delivery("Mike", "run01", "runnerpass");

        admin.login();
        admin.registerCustomer(customer);
        admin.registerVendor(vendor);

        vendor.addMenu(new Menu("001", "Pepperoni Pizza", 15.0));

        customer.login();
        customer.getWallet().topUp(50.0);
        customer.placeOrder(new Menu("001", "Pepperoni Pizza", 15.0), "Delivery", 5.0);

        runner.login();
    }
}