package com.shoprite.person;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.shoprite.payment.Payment;
import com.shoprite.shoprite.Product;

public class Employee extends Person {
private String position;
private double salary;
private String username;
private int password;
public Employee() {}

public void setPosition(String position){
this.position = position;
}
public String getPosition(){
return position;
}
public void setSalary(double salary) {
this.salary = salary;
}
public double getSalary(){
return salary;
}
public void setUsername(String username){
this.username = username;
}
public String getUsername(){
return username;
}
public void setPassword(int password){
this.password = password;
}
public int getPassword(){
return password;
}

        public void register(String surName, String lastName, String dateOfBirth, String emailAddress, String race, String gander, String nationality, String idNumber, String position, double salary, String username, int password){
            this.setSurName(surName);
            this.setLastName(lastName);
            this.setDateOfBirth(dateOfBirth);
this.setEmailAddress(emailAddress);
this.setRace(race);
this.setGander(gander);
this.setNationality(nationality);
this.setIdNumber(idNumber);
this.setPosition(position);
this.setSalary(salary);
this.setUsername(username);
this.setPassword(password);
        }
        /*public void login(ArrayList<Employee> emps, String uname, int pword){
            for(int i = 0; i < emps.size(); i++){
            if(emps.get(i).getUsername().equals(uname) && emps.get(i).getPassword() == pword){
            System.out.println("Welcome " + emps.get(i).getSurName() + emps.get(i).getLastName());
            }else{
            System.out.println("incorrect login details");
            }
            }
        }*/
        
        public Product sellProduct(List<Product>products, long barcode) {
        	
        	Product soldProduct = null;
        	
        	for(Product p : products) {
        		if(barcode == p.getBarCode()) {
        			soldProduct = p;
        		}
        	}
        	
        	return soldProduct;
        	
        }
        
        public Payment payment(List<Product>productSold, Payment payment) {
        	
        	for(Product p: productSold) {
        		double totalPrice = payment.getAmount() + p.getPrice();
        		payment.setAmount(totalPrice);
        	}
        	payment.setDate(LocalDateTime.now());
        	
        	return payment;
        	
        }
        
        public String toString() {
            return "\nSurname : " + getSurName() + "\nlast name : "+ getLastName() + "\ndate of birth : " + getDateOfBirth() + "\nemail address " + getEmailAddress() + "\nrace "+getRace() + "\ngander " + getGander() + "\nnationality " + getNationality() + "\nid number " + getIdNumber() + "\nposition " + getPosition() + "\nsalary " + getSalary() + "\nuser name " + getUsername() + "\npassword " + getPassword();
}
}