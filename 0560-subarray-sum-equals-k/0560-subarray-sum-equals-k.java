class Solution {
    public int subarraySum(int[] nums, int k) {
        int total=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);

        for(int i=0;i<=nums.length-1;i++){
            sum += nums[i];
            int rem = sum-k;

            if(map.containsKey(rem)){
                total += map.get(rem);
             }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return total;

    }
}