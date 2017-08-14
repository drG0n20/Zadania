package Algorithms;

public class BanknotyZadanie2 extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "banknoty";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int zl = Integer.parseInt(input[1]);
        int gr = Integer.parseInt(input[2]);
        int[] zlotowki = new int[]{200, 100, 50, 20, 10, 5, 2, 1};
        int[] grosze = new int[]{50, 20, 10, 5, 2, 1};
        int[] iloscPrzejscZlotowki = new int[8];
        int[] iloscPrzejscGrosze = new int[6];

        while (zl > 0) {
            for (int i = 0; i < zlotowki.length; i++) {
                if (zl >= zlotowki[i]) {
                    zl = zl - zlotowki[i];
                    iloscPrzejscZlotowki[i]++;
                    break;
                }
            }
        }

        while (gr > 0) {
            for (int i = 0; i < grosze.length; i++) {
                if (gr >= grosze[i]) {
                    gr = gr - grosze[i];
                    iloscPrzejscGrosze[i]++;
                    break;
                }
            }
        }

        for (int i = 0; i < iloscPrzejscZlotowki.length; i++) {
            System.out.printf("%d x %d zl \n", iloscPrzejscZlotowki[i], zlotowki[i]);
        }

        System.out.println("----------");

        for (int i = 0; i < iloscPrzejscGrosze.length; i++) {
            System.out.printf("%d x %d gr \n", iloscPrzejscGrosze[i], grosze[i]);
        }
    }
}

