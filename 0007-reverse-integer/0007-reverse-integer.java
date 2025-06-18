class Solution {
    public int reverse(int x) {
        boolean negative=false;
        if(x<0){
            negative=true;
            x=Math.abs(x);
        }
        int rev=0;
        while(x>0){
            int last=x%10;
            if((Integer.MAX_VALUE-last)/10 < rev){
                return 0;
            }
            rev=rev*10+last;
            x=x/10;
        }
        if(negative){
            return -rev;
        }
        return rev;
        
    }
}