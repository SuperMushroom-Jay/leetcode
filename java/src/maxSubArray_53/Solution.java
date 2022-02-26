package maxSubArray_53;

public class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        //考虑含有非负数情况
        for (int num : nums) {
            sum += num;
            maxSum = Math.max(sum, maxSum);
            sum = Math.max(0, sum);
        }
        //考虑是否全为负数情况
        return maxSum;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.maxSubArray(new int[]{-2,-1}));
    }
}
