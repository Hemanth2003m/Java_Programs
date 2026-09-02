package LinkedLists;

import java.util.Scanner;

public class ScanLLAndPrint {
	static class SinglyLinkedListNode{
		int data;
		SinglyLinkedListNode next;
		
		SinglyLinkedListNode(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	static SinglyLinkedListNode buildList(Scanner scanner, int n) {
		
		 if (n == 0) return null;
		int value = scanner.nextInt();
		SinglyLinkedListNode head = new SinglyLinkedListNode(value);
		SinglyLinkedListNode tail = head;
		
		for(int i = 1; i < n ; i++) {
			
			value = scanner.nextInt();
			SinglyLinkedListNode newNode = new SinglyLinkedListNode(value);
			tail.next = newNode;
			tail = newNode;
			
			
		}
		return head;
		
	}
	static void printList(SinglyLinkedListNode head) {
		
		SinglyLinkedListNode temp = head;
		while(temp != null) {
			
			System.out.print(temp.data + " -> ");
			
			temp = temp.next;
		}
		System.out.print(" ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the Size: ");
		int n = scanner.nextInt();
			
		System.out.println("enter the Elements: ");
		SinglyLinkedListNode head = buildList(scanner, n); 
			
	 
		 System.out.println("Linked list:");
		printList(head);
		
	}

}
