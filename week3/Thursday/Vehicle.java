package week3.Thursday;

abstract class Vehicle {
    abstract void drive();

    abstract void steeringMechanism();

    void start() {
        System.out.println("Vehicle started");
    }

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Bike extends Vehicle {
    @Override
    void drive() {
        System.out.println("The bike has 6 gears and 2 wheels");
    }

    @Override
    void steeringMechanism() {
        System.out.println("The Bike has a handle which can turn left and right");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("The car has 5 gears and 4 wheels");
    }

    @Override
    void steeringMechanism() {
        System.out.println("The car has a steering wheel which can rotate left and right");
    }
}

class Drive {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        car.start();
        car.drive();
        car.steeringMechanism();
        car.stop();
        bike.start();
        bike.drive();
        bike.steeringMechanism();
        bike.stop();

    }
}