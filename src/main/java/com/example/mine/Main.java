package com.example.mine;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //functional interface with class
        Greeting greeting  = new HW();
        greeting.sayHW();

        ///////////////////////////////////////////////////////////////////
        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHW() {
                System.out.println("DIRETO NA CLASSE");
            }
        };
        greeting1.sayHW();

            Greeting greeting3 = () -> System.out.println("COM LAMBDA");
            greeting3.sayHW();

        //////////////////////////////////////////////////////////////////
        Calculator calculator = (int x, int y) -> {
            Random random = new Random() ;
            int randoNumber = random.nextInt(50);
            return x * y  + randoNumber;
            //return x * y;
        };
        System.out.println(calculator.calculate(5, 6));


    }
}
