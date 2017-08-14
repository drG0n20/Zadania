package Algorithms;

import java.util.Stack;

public class ONP_zadanie5 extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "onp_zadanie5";
    }

    @Override
    public void runAlgorithm(String[] input) {

        Stack<String> stack = new Stack<>(); //nowy stos do trzymania operatorow
        String myInput = "( a + b ) * c =";
        String[] myInputArr = myInput.split(""); //dzieli myInput na pojedyncze elementy

        String helper = "";
        for (String element : myInputArr) {

            switch (element) {
                case "=":
                    while (!stack.empty()) //jezeli stos jest pusty
                    {
                        System.out.printf("%s", stack.pop()); //wypisujemy wszystko co jest na stosie
                    }
                    break;
                case "(":
                    stack.push(element); //ma sie dodac na stos
                    break;
                case ")":
                    helper = stack.pop();
                    while (!helper.equals("(")) {
                        System.out.printf("%s", helper);
                        helper = stack.pop();
                    }
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "^":
                    while (!stack.empty()) {
                        if (GetOperatorPriority(element) == 3  //jesli mamy najwyzszy priorytet
                                || GetOperatorPriority(element) >= GetOperatorPriority(stack.peek())) {
                            break;
                        } else {
                            System.out.printf("%s", stack.pop());
                        }
                    }
                    stack.push(element); // wrzucamy na stos
                    break;
                default:
                    System.out.printf("%s", element);
                    break;
            }
        }
    }

    public int GetOperatorPriority(String operator) {
        switch (operator) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            case "^":
                return 3;
            default:
                return -1;
        }
    }
}
