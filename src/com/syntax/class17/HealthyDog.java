package com.syntax.class17;

public class HealthyDog {
    //when the information is expected to be different from object to object
    //we store that information in an instance variable
    String name;//instance
    String color;//instance
    //if we know tht a value will stay same for all the objects of a class
    //we create a static variable for that why because
    static int numberOfLegs;//static
    void eat(){
        int noOfTimes=3; //local
        System.out.println(name+"eats"+noOfTimes);
    }

    public static void main(String[] args) {
        HealthyDog dog=new HealthyDog(); //local

        dog.name="scooby";
        dog.color="Pink";
        HealthyDog.numberOfLegs=4;
        dog.eat();

HealthyDog dog2=new HealthyDog();
        dog2.name="tomy";
        dog2.color="Navi blue";
        HealthyDog.numberOfLegs=4;
        dog2.eat();

    }
}
