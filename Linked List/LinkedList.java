package LL;
import java.util.*;
public class LinkedListUse {
	public static Node<Integer> takeinput(){
		
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		Node<Integer> head=null,tail=null;
		
		while(x!=-1) {
			Node<Integer> newnode=new Node<>(x);
			
			if(head==null) {
				head=newnode;
				tail=newnode;
			}else {
				
				tail.next=newnode;
				tail=newnode;
				
			}
			x=sc.nextInt();
		}
		
		return head;
	}
	
	public static Node<Integer> insert(Node<Integer> head, int num,int pos){
		Node<Integer> newnode=new Node<Integer>(num);
		
		if(pos==0) {
			newnode.next=head;
			return newnode;
		}
		
		int i=0;
		Node<Integer> temp=head;
		
		while(i<pos-1) {
			temp=temp.next;
			i++;
			if(temp.next==null) {
				break;
			}
		}
		
		newnode.next=temp.next; //
		temp.next=newnode;
		
		return head;
		
	}
	public static Node<Integer> delete(Node<Integer> head,int pos){
		if(pos==0) {
			return head=head.next;
		}
		
		int i=0;
		
		Node<Integer> temp=head;
		
		while(i<pos-1) {
			temp=temp.next;
			i++;
		}
		
		if(temp.next.next==null) {
			temp.next=null;
		}
		
		temp.next=temp.next.next;
		return head;
		
		
				
	}
	
	public static void  print(Node<Integer> head){
		while(head!=null) {
			System.out.println(head.data+" ");
			head=head.next;
		}
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head=takeinput();
		head=insert(head,80,1);
		head=delete(head,0);
		print(head);
	}

}
