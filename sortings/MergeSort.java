package sortings;

import java.util.Scanner;

//STABLE
//NOT INPLACE
//NOT ADAPTIVE
public class MergeSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        mergeSort(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if(low<high){
            int mid=(low+high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int i=low;
        int j=mid+1;
        int k=0;
        int b[] = new int[high-low+1];

        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                b[k]=arr[i];
                i++;
                k++;
            }
            else{
                b[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            b[k]=arr[i];
            i++;
            k++;

        }

        while(j<=high){
            b[k]=arr[j];
                j++;
                k++;
        }

        for(int z=0;z<b.length;z++){
            arr[low]=b[z]; //keep a look at this point
            low++;
        }
    }
    
}
