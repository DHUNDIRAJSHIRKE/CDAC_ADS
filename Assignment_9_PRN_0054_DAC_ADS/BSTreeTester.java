package binaryTree;

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
