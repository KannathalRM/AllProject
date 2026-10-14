package org.programfive;

import java.util.Scanner;

public class loop {
//FizzBuzz
	Scanner s=new Scanner(System.in);
//	private void fizz() {
//		System.out.println("Enter a number");
//		int n=s.nextInt();
//		if(n%3==0 && n%5==0)
//		{
//			System.out.println("FizzBuzz");
//		}
//		else if(n%3==0)
//			{
//				System.out.println("Fizz");
//			}
//			else if(n%5==0)
//			{System.out.println("Buzz");
//			}
//			else
//				System.out.println("Number is not a fizz/buzz/FizzBuzz");
//		
//	}
	
//	Prime number
//	private void prime() {
//		System.out.println("Enter a number");
//		int num=s.nextInt();
//		if(num>=1) {
//			int count=0;
//		for(int i=1;i<=num;i++)
//		{
//			if(num%i==0)
//			{
//				count=count+1;
//			}
//			}
//		if(count==2)
//		{
//			System.out.println("Number is prime");
//		}
//		else
//			System.out.println("Number is not a prime");
//		}
//		
//	}
//	Factorial number
//	private void fact() {
//		System.out.println("Enter a number");
//		int num=s.nextInt();
//		int ans=1;
//		for(int i=num;i>=1;i--)
//		{
//			ans=ans*i;
//		}
//		System.out.println("Factorial number is : "+ans);
//		}
//	
//	Palindrome
//	private void fact() {
//		System.out.println("Enter a word");
//		String sentance=s.next();
//		int length= sentance.length();
//		int a=length/2;
//		int cou=0;
//		for(int j=0;j<a;j++)
//		{
//			char b=sentance.charAt(j);
//			b=Character.toLowerCase(b);
//			for(int k=length-1;k>a;k--)
//			{
//				char c=sentance.charAt(k);
//				c=Character.toLowerCase(c);
//				if(b==c)
//				{cou=cou+1;
//			}
//			
//		}
//		}
//		if(cou==a)
//		{
//		System.out.println("Word is palindrome");
//	}
//		else
//			System.out.println("Word is not a palindrome");
//			}
	private void palin() {
		System.out.println("Enter a number");
		int num1=s.nextInt();
		int ans=1;
		for(int i=1;i<=12;i++)
		{
			ans=num1*i;
			System.out.println(num1 +"*" +i +"=" +ans);
		}
		}
	
	public static void main(String[] args) {
		loop l=new loop();
//		l.fizz();
//	l.prime();
//		l.fact();
		l.palin();
	}
}
