package com.example.mine;

public class Main {

    public static void main(String[] args) {

        //functional interface with class

        Greeting greeting  = new HW();
        greeting.sayHW();

        // abaixo com


        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHW() {
                System.out.println("DIRETO NA CLASSE");
            }
        };

        greeting1.sayHW();

    }

}
