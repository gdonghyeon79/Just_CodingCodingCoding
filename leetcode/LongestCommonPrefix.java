package leetcode;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String[] strs1 = {"a","aa","aaaa"};
        String[] strs2 = {""};

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String result =longestCommonPrefix.longestCommonPrefix( strs );

        System.out.println("result -> " + result);
    }

    public String longestCommonPrefix(String[] strs) {
        int arrCount = strs.length;
        StringBuilder sb = new StringBuilder();

        if(arrCount>0){
            int strLength = strs[0].length();
            if(!(strLength > 0)){
                return "";
            }
            int i=0;
            boolean isRun = true;

            while(i<strLength && isRun){
                char ch = strs[0].charAt(i);
                int cnt = 0;
                for(int j=0; j<arrCount;j++){
                    if(i>=strs[j].length()){
                        isRun = false;
                        break;
                    }
                    if(ch == strs[j].charAt(i)){
                        cnt++;
                    }
                }

                if(cnt == arrCount){
                    sb.append(ch);
                }else{
                    isRun = false;
                }
                i++;
            }
        }


        return sb.toString();
    }
}

