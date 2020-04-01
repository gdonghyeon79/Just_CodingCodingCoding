package leetcode;

import java.math.BigDecimal;

// 2020.03.30
public class StringToInteger {

    public static void main(String[] args) {
        String str = "2147483646";

        myAtoi( str );

    }
    public static int myAtoi(String str) {

        str = str.trim();
        int strLen = str.length();
        boolean isPlus = true;
        int pivot = 0;
        if(strLen == 0)
            return 0;
        if(str.charAt(pivot) == '-'){
            isPlus = false;
            pivot++;
        }else if(str.charAt(pivot) == '+'){
            pivot++;
        }
        StringBuffer sb = new StringBuffer();
        int sbCount = 0;
        while(pivot<strLen){
            char ch = str.charAt(pivot);
            if(ch >= '0' && ch <= '9'){
                if(sbCount == 0 && ch == '0'){
                    pivot++;
                    continue;
                }
                sb.append(ch);
                sbCount++;
                pivot++;
            }else{
                break;
            }
        }
        long l = 0l;
        if(sbCount == 0){
            return 0;
        }else if(sbCount > 10){
            if(isPlus){
                return Integer.MAX_VALUE;
            }else{
                return Integer.MIN_VALUE;
            }
        }
        else{
            l = Long.parseLong(sb.toString());
        }

        System.out.println(sb.toString());
        l = isPlus ? l : l*-1;

        if(l>=Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(l<=Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        return (int)l;
    }
}
