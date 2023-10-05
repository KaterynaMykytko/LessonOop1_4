package org.courses.ex4;

public class Main {

    public static void main(String[] args) {

        Computer [] computers = new Computer[5];

        computers[0] = new Computer(16);
        computers[1] = new Computer(32);
        computers[2] = new Computer(64);
        computers[3] = new Computer(128);
        computers[4] = new Computer(256);

       for (Computer computer : computers){
            System.out.println(computer.getMemorySize());
       }
    }
}
