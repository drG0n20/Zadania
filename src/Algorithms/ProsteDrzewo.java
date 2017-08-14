package Algorithms;

public class ProsteDrzewo extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "prostedrzewo";
    }

    String _tree[]; //tworzymy tylko wskaznik, ze bedzie takie drzewo
    int _level;
    int _height;

    @Override
    public void runAlgorithm(String[] input) {
        int n = input.length - 1; //lenght musi byc -1 ze wzgledu na 0 na poczatku tablicy
        getLevel(n);
        _tree = new String[n]; //przypisuje wskaznikowi konkretne drzewo
        int i;

        for (i = 0; i < n; i++) {
            _tree[i] = input[i + 1]; //input nazwa alg, od jedynki | kolejne el
        }

//        for (int j = 0; j < _tree.length; j++) {
//            _tree[j] = "AA"; //jezeli bedzie string dwuliterkowy to bedzie bzdura i nie nalezy sie nia przejmowac
//        }
        //mamy podac wysokosc drzewa
        System.out.printf("Poziom drzewa: %d\n", _level);
        System.out.println();
        System.out.printf("Wysokosc drzewa: %d\n", _height);
        System.out.println();
        System.out.printf("Korzeniem jest: %s\n", _tree[0]);
        System.out.println();

        for (int j = 0; j < _tree.length; j++) {
            String elementLewy = "";
//            String elementPrawy;
            String element = "";
            try {
                element = _tree[j]; //sprawdzamy czy ma ojca
                elementLewy = _tree[2 * j + 1];
//             elementPrawy = _tree[2*j+2]; //nie trzeba sprawdzac prawego elementu
            } catch (Exception ex) {
                System.out.println("Element " + element + " jest lisciem\n");
            }
        }
        getSons("A");
    }


    private void getLevel(int n) {
        int currentSize = 0;
        int iterator = 0;
        do {
            currentSize = currentSize + (int) Math.pow(2d, (double) iterator);
            iterator++;
        }
        while (currentSize < n);
        _level = _height = iterator - 1; //odejmujemy 1, zeby wskazywalo dobry poziom
    }


    private void getSons(String father) {
        int i = 0;
        for (i = 0; i < _tree.length; i++) {
            if (_tree[i].equals(father))
                break;
        }
        try {
            System.out.printf("Lewym synem " + "elementu %s jest: %s\n",
                    _tree[i], _tree[2 * i + 1]);
            System.out.printf("Prawym synem " + "elementu %s jest: %s\n",
                    _tree[i], _tree[2 * i + 2]);
        } catch (Exception ex) {
            System.out.printf("Element %s nie posiada syna", _tree[i]);
        }
    }
}



