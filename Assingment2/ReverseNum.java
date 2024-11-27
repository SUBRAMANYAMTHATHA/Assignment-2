package Assingment2;

import java.util.Scanner;

public class ReverseNum {
	
	  public static void main(String[] args) {
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter the num to reverse");
		  int n = sc.nextInt();
		  int temp=0,rev=0;
		  while(n!=0) {
			  temp = n%10;
			  rev = rev*10 + temp;
			  n = n/10;
		  }
		  System.out.println("enter the num is :"+rev);
		  sc.close();
		  }
	  }


