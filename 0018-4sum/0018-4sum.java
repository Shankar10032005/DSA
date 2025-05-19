class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        int a=0;
        while(a<=nums.length-4){
            int b=a+1;
            while(b<=nums.length-3){
            int c=b+1;
            int d=nums.length-1;

            while(c<d){
                long sum = (long) nums[a] + nums[b] + nums[c] + nums[d];

                if(sum < target){
                    c++;
                }
                else if(sum > target){
                    d--;
                }
                else{
                    List<Integer> four=Arrays.asList(nums[a],nums[b],nums[c],nums[d]);
                    list.add(four);
                    c++;
                    d--;
                    while(nums[c]==nums[c-1] && c<d){
                        c++;
                    }
                     while(nums[d]==nums[d+1] && c<d){
                        d--;
                    }
                }

            }
            b++;
        while(nums[b]==nums[b-1] && b<=nums.length-3){
            b++;
        }
        }
        
        a++;
        while(nums[a]==nums[a-1] && a<=nums.length-4){
            a++;
        }
        }

        return new ArrayList<>(list);
    }
}