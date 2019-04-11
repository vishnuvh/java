package com.lambda;

public class LambdaSample {

    public static void main(String[] args){

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        });
        t.start();

        Thread t1 = new Thread(()-> System.out.println("hello"));
        t1.start();
    }
}
