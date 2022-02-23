package longestCommonPrefix_14;

import javafx.scene.Parent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
//        //1
//        Pattern pattern;
//        Matcher matcher;
//        StringBuilder lcp= new StringBuilder();
//        int i,j;
//        boolean isMatch=true;
//        for(i=0;i<strs[0].length()&&isMatch;i++){
//            lcp.append(strs[0].charAt(i)); //获取第一个字符串的部分字符
//            String re="^"+lcp;
//            //System.out.println("re="+re);
//            pattern =Pattern.compile(re);
//            for(j=1;j<strs.length;j++){ //比较剩余的字符串
//                matcher = pattern.matcher(strs[j]);
//                isMatch=matcher.find();
//                //System.out.println("matcher.find()="+isMatch);
//                if(i>=strs[j].length()||!isMatch) return lcp.substring(0,i);
//            }
//        }
//        //System.out.println("answer i="+i);
//        if(i==0) return "";
//        else return lcp.toString();
//        //2
//        int i;
//        for (i=0;i<strs[0].length();i++){
//            for(int j=1;j<strs.length;j++){
//                if(i>=strs[j].length()||strs[j].charAt(i)!=strs[0].charAt(i))
//                    return strs[0].substring(0,i);
//            }
//        }
//        return strs[0];
        //3
        String lcp=strs[0];
        for(String str:strs){
            //对于不是最长公共前缀的就剪断
            while (!str.startsWith(lcp)){
                lcp=lcp.substring(0,lcp.length()-1);
            }
            if(lcp.length()==0) return "";
        }
        return lcp;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.longestCommonPrefix(
                new String[]{
                        "fss"
                }
        ));
    }
}
