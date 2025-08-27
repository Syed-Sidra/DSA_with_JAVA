package backtracking;

public class Subsets {
    public static void findSubset(String str,String ans,int i){
    if(i==str.length()){
        System.out.println(ans);
        return;
    }
    // yes case
    findSubset(str, ans+str.charAt(i), i+1);
    // no case
    findSubset(str, ans, i+1);
    }
    public static void main(String args[]){
    String str = "abc";
    String ans ="";
    findSubset(str, ans, 0);
    }
}

// time complexity -> O(n*2^n)