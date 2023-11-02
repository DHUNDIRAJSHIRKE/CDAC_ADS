package recursion;


/*Write a program to perform the following operations using Java.
1. Read a number from user the find the sum of digits of the number using recursive function.
2. Write a recursive function to find the square of the number.   <---------------------
3. Write a program to demonstrate the tail recursion for finding the factorial of the number.
4. Write a method to check whether the number is palindrome or not?*/



public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" square of : " + square(0));
	}

	public static int square(int num) {
		// TODO Auto-generated method stub
		if(num<0) {
			num = num * (-1);
		}
		if(num==0) {
			return num;
		}else if(num==1) {
			return num;
		}else {
			return square(num-1) + 2*(num-1)+1;
		}
	}

}
