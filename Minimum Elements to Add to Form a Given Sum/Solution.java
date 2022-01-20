class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long tot = 0;
        for(int num :nums){
            tot += num;
        }
        return (int) Math.ceil(Math.abs(goal - tot) / (double) limit);

    }
}