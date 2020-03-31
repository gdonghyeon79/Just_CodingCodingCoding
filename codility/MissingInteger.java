package codility;
import java.util.Arrays;
public class MissingInteger {
    public static void main(String[] args) {
        int[] A = {2};
        System.out.println(solution( A ));
    }

    // 첫 시도의 문제점은 배열에서 없는 작은 정수를 찾아야하는데, 배열 후 리스트 중간이나 마지막에 없는 숫자만 찾았음. 1이 비어 있어도 찾지 않
    // 여러번 시도..
    // 문제 의도를 정확히 하지 못했음... 가령  4,5,6,7 이렇게 나오면 1을 찾아내야하는데, 나는 3이라고 생각, 4,5,6,8,9 이렇게면 7을 찾아야 한다고 생각,
    // 결론적으로 문제 의도는 1~범위 1000000 까지 가장 낮은 정수를 찾는것.
    // 이런 것 문제 의도 파악하기가 어렵다.
    public static int solution(int[] A){
        // write your code in Java SE 8
        // write your code in Java SE 8
        Arrays.sort(A);
        int aLen = A.length;

        int pivot = 0;
        int maxValue = A[aLen-1];

        if(A[aLen-1] <= 0 ){
            return 1;
        }else{
            for(int i=0; i<aLen-1; i++){
                if(A[i] <= 0){
                    pivot++;
                    continue;
                }else{
                    if(A[pivot] > 1){
                        return 1;
                    }
                    if(A[i]==A[i+1]){
                        // 이웃하는 수가 같으면 이동
                        continue;
                    }else if(A[i]+1==A[i+1]){
                        // 이웃하는 수가 +1 값이면 이동
                        continue;
                    }else{
                        // 이웃이 같거나 +1 값이 아님 빠진값 발생.
                        // 그중에서 마지막 -1, 마지막 자리 경우
                        return A[i]+1;

                    }

                }

            }

            if(A[pivot] == 1){
                return A[aLen-1]+1;
            }else{
                return 1;
            }

        }
    }
}
