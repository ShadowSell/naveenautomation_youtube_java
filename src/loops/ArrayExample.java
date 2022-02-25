package loops;

public class ArrayExample {
    public static void main(String[] args) {

        //array: to store similar data type values in a array variable
        //lowest bound = 0
        //highest bound = n-1(n is the size of array)
        int[] i = new int[4];
        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;
        System.out.println(i[2]);//will print 30

        System.out.println(i.length);//will print 4

        //to print all the values of array: for loop
        for(int j = 0; j < i.length; j++){
            System.out.println(i[j]);
        }
        //double array
        double[] d = new double[3];
        d[0] = 12.33;
        d[1] = 13.44;
        d[2] = 45.55;

        System.out.println(d[2]);//will print 45.55

        char[] c = new char[3];
        c[0] = 'q';
        c[1]= 2;
        c[2]= '$';

        //boolean array
        boolean[] b = new boolean[2];
        b[0] = true;
        b[1] = false;

        //5. String Array:
        String[] s = new String[3];
        s[0] = "test";
        s[1] = "Hello";
        s[2] = "World";

        System.out.println(s.length);//will print 3
    }

    }

