package BasicPrograms;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		double length=sc.nextDouble();
		System.out.println("Enter the bredth");
		double bredth=sc.nextDouble();
		double area=length*bredth;
		System.out.println(area+" area of rectangle");
	}

}
