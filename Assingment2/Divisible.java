package Assingment2;

import java.util.Scanner;

public class Divisible {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter range from 1 to :");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			if(i%7==0 ) {
				if (i%5==0 ) {
					continue;
					
				}
				else {
					System.out.println(i);
				}
			}
		}
	}

}
