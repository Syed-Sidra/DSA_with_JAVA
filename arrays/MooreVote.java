package arrays;

public class MooreVote {
    public static int mooreVote(int arr[]){
     int count = 0, cand=0;
     for(int num : arr){
     if(count == 0)  cand = num;
     
     if(count == cand){
        count += 1;
     }
     else count-=1;
     }
     return cand;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,1,3,5,1};
       int ans = mooreVote(arr);
        System.out.println(ans);
    }
}
