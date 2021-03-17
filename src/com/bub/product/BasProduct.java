package com.bub.product;

public class BasProduct extends AbstactProductFrontPage {
  final String quality = "Good";

  public static void main(String[] args) {
    BasProduct pro = new BasProduct();

  }

  public final String getX() {
    return "X";
  }

  @Override
  public String getTiTle() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getPrice() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getUrlImage() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getSoldText() {
    // TODO Auto-generated method stub
    return null;
  }

}
