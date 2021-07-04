package singlelinkedlist;

//import singlelinkedlist.pairwiseswap.Node;

public class kpairreverse {
	 static Node head;
	
	public static class Node{
		int data;
		Node next;
		Node(int val){
			data=val;
			next = null;
		}
	}
	
	 static void push(int val) {
		Node node = new Node(val);
		node.next=head;
		head=node;
	}
	 void printlist() {
		 Node t = head;
		 while(t!=null)
		 {
			 System.out.print(t.data+" ");
			 t=t.next;
		 }
	 }
	 Node reverse(Node head,int k) {
		 
		 if(head==null)
			 return head;
		 
		 Node prev=null;
		 Node next = null;
		 Node curr = head;
		 int count =0;
		 while(curr!=null && count<k) {
			 next = curr.next;
			 curr.next = prev;
			 prev = curr;
			 curr = next; 
			 count++;
		 }
		 
		 if(next!=null)
			 head.next = reverse(next,k);
		 
		 return prev;
		 
	 }
	 
public static void main(String [] args) {
	kpairreverse llist = new kpairreverse();
	
     llist.push(7);
     llist.push(6);
     llist.push(5);
    
//     System.out.println("before reverse:");
	llist.printlist();
//	
//	llist.head = llist.reverse(llist.head,3);
	System.out.println("");
//	System.out.println("after reversal:");
//	
//	llist.printlist();
     kpairreverse ll = new kpairreverse();
     ll.push(4);
     ll.push(5);
     ll.push(1);
     ll.printlist();
     
     System.out.println("");
     
     resultlist(llist.head,ll.head);
     
}
private static void resultlist(Node head1, Node head2) {
	int t = 0;
	int carry =0;
	kpairreverse res = new kpairreverse();
	while(head1!=null&&head2!=null) {
		
		t= head1.data+head2.data+carry;
		if(t%10!=0) {
			t = t/10;
			carry = t%10;
		}
		
		res.push(t);
		
	}
	res.printlist();
	
}

}
