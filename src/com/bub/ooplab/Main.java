package com.bub.ooplab;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    System.out.println("------Casting-------");
    int myInt = 5;
    float myFloat = myInt; // Widening
    System.out.println("myInt value: " + myInt);
    System.out.println("myFloat value: " + myFloat);
    float newFloat = 5.5f;
    int newInt = (int) newFloat; // Narrowing
    System.out.println("newFloat value: " + newFloat);
    System.out.println("newInt value: " + newInt);

    int otherInt = 130;
    byte myByte = (byte) otherInt; // Overflow
    System.out.println("otherInt value: " + otherInt);
    System.out.println("myByte value: " + myByte);

    System.out.println("------Casting Class-------");
    Employee dang = new Employee("Dang", "Red", 30, 10000, "V");
    Employee ceo = new CEO("Captain", "Marvel", 30, 30000, "Striker");
    Programmer prog = new Programmer("Captain", "Marvel", 38, 20000, "Fullstack");
    CEO ceo2 = (CEO) ceo;
    // CEO ceo3 = new Employee("Captain", "Marvel", 30000); // Error
    // CEO ceo4 = (CEO) dang; // Error
    ArrayList<Employee> myList = new ArrayList<>();
    myList.add(ceo2);
    myList.add(dang);
    myList.add(prog);
    CEO ceo3 = (CEO) myList.get(0);
    Employee dang2 = myList.get(1);
    Programmer prog2 = (Programmer) myList.get(2);
    ceo3.hello("A"); // Hi, nice to meet you. Captain!
    prog2.hello("B"); // Hello Captain

    System.out.println("------Casting Interface-------");
    CEO ceo1 = new CEO("Captain", "Marvel", 30, 30000, "Striker");
    IWebsiteCreator dang1 = (IWebsiteCreator) new Programmer("Dang", "Red", 30, 10000, "V");
    Programmer dang21 = (Programmer) dang1;
    AI alphaGo = new AI("alphaGo", "Java");
    IWebsiteCreator alphaGo2 = alphaGo;
    ceo1.orderWebsite(dang1);
    ceo1.orderWebsite(dang21);
    ceo1.orderWebsite(alphaGo);
    ceo1.orderWebsite(alphaGo2);

  }

}
