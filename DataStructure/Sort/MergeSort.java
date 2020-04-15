package DataStructure.Sort;

public class MergeSort {

    public static void main(String[] args) {

        int arr[] = {12,11,13,5,6,7};
        MergeSort ms = new MergeSort();
        ms.sort(arr, 0,5);
        ShowArray(arr);
    }

    // divide
    public void sort(int[] arr, int s, int f){
        if(s<f){
            int m = (f+s)/2;    // 중간값

            sort(arr, s, m);    // 앞 반
            sort(arr, m+1, f);  // 뒷 반
            merge(arr, s, m, f);
        }
    }

    // conquer, merge
    public void merge(int[] arr, int s, int m, int f){
        //들어온 배열의 사이즈와 임시 배열 생성하고 나눠 넣기.
        int sSize = m-s+1;
        int fSize = f-m;

        // 두자리를 한자리로 나눠 넣으면 현재 1,1 들어옴
        int[] L = new int[sSize];
        int[] R = new int[fSize];

        // 값을 나눠 넣으면...
        for(int i=0; i<sSize; i++){
            L[i] = arr[s+i];
        }
        for(int j=0; j<fSize; j++){
            R[j] = arr[m+1+j];
        }

        //L[0], R[0]
        // 두개 비교해서 자리 바꾸기

        int i = 0;
        int j = 0;
        int k = s; //시작값
        while(i<sSize && j<fSize){

            if(L[i]<R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // 두개 중 하나 들어가고 끝나며 남은거 처리, 한쪽은 사이즈만큼 다돌아가서 한쪽만 남음
        while(i<sSize){
            arr[k]=L[i];
            i++;
            k++;
        }

        while(j<fSize){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    private static void ShowArray(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"  ");
        }
        System.out.println();
    }
}
