package com.syntax.review4;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int a=1;
        while (a>=3){
            System.out.println("I am while loop");
            a++;
        }
       int b=1;
        do {
            System.out.println("do while");
            b++;
        }while (b>=3);
        //Ask students if they understand loops
        //if they do not --> tell them to practice more loops
        //if they understand--> you good move to arrey concept
        Scanner scan=new Scanner(System.in);
        String answer;
        do {
            System.out.println("Do you undertand loops in Java");
             answer = scan.next();
        }while (!answer.equalsIgnoreCase("yes"));
        System.out.println("Great jobs,lets learn arrays now");
        }
    }

