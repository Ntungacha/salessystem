package com.shoprite.person;
import com.shoprite.shoprite.Product;

public class Supplier extends Person {
private String logo;
public Product product;
public Supplier() {}

public void setLogo(String logo) {
this.logo = logo;
}
public String getLogo(String logo){
return logo;
}
} 