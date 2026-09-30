import java.util.Scanner;
import java.util.Stack;

class result{
    public static String isBalanced(String s){
        if(s.length() % 2 != 0){
            return "NO";
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
                if(stack.isEmpty()){
                    return "NO";
                }
                char t =  stack.pop();
                if((t == '(' && s.charAt(i) != ')') || (t == '[' && s.charAt(i) != ']') || t == '{' && s.charAt(i) != '}'){
                    return "NO";
                }
            }
        }
        if(stack.isEmpty()){
            return "YES";
        }
        else {
            return "NO";
        }
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(result.isBalanced(s));
    }
}