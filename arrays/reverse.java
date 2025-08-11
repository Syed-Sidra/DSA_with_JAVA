package arrays;
// time complexity -> O(n)
public class reverse {
    public static void reverseArray(int[] arr){
        int n= arr.length;
        int left =0, right = n-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String args[]){
            int arr[] = {1,2,3,4,5,6};
            reverseArray(arr);
            System.out.print(2%6);
    }
}
