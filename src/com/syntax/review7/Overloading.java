package com.syntax.review7;

public class Overloading {
    private void hello(){
        System.out.println("hello");
    }
    private void hello(String name){
        System.out.println("hello"+name);
    }
    static void bye(String name){
        System.out.println("bye"+name);

    }
}
