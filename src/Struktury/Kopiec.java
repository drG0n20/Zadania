package Struktury;

public class Kopiec {
    int _date[];
    int _counter = 0;

    public Kopiec(int n) {
        _date = new int[n];
    }

    public void insertElement(int element) {
        int i = _counter++;
        int j = (i - 1) / 2;

        while (i > 0 && _date[j] < element) {
            _date[i] = _date[j];
            i = j;
            j = (i - 1) / 2;
        }
        _date[i] = element;
    }

    public int deleteElement() {
        int root = -1;
        int lastElement = -1;
        int i = 0;
        int j = 0;


        if (_counter-- > 0) {  //koniec bedzie zawieral o 1 el mniej

            root = _date[0];
            lastElement = _date[_counter]; // zapamietujemy ostatni el kopca
            i = 0;
            j = 1;
            while (j < _counter) {
                if (j + 1 > _counter && _date[j + 1] > _date[j]) {
                    j = j + 1; //szukamy wiekszego syna
                } else if (lastElement >= _date[j]) {
                    break;
                } else {
                    _date[i] = _date[j];
                    i = j;
                    j = 2 * j + 1;
                }
            }
            _date[i] = lastElement;
        }
        return root;
    }

    public void printAllElements() {

        for (int i = 0; i < _counter; i++) {
            System.out.println(_date[i]);
        }
    }

//    public void sort() {
//        int size = _counter; //pobieram sobie rozmiar kopca
//        int[] sort = new int[_counter]; //tworzę tablice, która posłuży mi do sortowania
//        for (int i = _counter - 1; i >= 0; i--) {
//            sort[i] = deleteRoot(); //kasuje korzeń i jednocześnie zapisuje sobie jego wartość na ostatnim wolnym
//            //miejscu tablicy
//        }
//
//        for (int i = 0; i < size; i++) {
//            System.out.printf("%d ", sort[i]);
//        }
//    }
}

