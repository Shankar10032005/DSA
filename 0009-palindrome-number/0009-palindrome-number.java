class Solution {
    public boolean isPalindrome(int x) {
        int oriX=x;
        int ans=0;
        
        while(x>0){
            int last=x%10;
            ans=ans*10+last;
            x=x/10;
        }
        if(ans==oriX){
            return true;
        }
        return false;
        
    }
}