package sortings;

import java.util.Scanner;

//NOT STABLE
//INPLACE
//ADAPTIVE
public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        qs(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }

    private static void qs(int arr[],int low,int high){
        if(low<high){
            int p=partition(arr,low,high);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            qs(arr,low,p-1);
            qs(arr,p+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {

        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        int t=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=t;
        return i+1;
        
    }

        
}
