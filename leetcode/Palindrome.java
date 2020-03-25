package leetcode;

public class Palindrome {

    public static  void main(String[] args){
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome( "0P" ));
        System.out.println(palindrome.isPalindrome( "A man, a plan, a canal: Panama" ));
    }

    /**
     *  펠린드롬 : 문장을 뒤집어도 동일한 형태, 숫자, 알파벳 처리, 사이즈 0도 트루, 기타 특수문자 모두 무시 트루.
     * @param string
     * @return boolean
     */

    public boolean isPalindrome(String s) {
        int endPoint = s.length()-1;
        int beginPoint = 0;
        boolean isMatch = false;
        while(beginPoint<endPoint){
            char beginChar = Character.toLowerCase(s.charAt(beginPoint));
            char endChar = Character.toLowerCase(s.charAt(endPoint));

            //   숫자도
            if(beginChar >= 'a' && beginChar <= 'z' || beginChar >= '0' && beginChar <='9'){
                ;
            }else{
                beginPoint++;
                continue;
            }

            if(endChar >= 'a' && endChar <= 'z' || endChar >= '0' && endChar <='9'){
                ;
            }else{
                endPoint--;
                continue;
            }

            if(beginChar == endChar){
                beginPoint++;
                endPoint--;
            }else{
                return false;
            }
        }
        return true;
    }
}
