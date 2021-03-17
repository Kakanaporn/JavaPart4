package com.bub.ooplab;

public class CEO extends Employee {

  public CEO(String firstnameInput, String lastnameIput, int ageInput, int salaryInput,
      String positionInput) {
    super(firstnameInput, lastnameIput, ageInput, salaryInput, positionInput);
    // TODO Auto-generated constructor stub
  }

  @Override
  public int getSalary() {
    // TODO Auto-generated method stub
    return super.getSalary() * 2;
  }

  @Override
  public String fullName() {
    // TODO Auto-generated method stub
    return super.fullName();
  }

  @Override
  public void hello(String firstname) {
    // TODO Auto-generated method stub
    super.hello(firstname);
  }

  public void fire(Employee employee) {
    System.out.println(employee.firstname + "has been fired!");
  }

  public void orderWebsite(IWebsiteCreator creator) {
    creator.createWebsite("some template", "Codecamp Codecamp3");
  }



}
