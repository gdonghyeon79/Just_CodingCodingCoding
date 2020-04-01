package leetcode;

// indexOf  같은 거 만드는 문제.

public class StrStr {

    //한번에 통과, 쉽긴 했음.
    public static void main(String[] args) {
        System.out.println( strStr( "hello","ll" ) );
    }
    public static int strStr(String haystack, String needle) {
        int haystack_length = haystack.length();
        int needle_length = needle.length();

        if(needle_length == 0){
            return 0;
        }
        if(haystack_length< needle_length){
            return -1;
        }

        int haystack_pivot = 0;
        int needle_pivot = 0;

        while(haystack_pivot<=(haystack_length-needle_length)){
            if(haystack.charAt(haystack_pivot) == needle.charAt(needle_pivot)){
                boolean isMatch = true;
                for(int i=0; i<needle_length;i++){
                    if(haystack.charAt(haystack_pivot+i) != needle.charAt(needle_pivot+i)){
                        isMatch = false;
                        break;
                    }
                }
                if(isMatch){
                    return haystack_pivot;
                }
            }
            haystack_pivot++;
        }
        return -1;
    }
}
