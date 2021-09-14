class Solution {
    public int countSubstrings(String s) {
       int count=0;
        
        
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String ans=s.substring(i,j);
                System.out.println(ans);
            }
        }
      
    }
}
