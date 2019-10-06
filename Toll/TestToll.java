public class TestToll {
    public static void main(String[] args) {
        Toll truck1 = new Toll(5, 13000);
        truck1.calculateToll();
        truck1.displayReceipt();

        Toll truck2 = new Toll(6, 9800);
        truck2.calculateToll();
        truck2.displayReceipt();
    }
}