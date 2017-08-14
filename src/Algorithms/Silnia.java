package Algorithms;

public class Silnia extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "Liczenie silni";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);

        System.out.println(Silnia(n));
    }

    private int Silnia(int n) { //calkowicie z boku bo tam sa Stringi
        //potrzebny warunek kiedy musimy przestac wykonywac petle
        if (n < 2)
            return 1;
        return n * Silnia(n - 1); //wchodzimy w rekurencje
    }
}
