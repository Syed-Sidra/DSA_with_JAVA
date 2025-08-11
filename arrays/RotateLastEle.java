package arrays;

// time complexity -> O(n)
public class RotateLastEle {
    public static void rotateArray(int[] arr, int k){
        int n = arr.length;
        int i,j;
        if(n==0) return;

         k = k % n;
        
        // reverse last k elements
        for(i=n-k,j=n-1; i<j; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //reverse first n-k elements
        for(i=0,j=n-k-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // reverse entire array
        for(i=0,j=n-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
        }

        for(i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
       
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int k = 2;
        rotateArray(arr, k);
    }
}
