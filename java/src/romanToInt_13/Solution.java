package romanToInt_13;

import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
//        //1.第一种方法
//        if(s.equals("")) return 0;
//        HashMap<String,Integer> map=new HashMap<String,Integer>();
//        map.put("I",1);
//        map.put("V",5);
//        map.put("X",10);
//        map.put("L",50);
//        map.put("C",100);
//        map.put("D",500);
//        map.put("M",1000);
//        map.put("IV",4);
//        map.put("IX",9);
//        map.put("XL",40);
//        map.put("XC",90);
//        map.put("CD",400);
//        map.put("CM",900);
//        //IV:4 IX:9
//        //XL:40 XC:90
//        //CD:400 CM:900
//        int sumNumber=0;
//        int singleNumber=0;
//        int doubleNumber=0;
//        for(int i=0;i<s.length();i++){
//            if(i<s.length()-1&&map.containsKey(s.substring(i,i+2))){
//                doubleNumber=map.get(s.substring(i,i+2));
//                sumNumber+=doubleNumber;
//                if(i==s.length()-2) break;
//                i++;
//            }else{
//                singleNumber=map.get(s.substring(i,i+1));
//                sumNumber+=singleNumber;
//            }
//        }
//        return sumNumber;

        //第二种方法
//        int sumNumber=0;
//        int tempNumber=0;
//        String key;
//        for(int i=0;i<s.length();i++){
//            key=s.substring(i,i+1);
//            if((key.equals("I")||key.equals("X")||key.equals("C"))&&i<s.length()-1&&(tempNumber=getNumber(s.substring(i,i+2)))!=0){
//                sumNumber+=tempNumber;
//                if(i==s.length()-2) break;
//                i++;
//            }else{
//                sumNumber+=getNumber(key);
//            }
//        }
//        return sumNumber;
        int preNumber=getNumber(s.charAt(0));
        int nowNumber=0;
        int sumNumber=0;
        if(s.length()==1)
            return preNumber;
        //System.out.println("len="+s.length());
        for(int i=1;i<s.length();i++){
            nowNumber=getNumber(s.charAt(i));
            //System.out.println("i="+i);
            //特殊数
            if(preNumber<nowNumber){
                //System.out.println(sumNumber+"+"+nowNumber+"-"+preNumber+"="+(sumNumber+nowNumber-preNumber)+",  i="+i);
                sumNumber+=nowNumber-preNumber;
                i=i+1;
                if(i>=s.length())  break;
                preNumber=getNumber(s.charAt(i));

            }else{  //普通数
                //System.out.println(sumNumber+"+"+preNumber+"="+(sumNumber+preNumber)+",  i="+i);
                sumNumber+=preNumber;
                preNumber=nowNumber;
            }
            //若最后一个是普通数，则再加一次preNumber
            if(i==s.length()-1) sumNumber+=preNumber;
        }
        return sumNumber;
    }
    int getNumber(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:return 0;
        }
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.romanToInt(   "XV"
        ));
    }
}
