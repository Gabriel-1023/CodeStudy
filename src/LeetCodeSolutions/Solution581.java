package LeetCodeSolutions;

class Solution581 {
    public static int findUnsortedSubarray(int[] nums) {
        int l = -1, r = -1, n = nums.length;
        int maxn = Integer.MIN_VALUE, minn = Integer.MAX_VALUE;
        for(int i = 0; i < n; i ++) {
            // 寻找子数组B的右边界
            if(nums[i] < maxn) {
                r = i;
            } else {
                maxn = nums[i];
            }
            // 寻找子数组B的左边界
            if(nums[n - 1 - i] > minn) {
                l = n - 1 - i;
            } else {
                minn = nums[n - 1 - i];
            }
        }
        if(l == -1) return 0;
        return r - l + 1;
    }

    public static void main(String[] args) {
//        int[] nums = {2,6,4,8,10,9,15};
        int[] nums = {1,3,5,4,2};
        System.out.println(findUnsortedSubarray(nums));
    }
}
