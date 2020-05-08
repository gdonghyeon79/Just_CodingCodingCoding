package my;

public class test {
    public static void main(String[] args) {

        String S2 = "CAGCCTA";
        int[] P2 = {2, 5, 0};
        int[] Q2 = {4, 5, 6};

        //A, C, G, T  발생을 찾는 4개 각각 배열 사이즈7 필요
        int[] A = new int[S2.length()+1];
        int[] C = new int[S2.length()+1];
        int[] G = new int[S2.length()+1];
        // 해당 없으면 4
        for(int i=0; i<S2.length(); i++ ){
            char ch = S2.charAt( i );

            switch(ch){
                case 'A':
                    A[i+1] = A[i+1] + 1;
                    break;
                case 'C':
                    C[i+1] = C[i+1] + 1;
                    break;
                case 'G':
                    G[i+1] = G[i+1] + 1;
                    break;
                default:
                    break;
            }
            A[i+1] = A[i+1] + A[i];
            C[i+1] = C[i+1] + C[i];
            G[i+1] = G[i+1] + G[i];

        }

        for(int i=0;i<10;i++){
            System.out.println(A[i+1] +" , " + C[i+1] + " , "+ G[i+1]);

        }

        int[] answer = new int[P2.length];

        for(int j=0; j<answer.length; j++){
            int s = P2[j];  //2
            int e = Q2[j];  //4

            if(s == e){
                char ch = S2.charAt( s );
                switch(ch){
                    case 'A':
                        answer[j] =1;
                        break;
                    case 'C':
                        answer[j] =2;
                        break;
                    case 'G':
                        answer[j] =3;
                        break;
                    default:
                        answer[j] =4;
                        break;
                }
            }else if( A[s] != A[e]){

            }
        }

    }
}
