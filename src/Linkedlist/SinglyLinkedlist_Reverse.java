package Linkedlist;

import org.junit.Test;

public class SinglyLinkedlist_Reverse {
	
	Node head;
	Node tail;
	int length;
	
	public class Node 
	{
		int value;
		Node next;
		
		public Node(int value) 
		{
			this.value = value;
			next = null;
		}
	}
	
	public void add(int val) 
	{
		Node temp = new Node(val);
		if(head==null) {	
			head = tail = temp;
		} else {
			tail.next = temp;
			tail = temp;
		}
		length++;
	}
	
	public void printVals(Node head) 
	{
		while(head!=null) {
			System.out.print(head.value + " ");
			head = head.next;
		}
		System.out.println();
	}
	
	public Node addAll(int[] val){
		Node temp = null;
		
		for(int i : val) {
			temp = new Node(i);
			if(head==null) {
				head = tail = temp;
			}else {
				tail.next = temp;
				tail = temp;
			}
			length++;
		}
		return head;
	}
	
	
	//Test Data
	
		@Test
		public void positive() {
			int[] arr = {1,2,3,4,5};
			int[] output = {5,4,3,2,1};
			//Assert.assertEquals(reverseLinkedList(addAll(arr)), addAll(output));
			printVals(reverseLinkedList_Recursive(addAll(arr)));
		}
		
		@Test
		public void edge() {
			int[] arr = {1};
			int[] output = {1};
			//Assert.assertEquals(reverseLinkedList(addAll(arr)), addAll(output));	
			printVals(reverseLinkedList_Recursive(addAll(arr)));
		}
		
		@Test
		public void edge2() {
			int[] arr = {};
			int[] output = {};
			//Assert.assertEquals(reverseLinkedList(addAll(arr)), addAll(output));	
			printVals(reverseLinkedList_Recursive(addAll(arr)));
		}
		
		@Test
		public void negative() {
			int[] arr = {1,1,1,1};
			int[] output = {1,1,1,1};
			//Assert.assertEquals(reverseLinkedList(addAll(arr)), addAll(output));	
			printVals(reverseLinkedList_Recursive(addAll(arr)));
		}
		
		private Node reverseLinkedList(Node head) {
			Node reverse = null;
	        while(head != null){
	            reverse = addFirst(reverse,head.value);
	            head = head.next;
	        }
	        return reverse;
		}
		
		private Node reverseLinkedList_ConstantSpace(Node head) {
			if(head==null || head.next == null) return head;
			Node a = head;
			Node b = a.next;
			while(b != null) {
				head = addFirst(head,b.value);
				if(b.next != null) a.next = b.next;
				else a.next = null;
				b = b.next;
			}
	        return head;
		}
		public Node reverseLinkedList_Recursive(Node head) {
			if(head==null || head.next==null) return head;
	        Node a = head;
	        Node b = a.next;
	        
	        return recursive(head,a,b);
		}
		
		public Node recursive(Node head, Node a, Node b){
	        if(b==null) return head;
	            head = addFirst(head,b.value);
	            a.next = (b.next==null) ? null : b.next;
	            b = b.next;
	        return recursive(head,a,b);
	    }

		private Node addFirst(Node head, int value) {
			Node node = new Node(value);
	        Node temp = head;
	        head = node;
	        head.next = temp;
	        return head;
		}
		
	


}
