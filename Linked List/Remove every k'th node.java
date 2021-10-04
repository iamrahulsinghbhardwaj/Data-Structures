class GfG
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
        if(head==null || k==1){
            return null;
        }
        
        int count=1;
        Node temp=head;
        Node temphead=temp;
        
        while(temp!=null){
            if(temp==null || temp.next==null){
                break;
            }
            if(count==(k-1)){
                temp.next=temp.next.next;
                count=0;
            }
            temp=temp.next;
            count++;
        }
        
        return temphead;
    }
}
