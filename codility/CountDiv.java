package codility;

public class CountDiv {
    public static void main(String[] args) {
        // 50%, 50% 틀린 케이스
        System.out.println("resutl -> " + solution(1,10000,10001));
        //처음에 반복이 아닌 카운트 계산 법으로 풀어야 했음.
        //같은 수 일때 무조건 0이 아니라 나눠지는 값인지 확인 필요했음
        // // -- 1차 시도 50% 사유 기재
        //2차 시도 ?
    }

    public static int solution(int A, int B, int K) {
        // write your code in Java SE 8
        // 예외조건 바로 리턴 가능
        // K가 크면 나눠지는 수가 없음. 제외
        if (K == 0) {
            return 0;
        }else if(K == 1){ // 간격만큼 모두
            return B-(A-1);
        }
        // 같은 값에 나머지 0이면 나눠지는 수는 1개
        if(A==B && B%K == 0){
            return 1;
        }

        System.out.println("dfadf");
        // 일반적인 상황.
        int divA = A/K;
        int modA = A%K;
        if( modA != 0){
            if(A+(K-modA) > B){
                return 0;
            }
            divA = (A+(K-modA))/K;
        }
        //divA
        int divB = B/K;
        int modB = B%K;
        if(modB != 0){
            if( (B-modB) <= (divA*K)){
                return 1;
            }
            divB = (B-modB)/K;
        }

        return divB-(divA-1);
    }
}
