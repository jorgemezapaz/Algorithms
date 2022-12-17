package medium;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    //Problem link: https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
    //time O(n), space O(n) where n is the numbers of operations
    public static Integer firstSolution(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if(!"+-/*".contains(token)){
                stack.push(Integer.valueOf(token));
            }else {
                Integer a = stack.pop();
                Integer b = stack.pop();
                if("+".equals(token)) stack.push(b + a);
                if("-".equals(token)) stack.push(b - a);
                if("/".equals(token)) stack.push(b / a);
                if("*".equals(token)) stack.push(b * a);
            }
        }
        return stack.pop();
    }
}
