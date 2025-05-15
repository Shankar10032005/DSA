class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] positive = new int[n / 2];
        int[] negative = new int[n / 2];

        int p = 0, ne = 0;
        for (int num : nums) {
            if (num > 0) {
                positive[p++] = num;
            } else {
                negative[ne++] = num;
            }
        }

       int v = 0;
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = positive[v++];
            } else {
                nums[i] = negative[l++];
            }
        }

        return nums;
    }
}
