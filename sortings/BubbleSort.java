package sortings;

import java.util.*;
//stable
//inplace
//adaptive
//TC:O(N^2)
//SC:0(1)
class BubbleSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        boolean swapped=false;
        for(int i=0;i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }

        System.out.println("After Swammping using bubble sort");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
