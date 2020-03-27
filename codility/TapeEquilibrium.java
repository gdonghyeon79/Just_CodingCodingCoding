package codility;

public class TapeEquilibrium {

    public static void main(String[] args){
        int A[] = {2,3,1,4,5};
        System.out.println("A min value -> "+  solution( A ));
    }

    // result n*n 결과다. 문제가 있음. 속도 개선.
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int aLen = A.length;

        boolean resultInit = false;
        int resultValue = 0;

        // 0< P < aLen

        for(int p = 1 ; p < aLen ; p ++){
            int difference = 0;
            for(int i = 0; i < aLen ; i++){
                if(i >= p){
                    difference = difference - A[i];
                }else{
                    difference = difference + A[i];
                }
            }
            difference = Math.abs(difference);
            if(resultInit){
                if(resultValue > difference){
                    resultValue = difference;
                }
            }else{
                resultInit = true;
                resultValue = difference;
            }
        }
        return resultValue;
    }
}
