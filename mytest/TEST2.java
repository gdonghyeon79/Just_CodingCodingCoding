package mytest;
import java.util.Arrays;
import java.lang.Math;


public class TEST2 {
    /**
     * 2
     *
     * You are given a string S. Deletion of th K-th letter of S costs C[k]. After deleting a letter, the costs of deleting other letters do not change.
     * For example for S='ab' and C=[1,3] after deleting 'a', deletion of 'b' will still cost 3.
     *
     * You want to delete some letters from S to obtain a string without two identical letters next to each other. What is the minimum total cost of deletions to achieve such a string?
     *
     * given S ="abccbd" and C =[0,1,2,3,4,5], the function should return 2. you can delete the first occurence of 'c' to achieve "abcbd"
     *
     * given S = "aabbcc" and C =[1,2,1,2,1,2] the function should return 3.
     * by deleting all letters with a cost of 1, you can achieve string "abc".
     *
     * given S ="aaaa" and C=[3,4,5,6] the function should return 12. You need to delete all but one letter 'a', and the lowest cost of deletions is 3+4+5+12.
     *
     * given S ="ababa" and C =[10,5,10,5,10] the function should return 0. there is no need to delete any letter
     *
     * 문자열 S가 주어집니다. K 번째 S 번째 문자의 삭제 비용 C [k]. 문자를 삭제 한 후에 다른 문자를 삭제하는 비용은 변경되지 않습니다.
     * 예를 들어 'a'를 삭제 한 후 S = 'ab'및 C = [1,3]의 경우 'b'를 삭제하면 여전히 3입니다.
     *
     * S에서 일부 문자를 삭제하여 서로 동일한 두 문자가없는 문자열을 얻으려고합니다. 그러한 문자열을 달성하기위한 최소 총 삭제 비용은 얼마입니까?
     *
     * S = "abccbd"및 C = [0,1,2,3,4,5]의 경우 함수는 2를 반환해야합니다. "abcbd"를 달성하기 위해 'c'의 첫 번째 발생을 삭제할 수 있습니다.
     *
     * S = "aabbcc"이고 C = [1,2,1,2,1,2] 인 경우 함수는 3을 반환해야합니다.
     * 비용이 1 인 모든 문자를 삭제하면 문자열 "abc"를 얻을 수 있습니다.
     *
     * S = "aaaa"및 C = [3,4,5,6] 인 경우 함수는 12를 반환해야합니다. 한 문자 'a'를 제외한 모든 문자를 삭제해야하며 가장 낮은 삭제 비용은 3 + 4 + 5 + 12입니다. .
     *
     * S = "ababa"및 C = [10,5,10,5,10]의 경우 함수는 0을 반환해야합니다. 문자를 삭제할 필요가 없습니다.
     */
    public static void main(String[] args) {

    }


}
