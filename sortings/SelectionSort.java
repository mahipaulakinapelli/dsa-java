package sortings;

import java.util.Scanner;

//NOT STABLE
//INPLACE
//NOT ADAPTIVE
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before Swapping");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n-1;i++){
            int min_ind=i;
           
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_ind]){
                    min_ind=j;
                }
            }
            int t=arr[i];
            arr[i]=arr[min_ind];
            arr[min_ind]=t;
        }

        System.out.println("After Swapping");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
