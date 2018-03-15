package Lesson10_1;

import java.awt.List;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

// Demo code for the user implemenation of Binary search tree
public class MyBST {
	/** The tree root. */
	private BinaryNode root;
	private List<int>  innerList;

	public MyBST() {
		root = null;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order. Inorder Traversal
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	// Inorder Traversal to print the nodes in Ascending order
	private void printTree(BinaryNode t) {
		if (t != null) {
			printTree(t.left);
			System.out.print(t.element + ",");
			printTree(t.right);
		}
	}

	// Assume the data in the Node is an Integer.

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			return;
		} else {
			BinaryNode n = root;
			boolean inserted = false;

			while (!inserted)// true
			{
				if (x.compareTo(n.element) < 0) {
					// space found on the left
					if (n.left == null) {
						n.left = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				} else if (x.compareTo(n.element) > 0) {
					// space found on the right
					if (n.right == null) {
						n.right = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.right;
					}

				}
				// if a node already exists
				else {
					inserted = true;
				}

			}

		}
	}

	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left; // Left child
		private BinaryNode right; // Right child
		// Constructors

		BinaryNode(Integer theElement) {
			this(theElement, null, null);
		}

		BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}

	}

	public void preOrder() {
		if (root == null) System.out.println("Empty tree");
		else preOrder(root);
	}

	private void preOrder(BinaryNode t) {
		if (t != null) {
			System.out.print(t.element + ",");
			preOrder(t.left);
			preOrder(t.right);
		}
	}

	public void postOrder() {
		if (root == null) System.out.println("Empty tree");
		else postOrder(root);
	}

	private void postOrder(BinaryNode t) { // implement
		if (t != null) {

			postOrder(t.left);
			postOrder(t.right);
			System.out.print(t.element + ",");
		}
	}

	public boolean contains(Integer key) { // implement
		
		if (key == null) return false;
		else	return contains(root,key);
	
	}
	
	private  boolean contains(BinaryNode t,Integer key) { // implement
		
		boolean ret= false;
		
		if (t == null) return false;
		else {
			if (t.element.equals(key)) ret = true;
			else {
				ret = ret || contains(t.left,key);
				ret = ret || contains(t.right,key);
			}
		}
		
		return ret;
	}

	public Integer getRoot() {// implement
		return root.element;
	}

	public Integer leafNodes() {
		return leafNodes(root);
	}

	private int leafNodes(BinaryNode t) {// Implement
		int iCount= 0;
		
		if (t == null) return 0;
		else {
				if (t.left == null && t.right == null) iCount++; 
				else {
					iCount += leafNodes(t.left);
					iCount += leafNodes(t.right);
				}
			}
		
		
		return iCount;
	}

	public int size() {// implement
		
		int iCount= 0;
		if (root == null) iCount=0;
		if (root != null) {
			iCount += countNode(root);
			
		}
		
		return iCount;
	}
	
	private int countNode(BinaryNode t) {
		
		int iCount= 0;
		
		if (t != null) {
			iCount ++;
			iCount += countNode(t.left);
			iCount += countNode(t.right);
			
		}
		return iCount;
		
	}
	

	public boolean isEmpty() {// implement
		return (root == null);
	} // check the tree is empty or not

	public Integer findMin() {
		return findMin(root);
	}

	private Integer findMin(BinaryNode node) {// implement

		
		
		return null;

	}

	public Integer findMax() {
		return findMax(root);
	}

	public Integer findMax(BinaryNode node) {// implement
		return null;
	}
	
	private void toList() {}
	
	private void LNR(BinaryNode t) {
//		if (t != null) {
//			printTree(t.left);
//			System.out.print(t.element + ",");
//			printTree(t.right);
//		}
	}
	
	

	public static void main(String[] args) {

		MyBST mybst = new MyBST();

		int[] a = { 45, 25, 65, 75, 15, 30, 55, 80, 10,20,50,60 };

		for (int j = 0; j < a.length; j++) {
			mybst.insert(a[j]);

		}
		
		System.out.println("NLR traverse: root = " + mybst.getRoot());
		mybst.preOrder();
		System.out.println();
		
		System.out.println("LNR traverse: root = " + mybst.getRoot());
		mybst.printTree();
		System.out.println();

		
		System.out.println("LRN traverse: root = " + mybst.getRoot());
		mybst.postOrder();
		System.out.println();
		
		System.out.println("Tree contains 20 ?: " + mybst.contains(20));
		System.out.println();
		
		System.out.println("Number of leaf nodes: " + mybst.leafNodes());
		System.out.println();
		
		System.out.println("Number of nodes: " + mybst.size());
		System.out.println();
		
/*
		TreeSet<Integer> ts = new TreeSet<Integer>();

		for (int j = 0; j < a.length; j++) {
			ts.add(a[j]);
			System.out.println("\nAfter inserting " + j + "th item " + a[j]);
			Iterator<Integer> it = ts.iterator();
			Integer nextItem = null;
			while (it.hasNext()) {
				nextItem = it.next();
				System.out.print(nextItem + " ");
			}
			System.out.println();
		}

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "Hello");
		map.put(10, "World!");
		map.put(11, "Welcome");
		map.remove(8);
		String str = map.get(11) + ", " + map.get(10);
		System.out.println(str);*/

	}
}
