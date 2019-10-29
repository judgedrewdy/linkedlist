package lists;

public class LinkedList {
	private Node head = null;
	private Node tail = null;
	
	public void append(int nodeData) {
		if(head == null) {
			Node firstNode = new Node(nodeData, null);
			head = firstNode;
			tail = firstNode;
		}
		else {
			Node newNode = new Node(nodeData, null);
			tail.setNextNode(newNode);
			tail = newNode;
		}
	}
	
	public void prepend(int nodeData) {
		if(head == null) {
			Node firstNode = new Node(nodeData, null);
			head = firstNode;
			tail = firstNode;
		}
		else {
			Node newNode = new Node(nodeData, head);
			head = newNode;
		}
	}
	
	public void insertAfter(int dataInsertingAfter, int nodeData) {
		Node currentNode = head;
//		if(head == null) {
//			Node firstNode = new Node(nodeData, null);
//			head = firstNode;
//			tail = firstNode;
//		}
//		else if() {
//			
//		}
		
			while (currentNode != null) {
				if(currentNode.getData() == dataInsertingAfter) {
					Node newNode = new Node(nodeData, currentNode.getNextNode());
					currentNode.setNextNode(newNode);		
				}
				currentNode = currentNode.getNextNode();
			}
		
	}
	
	public int listLength() {
		int count = 0;
		Node currentNode = head;
		while (currentNode != null) {
			currentNode = currentNode.getNextNode();
			count++;
		}
		return count;
	}
	

	
	public void printList() {
		Node curNode = head;
		while (curNode != (null)) {
			System.out.print(curNode.getData() + " ");
			curNode = curNode.getNextNode();
		}
	}
}
