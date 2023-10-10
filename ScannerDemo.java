package BasicPrograms;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		float b=sc.nextFloat();
		float c=a+b;
		System.out.println("Addition of two numbers are : "+c);

	}

}
