package arrays;

public class PrefixSum {
    public static void prefixSum(int[] arr){
        int n= arr.length;
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
            for(int j=0;j<n;j++){
                int start =j;
                for(int k=j+1;k<n;k++){
                    int end = k;
                    currSum = (start == 0)?prefix[end]:prefix[end] - prefix[start-1];
                }
                maxSum = Math.max(currSum,maxSum);

            }
        }
        System.out.print(maxSum);
    }
    public static void main(String[] args){
        int[] arr ={1,-2,6-1,3};
        prefixSum(arr);
    }
}
