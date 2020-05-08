package mytest;

public class Test5 {

    public static void main(String[] args) {

        Test5 test5 = new Test5();

        test5.solution( 24 );

    }

    public void solution(int N){
        // Codility 2
        // Test 3
        // Coders 5

        for(int i = 1 ; i <=N ; i++){
            StringBuilder sb = new StringBuilder();

            if(i%2 == 0){
                sb.append( "Codility" );
            }
            if(i%3 == 0){
                sb.append( "Test" );
            }
            if(i%5 ==0){
                sb.append( "Coders" );
            }

            if(sb.length() == 0){
                System.out.println(i);
            }else{
                System.out.println(sb.toString());
            }
        }

    }
}
