
class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        //HashMap<Integer,Boolean> map=new HashMap<>();
    //     HashSet<Integer> set=new HashSet<>();
        
        
      Node slow=head;
      Node fast=head;
       
      while(fast!=null && fast.next!=null){
          slow=slow.next;
          fast=fast.next.next;
           
          if(slow==fast){
              return true;
          }
      }
       
      return false;
    
    // HashSet<Node> s = new HashSet<Node>();
    //     while (h != null) {
            
    //         if (s.contains(h))
    //             return true;

    //         s.add(h);
 
    //         h = h.next;
    //     }
 
    //     return false;
    }
}
