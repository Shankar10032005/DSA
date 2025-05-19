class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> result=new HashSet<>();

        for(int i=0;i<=nums.length-1;i++){
            HashSet <Integer> list=new HashSet<>();
            for(int j=i+1;j<=nums.length-1;j++){
                int check= -(nums[i]+nums[j]);
                if(list.contains(check)){
                    List<Integer> triplet=Arrays.asList(nums[i],nums[j],check);

                    Collections.sort(triplet);
                    result.add(triplet);
                }
                list.add(nums[j]);
            }
        }
        ArrayList<List<Integer>> ans =new ArrayList<>(result);
        return ans;
    }
}