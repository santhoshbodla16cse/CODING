package singlelinkedlist;

public class pairwiseswap {
	static Node head;
	 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    /* Function to pairwise swap elements of a linked list.
     It returns head of the modified list, so return value
     of this node must be assigned */
    Node pairWiseSwap(Node node)
    {
    	 // Base Case: The list is empty or has only one node
        if (node == null || node.next == null) {
            return node;
        }
 
        // Store head of list after two nodes
        Node remaing = node.next.next;
 
        // Change head
        Node newhead = node.next;
 
        // Change next of second node
        node.next.next = node;
 
        // Recur for remaining list and change next of head
        node.next = pairWiseSwap(remaing);
 
        // Return new head of modified list
        return newhead;
    			
    }
 
    /* Function to print nodes in a given linked list */
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    // Driver program to test above functions
    public static void main(String[] args)
    {
 
        /* The constructed linked list is:
         1->2->3->4->5->6->7 */
        pairwiseswap list = new pairwiseswap();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(7);
 
        System.out.println("Linked list before calling pairwiseSwap() ");
        list.printList(head);
        head = list.pairWiseSwap(head);
        System.out.println("");
        System.out.println("Linked list after calling pairwiseSwap() ");
        list.printList(head);
        System.out.println("");
    }

}
