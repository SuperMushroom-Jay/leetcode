package lengthOfLastWord_58;

public class Solution {
    public int lengthOfLastWord(String s) {
//        String[] str=s.split(" ");
//        return str[str.length-1].length();
        int firstIndex;
        int lastIndex=s.length()-1;
        while (s.charAt(lastIndex)==' ')   //从末尾定位到非空格位置
            lastIndex--;
        firstIndex=lastIndex;
        while (firstIndex>=0&&s.charAt(firstIndex)!=' ')
            firstIndex--;
        return s.substring(firstIndex+1,lastIndex+1).length();
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.lengthOfLastWord(" 78910"));
    }
}
