package codility;

import java.util.Arrays;

public class PermCheck {
    public static void main(String[] args) {

        // 이런 값이 들어올 때를 생각 못했다.
        int[] A = {9, 5, 7, 3, 2, 7, 3, 1, 10, 8};

        // 위 배열을 1,2,3,3,5,7,7,8,9,10
        System.out.println( soloution( A ) );
    }

    public static int soloution(int[] A){
        //100% , 첫시도 순열을 가장 순열아닌 배열, [1,2,2,4] 첫과 끝은 순열 기준이 맞지만 가운데가 틀림.
        Arrays.sort(A);

        int aLen = A.length;

        // 순열의 조건을 1~N ,
        if(A[0] != 1){
            return 0;
        }
        for(int i=0; i<aLen;i++){
            if(A[i] != i+1){
                return 0;
            }
        }
        return 1;
    }
}
