package oop_concepts;

public class FunctionsInJava {
    public static void main(String[] args){

        FunctionsInJava obj = new FunctionsInJava();
        obj.test();
        obj.pqr();
        obj.qa();
        String s1 = obj.qa();
        System.out.println(s1);//will return Selenium
        obj.division(30,10);
        int l = obj.pqr();
        System.out.println(l);//will return 30

        int div = obj.division(25,5);
        System.out.println(div);//will return 5
    }
    //non static methods
    public void test(){//void means it does not return any value
        System.out.println("test method");
    }
    public int pqr(){
        int a = 10;
        int b = 20;
        int c = a+b;

        return c;
    }
    public String qa(){
        System.out.println("qa method");
        String s = "Selenium";

        return s;
    }
    public int division(int x, int y) {
        System.out.println("division method");
        int d = x / y;

        return d;
    }

}
