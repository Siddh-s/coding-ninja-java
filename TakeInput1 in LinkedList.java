package germany;

public class node<T> {
    T data;
    node<T> next;
    node(T data){
        this.data = data;
    }
    
}
import java.util.Scanner;

public class linkedlistUse {
  
 public static void prints (node<Integer> head){
    while(head!= null){
        System.out.print (head.data + " ");
        head = head.next;
    }
    System.out.println();
 }   
   
 public static node<Integer> takeInput(){
    Scanner sc= new Scanner (System.in);
    int data= sc.nextInt();
    node<Integer> head = null ;
    while(data!= -1){
        node<Integer> currentNode = new node<Integer>(data); 
        if (head == null){
          head =  currentNode ;
        }
    else{
        node<Integer> tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = currentNode;
    }
    data = sc.nextInt();
    }
    return head;
 }

    public static void main (String args[]){
        node<Integer> head = takeInput();
        prints(head);
       
       
        
    }
}
