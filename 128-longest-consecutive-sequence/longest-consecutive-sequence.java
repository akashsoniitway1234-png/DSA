class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int longest = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        for(int j : set){
            if(!set.contains(j-1)){
                int cnt = 1;
                int x = j;
                while(set.contains(x+1)){
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}