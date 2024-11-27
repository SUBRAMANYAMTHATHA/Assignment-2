package Assingment2;

public class Compare {
	public static void main (String[] args) {
		
		great();
		small();
		
	}
	 static void great() {

		int a =5 , c = 7, b =9;
		
		if(a>b && a>c) {
			System.out.println(a+"is greater");
			
		}
		else if(b>a && b>c) {
			System.out.println(b+" is geater");
		}
		else {
			System.out.println(c+ " is greter");
		}
			
	}
	 static void small () {
		
		int a =5 , c = 7, b =9;
		if (a<b && a<c) {
			System.out.println(a+"is smaller");
			
		}
		else if (b<a && b<c) {
			System.out.println(b+"is smaller"); }
		
		else {
			System.out.println(c);
		}
	}

}
