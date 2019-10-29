package lists;

public class ListTester {

	public static void main(String[] args) {
		
		LinkedList newList = new LinkedList();
		
		
	
		newList.append(23);
		newList.append(420);
		newList.append(70);
		newList.append(0);
		newList.insertAfter(70, 69);
		newList.append(23);
		newList.append(40);
		newList.insertAfter(23, 120);
		newList.insertAfter(40, 33);
		
		
		newList.printList();
		System.out.println("\nList length: " + newList.listLength());
	}

}
