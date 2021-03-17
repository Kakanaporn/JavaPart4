package com.bub.ooplab;

public class Employee {
  public String firstname;
  public String lastname;
  public String position;
  public String fullname;
  private int age;
  private int salary;

  public static void main(String[] args) {
    Employee dang = new Employee("Dang", "Red", 25, 20000, "IT support");
    dang.work();
    System.out.println(dang.fullName());
    dang.checkPosition();
    dang.getAge();
    dang.getSalary();
  }

  public Employee(String firstnameInput, String lastnameIput, int ageInput, int salaryInput,
      String positionInput) {
    firstname = firstnameInput;
    lastname = lastnameIput;
    salary = salaryInput;
    age = ageInput;
    position = positionInput;
    fullname = firstname + " " + lastname;
    // declare variables
  }

  public void work() {
    System.out.println("My name is " + firstname);
  }

  public void hello(String firstname) {
    System.out.println("My name is " + this.firstname + "Hi, nice to meet you " + firstname);
  }

  public int getSalary() {
    return this.salary;
  }

  public int getAge() {
    System.out.println("My Age is " + age);
    return this.age;
  }

  public void checkPosition() {
    System.out.println("My Position: " + position);
  }

  public String fullName() {
    return this.fullname;
  }

}
