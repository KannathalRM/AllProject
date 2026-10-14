package org.programfive;

import java.util.Scanner;

public class funandmeth extends loop {
//Even or Odd number
//	public void even() {
//		System.out.println("Enter a number");
//		int n=s.nextInt();
//		if(n%2==0)
//		{
//			System.out.println("Number is even");
//		}
//		else
//			System.out.println("Number is odd");
//		
//	}
//	Greatest of 3 numbers
//	private void greatest() {
//		int a, b, c;
//		System.out.println("Enter number - a, b, c");
//		a=s.nextInt();
//		b=s.nextInt();
//		c=s.nextInt();
//		if(a>b && a>c)
//		{
//			System.out.println("A is greater");
//		}
//		else if(b>a && b>c)
//		{
//			System.out.println("B is greater");
//		}
//		else
//		{
//			System.out.println("C is greater");
//		}
//	}
//	Reverse
	private void reverse() {
		System.out.println("Enter a word");
		String word=s.next();
		int s=word.length();
		String letter=" ";
		for(int i=s-1;i>=0;i--)
		{
			char letter1 = word.charAt(i);
			letter=letter+letter1;
			
		}
		System.out.println(letter);
	}
	public static void main(String[] args) {
		funandmeth f=new funandmeth();
//		f.even();
//		f.greatest();
		f.reverse();
	}
}
