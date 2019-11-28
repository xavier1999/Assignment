package Week5;

public class Binary_serach_tree {
		
	    /* Class containing left and right child of current node and key value*/
	    class Node { 
	        int key; 
	        Node left, right; 
	  
	        public Node(int item) { 
	            key = item; 
	            left = right = null; 
	        } 
	    } 
	  
	    // Root of BST 
	    Node root; 
	  
	    // Constructor 
	    Binary_serach_tree() {  
	        root = null;  
	    } 
	  
	    // This method mainly calls insertRec() 
	    void insert(int key) { 
	       root = insertRec(root, key); 
	    } 
	      
	    /* A recursive function to insert a new key in BST */
	    Node insertRec(Node root, int key) { 
	  
	        /* If the tree is empty, return a new node */
	        if (root == null) { 
	            root = new Node(key); 
	            return root; 
	        } 
	  
	        /* Otherwise, recur down the tree */
	        if (key < root.key) 
	            root.left = insertRec(root.left, key); 
	        else if (key > root.key) 
	            root.right = insertRec(root.right, key); 
	  
	        /* return the (unchanged) node pointer */
	        return root; 
	    } 
	  
	    // This method mainly calls InorderRec() 
	    void inorder()  { 
	       inorderRec(root); 
	    } 
	  
	    // A utility function to do inorder traversal of BST 
	    void inorderRec(Node root) { 
	        if (root != null) { 
	            inorderRec(root.left); 
	            System.out.println(root.key); 
	            inorderRec(root.right); 
	        } 
	    } 
	  
	    // Driver Program to test above functions 
	    public static void main(String[] args) { 
	    	Binary_serach_tree tree = new Binary_serach_tree(); 
	  
	  
	        tree.insert(2); 
	        tree.insert(7); 
	        tree.insert(9); 
	        tree.insert(4); 
	        tree.insert(1); 
	        tree.insert(5); 
	        tree.insert(3); 
	        tree.insert(6);
	        tree.insert(0);
	        tree.insert(8); 
	       
	        tree.inorder(); 
	    } 
	} 
