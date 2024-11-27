package Assingment2;

import java.util.Scanner;

public class ArrayUsingLoop {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("enter the no of elements in array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("enter array values");
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			}
		System.out.println("the entered values are");
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
			
		}
		sc.close(); 
		
	}

}
