package codility;

public class GeonomicRangeQuery {
    public static void main(String[] args) {

        String S = "AC";
        int[] P = {0, 0, 1};
        int[] Q = {0, 1, 1};

        String S2 = "CAGCCTA";
        int[] P2 = {2, 5, 0};
        int[] Q2 = {4, 5, 6};

        int[] result = solution(S2, P2, Q2);
        for(int i=0; i<result.length;i++) {
            System.out.println(result[i]);
        }
    }
    // 첫 제출. 50% --> O(N*M) 구조가 나옴, 100%는  O(N+M) , 시간복잡도가 관건.
    // 구현이 어렵다, 풀이 방법 기억해둘 것.
    public static int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[] A = new int[S.length() + 1];
        int[] C = new int[S.length() + 1];
        int[] G = new int[S.length() + 1];

        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'A':
                    A[i + 1]++;
                    break;
                case 'C':
                    C[i + 1]++;
                    break;
                case 'G':
                    G[i + 1]++;
                    break;
                default:
                    break;
            }

            A[i + 1] = A[i + 1] + A[i]; // 인덱스서 발생되면 그 값을 다음 인덱스로 복사
            C[i + 1] = C[i + 1] + C[i];
            G[i + 1] = G[i + 1] + G[i];

            System.out.println(A[i+1] +" , " + C[i+1] + " , "+ G[i+1]);
        }


        int[] answer = new int[P.length];

        for (int i = 0; i < answer.length; i++) {
            int startIndex = P[i];
            int endIndex = Q[i];
System.out.println("st : "+ startIndex + " , ed : " + endIndex);
            if (startIndex == endIndex) {
                System.out.println("startIndex == endIndex");
                char c = S.charAt(startIndex);
                System.out.println("c : " + c);
                switch (c) {
                    case 'A':
                        answer[i] = 1;
                        break;
                    case 'C':
                        answer[i] = 2;
                        break;
                    case 'G':
                        answer[i] = 3;
                        break;
                    case 'T':
                        answer[i] = 4;
                        break;
                }
            } else if (A[startIndex] != A[endIndex + 1]) {
                System.out.println("A[startIndex] != A[endIndex + 1] " + A[startIndex] + " , "+ A[endIndex + 1] );
                answer[i] = 1;
            } else if (C[startIndex] != C[endIndex + 1]) {
                System.out.println("C[startIndex] != C[endIndex + 1] " + C[startIndex] + " , "+ C[endIndex + 1] );
                answer[i] = 2;
            } else if (G[startIndex] != G[endIndex + 1]) {
                System.out.println("G[startIndex] != G[endIndex + 1] " + G[startIndex] + " , "+ G[endIndex + 1] );
                answer[i] = 3;
            } else {
                System.out.println("else " + A[startIndex] + " , "+ A[endIndex + 1] );
                answer[i] = 4;
            }
        }

        return answer;

    }
}
