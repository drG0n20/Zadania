package Algorithms;

import java.util.Stack;

public class Stos extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "stos";
    }

    @Override
    public void runAlgorithm(String[] input) {

        Stack<Integer> S = new Stack<>();

        int liczba = 45;
        int podstawa = 2;

        while (liczba > 0) {
            S.push(liczba % podstawa);
            liczba = Math.floorDiv(liczba, podstawa);
        }
        while (!S.empty()) {
            System.out.println(S.pop());
        }
    }
}
