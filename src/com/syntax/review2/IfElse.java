package com.syntax.review2;

public class IfElse {
    public static void main(String[] args) {
        /* if statement
        if(boolean condition){
        codeA;
        }else{
        codeB
        }
         */
        int num=12;
                if (num>100){
                    System.out.println(num+"is greater than a 100");
                }else {
                    System.out.println(num+"is less than a 100");
                }
                String button="Enroll Today";
                if (button.equals("Enroll Today")){
                    System.out.println("Test case pass");
                }else {
                    System.out.println("Test case failed");
                }
    }
}
