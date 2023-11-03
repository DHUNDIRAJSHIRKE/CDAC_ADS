package binaryTree;

public class BSTree {
	private Node root;

	public BSTree() {
		root = null;
	}

	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node() {
			data = 0;
			left = null;
			right = null;
		}

		public Node(int val) {
			data = val;
			left = null;
			right = null;
		}
	}

	public void addValue(int val) {
		Node newNode = new Node(val);
		if (root == null) {
			root = newNode;
		} else {
			if (root.data > val) {
				if (root.left == null) {
					root.left = newNode;
				} else {
					addValue(newNode, root.left);
				}
			} else {
				if (root.right == null) {
					root.right = newNode;
					System.out.println(" " + root.right.data);
				} else {
					addValue(newNode, root.right);
				}
			}
		}
	}

	public void addValue(Node newNode, Node root) {

		// TODO Auto-generated method stub
		if (root == null) {
			root = newNode;
		}
		if (root.data > newNode.data) {
			if (root.left == null) {
				root.left = newNode;
			} else {
				addValue(newNode, root.left);
			}
		} else {
			if (root.right == null) {
				root.right = newNode;
			} else {
				addValue(newNode, root.right);
			}

		}
	}

	public void inOrder() {
		if (isEmpty()) {
			System.out.println(" EMPTY!!");
			return;
		}
		if (root.left != null) {

			inOrder(root.left);
		}
		System.out.print(root.data + " ");
		if (root.right != null) {

			inOrder(root.right);
		}
		System.out.println();
	}

	public boolean isEmpty() {
		if (root == null) {
			return true;
		}
		return false;
	}

	public void inOrder(Node root) {
		if (root.left != null) {
			inOrder(root.left);

		}
		if (root != null) {
			System.out.print(root.data + " ");

		}
		if (root.right != null) {
			inOrder(root.right);
		}
	}

	public void preOrder() {
		if (isEmpty()) {
			System.out.println(" EMPTY!!");
			return;
		}
		System.out.print(root.data + " ");
		if (root.left != null) {

			preOrder(root.left);
		}

		if (root.right != null) {

			preOrder(root.right);
		}
		System.out.println();
	}

	public void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
		}
		if (root.left != null) {
			preOrder(root.left);

		}

		if (root.right != null) {
			preOrder(root.right);
		}
	}
	public void postOrder() {
		if (isEmpty()) {
			System.out.println(" EMPTY!!");
			return;
		}
		
		if (root.left != null) {

			postOrder(root.left);
		}

		if (root.right != null) {

			postOrder(root.right);
		}
		System.out.print(root.data + " ");
		System.out.println();
	}

	public void postOrder(Node root) {
		
		if (root.left != null) {
			postOrder(root.left);

		}

		if (root.right != null) {
			postOrder(root.right);
		}
		if (root != null) {
			System.out.print(root.data + " ");
		}
	}

}
