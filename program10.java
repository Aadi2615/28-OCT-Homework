package Homework28OCT;

import java.util.Scanner;

public class program10 {
public static void main(String[] args) {
	Scanner sc =new  Scanner(System.in);
	
	int i;
	
	System.out.println("Enter the number :  ");
	i=sc.nextInt();
	
	if( i %5==0) {
		System.out.println("Apple");
	}else {
		System.out.println(i);
	}
} 

}

