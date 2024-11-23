package com.file.uploader.java8.features;

@FunctionalInterface
public interface Product {

  public   String getName(String name);

  static double calculateSalesTax(double price) {
    double taxRate = 0.08; // Example: 8% sales tax rate
    return price * taxRate;
  }

  default double getDiscountedPrice() {
    double discount = 0.10; // default 10% discount
    return  (1 - discount);
  }

}
