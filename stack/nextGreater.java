package stack;

import java.util.Stack;

public class nextGreater {
    public static int[] nextGreater(int arr[]){
     Stack<Integer> s = new Stack<>();
     int result[] = new int[arr.length];
     for (int idx = arr.length-1; idx >=0; idx--) {
             while(!s.isEmpty() && s.peek()<=arr[idx]){
              s.pop();
             }
            if(s.empty()){
                result[idx]=-1;
            }
            else{
                result[idx]=s.peek();
            }

            s.push(arr[idx]);
         
     }
     return result;
    }
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int result[] = nextGreater(arr);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
