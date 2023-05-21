package germany;

public class node<T> {
    T data;
    node<T> next;
    node(T data){
        this.data = data;
    }
    
}
public class Linkedlist use 
{
public static void printRecursively (node<Integer> head){
    if ( head == null){
        return;
    }
    System.out.print(head.data + " ");
    printRecursively(head.next);

 }
 
   
 

    public static void main (String args[]){
        node<Integer> head = takeInput();
       
        
       printRecursively(head);;
       
       
        
    }
}
