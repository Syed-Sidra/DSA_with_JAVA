package arrays;
import java.util.ArrayList;
import java.util.Arrays;
/* */
public class DuplicateElements {
    public static ArrayList<Integer> duplicateElements(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
       
        for(int i=0;i<n;i++){
            int cnt =0;
             for(int it : ans){
            if(arr[i]==it){
                cnt++;
                break;
            }
        }

       if(cnt>0) continue; 
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    cnt++;
                    break;
                }
            }
            if(cnt>0)  ans.add(arr[i]);
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,3,4,2};
       ArrayList<Integer> ans = optimalSol(arr);
        for(int res : ans){
            System.out.print(res + " ");
        }
    }
    // time complexity -> O(n log(n))
    public static ArrayList<Integer> optimalSol(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                if(ans.isEmpty() || ans.get(ans.size()-1) != arr[i]){
                    ans.add(arr[i]);
                }
            }
        }
        return ans;
    }
}
