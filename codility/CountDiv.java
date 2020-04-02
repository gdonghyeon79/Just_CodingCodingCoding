package codility;

import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;
import jdk.nashorn.internal.parser.JSONParser;

public class CountDiv {
    public static void main(String[] args) {
        // 50%, 50% 틀린 케이스
        System.out.println("resutl -> " + solution(0,0,11));
        //처음에 반복이 아닌 카운트 계산 법으로 풀어야 했음.
        //같은 수 일때 무조건 0이 아니라 나눠지는 값인지 확인 필요했음
        // // -- 1차 시도 50% 사유 기재

        //2차 시도 ?
    }

    public static int solution(int A, int B, int K) {
        // write your code in Java SE 8

        // 예외조건 바로 리턴 가능
        // K가 크면 나눠지는 수가 없음. 제외
        if(B<K || K==0){
            return 0;
        }
        if(K == 1){ // 간격만큼 모두
            return B-(A-1);
        }
        if((B-A) == 0 || K == B){
            return 1;
        }
        int divA = A/K;
        int modA = A%K;
        if( modA != 0){
            if(A+(K-modA) > B){
                return 0;
            }else{
                divA =divA +1;
            }
        }
        int count = 0;
        for(int i = divA; i*K <= B ; i++){
            count++;
        }

        return count;
    }
}
