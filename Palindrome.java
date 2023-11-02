package recursion;



/*Write a program to perform the following operations using Java.
1. Read a number from user the find the sum of digits of the number using recursive function.
2. Write a recursive function to find the square of the number.
3. Write a program to demonstrate the tail recursion for finding the factorial of the number.
4. Write a method to check whether the number is palindrome or not? <---------------------  */




public class Palindrome {

	public static void main(String[] args) {
		int num = 4162261;
		System.out.println(" is " + num + " palindrome : " + palindrome(num));
	}

	public static boolean palindrome(int num) {
		if (num < 0) {
			num = num * (-1);
		}
		int first = num, last = num % 10, reduced, count = 0, temp = 1;
		if (num > 0) {
			count = countOfDigits(num);
			for (int i = 1; i < count; i++) {
				first = first / 10;
			}
		}
		for (int i = 1; i < count; i++) {
			temp = temp * 10;
		}
		temp = temp * first;

		if (first == last) {
			reduced = num - temp;
			if (reduced == 0) {
				return true;
			}
			return palindrome(reduced / 10);
		} else {
			return false;
		}
	}

	public static int countOfDigits(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

}
