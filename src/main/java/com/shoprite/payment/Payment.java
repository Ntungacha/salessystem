package com.shoprite.payment;

import java.time.LocalDateTime;

public class Payment{
private String type;
private String currency;
private LocalDateTime date;
private String reference;
private double amount;
private double change;
public Payment(){}

public void setType(String type){
this.type=type;
}
public String getType() {
return type;
}
public void setCurrency(String currency){
this.currency=currency;
}
public String getCurrency(){
return currency;
}
public void setDate(LocalDateTime date){
this.date=date;
}
public LocalDateTime getDate(){
return date;
}
public void setReference(String reference){
this.reference=reference;
}
public String getReference(){
return reference;
}
public void setAmount(double amount){
this.amount=amount;
}
public double getAmount(){
return amount;
}
public void setChange(double change){
this.change=change;
}
public double getChange(){
return change;
}



}