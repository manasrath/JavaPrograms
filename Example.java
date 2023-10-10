package BasicPrograms;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
     String name="Manas" ;//its using String as non-primitive datatype
     String s=new String ("Sanam"); //object refernce,using String as class
     
     Scanner sc=new Scanner (System.in);
     System.out.println("Enter  Your Name ");
     String st=sc.nextLine();
     System.out.println(st);
	}
}
