package com.syntax.review2;

public class IfElseIf {
    public static void main(String[] args) {
        /* when we have more condition test
        if(boolean condition){
        codeA;
        }else if (boolean condition) {
        code B;
        }else if (boolean condition) {
        codeC;
        }

         */
        /*check homework
        if you completed more than 25 -> great job
        if you completed more than >20 -> good job
        if you completed more than 10-> ok job
        if you completd more than>5 -> not good job


         */
        int homework= 15;

        if (homework >25) {
            System.out.println("great job");
        }else if (homework>20) {
            System.out.println("good job");
        }else if (homework>10){
        System.out.println("ok job");
        }else if (homework> 5){
            System.out.println("not a good job");
        }
        System.out.println( "---------------------------");
        String browser="firefox";
        if (browser.equals("chrome")){
            System.out.println("Test case executed on chrome browser");

        } else if (browser.equals("safari")) {
            System.out.println("Test cases executed on safari browser");
        } else if (browser.equals("firefox")) {
            System.out.println("Test cases executed on firefox browser");


        }else {
            System.out.println("browser is not supported");
        }

    }

    }
