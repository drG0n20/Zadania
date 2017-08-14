package Algorithms;

public class AlgorytmKzryzowka extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "algorytmkzryzowka";
    }

    private String _letters[] = {"A", "B", "C", "D", "E", "F", "G",
            "H", "I", "J", "K", "L", "M", "N",
            "O", "P", "Q", "R", "S", "T", "U",
            "W", "X", "Y", "Z"};

    @Override
    public void runAlgorithm(String[] input) {

        int sqrt = Integer.parseInt(input[1]);
        if (Math.sqrt(sqrt) % 1 == 0) {

            int x = (int) Math.sqrt(sqrt);
            String[][] tab = new String[x][x];

            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab.length; j++) {
                    tab[i][j] = _letters[i] + (j + 1);
                }
            }

            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab.length; j++) {
                    System.out.printf("%s ", tab[i][j]);
                }
                System.out.println();
            }
            System.out.println("KONIEC");
        }
    }
}
