class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int num1=Integer.MIN_VALUE;
        int num2=Integer.MIN_VALUE;
        int count1=0;
        int count2=0;
        int i=0;

        while(i<=nums.length-1){

            if(count1 ==0 && num2 != nums[i]){
            num1=nums[i];
            count1 = 1;
           

            }
            else if(count2 == 0 && num1 != nums[i]){
            num2=nums[i];
            count2=1;
            
            }
            else if(nums[i]==num1){
                count1+=1;
            }
            else if(nums[i]==num2){
                count2+=1;
            }
            else{
                count1-=1;
                count2-=1;
                
            }
            i++;


        }
        ArrayList<Integer> list=new ArrayList<>();
        int len=(nums.length/3)+1;
        int cnt1=0;
        int cnt2=0;
        for(int j=0;j<=nums.length-1;j++){
            if(nums[j]==num1){
                cnt1+=1;
                if(cnt1==len){
                    list.add(num1);
                }
            }
            else if(nums[j]==num2){
                cnt2+=1;
                if(cnt2==len){
                    list.add(num2);
                }
            }
        }

        return list;
        
    }
}