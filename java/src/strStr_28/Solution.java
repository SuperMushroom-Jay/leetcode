package strStr_28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public int strStr(String haystack, String needle) {
//        //此算法相当于暴力枚举，时间超时
//        if(needle.equals(""))
//            return 0;
//        int needleIndex;
//        int haystackIndex=0;
//        int recorder=0;
//        while (haystackIndex<haystack.length()){
//            if(haystack.charAt(haystackIndex)==needle.charAt(0)){
//                recorder=haystackIndex;
//                needleIndex=0;
//                while (haystackIndex<haystack.length()
//                        && needleIndex<needle.length()
//                        &&haystack.charAt(haystackIndex)==needle.charAt(needleIndex)){
//                    haystackIndex++;
//                    needleIndex++;
//                }
//                System.out.println("haystackIndex="+haystackIndex+", needleIndex="+needleIndex);
//                if(needleIndex==needle.length())
//                    return haystackIndex-needleIndex;
//                haystackIndex=recorder+1;
//            }else{
//                haystackIndex++;
//            }
//            System.out.println("haystackIndex"+haystackIndex);
//        }
//        return -1;

//        //直接调用java库函数的正则表达式
//        if(needle.equals(""))
//            return 0;
//        Pattern pattern=Pattern.compile(needle);
//        Matcher matcher=pattern.matcher(haystack);
//        if(matcher.find())
//            return matcher.start();
//        return -1;

//        if(needle.equals(""))
//            return 0;
//        for(int i=0;i<haystack.length();i++){
//            if(haystack.charAt(i)==needle.charAt(0)&&haystack.startsWith(needle,i))
//                return i;
//        }
//        return -1;
        return haystack.indexOf(needle);
        //暂时不会kmp算法，下次学习过后在补充
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        //"mississippi"
        //"issip"
        System.out.println(solution.strStr("a",""));
    }
}
