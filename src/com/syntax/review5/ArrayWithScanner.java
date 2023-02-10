package com.syntax.review5;

import java.util.Scanner;

public class ArrayWithScanner {
    public static void main(String[] args) {
        //let's create an array of names using Scanner
        Scanner scan=new Scanner(System.in);
        System.out.println("How many names you want to store");
        int size=scan.nextInt();
        String[] name=new String[size];
        //This loop stores elements inside the array
        //regular for loop work with indexes
        for (int i=0;i< name.length;i++){
            System.out.println("Please enter name");
            name[i]= scan.next();
        }
        //using loop below we can retrieve element
        //enhanced for loop work with variable
        for (String n:name){
            System.out.println(n);
        }
    }
}
