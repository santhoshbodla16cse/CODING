package recursion;

public class BinaryTree {
	
	 Node root;
	
	BinaryTree(){
		root=  null;
	}
	BinaryTree(int key){
		root = new Node(key);
	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.right.right = new Node(13);
		bt.root.right.right.right = new Node(113);
		bt.root.right.right.right.right = new Node(123);
		bt.root.left.left = new Node(4);
		bt.root.left.left.left = new Node(5);
		//DisplayTree(bt);
		HeightofBT h = new HeightofBT();
		int res = h.height(bt.root);
		System.out.println(res);
	}
	 static void DisplayTree(BinaryTree bt) {
		Node temp = bt.root;
		while(temp!=null)
		{
		System.out.println(temp.key);
		temp = temp.left;
		}
		
	}

}
