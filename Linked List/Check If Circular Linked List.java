class GfG
{
    boolean isCircular(Node head)
    {
        if(head.next==null || head==null){
            return false;
        }
        
        Node temp=head;
        
        while(head!=null){
            head=head.next;
            if(head==temp){
                return true;
            }
        }
        
        return false;
    }
}
