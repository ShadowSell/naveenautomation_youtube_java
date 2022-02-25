package loops;

public class TwoDArrays {
    public static void main(String[] args) {

//        String[][] x = new String[3][5];
//        x[0][0]= "Paper";
//        x[0][1]= "Pen";
//        x[0][2]= "Pencil";
//        x[0][3]= "Shark";
//        x[0][4]= "Fish";
//
//
//        System.out.println(x.length);

        Integer[][] intList = {{12,23,43,56,63},{15,29,65,43,56},{95,43,67,85,12}};
        System.out.println(intList[0][3]);//will print 56
        System.out.println(intList.length);//will print 3

        for(int row = 0; row< intList.length;row ++){
            for(int column = 0; column<intList[0].length;column++){
                System.out.println(intList[row][column]);
            }
        }




        }


        }



