

import java.util.Arrays;

public class Question2 {


    //WAP to sort an array using Quick Sort Algorithm.
    public static void main(String[] args) {
        int[] arr = {78,56,1,35,41,5,14,31};
        QuickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void QuickSort(int[] arr, int low,int high){
        if(low>=high){
            return;
        }
        int s = low;
        int e = high;
        int m = s+(e-s)/2;
        int piviot = arr[m];
        while(s<=e){

            while (arr[s]<piviot){
                s++;
            }
            while (arr[e]>piviot){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        QuickSort(arr,low,e);
        QuickSort(arr,s,high);
    }

}
