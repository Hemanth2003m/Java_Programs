package LinkedLists;

import java.io.*;
import java.util.*;

public class MergeTwoSortedList {
    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
        
        SinglyLinkedListNode(int data){
            this.data = data;
            this.next = null;
        } 
        
     }
        static SinglyLinkedListNode buildList(Scanner scanner, int n){
            
            SinglyLinkedListNode head = new SinglyLinkedListNode(scanner.nextInt());
            SinglyLinkedListNode tail = head;
            
            for(int i=1 ; i< n; i++){
                
                SinglyLinkedListNode newNode = new SinglyLinkedListNode(scanner.nextInt());
                tail.next = newNode;
                tail = newNode;
                
            }
            
            return head;
    }
    
    static SinglyLinkedListNode  mergeList(SinglyLinkedListNode head1,SinglyLinkedListNode head2){
        
        SinglyLinkedListNode newList = new SinglyLinkedListNode(-1);
        SinglyLinkedListNode tail = newList;
        SinglyLinkedListNode temp1 = head1;
        SinglyLinkedListNode temp2 = head2;
        
        while(temp1 != null && temp2 != null){
                if(temp1.data >= temp2.data){
                    tail.next = temp2;
                    temp2 = temp2.next; 
                }  else{
                    tail.next = temp1;
                    temp1 = temp1.next; 
                }    
                tail = tail.next;      
        }
       if (temp1 != null) tail.next = temp1;
        if (temp2 != null) tail.next = temp2;
        
        return newList.next; 
    }
    
    static void display(SinglyLinkedListNode newList){
        
        SinglyLinkedListNode temp = newList;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for(int i = 0; i < n; i++){
            int n1 = scanner.nextInt();
            SinglyLinkedListNode llist1 =  buildList(scanner, n1);
            int n2 = scanner.nextInt();
            SinglyLinkedListNode llist2 = buildList(scanner, n2);
         SinglyLinkedListNode merged = mergeList(llist1, llist2);
           display(merged);
        }
        
       
       
    }
}
