public static node<Integer> midPoint(node<Integer> head){
   node<Integer>  slow = head , fast = head ;
   while(fast.next != null && fast.next.next != null){
     slow = slow.next;
     fast = fast.next.next;
   }
   return slow;
}
 
   public static void main (String args[]){
        node<Integer> head = takeInput();
        node<Integer> mid = midPoint(head);
        System.out.println(mid.data);
        prints(head);
      
        
    }
