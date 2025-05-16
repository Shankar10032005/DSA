class Solution {
    public int longestConsecutive(int[] nums) {
         if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int current=0;
        int len=1;
        int max=1;

        for(int i=1;i<=nums.length-1;i++){
            if(nums[i]==nums[current]+1){
                len +=1;
                current++;
                max=Math.max(max,len);
            }
            else if(nums[current]==nums[i]){
                current++;
            }
            else{
                len=1;
                current++;
            }
        }
        return max;
        
    }
}