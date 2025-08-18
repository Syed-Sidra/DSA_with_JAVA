public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,3,4,2,1};
        selectionSort(arr);
    }
}
