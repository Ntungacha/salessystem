package com.shoprite.app;

import com.shoprite.person.Employee;
import com.shoprite.person.Person;
import com.shoprite.person.Supplier;
import com.shoprite.shoprite.Store;
import com.shoprite.shoprite.Product;
import com.shoprite.payment.Payment;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test{
public static void main(String[] args){
ArrayList<Employee> emps = new ArrayList<>();
List<Product> prods = Arrays.asList(
		new Product("Bread",00001,12,"breakfast"),
		new Product("kenny sugar",00002,10,"adsf"),
		new Product("Corn Flakes",00003,40,"wheat"),
		new Product("Milk",00004,20,"dairy")				
		);
List <Product> soldProducts = new ArrayList<>();
Employee emp = null;
Payment pay = null;
Supplier sup = null;
Store store = null;
Product prod = null;
Scanner scan = new Scanner(System.in);

for(int i = 1; i < 100; i++){
    int option = 0;
    for(;;){
    scan.nextLine();
    try{
    System.out.println("\n WELCOME TO SHOPRITE ");
    System.out.println("Enter 0: To Exit");
    System.out.println("Enter 1: To Register Employee");
    System.out.println("Enter 2: To Login");
    option = scan.nextInt();
    break;
    }catch(Exception ex){
    System.out.println("Please enter an option below");
    }
    }
if(option == 0){
i = 1000;
}
else if(option == 1){
emp = new Employee();
System.out.println("\t\t\tREGISTER");
scan.nextLine();
System.out.print("Enter sur name :");
String surName = scan.nextLine();
System.out.print("Enter last name:");
String lastName = scan.nextLine();
System.out.print("Enter email Address ");
String emailAddress = scan.nextLine();
System.out.print("Enter date of birth");
String dateOfBirth =scan.nextLine();
System.out.print("Enter nationality");
String nationality = scan.nextLine();
System.out.print("Enter id number ");
String idNumber = scan.nextLine();
System.out.print("Enter salary ");
double salary = scan.nextDouble();
System.out.print("Enter gander ");
String gander = scan.nextLine();
System.out.print("Enter race ");
String race = scan.nextLine();
System.out.print("Enter position ");
String position = scan.nextLine();
System.out.print("Enter user name ");
String username = scan.nextLine();
 int password = 0;
                        for(;;) {
                        scan.nextLine();
                        try{
                        System.out.print("Enter password: ");
                        password = scan.nextInt();
                        break;
                        }catch(Exception ex){
                        System.out.println("Please enter password.");
                        }
                        }
emp.register(surName, lastName, dateOfBirth, emailAddress, race, gander, nationality, idNumber, position, salary, username, password);
emps.add(emp);
System.out.println(emp);
}//end of register employee.
else if(option == 2){
System.out.println("\t\tLOGIN");
scan.nextLine();
System.out.print("Enter user name ");
String uname = scan.nextLine();
 int pword = 0;
                        for(;;) {
                        scan.nextLine();
                        try{
                        System.out.print("Enter password: ");
                        pword = scan.nextInt();
                        break;
                        }catch(Exception ex){
                        System.out.println("Please enter password.");
                        }
                        }
for(int b = 0; b < emps.size(); b++){
	if(emps.get(b).getUsername().equals(uname) && emps.get(b).getPassword() == pword && emps.get(b).getPosition().equalsIgnoreCase("admin")) {
		for(int r = 0; r < 10; r++) {
			int log = 0;
			for(;;) {
				scan.nextLine();
				try {
					System.out.println("Choose 1: to add product");
					System.out.println("choose 2: to void product");
					System.out.println("choose 0: to exit");
					log = scan.nextInt();
					break;
				}catch(Exception ex) {
					System.out.println("choose an option from the list below");
				}//end of catch
			}//end of loop for try and catch
			if(log == 0) {
				r=100;
			}
			else if(log == 1) {
				 prod = new Product();
				    System.out.println("\t\t\t ADD PRODUCT ");
				    scan.nextLine();
				    System.out.print("Enter product name:");
				    String name = scan.nextLine();
				    System.out.print("Enter expiring date of the product:");
				    String expiringDate = scan.nextLine();
				    System.out.print("Enter manufacturingDate:");
				    String manufacturingDate = scan.nextLine();
				    System.out.print("Enter product description:");
				    String description = scan.nextLine();
				    double price = 0;
				     for(;;) {
				     scan.nextLine();
				     try{
				     System.out.print("Enter price: ");
				     price = scan.nextDouble();
				     break;
				     }catch(Exception ex){
				     System.out.println("enter price : ");
				             }
				             }
				    double weight = 0;
				         for(;;) {
				         scan.nextLine();
				         try{
				         System.out.print("Enter weight: ");
				         weight = scan.nextDouble();
				         break;
				         }catch(Exception ex){
				         System.out.println("enter weight : ");
				             }
				             }
				    double height = 0;
				         for(;;) {
				         scan.nextLine();
				         try{
				         System.out.print("Enter height: ");
				         height = scan.nextDouble();
				         break;
				         }catch(Exception ex){
				         System.out.println("enter height : ");
				             }
				             }
				    double length = 0;
				         for(;;) {
				         scan.nextLine();
				         try{
				         System.out.print("Enter length: ");
				         length = scan.nextDouble();
				         break;
				         }catch(Exception ex){
				         System.out.println("enter length : ");
				             }
				             }
				    long barCode = 0;
				         for(;;) {
				         scan.nextLine();
				         try{
				         System.out.print("Enter barCode: ");
				         barCode = scan.nextLong();
				         break;
				         }catch(Exception ex){
				         System.out.println("enter barCode : ");
				             } 
				             }
				    prod.addProduct(name, expiringDate, manufacturingDate, description, price, weight, height, length, barCode);
				    prods.add(prod);
				System.out.println(prod);
			}//end of add product
			else if(log == 2) {
				System.out.println("/t/tVOID PRODUCT");
			}
		}//end of for loop r
	}//end of amdin login
	else if(emps.get(b).getUsername().equals(uname) && emps.get(b).getPassword() == pword){
            System.out.println("Welcome " + emps.get(b).getSurName() + emps.get(b).getLastName());
        for(int q = 0; q < 10; q++){
            int choose = 0;
            for(;;){
            scan.nextLine();
            try{
            System.out.println("choose 1: to sale product");
            System.out.println("choose 2: to check available product");
            System.out.println("choose 0: to exit");
            choose = scan.nextInt();
            break;            
            }catch(Exception ex){
            System.out.println("choose an option from the list below");
            }
            }
    if(choose == 0){
    q = 1000;
    }else if(choose == 1) {
    	System.out.println("\t\tSELL PRODUCT");
    	SELL :while(true) {
    	System.out.println("Press 1 to scan and 2 to proceed");
    	int scanOption = scan.nextInt();
    	if(scanOption == 1) {
    		System.out.println("Enter Barcode Number");
    		long barcode = scan.nextLong();
    		Product product= emp.sellProduct(prods, barcode);
    		soldProducts.add(product);
    	}else if(option == 2) {
    		pay = new Payment();	
    		pay = emp.payment(soldProducts, pay);
    		System.out.println("Total Price : " + pay.getAmount());
    		System.out.println("Enter Tender Amount");
    		double tender = scan.nextDouble();
    		pay.setChange(tender - pay.getAmount());
    		System.out.println("Product Name " + "\tPrice");
    		for(Product p: soldProducts) {
    			System.out.println(p.getName() + "\t" + "\t" +p.getPrice());
    		}
    		System.out.println("Gross Amount : " + pay.getAmount());
    		System.out.println("Tender Amount : " + tender);
    		System.out.println("Change : " + pay.getChange());
    		System.out.println("Date and Time : " + pay.getDate());
    		break SELL;
    	}//end of option 2
    	}//end of SELL loop
    }//end of choose 2
  }//inner loop q;
b=1000;
 }else{
  System.out.println("incorrect login details");
 }//end of else for login
}// end of loop b  
}//end of option 2;
}// main loop i;
}
}