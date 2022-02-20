package twoSum_1;

import java.util.HashMap;

public class Solution {
    //1. 暴力搜索法
//    public int[] twoSum(int[] nums, int target) {
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i]+nums[j]==target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return null;
//    }

    //哈希表解法(用空间换时间)
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(target-nums[i])){
                return new int[]{hashMap.get(target-nums[i]),i};
            }else{
                hashMap.put(nums[i],i);
            }
        }
        return null;
    }
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7};
        Solution solution=new Solution();
        int[] s = solution.twoSum(a,5);
        if(s!=null){
            System.out.println(s[0]+","+s[1]);
        }
    }
}
