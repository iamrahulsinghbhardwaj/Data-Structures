class Solution {
    int remove_duplicate(int A[],int N){
    
       if(N==0 || N==1){
           return N;
       }
       
       int c=0;
       
       for(int i=0;i<A.length-1;i++){
           if(A[i]!=A[i+1]){
               A[c++]=A[i];
           }
       }
       
       A[c++]=A[N-1];
	    
	    return c;
    }
}

