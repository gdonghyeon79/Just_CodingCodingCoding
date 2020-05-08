package mytest;

/*

 */
public class Test4 {

    public static void main(String[] args) {
        int[] A = {5,2,4,6,3,7};
        //int[] A = {4,10,10000,2,2,7,2,10,1};
        Test4 test4 = new Test4();
        //int[] A = {2,2,2,2,2,2,2,2,2};
        System.out.println("minValue : " + test4.solution(A));

        System.out.println("minValue 2 : " + test4.solution_idea1(A));

    }

    // idea, min value 3개
    public int solution_idea1(int[] A){
        int A_length = A.length;
        if(A_length < 5){
            return -1;
        }
        // 조건 0, 끝은 대상이 아님. 조건 최소값 1, 최대값 1,000,000,000 , 제일 작은 경우 2, 제일 큰 경우 2,000,000,000
        int minValue = 1000000000;   //  작은
        int minPoint = -1;
        int mminValue = 1000000000;  //  중간 작은
        int mminPoint = -1;
        int mmminValue = 1000000000; //  가장 작은
        int mmminPoint = -1;

        int minSum = 2000000000;

        for(int i=1; i< A_length -1 ; i++){
            int tmp = A[i];
            if(tmp<minValue){
                if(tmp<mminValue){
                    if(tmp<mmminValue){
                        // 중간 작은 값을 작은 값으로 밀어내기
                        minPoint = mminPoint;
                        minPoint = mminValue;

                        // 중간 작은 값에 가장 작은 값으로 밀어내기
                        mminPoint = mmminPoint;
                        mminValue = mmminValue;

                        //가장 작은 값에 새로운 값 넣기
                        mmminValue = tmp;
                        mmminPoint = i;
                    }else{
                        // 중간값 작은 값으로 밀기
                        minPoint = mminPoint;
                        minPoint = mminValue;

                        // 중간 값에 새로운 값 넣기
                        mminValue = tmp;
                        mminPoint = i;
                    }
                }else{
                    minValue = tmp;
                    minPoint = i;
                }
            }else{
                if(minPoint < 0){
                    minPoint = i;
                }
            }
        }

        System.out.println("minPoint, minValue >> " + minPoint + minValue);
        System.out.println("mminPoint, mminValue >> " + mminPoint + mminValue);
        System.out.println("mmminPoint, mmminValue >> " + mmminPoint + mmminValue);
        if(Math.abs(mmminPoint - mminPoint) > 0){
            return mmminValue + mminValue;
        }else{
            return mmminValue + minValue;
        }
    }


    // brute force
    public int solution(int[] A){
        int A_length = A.length;
        if(A_length < 5){
            return -1;
        }
        // 조건 0, 끝은 대상이 아님. 조건 최소값 1, 최대값 1,000,000,000 , 제일 작은 경우 2, 제일 큰 경우 2,000,000,000
        int minValue = 2000000000;
        //brute force, 인접 x, ;
        System.out.println("A_length >> " + A_length);
        for(int i=1; i< A_length - 3; i++){
            for(int j=i+2; j<A_length - 1; j++){
                System.out.println("brute force i, j >> " + i + ", "+j);
                int val = A[i] + A[j];
                if(val < minValue){
                    minValue = val;
                }
                if(val == 2){
                    minValue = val;
                    break;
                }
            }
        }
       return minValue;
    }
}
