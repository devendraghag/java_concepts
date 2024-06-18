package Coupling.TightCoupling;

class Engine {
    public void start() {
        System.out.println("Engine started.");
    }
}

class Car {
    private Engine engine;

    public Car() {
        engine = new Engine();  // Tight coupling
    }

    public void start() {
        engine.start();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
