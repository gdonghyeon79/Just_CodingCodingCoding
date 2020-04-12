package DataStructure.Sort;

public class SelectionSort {
    // 선택 정렬 - Selection
    // Description
    // 가장 작은 원소를 찾아 왼쪽부터 채워나가는 형태.
    // n(n-1) / 2  시각복잡도, n^2 나옴

    // ex. [4,7,2,1,8,3,9,2]
    public static void main(String[] args) {
        int[] arr = {4,7,2,1,8,3,9,2};
        int min = 0;
        int length = arr.length;
        ShowArray(arr);

        // 선택 정렬이 틀린 경우 스왑이 계속 일어나면 안됨, 한번당 1회. 최소 위치를 찾고 미지막 한 번 교체
        /*for(int i=0; i<length; i++){
            for(int j=i+1;j<length;j++){
                if(arr[i]>arr[j]){
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
            ShowArray(arr);
        }*/

        // 스와입 한 번만 일어나게
        for(int i = 0; i<length ; i++){
            min = i;
            for(int j=i+1; j<length; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            // swap 은 하위 찾는 반복이 끝나고, 스왑.
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;

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

