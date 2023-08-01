package day_4;

public class LinkedList {

	Node head;
	Node tail;

	public class Node {

		int data;
		Node next;

		Node(int data) {

			this.data = data;
			this.next = null;
		}

	}

	public void create(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			
		} else {
			newNode.next = head;
			head = newNode;
		}

	}
	
	public void traverse() {
	
	Node current	  = head;
	
	  if(current==null) {
		  return;
	  }else {
		  
		  while(current!=null) {
			  
			 System.out.println(current.data);
			 current  = current.next;
			    		   
		  }
		  
	  }
	
	

	}


	public static void main(String args[]) {
		LinkedList linkedList = new LinkedList();
		linkedList.create(5);
		linkedList.create(7);
		linkedList.create(8);
		linkedList.create(9);
		
		linkedList.traverse();

	}
}
