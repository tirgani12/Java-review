package com.syntax.review5;

public class TwoDArrayReview {
    public static void main(String[] args) {


    int[][] array={
            {1,2,3},
            {11,12,13},
            {20,21,22}
    };
    //getting all value from 2D array using regular for loop
        for (int row=0; row< array.length;row++){//outer loops iterates over rows
            for (int col=0;col<array[row].length;col++){// iterates over each column
                System.out.println(array[row][col]);

            }

        }
    //getting all values from 2D array
        for (int[] arr:array){//iterates over arrays
            for (int num:arr){//iterates over each element
                System.out.print(num);

            }
            System.out.println();

        }
    int numberOfArrays=array.length;
        System.out.println(numberOfArrays);

}
}