package com.shoprite.shoprite;

public class Product{
private String name;
private String expiringDate;
private String manufacturingDate;
private String description;
private double price;
private double weight;
private double height;
private double length;
private long barCode;
public Product() {}

public Product(String name, int barcode, double price, String desc) {
	this.name = name;
	this.barCode = barcode;
	this.price = price;
	this.description = desc;
}

public void setName(String name){
this.name=name;
}
public String getName(){
return name;
}
public void setExpiringDate(String expiringDate){
this.expiringDate=expiringDate;
}
public String getExpiringDate(){
return expiringDate;
}
public void setManufacturingDate(String manufacturingDate){
this.manufacturingDate=manufacturingDate;
} 
public String getManufacturingDate(){
return manufacturingDate;
}
public void setDescription(String description){
this.description=description;
}
public String getDescription(){
return description;
}
public void setPrice(double price){
this.price=price;
}
public double getPrice(){
return price;
}
public void setWeight(double weight){
this.weight=weight;
}
public double getWeight(){
return weight;
}
public void setHeight(double height){
this.height=height;
}
public double getHeight(){
return height;
}
public void setLength(double length){
this.length=length;
}
public double getLength(){
return length;
}
public void setBarCode(long barCode){
this.barCode=barCode;
}
public long getBarCode(){
return barCode;
}
        public void addProduct(String name, String expiringDate, String manufacturingDate, String description, double price, double weight, double height, double length, long barCode){
this.setName(name);
this.setExpiringDate(expiringDate);
this.setManufacturingDate(manufacturingDate);
this.setDescription(description);
this.setPrice(price);
this.setWeight(weight);
this.setHeight(height);
this.setLength(length);
this.setBarCode(barCode);
   }
        public String toString(){
            return "name " + getName() + "\nexpiring date " + getExpiringDate() +"\nManufacturing Date "+getManufacturingDate() + "\ndescription " + getDescription() + "\nprice " + getPrice() + "\n weight " + getWeight() + "\n Height " + getHeight() + "\nLength " + getLength() + "\nBar Code " + getBarCode();
}

}