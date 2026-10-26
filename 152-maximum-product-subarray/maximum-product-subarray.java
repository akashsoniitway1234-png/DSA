class Solution {
    public int maxProduct(int[] nums) {
      int max = Integer.MIN_VALUE;
      int pr = 1, sf = 1, n = nums.length;
      for(int i = 0; i < n; i++){
        if(pr == 0) pr = 1;
        if(sf == 0) sf = 1;
        pr *= nums[i];
        sf *= nums[n - i - 1];
        max = Math.max(max , Math.max(pr, sf));
      }
      return max;  
    }
}