class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int len=(nums.length/3)+1;

        for(int i=0;i<=nums.length-1;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])==len  && !list.contains(nums[i])){
                list.add(nums[i]);
            }
            if(list.size()==2 ){
                break;
            }
        }
        return list;
    }
}