
class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         HashSet<Integer> set=new HashSet<>();
         
         Node curr=head;
         set.add(curr.data);
         
         while(curr.next!=null){
             if(set.contains(curr.next.data)){
                 curr.next=curr.next.next;
             }else{
                 curr=curr.next;
                 set.add(curr.data);
             }
         }
         
         return head;
         
         
    }
}
