package Coupling.LooseCoupling;

interface Engine {
    void start();
}

class GasEngine implements Engine {
    public void start() {
        System.out.println("Gas engine started.");
    }
}

class ElectricEngine implements Engine {
    public void start() {
        System.out.println("Electric engine started.");
    }
}

class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;  // Loose coupling
    }

    public void start() {
        engine.start();
    }

    public static void main(String[] args) {
        Engine gasEngine = new GasEngine();
       // gasEngine.start();
        Car carWithGasEngine = new Car(gasEngine);
        carWithGasEngine.start();

        Engine electricEngine = new ElectricEngine();
        Car carWithElectricEngine = new Car(electricEngine);
        carWithElectricEngine.start();
    }
}