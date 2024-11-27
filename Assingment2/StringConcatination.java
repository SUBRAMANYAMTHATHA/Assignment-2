package Assingment2;

import java.util.Scanner;

public class StringConcatination {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string 1:");
		String s1 = sc.nextLine();
		
		System.out.println("Enter the string 2:");
		String s2 = sc.nextLine();
		
		String s3 = s1.concat(" ").concat(s2);
		System.out.println("the concatenated string is: "+ s3);
		
		sc.close();

	}
	

}
