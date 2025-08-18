package arrays;
/*  Ques-> Reverse an array in groups of given size */
public class ReversekGroup {
    public static int[] reverseGroup(int[] arr, int k){
    int n = arr.length;
    for(int i=0;i<n;i+=k){
     int left=i;
     int ryt = Math.min(i+k-1,n-1);
     while(left<ryt){
        int temp = arr[left];
        arr[left] = arr[ryt];
        arr[ryt] = temp;
        left++;
        ryt--;
     }
    }
    return arr;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8};
        int key = 3;
        reverseGroup(arr, key);
        for(int num : arr){
            System.out.print(num + " ");
        }

    }
}
