package DataStructure.Sort;

public class BubbleSort {
    public static void main(String[] args) {
        //단순정렬, 기본 알로기즘 버블정렬
        // 배열내서 연속된 두 항목 가리키고, 비교한 후, 끝 숫자를 뒤로 자리 바꿈.
        // n , n+1

        int[] arr = {9,8,7,6,5,4,3,2,1};
        int length = arr.length;
        for(int i=0; i<length;i++){
            for(int j=0; j<length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
            ShowArray(arr);
        }
    }
    private static void ShowArray(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"  ");
        }
        System.out.println();
    }
}
