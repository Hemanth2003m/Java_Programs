package LinkedLists;

import java.util.Scanner;

public class DoublyLinkedLiST {
	
	static class DoublyLinkedListNode{
		int data;
		DoublyLinkedListNode next;
		DoublyLinkedListNode prev;
		
		DoublyLinkedListNode(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
		}
		
	}
	static DoublyLinkedListNode buildList(Scanner scanner, int n) {
		
		 if (n == 0) return null;
		int value = scanner.nextInt();
		DoublyLinkedListNode head = new DoublyLinkedListNode(value);
		DoublyLinkedListNode tail = head;
		
		for(int i = 1; i < n ; i++) {
			
			value = scanner.nextInt();
			DoublyLinkedListNode newNode = new DoublyLinkedListNode(value);
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			
			
		}
		return head;
		
	}
	static void printList(DoublyLinkedListNode head) {
		
		DoublyLinkedListNode temp = head;
		while(temp != null) {
			
			System.out.print(temp.data + " -> ");
			
			temp = temp.next;
		}
		System.out.print("End");
		System.out.println();
		
	}	
	
	static void printRevList(DoublyLinkedListNode head) {
		
		DoublyLinkedListNode temp = head;
		DoublyLinkedListNode last = null;
		while(temp != null) {
			
			last = temp;
			temp = temp.next;
		}
		
		while(last != null) {
			
			System.out.print(last.data + " -> ");
			
			last = last.prev;
		}
		System.out.print("Start");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the Size: ");
		int n = scanner.nextInt();
			
		System.out.println("enter the Elements: ");
		DoublyLinkedListNode head = buildList(scanner, n); 
			
	 
		 System.out.println("Linked list:");
		 printList(head);
		 printRevList(head);
		
	}

	

}
