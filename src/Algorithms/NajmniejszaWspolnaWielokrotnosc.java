package Algorithms;

public class NajmniejszaWspolnaWielokrotnosc extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "nww";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int a1 = Integer.parseInt(input[1]);
        int a2 = Integer.parseInt(input[2]);

        /**
         * Drukujemy najmniejsza wspolna wielokrotnosc
         */
        System.out.println("NWW: " + NwW(a1, a2));
        System.out.println("NWD: " + NwD(a1, a2));
    }


    private int NwD(int a1, int a2) {
        if (a1 == 0) {
            return a2;
        }
        return NwD((a2 % a1), a1);
    }

    /**
     * Metoda zwraca najmniejsza wspolna wielokrotnosc
     *
     * @param a1 - parametr pierwszy
     * @param a2 - parametr drugi
     */

    private int NwW(int a1, int a2) {
        if (a1 == 0 || a2 == 0) {
            return -1;
        }
        return (a1 * a2) / NwD(a1, a2);
    }
}

