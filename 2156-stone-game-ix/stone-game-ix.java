class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] cnt = new int[3];

        for (int stone : stones) {
            cnt[stone % 3]++;
        }

        // Even number of remainder-0 stones
        if (cnt[0] % 2 == 0) {
            return cnt[1] > 0 && cnt[2] > 0;
        }

        // Odd number of remainder-0 stones
        return Math.abs(cnt[1] - cnt[2]) > 2;
    }
}