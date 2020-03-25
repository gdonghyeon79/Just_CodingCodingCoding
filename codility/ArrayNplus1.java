package codility;

import java.util.*;

public class ArrayNplus1 {

    public static void main(String[] args){
        solution( )
    }

    // 첫 50%,
    // 빈리스트, 싱클엘리먼트, 더블엘리먼트, 범위.
    public static int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);
        int pivotValue = A[0];

        int startPoint = 0;
        int endPoint = A.length -1;
        int value = 0;
        int midPoint = 0;

        while(startPoint <= endPoint){
            if((pivotValue+startPoint) != A[startPoint]){
                // 같으면 정상, 작은 경우 없음, 큰 경우 본 수치보다 +1 인 경우
                return A[startPoint] -1;
            }

            midPoint = (startPoint + endPoint) / 2;

            if(A[midPoint] == pivotValue+midPoint){
                startPoint = midPoint +1;
            }else{
                endPoint = midPoint;
            }

        }
        return 0;
    }

}

// 이게.. 너무 어렵게 생각했다. 조건을 잘 보자. 1부터 시작하는 배열이였음. 첫자리부터 1.. 이렇게 가야함.
// 정렬다 되더 있음. 다음 숫자를...
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);

        for(int i= 0; i<A.length; i++){
            // 조건 A는 1부터 시작한다.  N+1까지..
            if(i+1 != A[i]){
                return i+1;
            }

        }
        // 빠진수가 없음. 마지막의 다음 숫자
        return A.length+1;
    }
}