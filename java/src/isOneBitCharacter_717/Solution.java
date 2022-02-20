package isOneBitCharacter_717;

public class Solution {
    //分支限定法
    //还需要优化
    public boolean isOneBitCharacter(int[] bits) {
        if(bits.length==0){
            return false;
        }
        if(bits[bits.length-1]!=0){
            return false;
        }
        if(bits.length==1){
            return bits[0] == 0;
        }
        return dfs(bits,bits.length-2);
    }
    //从数组末尾向前
    boolean dfs(int[] bits,int index){
        boolean isFind;
        if(index==0){
            return bits[index] == 0;
        }else if(index==1){
            //第二次没通过，是因为没有考虑到遍历到前面的两个数可以是【0,0,...满足条件...】的情况
            return (bits[index] == 0 || bits[index] == 1) && bits[index - 1] == 1 || bits[index] == 0 && bits[index - 1] == 0;
        }else{
            //0
            if(bits[index]==0){
                isFind = dfs(bits,index-1);
                if (isFind){
                    return true;
                }
            }
            //01
            if(bits[index]==0&&bits[index-1]==1){
                isFind = dfs(bits,index-2);
                if (isFind){
                    return true;
                }
            }
            //11
            if(bits[index]==1&&bits[index-1]==1){
                isFind = dfs(bits,index-2);
                return isFind;
            }
        }
        return false;
    }
//    public boolean isOneBitCharacter(int[] bits){
//        int n = bits.length, i = n - 2;
//        while (i >= 0 && bits[i] == 1) {
//            --i;
//        }
//        return (n - i) % 2 == 0;
//    }
    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.isOneBitCharacter(new int[]{1,0,1,1,0}));
    }
}
