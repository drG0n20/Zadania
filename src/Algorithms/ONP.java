package Algorithms;

import java.util.Stack;

public class ONP extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "onp";
    }

    @Override
    public void runAlgorithm(String[] input) {

        Stack<Integer> stack = new Stack<>();

        int v1 = 0;
        int v2 = 0;

        for (int i = 1; i < input.length; i++) {
            switch (input[i]) {
                case "=":
                    System.out.println(stack.peek());
                    break;
                case "*":
                    v1 = stack.pop();
                    v2 = stack.pop();
                    stack.push(v1 * v2);
                    break;
                case "/":
                    v1 = stack.pop();
                    v2 = stack.pop();
                    stack.push(v1 / v2);
                    break;
                case "+":
                    v1 = stack.pop();
                    v2 = stack.pop();
                    stack.push(v1 + v2);
                    break;
                case "-":
                    v1 = stack.pop();
                    v2 = stack.pop();
                    stack.push(v1 - v2);
                    break;
                default:
                    stack.push(Integer.parseInt(input[i]));
            }
        }
    }
}
