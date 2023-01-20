package com.syntax.review2;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        int i =10;

        //non prim variable =scanner
      Scanner keyboard= new Scanner(System.in);
        System.out.println("please enter your age");
      int age=keyboard.nextInt(); //to capture int value
        System.out.println("are you tired");

        boolean tired= keyboard.nextBoolean();//to capture boolean values
        System.out.println("what is your name");
        String name=keyboard.next();//to capture string until space


    }
}
