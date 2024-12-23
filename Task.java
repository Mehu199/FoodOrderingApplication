public class Task {
    private String details;
    private double fee;

    public Task(String details, double fee) {
        this.details = details;
        this.fee = fee;
    }

    public String getDetails() {
        return details;
    }

    public double getFee() {
        return fee;
    }
}
