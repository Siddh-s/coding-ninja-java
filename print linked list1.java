package germany;

public class node<T> {
    T data;
    node<T> next;
    node(T data){
        this.data = data;
    }
    
}
public class linkedlistUse {
    public static node<Integer> createLinkedlist(){
       node<Integer> n1 = new node(10);
       node<Integer> n2 = new node(20);
       node<Integer> n3 = new node(30);
       node<Integer> n4 = new node(40);
       n1.next = n2;
       System.out.println(" n1 " + n1 + " data " + n1.data + " next  "+ n1.next);
       n2.next = n3;
       n3.next = n4;
       return n1;
    }

    public static void main (String args[]){
        node<Integer> head = createLinkedlist();
        // node<Integer> n1 = new node<>(10);
        // System.out.println(n1.data);
        // System.out.println(n1.next);
        // System.out.println(n1);
    }
}
