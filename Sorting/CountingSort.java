
public class CountingSort {
    public static void countingSort(int[] arr){
        int large = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            large = Math.max(large, arr[i]);
        }
        int[] count = new int[large+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
       while(count[i]>0){
        arr[j] = i;
        j++;
        count[i]--;
       }
        }
        for(int ele : arr){
            System.out.print(ele +" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={1,4,1,3,2,4,3,7};
        countingSort(arr);
    }
    
}
