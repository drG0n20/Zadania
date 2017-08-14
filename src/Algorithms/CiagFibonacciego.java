package Algorithms;


public class CiagFibonacciego extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "ciagfibonacciego";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.println(Fib(n));
    }

    private int Fib (int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else
            return Fib(n - 1) + Fib(n - 2);
    }
}
