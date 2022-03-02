package oop_concepts;

public class LocalVsGlobalVariable {

    String name = "Tom";
    int age = 25;

    public static void main(String[] args){

        int i = 10;//local variable
        System.out.println(i);//will print 10
        LocalVsGlobalVariable obj1 = new LocalVsGlobalVariable();
        System.out.println(obj1.age);
        System.out.println(obj1.name);

        LocalVsGlobalVariable obj3 = new LocalVsGlobalVariable();
        obj3.sum();

    }
    public void sum(){
        int i = 10;
        int j = 20;

        System.out.println(i+j);
    }
}
