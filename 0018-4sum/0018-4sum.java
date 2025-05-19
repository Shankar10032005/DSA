class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> ans=new HashSet<>();

        for(int a=0;a<=nums.length-1;a++){
            for(int b=a+1;b<=nums.length-1;b++){
                HashSet<Long> set=new HashSet<>();
                for(int c=b+1;c<=nums.length-1;c++){
                     long currentSum = (long) nums[a] + nums[b] + nums[c];
                    long rem=(long) target - currentSum;;
                    if(set.contains(rem)){
                        List<Integer> four=Arrays.asList(nums[a],nums[b],nums[c],(int)rem);
                        Collections.sort(four);
                        ans.add(four);
                    }
                    set.add((long)nums[c]);
                }
            }
        }
        return new ArrayList<>(ans);
    }
}