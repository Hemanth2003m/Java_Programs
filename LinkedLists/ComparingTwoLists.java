package LinkedLists;

import java.io.*;
import java.util.*;

public class ComparingTwoLists {

    static class SinglyLinkedListNode{
        
        int data;
        SinglyLinkedListNode next;
        
        SinglyLinkedListNode(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    
    static SinglyLinkedListNode buildList(Scanner scanner, int n){
        if(n == 0) return null;
        
        SinglyLinkedListNode head = new SinglyLinkedListNode(scanner.nextInt());
        SinglyLinkedListNode tail = head;
        
        for(int i = 1; i < n; i++){
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(scanner.nextInt());
            tail.next = newNode;
            tail = newNode;
        }
        
        return head;
    }
    
    static int compare(SinglyLinkedListNode head1, int n1, SinglyLinkedListNode head2, int n2){
        
        if(n1 != n2) return 0;
        
        SinglyLinkedListNode temp1 = head1;
        SinglyLinkedListNode temp2 = head2;
        
        while(temp1.next != null && temp2.next !=null){
            if(temp1.data != temp2.data) return 0;
             temp1 = temp1.next;
             temp2 = temp2.next;
        }
        return 1;
    } 

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the iterations ");
        int iter = scanner.nextInt();
        for(int i = 1; i <=iter; i++){
            System.out.println("enter the size of firstNode ");
            int n1 = scanner.nextInt();
            
            System.out.println("Elements now ");
            SinglyLinkedListNode head1 = buildList(scanner, n1);
            
            System.out.println("enter the size of secondNode ");
            int n2 = scanner.nextInt();
            
            System.out.println("Elements now ");
            SinglyLinkedListNode head2 = buildList(scanner, n2);

        System.out.println(compare(head1, n1, head2, n2));
        }
        
    }
}
