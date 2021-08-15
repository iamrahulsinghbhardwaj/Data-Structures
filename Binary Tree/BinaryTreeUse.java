package BinaryTrees;
import java.util.*;

public class BinaryTreeUse {
	
	
	public static void print(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		
		String str="";
		str=root.data+" ";
		
		if(root.left!=null) {
			str+="L:"+root.data;
		}
		
		if(root.right!=null) {
			str+="R:"+root.data;
		}
		
		System.out.println(str);
		
		print(root.left);
		print(root.right);
	}

	public static BinaryTreeNode<Integer> takeInput(Scanner sc){
		System.out.println("Enter root data");
		int rootdata=sc.nextInt();
		
		if(rootdata==-1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootdata);
		
		root.left=takeInput(sc);
		root.right=takeInput(sc);
		
		return root;
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BinaryTreeNode<Integer> root=takeInput(sc);
		
		print(root);
	}

}
