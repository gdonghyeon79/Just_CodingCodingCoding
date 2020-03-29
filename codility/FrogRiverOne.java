package codility;

public class FrogRiverOne {

    public static void main(String[] args) {
        int[] A = {1,3,1,4,2,3,5,4};
        int result = solution(5, A);
        System.out.println("result -> " + result);
    }

    public static int solution(int X, int[] A){
        // ㅊㅓ음에 의도를 완전히 잘못 파악.
        // A[i] 값을 나뭇잎이 떨어지는 갯수라 착각, 위치 값임.

        // 위 실수 - 너무 단순하게 생각해도 너무 단순,
        // 두 번째 시도시, 값은 위치 포인트 파악.
        // 문제는 X값이 나올때까지  비교를 함. 역시 오류.
        // 세번 째 시도해서 풀어낸 소스
        // 위치 1부터~ X까지 순차 배열을 만들어, 위치 값이 0이면 건너뛸 수 없음.
        // 0에 들어갈 때 배열 위치 체크 채울 카운트 -1
        // 카운트가 0이되면 각 위치 포인트가 모두 채워짐. 그 시점에 i 리턴
        int aLen = A.length;
        int count = X;
        int[] B = new int[X];
        for(int i=0 ; i < aLen; i++){
            int aValue = A[i];
            if(B[aValue-1] == 0){
                count--;
                B[aValue -1] = aValue;
            }
            if(count == 0){
                return i;
            }
        }
        return -1;
    }

}
