package Algorithms;

public class SumaLiczb extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "sumaliczb";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int sum = 0;

        for (int i = 1; i < input.length; i++) {
            sum = sum + Integer.parseInt(input[i]);
            System.out.println(sum);
        }
    }
}
