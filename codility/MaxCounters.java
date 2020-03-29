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

    // 첫 시도, 77%  정확함 100%, 퍼포먼스 77%..  획득.
    public static int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int alen = A.length;
        int[] B = new int[N];
        int maxValue = 0;
        for(int i=0; i< alen; i++){
            int aValue = A[i];

            if(aValue == (N+1)){
                for(int j=0; j<N ; j++){
                    B[j] = maxValue;
                }
            }else{
                int bPoint = aValue-1;
                int beforeValue = B[bPoint];
                B[bPoint] = beforeValue + 1;

                if(maxValue < B[bPoint]){
                    maxValue = B[bPoint];
                }
            }
        }
        return B;
    }
}
