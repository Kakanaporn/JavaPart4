package com.bub.product;

public abstract class AbstactProductFrontPage {
  private String title = "";
  private String description = "";

  public abstract String getTiTle();

  public abstract String getPrice();

  public abstract String getUrlImage();

  public abstract String getSoldText();

  public void printTilte() {
    System.out.println(this.title);
  }

  public void printDescription() {
    System.out.println(this.description);
  }

}
