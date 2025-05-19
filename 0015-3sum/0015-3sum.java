class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list=new HashSet<>();
        Arrays.sort(nums);

    
    int a=0;
     while(a<=nums.length-3){
        int b=a+1;
        int c=nums.length-1;

        while(b<c){
            if(nums[a]+nums[b]+nums[c]<0){
                b++;
            }
            else if(nums[a]+nums[b]+nums[c]>0){
                c--;
            }
            else{
                List<Integer> triplet=Arrays.asList(nums[a],nums[b],nums[c]);
                list.add(triplet);
                b++;
                c--;
                while (b < c && nums[b] == nums[b - 1]) {
                        b++;
                 }
                while (b < c && nums[c] == nums[c + 1]) {
                        c--;
                    }
            }
        }
        a+=1;
        while (a <= nums.length - 3 && nums[a] == nums[a - 1]) {
                a++;
            }        
    }  
    return new ArrayList<>(list);
}
}