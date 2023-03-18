package com.syntax.review7;

public class Methods {
    //user defined:with return type and without
    //wit parameters and without
    void hell0(){
        System.out.println("Hello");
    }
    void sayHello(String name){
        System.out.println("Hello"+name);
    }
    // create a method that returns the largest number between given 2 integer values
    int findLargest(int num1,int num2){
        if (num1>num2){
            return num1;
        }else {
            return num2;
        }
    }
    double findAverage(double num1,double num2){
        return (num1+num2)/2;
    }
    //returns revers String from a given String
    String reverse(String str){
        StringBuilder obj=new StringBuilder(str);
       return obj.reverse().toString();
    }
    //crate a method that return a min value from given array
    static int minValue(int[] array){
        int min=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]<i){
                min=array[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
        String name="Mohammed";
        int characters=name.length();
        Methods obj=new Methods();
        obj.sayHello(name);
        System.out.println("--------***----------------");
        int largest=obj.findLargest(300,456);
        System.out.println("The largest number is "+largest);
        double average=obj.findAverage(6,5);
        System.out.println(average);
        StringBuilder reverse= new StringBuilder(obj.reverse("hello"));
        System.out.println(reverse);
        int[]array={10,20,30};
        Methods.minValue(array);
        int minimum= obj.minValue(array);
        System.out.println(minimum);


    }
}
