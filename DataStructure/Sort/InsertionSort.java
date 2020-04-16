package DataStructure.Sort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    public static void main(String[] args) {
        // insertion 삽입 정렬
        // 손안의 카드 정렬과 유사,
        // 새로운 카드를 기존의 정렬된 카드 사이의 올바른 자리를 찾아 삽입.
        // 새로 삽입될 카드의 수만큼 반복하게 되면 전체 카드가 정렬
        // 자료 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열부분과 비교, 자신의 위치를 찾아 삽입함으로 정렬 완성하는 알고리즘.

        // 삽입정렬은 두 번째 자료부터 시작, 그 앞의 자료들과 비교하여 삽입할 위치 지정 후 자료를 뒤로 옮기고 지정한 자리에 자료를 삽입하여 정렬하는 알고리즘.
        // 즉 두번째 자료는 첫번째 자료,
        // 세번째 자료는 두번째와 첫번째,
        // 네번째 자료는 세번째 두번째 첫번째,
        // 비교 후 자료가 삽입될 위치 찾음. 그 위치에 자료를 삽입하기 위해 자료를 한칸 씩 뒤로 이동,

        // 8,5,6,2,4
        // 5,8,6,2,4    key = 1
        // 5,6,8,2,4    key = 2
        // 2,5,6,8,4    key = 3
        // 2,4,5,6,8    key = 4

        int[] arr = {8,5,6,2,4};

        for(int i=1; i<arr.length;i++){ // 비교 기준 값 위치
            int pVal = arr[i];
            for(int j=i; j>0;j--){  // 기준값 비교할 대상
                if(arr[j-1] > pVal){  // 기준 값 대비 크면 자리 이동.
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= tmp;
                }
            }
            ShowArray( arr );
        }

    }
    private static void ShowArray(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"  ");
        }
        System.out.println();
    }
}
