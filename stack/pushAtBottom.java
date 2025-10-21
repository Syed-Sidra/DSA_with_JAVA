package stack;
import java.util.*;
public class pushAtBottom {
    public static void PushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        PushAtBottom(s, data);
        s.push(top);
    }
    
    public static void print(Stack<Integer> s){
        while(!s.isEmpty()){
             System.out.println(s.peek());
             s.pop();
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);

        PushAtBottom(s, 4);
        print(s);

    }
}
