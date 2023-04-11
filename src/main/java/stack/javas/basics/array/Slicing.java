package stack.javas.basics.array;

import java.util.Arrays;

public class Slicing {
    double[][] access={
            {3.4,9.1,5.6},{34.6,92.4,11.23},{6.3,2.4,7.7,1.6,6.6,5.2}
    };

    public double[] formFrom(int row, int count){
        if(row<access.length&&row>=0&&access[row].length>=count){
            double[] single=new double[count];
            for(int index=0;index<single.length;index++){
                single[index]=access[row][index];
            }
            return single;
        }
        return new double[0];
    }

    public static void main(String[] args) {
        Slicing slicing=new Slicing();
        double[] temp=slicing.formFrom(-1,2);
        System.out.println(Arrays.toString(temp));
    }
}
