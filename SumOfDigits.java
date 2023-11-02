package recursion;


/*Write a program to perform the following operations using Java.
1. Read a number from user the find the sum of digits of the number using recursive function. <---------------------
2. Write a recursive function to find the square of the number.
3. Write a program to demonstrate the tail recursion for finding the factorial of the number.
4. Write a method to check whether the number is palindrome or not?*/




import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println(" Enter a number: ");
			Scanner sc = new Scanner(System.in);
			System.out.println(" sum of digits: " + digits(sc.nextInt()));
		}
	}

	private static int digits(int n) {
		// TODO Auto-generated method stub
		if(n<0) {
			n=n*(-1);
		}
		int sum = 0;
		if (n < 10) {
			return n % 10;
		} else {
			sum = n % 10;
			return digits(n / 10) + sum;
		}
	}

}
