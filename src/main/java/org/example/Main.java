package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(5);
        System.out.println("THE ROLL OF THE DICE IS: " + x);
        if(x == 0) {
            System.out.println("Hello world'");
        } else if (x == 1) {
            System.out.println("YOU WILL WORK WITH 'create gameAd CRUD operations'");
        } else if (x == 2) {
            System.out.println("YOU WILL WORK WITH 'create order CRUD operations'");
        } else if (x == 3) {
            System.out.println("Trolololo!");
        } else if (x == 4) {
            System.out.println("YOU WILL WORK WITH 'SECURITY'");
        }
    }
}