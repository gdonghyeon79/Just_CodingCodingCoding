package codility;
import java.util.Arrays;
public class MissingInteger {
    public static void main(String[] args) {
        int[] A = {2};
        System.out.println(solution( A ));
    }

    // 첫 시도의 문제점은 배열에서 없는 작은 정수를 찾아야하는데, 배열 후 리스트 중간이나 마지막에 없는 숫자만 찾았음. 1이 비어 있어도 찾지 않음
    public static int solution(int[] A){
        // write your code in Java SE 8
        Arrays.sort(A);
        int aLen = A.length;

        if(A[aLen-1]<= 0){
            return 1;
        }

        int pivot = 0;
        while(pivot<(aLen-1)){
            if(A[pivot] == A[pivot+1]){
                pivot++;
            }else if((A[pivot]+1) == A[pivot+1]){
                pivot++;
            }else{
                return A[pivot]+1;
            }
        }
        return A[aLen-1]+1;
    }
}
