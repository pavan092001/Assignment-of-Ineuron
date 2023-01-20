import java.util.Arrays;

public class Question4 {

    public static void main(String[] args) {
        int[] array = {78,87,1,54,98,5,-14};
        int[] sortedArray = mergeSort(array);
        System.out.println(Arrays.toString(sortedArray));

    }
    static int[] mergeSort(int[] arr){
        if(arr.length ==1)
            return arr;
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left ,right);
    }
    static  int[] merge(int[] left,int [] right){
        int[] re = new int[left.length+right.length];
        int i=0,j=0,k=0;
        while (i<left.length && j<right.length){
            if(left[i]<right[j]){
                re[k] = left[i];
                i++;
            }else {
                re[k] = right[j];
                j++;
            }
            k++;
        }

        while(i< left.length){
            re[k] = left[i];
            i++;
            k++;
        }

        while(j< right.length){
            re[k] = right[j];
            j++;
            k++;
        }
        return re;
    }
}

