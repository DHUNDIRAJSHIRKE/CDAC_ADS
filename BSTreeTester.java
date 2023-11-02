package binaryTree;


/*Write a program to perform the following operations using Java.
1. Read the count of elements from user to create the binary search tree.
2. Create the class and methods for the following and call them using a menu based program and
call them using a loop.
a. Insert the data into the binary search tree
b. Show the contents using Inoder traversal
c. Show the contents using preorder traversal
d. Show the contents using postoder traversal*/


import java.util.Scanner;

public class BSTreeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean exit = false;
		BSTree tree = new BSTree();
		try (Scanner sc = new Scanner(System.in)) {

			while (!exit) {
				System.out.println(" 1 > Insert data 2 > InOrder 3 > PreOrder 4 > PostOrder 0 > EXIT");
				System.out.print(" Enter : ");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(" Enter Data : ");
						tree.addValue(sc.nextInt());
						System.out.println(" added");
						break;
					case 2:
						tree.inOrder();
						break;
					case 3:
						tree.preOrder();
						break;
					case 4:
						tree.postOrder();
						break;
					case 0:
						exit = true;
						break;
					default:
						System.out.println(" Invalid I/P!!!!");
						break;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} // while ends
		} // try-w/ resources ends here
	}

}
