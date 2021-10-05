/*
Given a singly linked list: A0→A1→…→An-1→An, reorder it to: A0→An→A1→An-1→A2→An-2→…
For example: Given 1->2->3->4->5 its reorder is 1->5->2->4->3.

Note: It is recommended do this in-place without altering the nodes' values.

Example 1:

Input:
LinkedList: 1->2->3
Output: 1 3 2
Example 2:

Input:
LinkedList: 1->7->3->4
Output: 1 4 7 3.
Your Task:
The task is to complete the function reorderList() which should reorder the list as required. The reorder list is automatically printed by the driver's code.

Note: Try to solve without using any auxilliary space.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 104

*/

//find the mid then point first node to second and so on

class gfg {
    Node reorderlist(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        
        Node slow=head;
        Node fast=head;
        Node prev=head;
        
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        prev.next=null;
        Node l1=head;
        Node l2=reverse(slow);
        
        Node ans=merge(l1,l2);
        
        return ans;
        
    }
    
    Node merge(Node l1,Node l2){
        
        Node head=l1;
        
        while(l2!=null){
            Node temp=l1.next;
            l1.next=l2;
            l1=l2;
            l2=temp;
        }
        
        return head;
        
    }
    
    Node reverse(Node head){
        Node prev=null;
        Node temp=head;
        Node curr=head;
        
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        
        return prev;
    }
}
