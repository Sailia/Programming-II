public class Stuff {
    private int m;
    private double n;

    public Stuff() {
        this.m = 10;
        this.n = 1.5;
        System.out.println(this.m * this.n + 1);
    }

    public Stuff(int mm, double s) {
        this.m = mm;
        this.n = s;
        System.out.println("Stuff " + this.m + this.n);
        display();
    }

    public void display() {
        System.out.println("I take no arguments! " + this.m);
    }

    public void display(double x) {
        System.out.println("display(): ");
        display();
        System.out.println((x + this.m) * this.n);
    }

    public void display(double x, int y) {
        System.out.println("display(double x): ");
        display(2 * x);
        System.out.println((x + y) * this.n + this.m);
    }
}