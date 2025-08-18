public class BinarySearch {
    public static int binarySearch(int[] arr,int key){
      int st = 0;
      int end = arr.length-1;
     while(st<=end){
        int mid = (st+end)/2;
        if(key==arr[mid]) return mid;
        else if(key<arr[mid])  end = mid-1;
        else st = mid+1;
     }
     return -1;
    }
    public static void main(String[] args) {
        int arr[] ={2,4,6,8,10,12};
        int key = 10;
        System.out.print(binarySearch(arr,key));
    }
}
