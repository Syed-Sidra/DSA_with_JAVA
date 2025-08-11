public class linearSearch {
    public static int linear(int[] arr, int key){
       for(int i=0;i<arr.length;i++){
        if(arr[i]==key)
        return i;
       }
       return -1;
    }
    public static void main(String[] args){
        int arr[] =  {5,90,76,65,34};
        int key=65;
       
        System.out.println(linear(arr,key));
    }
}
