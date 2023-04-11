package stack.javas.basics.array;

import java.util.Arrays;

public class Traverse {
    static int[][] hifi={
            {12,56,90},{8,30},{89,13,75,54,7,3}
    };

    public static void typical(){
        for(int row=0;row< hifi.length;row++){
            for(int column=0;column<hifi[row].length;column++){
                System.out.print(hifi[row][column]+" ");
            }
            System.out.println();
        }
    }

    public static void list(int row){
        if(row<hifi.length){
            for(int one:hifi[row]){
                System.out.print(one+" ");
            }
            System.out.println();
            row++;list(row);
        }
        else
            return;
    }

    public static void main(String[] args) {
//        for(int[] each:hifi){
//            System.out.println(Arrays.toString(each));
//        }
        //list(2);
        typical();
    }
}
