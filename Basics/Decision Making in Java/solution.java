class Solution {
    public static String compareNM(int n, int m) {
        // code here
        if(n<m){
            return "lesser";
        }
        if(n>m){
           return "greater"; 
        }
        if(n==m){
            return "equal";
        }
        
        return "none";
    }
}
