/******************************************************************************
 * 
 * Online Java Compiler.
 * Code, Compile, Run and Debug java program online.
 * Write your code in this editor and press "Run" button to execute it.
 * 
 *******************************************************************************/

abstract class Vehicle {
    abstract void drive();

    abstract void steeringMechanism();

    void start() {
        System.out.println("Vehicle Started");
    }

    void stop() {
        System.out.println("Vehicle Stopped");
    }
}

class Bike extends Vehicle {
    void drive() {
        System.out.println("Vehicle I drive is a bike");
    }

    void steeringMechanism() {
        System.out.println("Hub-Centre steering mechanism is used in vehicles like  bike");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Vehicle I drive is a car");
    }

    void steeringMechanism() {
        System.out.println("Pinion steering mechanism is used in vehicles like car");
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        car.drive();
        car.steeringMechanism();
        car.start();
        car.stop();
        bike.drive();
        bike.steeringMechanism();
        bike.start();
        bike.stop();
    }
}