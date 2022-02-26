package removeElement_27;

public class Solution {
    public int removeElement(int[] nums,int val){
        int slowIndex=0;
        int fastIndex=0;
        //定位到第一个val位置
        while (fastIndex<nums.length&&nums[fastIndex]!=val) {
            fastIndex++;
            slowIndex++;
        }
        while (fastIndex<nums.length){
            //然后判断定位到的val后非val数
            while (nums[fastIndex]==val){
                fastIndex++;
                if(fastIndex==nums.length){
                    return slowIndex;
                }
            }
            //然后修改数字
            nums[slowIndex++]=nums[fastIndex++];
        }
        return slowIndex;
    }
    //[0,1,2,2,3,0,4,2]
    public static void main(String[] args){
        Solution solution =new Solution();
        int[] array=new int[]{1,3};
        int len=solution.removeElement(array,2);
        for(int i=0;i<len;i++){
            System.out.print(array[i]+" ");
        }
    }
}
