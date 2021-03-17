package com.bub.ooplab;

public class Programmer extends Employee implements IWebsiteCreator, IWindowsInstaller {

  public Programmer(String firstnameInput, String lastnameIput, int ageInput, int salaryInput,
      String positionInput) {
    super(firstnameInput, lastnameIput, ageInput, salaryInput, positionInput);
    // TODO Auto-generated constructor stub
  }

  public Programmer() {
    this("Anonymous", "Anonymous", 25, 9000, "Backend");
  }

  public void installWindows(String version, String productKey) {
    System.out.println("Windows ver. " + version + ", Key: " + productKey);
  }

  public void FixPC(String serialNumber) {
    System.out.println("I'm trying to fix PC serialNumber:" + serialNumber);
  }

  public void createWebsite(String template, String titleName) {
    System.out.println("Setup template: " + template);
    System.out.println("Set Title name: " + titleName);
  }

  @Override
  public void formatWindows(String drive) {
    // TODO Auto-generated method stub

  }

  @Override
  public int getLastInstalledWindowsVersion() {
    // TODO Auto-generated method stub
    return 0;
  }

}
