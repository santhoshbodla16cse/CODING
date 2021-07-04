package recursion;

public class HeightofBT {
Node root;
public HeightofBT(Node root) {
	this.root = root;
}
HeightofBT(){
	
}

static int height(Node root) {
	
	if(root==null)
		return 0;
	
	int l = height(root.left);
	int r = height(root.right);
	
	return 1 + max(l,r);
}



private static int max(int l, int r) {
	if(l>r)
		return l;
	else
		return r;
	
}

}
