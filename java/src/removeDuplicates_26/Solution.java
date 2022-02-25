package removeDuplicates_26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int len=1;  //用来记录未重复项的索引
        int preNumber=nums[0];
        for(int i=1;i<nums.length;i++){
            while (nums[i]==preNumber){ //找到与记录数字不同的数字，并定位这个数字的索引i
                i++;
                if(i==nums.length){ //若i等于num长度返回数组长度
                    return len;
                }
            }
            preNumber=nums[i];
            nums[len++]=nums[i];
        }
        return len;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        int[] array=new int[]{0,0,1,1,1,2,2,3,3,4};
        int k=solution.removeDuplicates(array);
        for(int i=0;i<k;i++){
            System.out.print(array[i]+" ");
        }
    }
}
