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
        int alen = A.length;
        for(int i=0; i < alen ; i++){
            if(A[i] == X){
                return i;
            }
        }
        return -1;
    }

}
