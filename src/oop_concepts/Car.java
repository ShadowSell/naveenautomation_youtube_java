package oop_concepts;

public class Car {
    //global variables
    int mod;
    int wheel;

    public static void main(String[] args){
        Car a = new Car();
        Car b = new Car();
        Car c = new Car();

        a.mod= 2015;
        a.wheel= 4;
        b.mod = 2014;
        b.wheel = 4;
        c.mod =2013;
        c.wheel = 4;
        System.out.println("before assigning the references");

        System.out.println(a.mod);
        System.out.println(a.wheel);
        System.out.println(b.mod);
        System.out.println(b.wheel);
        System.out.println(c.mod);
        System.out.println(c.wheel);

        System.out.println("after shifting the references");

        a=b;
        b=c;
        c=a;
        a.mod= 10;
        System.out.println(a.mod);//output will be 10
        c.mod = 20;
        System.out.println(a.mod);//output will be 20
        System.out.println(c.mod);


    }

}
