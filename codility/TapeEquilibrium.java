package codility;

public class TapeEquilibrium {

    public static void main(String[] args){
        int A[] = {3,1,2,4,3};
        System.out.println("A min value -> "+  solution( A ));
    }

    // result n 100% 나옴. 이중 for 말고, n을 분리해서 처리하는 방법 생각할 것,
    // 2개인 경우 for
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int aLen = A.length;

        boolean resultInit = false;
        int resultValue = 0;

        // 0< P < aLen
        // a-b
        int a = 0;
        int b = 0;
        for (int i = 0; i < aLen; i++) {
            b = b + A[i];
        }
        for(int p = 0 ; p <= aLen-2 ; p++){
            int ap = A[p];
            a = a + ap;
            b = b - ap;
            int ab = Math.abs(a - b);
            if(resultInit){
                if(resultValue > ab){
                    resultValue = ab;
                }
            }else{
                resultInit = true;
                resultValue = ab;
            }

        }
        return resultValue;
    }
}
