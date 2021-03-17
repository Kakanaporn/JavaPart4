package com.bub.product;

public class Product {
  public String price;
  public String title;
  public String urlImage;
  public String soldText;

  public ProductStatus.Status productStatus;
  public ProductStatus.PriceStatus pricetStatus;

  public Product(String price, String title, String urlImage, String soldText) {
    this.price = price;
    this.title = title;
    this.urlImage = urlImage;
    this.soldText = soldText;
  }

  public static void main(String[] args) {
    Product x = new Product("1000", "phone", "", "");
    x.productStatus = ProductStatus.Status.DRAFT;
    x.pricetStatus = ProductStatus.PriceStatus.DEAL;

    ProductStatus.PriceStatus myStatus = x.pricetStatus;
    switch (myStatus) {
      case DISCOUNT:
        System.out.println("50% Discount!!");
        break;
      case DEAL:
        System.out.println("15% Discount!!");
        break;
      case NORMAL:
        System.out.println("No");
        break;
    }
  }


}

