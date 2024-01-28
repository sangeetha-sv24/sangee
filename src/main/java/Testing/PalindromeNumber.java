package Testing;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=scr.nextInt();
		int temp=num;
		int rem,sum=0;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;			
		}
		if(temp==sum)
			System.out.println("Given no is Palindrom");
		else
			System.out.println("Given no is not Palindrom");
	}

}
