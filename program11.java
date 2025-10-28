package Homework28OCT;

import java.util.Scanner;

public class program11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		System.out.println("Enter the Number : ");
		i=sc.nextInt();
		
		if(i%3==0 && i%5==0) {
			System.out.println("Mango and Apple");
		}else {
			System.out.println(i);
		}

	}

}
