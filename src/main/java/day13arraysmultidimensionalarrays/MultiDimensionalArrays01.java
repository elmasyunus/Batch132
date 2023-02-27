package day13arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {
    public static void main(String[] args) {

        //how to create multidimensional array

        int arr[][]= new int[4][2];

        System.out.println(Arrays.deepToString(arr)); //[[0,0], [0,0], [0,0], [0,0]]

        //How to add elements into multidimensional array

        arr[0][0]=3;
        arr[0][1]=10;

        System.out.println(Arrays.deepToString(arr)); //[[3,10], [61,5], [2,11], [81,23]]




    }
}
