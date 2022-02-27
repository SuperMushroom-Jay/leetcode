package plusOne_66;

public class Solution {
    public int[] plusOne(int[] digits) {
        boolean carry=false;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                break;
            }else{
                digits[i]=0;
                if(i==0){
                    carry=true;
                }else{
                    digits[i-1]++;
                    if(digits[i-1]<10){
                        break;
                    }
                }
            }
        }
        if(carry){
            int[] answer=new int[digits.length+1];
            System.arraycopy(digits, 0, answer, 1, digits.length);
            answer[0]=1;
            return answer;
        }
        return digits;
    }
}
