package DataStructure.Sort;

public class QuickSort {
    public static void main(String[] args) {

        // quick sort : 위키백과 정리 : n개의 데이터를 정렬할 때, 최악의 경우는 O(n제곱)번의 비교를 수행, 평균적으로 O(n log n)번의 비교 수행.
        // 분할정복(divide and conquer) 방법 통해 정렬
        // 피봇 기준으로 앞에는 피봇보다 값이 작은 원소, 피봇 뒤에는 피봇보다 값이 큰 원소 기준으로 리스트를 둘로 나눔(분할)
        // 분할된 두 개의 작은 리스트에 대해 재귀적으로 이 과정을 반복. 재귀는 리스트 크기가 0이나 1이 될때까지 반복.
        // 좌측 포인터는 pivot < a[i] , 우측으로 이동하며, 피봇보다 큰 값을 만나면 멈춤.
        // 우측 포인터는 pivot > a[j] , 좌측으로 이동하며, 피봇보다 작은 값을 만나면 멈춤
        // 둘이 서로 교환.(i<=j 조건)

        // (ex) 위키피디아 설명.
        // 5 - 3 - 7 - 6 - 2 - 1 - 4
        //                         p

        // (1) 리스트 왼쪽에 있는 i 위치의 값이 피벗 값보다 크고, 오른쪽에 있는 j 위치의 값은 피벗 값보다 작으므로 둘을 교환
        //  5 - 3 - 7 - 6 - 2 - 1 - 4
        //  i                   j   p
        //  1 - 3 - 7 - 6 - 2 - 5 - 4
        //  i                   j   p

        // (2) j 위치의 값이 피벗 값보다 작지만, i 위치의 값도 피벗값보다 작으므로 교환하지 않는다.
        //  1 - 3 - 7 - 6 - 2 - 5 - 4
        //      i           j       p

        // (3) i위치를 피벗 값보다 큰 값이 나올 때 까지 진행해 j 위치의 값과 교환한다.
        //  1 - 3 - 7 - 6 - 2 - 5 - 4
        //          i       j       p
        //  1 - 3 - 2 - 6 - 7 - 5 - 4
        //          i       j       p

        // (4) i위치가 j 위치보다 커지면, i 위치의 값과 피벗 값을 교환한다.
        //1 - 3 - 2 - 6 - 7 - 5 - 4
        //            i           p
        //1 - 3 - 2 - 4 - 7 - 5 - 6
        //            p

        // (5)피벗 값 좌우의 리스트에 대해 각각 퀵 정렬을 재귀적으로 수행한다.
        //  1 - 3 - 2       7 - 5 - 6
        //  1 - 2 - 3       5 - 6 - 7
        //  완성된 리스트는 다음과 같다.
        //  1 - 2 - 3 - 4 - 5 - 6 - 7
        int[] arr ={5,3,7,6,2,1,4};
        quickSort( arr, 0, 6 );
        ShowArray( arr );
    }

    public static void quickSort(int[] arr, int left, int right) {
        int i = left;
        int j = right;

        if(i<j){
            int pivot = arr[(left+right)/2];

            while(i<j){
                while(arr[i]<pivot){
                    i++;
                }
                while(arr[j]>pivot && i < j){
                    j--;
                }

                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }

            quickSort( arr, left, i-1 );
            quickSort( arr, i+1, right );
        }

    }
    private static void ShowArray(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"  ");
        }
        System.out.println();
    }
}
