public class Toll {
    private int axles, weight;
    private double fee;

    Toll(int axles, int weight) {
        this.axles = axles;
        this.weight = weight;
    }

    public void calculateToll() {
        this.fee = this.axles * 5;
        this.fee += this.weight/500 * 10;
    }

    public void displayReceipt() {
        System.out.println("Axles: " + this.axles);
        System.out.println("Weight: " + this.weight);
        System.out.println("Toll paid: " + this.fee);
    }

}