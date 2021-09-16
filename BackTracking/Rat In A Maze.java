/* 
Code: Rat In A Maze
Send Feedback
You are given a N*N maze with a rat placed at maze[0][0]. Find whether any path exist that rat can follow to reach its destination i.e. maze[N-1][N-1]. Rat can move in any direc­tion ( left, right, up and down).
Value of every cell in the maze can either be 0 or 1. Cells with value 0 are blocked means rat can­not enter into those cells and those with value 1 are open.
Input Format
Line 1: Integer N
Next N Lines: Each line will contain ith row elements (separated by space)
Output Format :
The output line contains true if any path exists for the rat to reach its destination otherwise print false.
Sample Input 1 :
3
1 0 1
1 0 1
1 1 1
Sample Output 1 :
true
Sample Input 2 :
3
1 0 1
1 0 1
0 1 1
Sample Output 2 :
 false
 
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int maze[][] = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				maze[i][j] = s.nextInt();
			}
		}
		System.out.println(Solution.ratInAMaze(maze));	
	}

}



public class Solution {

	public static boolean ratInAMaze(int maze[][]){
        int path[][]=new int [maze.length][maze.length];
        
        return ratInAMaze(maze,0,0,path);
	}
    
    public static boolean ratInAMaze(int maze[][],int i,int j,int path[][]){
        int n=maze.length;
        
        if(i<0 || i>=n || j<0 || j>=n || path[i][j]==1 || maze[i][j]==0){
			return false;
        }
        
        path[i][j]=1;
        
        if(i==n-1 && j==n-1){
            path[i][j]=0;
            return true;
        }
        
        //going upward
        if(ratInAMaze(maze,i-1,j,path)){
            return true;
        }
        
        //going downward
        if(ratInAMaze(maze,i+1,j,path)){
			return true;
        }
        
        //going left
        if(ratInAMaze(maze,i,j-1,path)){
            return true;
        }
        
        //going right
        
        if(ratInAMaze(maze,i,j+1,path)){
            return true;
        }
        
        return false;
        
    }
    
    
}


