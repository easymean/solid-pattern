package i.solution;

public class Plane implements Flyable, Drivable {

    @Override
    public void fly() {
        System.out.println("Plane flies");
    }

    @Override
    public void drive() {
        System.out.println("Plane drives");
    }
}
