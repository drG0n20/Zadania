package Algorithms;

public class NajwiekszyWspolnyDzielnik extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "najwiekszywspolnydzielnik";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int k = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);
        System.out.println(NwD(k, n));
    }

    private int NwD(int k, int n) {
        if (k == 0) {
            return n;
        }
        return NwD((n % k), k);
    }
}
