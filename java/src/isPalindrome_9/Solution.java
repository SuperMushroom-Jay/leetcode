package isPalindrome_9;

public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int left=1;
        int right=1;
        int numLen;
        for(numLen=1;numLen<10;numLen++){
            right *= 10;
            if(x/right==0){
                right/=10;
                break;
            }
        }
        for(int i=1;i<=(numLen+1)/2;i++){
            if((x/left)%10!=(x/right)%10) return false;
            left*=10;
            right/=10;
        }
        return true;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.isPalindrome(1234554321));
    }
}
