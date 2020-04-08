package leetcode;

public class CountAndSay {
    public static void main(String[] args) {
        int n =1;
        if(n<=0){
            System.out.println("-1");
        }

        String result = "1";
        for(int i=1;i<n;i++){
            result = method(result);
        }

        System.out.println(result);
     }

    public static String method(String result){
        StringBuilder sb = new StringBuilder();
        int p = 0;
        while(p<result.length()){
            char ch = result.charAt(p);
            int count = 0;

            while(p<result.length() && ch == result.charAt(p)){
                p++;
                count++;
            }
            sb.append(count);
            sb.append(ch);
        }

        return sb.toString();
    }
}
