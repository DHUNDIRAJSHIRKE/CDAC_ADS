package recursion;


/*Write a program to perform the following operations using Java.
1. Read a number from user the find the sum of digits of the number using recursive function.
2. Write a recursive function to find the square of the number.
3. Write a program to demonstrate the tail recursion for finding the factorial of the number.  <---------------------
4. Write a method to check whether the number is palindrome or not?*/




public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 8;
		System.out.println(" Factorial of " + num + " is : " + factorial(num));
	}

	public static int factorial(int num) {
		// TODO Auto-generated method stub
		if(num<0) {
			return -1;
		}
		if (num == 0) {
			return 1;
		} else {
			return num * factorial(num-1);
		}
	}

}
