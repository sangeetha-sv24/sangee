package sangee;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=scr.nextInt();
		int fact=1;
		for(int i=number;i>0;i--) {
			fact=fact*i;
			
		}
		System.out.println("Factorial of given number is: "+fact);
	}

}
