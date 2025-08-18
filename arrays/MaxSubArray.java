package arrays;

public class MaxSubArray {
    public static void maxSubArray(int[] arr){
        int n = arr.length;
        
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int start = i;
            for(int j=i+1;j<n;j++){
               int end =j;
               int currSum =0;
               for(int k=start;i<=end;k++){
                currSum += arr[k];
               }
               System.out.print(currSum + " ");
               if(currSum>maxSum){
                maxSum = currSum;
               }
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int[] arr={1,-2,6-1,3};
        maxSubArray(arr);
    }
}
