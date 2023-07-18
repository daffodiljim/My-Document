public class Car extends Vehicle {

    public void move() {
        System.out.println("*   CARS MOVES fASTER     *");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.carry();
        c1.move();
    }
}
