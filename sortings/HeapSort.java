package sortings;

import java.util.Scanner;


public class HeapSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        sc.close();

        heapSort(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void heapSort(int[] arr, int n) {
        buildHeap(arr,n);
        for(int i=n-1;i>=1;i--){
            int t=arr[i];
            arr[i]=arr[0];
            arr[0]=t;
            heapify(arr, i, 0);
        }
    }

    private static void buildHeap(int[] arr, int n) {
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n && arr[left]>arr[largest]){
            largest=left;
        }

        if(right<n && arr[right]>arr[largest]){
            largest=right;
        }

        if(largest!=i){
            int t=arr[i];
            arr[i]=arr[largest];
            arr[largest]=t;
            heapify(arr, n, largest);
        }
    }
    
}
