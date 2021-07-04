package BST;

public class BST_Creation {
	
	Node root;
	BST_Creation(){
		root = null;
	}
	
	void insert(int key) {
		root = insertRec(root,key);
	}
	private Node insertRec(Node root, int key) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		if(key<root.data) {
			root.left = insertRec(root.left,key);
		}
		else if(key>root.data) {
			root.right = insertRec(root.right,key);
		}
		return root;
	}
	void inorder() {
		inordermain(root);
	}
	private void inordermain(Node root) {
		if(root!= null) {
			inordermain(root.left);
			System.out.print(root.data+" ");
			inordermain(root.right);
		}
		
	}

	public static void main(String[] args) {
		
		BST_Creation tree = new BST_Creation();
		tree.insert(50);	
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        
        tree.inorder();
	}

}
