import Algorithms.AbstractAlgorithm;

public class Main {

    public static void main(String[] args) throws Exception {
        String algotrithmName = args[0];

        AlgorithmFactory factory = new AlgorithmFactory();
        AbstractAlgorithm algorithm = factory.getAlgorithm(algotrithmName);
        System.out.println("Wykonujemy algorytm: " + algorithm.getName());
        algorithm.runAlgorithm(args);

    }
}
