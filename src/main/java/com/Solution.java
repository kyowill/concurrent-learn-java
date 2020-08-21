package com;
import java.util.*;
public class Solution {


    public static void main(String[] args) {
        System.out.println("hello");
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        System.out.println("sleep is interrupt");
                        //break;
                    }
                }

            }
        });
        t.start();
        t.interrupt();
    }
}
