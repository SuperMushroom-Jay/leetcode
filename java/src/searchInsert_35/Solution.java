package searchInsert_35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length;
        int mid=(left+right)/2;
        while (left<right){
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid;
            }
            mid=(left+right)/2;
        }
        return mid;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.searchInsert(new int[]{1,3,5,7},8));
    }
}
