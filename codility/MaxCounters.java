package codility;

public class MaxCounters {

    public static void main(String[] args) {
        int[] A = new int[7];
        A[0] = 3;
        A[1] = 4;
        A[2] = 4;
        A[3] = 6;
        A[4] = 1;
        A[5] = 4;
        A[6] = 4;
        int N = 5;

        System.out.println("result -- > " + solution(N, A));
    }

    // 첫 시도 : 77%  정확함 100%, 퍼포먼스 77%..  획득.
    // 2ㅊㅏ 시도 : max 값을 찾기 위한 for문 제거 목적. for 문에 for은 성능에 치명적.
    // for문을 따로 두번, N+1 값을 기준으로 이하 값은 없음, max 값에 인크리즈, 나중에 max값보다 낮은 위치 값만 max 값으로 대체 후 리턴.

    public static int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int aLen = A.length;
        int[] B = new int[N];

        int maxVal = 0;
        int maxTmp = 0;

        for(int i=0; i<aLen; i++){
            int aVal = A[i];
            if(aVal == (N+1)){
                maxVal = maxTmp;
            }else{
                int beforeVal = B[aVal-1];
                if(beforeVal <= maxVal){
                    B[aVal-1] = maxVal+1;
                }else{
                    B[aVal-1] = beforeVal+1;
                }
                if(B[aVal-1] > maxTmp){
                    maxTmp = B[aVal-1];
                }
            }
        }
        for(int j=0; j<B.length;j++){
            if(B[j]<maxVal){
                B[j] = maxVal;
            }
        }
        return B;
    }
}
