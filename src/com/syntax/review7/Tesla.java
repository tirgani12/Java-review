package com.syntax.review7;

import java.util.StringTokenizer;

public class Tesla extends Car{
    String type;
    boolean autoPilot;
    Tesla(String make,String model,int year,int horsePower,String type,boolean autoPilot){
        super(make,model,year,horsePower);
        this.type=type;
        this.autoPilot=autoPilot;
    }
    protected  void haveAutopilot(){
        System.out.println(make+" have auto pilot"+autoPilot);
    }
    public void start(){

    }
    //overriding-is when we have same method name in 2 different class (parent-child)
    //in overriding -inheritance is a must
    //in overriding method signature should be same
    // In overloading we do not care about return type (can be changed)
    //                    or access modifiers (can be different)
}
