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
 public static node<Integer> delete(node<Integer> head , int pos){
    if (head == null){
        return head;
    }
    if(pos ==0){
        return head.next;
    }
    int count = 0;
    node<Integer> currHead = head;
    while(currHead!= null && count < pos-1){
        currHead = currHead.next;
        count++;
    }
    if (currHead == null || currHead.next == null){
        return head;
    }
    currHead.next = currHead.next.next;
    return head;
 }
   
 

    public static void main (String args[]){
        node<Integer> head = takeInput();
        delete(head, 2);
        
        prints(head);
       
       
        
    }
}
