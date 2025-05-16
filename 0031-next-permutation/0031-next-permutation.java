class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i] > nums[i-1]){
                index=i-1;
                break;
            }
        }

        if(index==-1){
            reverse(nums,0,nums.length-1);
            return;
        }

    
        for(int i=nums.length-1; i>index; i--){
            if(nums[i] > nums[index]){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;

                break;
            }
        }

        
            reverse(nums,index+1,nums.length-1);
        }

        static void reverse(int[] nums,int a,int b){
            while(a<b){

                int temp=nums[a];
                nums[a]=nums[b];
                nums[b]=temp;
                a++;
                b--;

            }
        }
    }
