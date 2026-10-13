package org.programfive;

import java.util.Scanner;

//BMI calculator
public class prog {
float weightInKg =22.0f;
float heightInMssq=0.85f;
float bmi;
Scanner s=new Scanner(System.in);
private void bmiCalculator() {
	bmi=weightInKg/heightInMssq;
	System.out.println("Your BMI is:"+bmi);

}
//Temperature converter
//Fahrenheit to Celsius
private void temcon() {
	System.out.println("Enter temperature in farenheit");
	float farenheit=s.nextFloat();
	float cel=(float) ((farenheit-32)*(5.0/9.0));
	System.out.println("Celcius= :" +cel);

}
//Celsius to Fahrenheit
private void temfahren() {
	System.out.println("Enter temperature in celcius");
	float cel=s.nextFloat();
	double frenheit= (cel*(9.0/5/0))+32;
	System.out.println("Farenheit= :" +frenheit);
}
//Simple interest
private void interest() {
	System.out.println("Enter principal amount in float");
	float principal=s.nextFloat();
	System.out.println("Enter rate of interest in float");
	float rate=s.nextFloat();
	System.out.println("Enter time in years in float");
	float Time=s.nextFloat();
	double Simpleinterest=principal*(rate/100)*Time;
	System.out.println("Simple Interest = "+Simpleinterest);
}
//Age in Days
private void ageInDays() {
	double ageInYears, ageInDays;
	System.out.println("Enter your age in years in float");
	ageInYears=s.nextFloat();
	ageInDays=ageInYears*365.25;
	System.out.println("Your age in days is : "+ageInDays);
	
}
//Tip splitter
private void tip() {
	float AmountPerPerson, BillAmount, TipPercentage, NumberofPeople; 
	BillAmount=589.0f;
	NumberofPeople=4.0f;
	TipPercentage=15.0f;
	AmountPerPerson=(BillAmount+(BillAmount*(TipPercentage/100)))/NumberofPeople;
	System.out.println("Amount per person = " +AmountPerPerson);
}

public static void main(String[] args) {
	prog p=new prog();
	p.bmiCalculator();
	p.temcon();
	p.temfahren();
	p.interest();
	p.ageInDays();
	p.tip();
	
}



}
