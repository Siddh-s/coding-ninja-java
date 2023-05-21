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
    node<Integer> head = null , tail = null;
    while(data!= -1){
        node<Integer> currentNode = new node<Integer>(data); 
        if (head == null){
          head =  currentNode ;
          tail = currentNode;
        }
    else{
      tail.next= currentNode;
      tail = currentNode; // or tail = tail.next
    }
    data = sc.nextInt();
    }
    return head;
 }
 public static node<Integer> recursivelyDeletion (node<Integer> head , int pos){
  if ( pos == 0){
    return head.next;
  }
  if(head == null && pos > 0){
    return head;
  }
  else{
             
    head.next = recursivelyDeletion(head.next, pos-1);
    return head;
  }

 }
   public static void main (String args[]){
        node<Integer> head = takeInput();
      //  head =  recursivelyDeletion(head, 1);
      head = recursivelyDeletion(head, 2);
       prints(head);
       
        
    
       
       
        
    }
}
