package codility;

public class GeonomicRangeQuery {
    public static void main(String[] args) {

        String S = "AC";
        int[] P = {0, 0, 1};
        int[] Q = {0, 1, 1};

        int[] result = solution(S, P, Q);
        for(int i=0; i<result.length;i++) {
            System.out.println(result[i]);
        }
    }
    // 첫 제출. 50%
    public static int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int S_length = S.length();
        int P_length = P.length;

        int[] result = new int[P_length];

        for(int K=0; K<P_length; K++){
            System.out.println(K);
            if(Q[K] >= S_length){
                break;
            }
            String tmpS = S.substring(P[K],Q[K]+1);
            if(tmpS.indexOf('A') > -1){
                result[K] = 1;
            }else{
                if(tmpS.indexOf('C') > -1){
                    result[K] = 2;
                }else{
                    if(tmpS.indexOf('G') > -1){
                        result[K] = 3;
                    }else{
                        result[K] = 4;
                    }
                }
            }
        }

        return result;
    }
}
