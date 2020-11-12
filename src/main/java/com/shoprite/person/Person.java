package com.shoprite.person;

public class Person{
private String surName;
private String lastName;
private String dateOfBirth;
private String emailAddress;
private String race;
private String gander;
private String nationality;
private String idNumber;
public Person() {}


public void setSurName(String surName){
this.surName = surName;
}
public String getSurName(){
return surName;
}
public void setLastName(String lastName){
this.lastName = lastName;
}
public String getLastName() {
return lastName;
}
public void setDateOfBirth(String dateOfBirth){
this.dateOfBirth = dateOfBirth;
}
public String getDateOfBirth(){
return dateOfBirth;
}
public void setEmailAddress(String emailAddress){
this.emailAddress = emailAddress;
}
public String getEmailAddress(){
return emailAddress;
}
public void setRace(String race){
this.race = race;
}
public String getRace(){
return race;
}
public void setNationality(String nationality){
this.nationality = nationality;
}
public String getNationality() {
return nationality;
}
public void setGander(String gander) {
this.gander = gander;
}
public String getGander () {
return gander;
}
public void setIdNumber(String idNumber){
this.idNumber = idNumber;
}
public String getIdNumber() {
return idNumber;
}


@Override
public String toString() {
	return "Person [surName=" + surName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", emailAddress="
			+ emailAddress + ", race=" + race + ", gander=" + gander + ", nationality=" + nationality + ", idNumber="
			+ idNumber + "]";
}




}