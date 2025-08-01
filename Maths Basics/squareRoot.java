public class squareRoot {
    // for calculating the square root in java we will use the pre-defined function Math.sqrt(number) 
     static  int squareRoot(int n){
       //let initialize starting value
       int start = 1;
       // end value is equal to the given number
       int end = n;
       //result
       int res = 1; // in case of 2 or 3
       // finding mid

       while(start<=end){
        int mid = start + (end - start)/2; // mid

        // check mid's square 
        if(mid*mid  <= n){  // if mid*mid is small then move forward 
            res = mid;
            start = mid +1;
        }

        else
          end = mid - 1; // if mid*mid is large then move backward
       }
       return res;
    }
    public static void main(String[] args) {
        int num = 13;
        System.out.print(squareRoot(num));
    }
}
