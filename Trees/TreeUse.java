package Tree;
import java.util.*;
import java.util.Scanner;

public class TreeUse {
	
	public static TreeNode<Integer> takeInput(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter root node");
		
		int root=sc.nextInt();
		TreeNode<Integer> rootnode=new TreeNode(root);
		
		
		System.out.println("Enter no of children");
		
		int childrencount=sc.nextInt();
		
		for(int i=0;i<childrencount;i++) {
			TreeNode<Integer> child=takeInput();
			rootnode.children.add(child);
		}
		return rootnode;
	}
	
	public static TreeNode<Integer> takeInputLevelWise(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the root node");
		
		int rootnode=sc.nextInt();
		
		Queue<TreeNode<Integer>> pendingNodes=new LinkedList<>();
		
		TreeNode<Integer> root=new TreeNode<>(rootnode);
		
		pendingNodes.add(root);
		
		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer> frontnode=pendingNodes.poll();
			
			System.out.println("Enter no of children of "+frontnode.data);
			
			int nchild=sc.nextInt();
			
			for(int i=0;i<nchild;i++) {
				System.out.println("Enter"+(i+1)+"th children of frontnode.data");
				
				int child=sc.nextInt();
				
				TreeNode<Integer> childnode=new TreeNode<Integer>(child);
				
				frontnode.children.add(childnode);
				pendingNodes.add(childnode);
			}
		}
		
		return root;
		
	}
	
	public static void print(TreeNode<Integer> root) {
		String str=root.data+":";
		
		for(int i=0;i<root.children.size();i++) {
			str=str+root.children.get(i).data+" ";
		}
		System.out.println(str);
		
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
	}
	
	
	public static void main(String[] args) {
		//TreeNode<Integer> root=takeInput();
		TreeNode<Integer> root=takeInputLevelWise();
		print(root);
	}

}
