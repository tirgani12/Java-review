package com.syntax.review4;



public class ForLoop {
    public static void main(String[] args) {
// best loop-used when we know how msny times we want to repeat block of cot
        for (int i=2;i<=20;i+=5){
            //break and continue


                System.out.println(i);
                if (i==12){
                    System.out.println("i is equal to 12 -Iam breaking my loop");
                    break;//stop/break the loop
                }
            }
        //continue-skips current itreraire
        for (int i=0; i<=10;i++){
            if (i%3==0){
                System.out.println(i);
                continue;//java goes back to the beginning of the loop
                // and skips the restbof the code that is inside loop body

            }
            System.out.println("Hello");
        }
        }
    }

