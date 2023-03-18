package com.syntax.review7;

public class Car {
    String make, model;
    int year, horsePower;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(String make, String model, int year, int horsePower) {
        this(make, model);
        this.year = year;
        this.horsePower = horsePower;
    }

    public void start() {
        System.out.println(make + " starts");
    }

    public void drive(int speed) {
        System.out.println(make + " drives with speed " + speed);
    }
    //same class have 2 or more methods with same name=Method Overloading
    /*
    how to implement?
    1.by using different number of the parameters
    2.by using different type of the parameters
    3,sequence
     */

    void drive(String destination) {
        System.out.println(make + " drives to " + destination);
    }

    void drive(int speed, String destination) {
        System.out.println(make + " drive to " + destination + " with speed= " + speed);

    }

    void drive(String destination, int speed) {
        System.out.println(make + " drive to " + destination + " with speed= " + speed);
    }
    //am i overloading
    /*
    private void drive(int wheel){} -no
    by changing access modifiers we are not overloading
    String drive(String destination){-no
    return destination
    }
    we cannot overload methods by changing it is return type
    in overloading methods signature must be different
    method signature involves name and parameters only!!!
    in overloading we do not ca
     */
}