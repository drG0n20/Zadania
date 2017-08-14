import Algorithms.*;
import Zadania_Algorytmika_PierwszyTydzien.*;
import Zadania_StrukturyDanych.*;

public class AlgorithmFactory {
    public AbstractAlgorithm getAlgorithm(String name) throws Exception {
        switch (name.toLowerCase()) {
//            case "test":
//                return new Test();
//            case "biednycamelcase":
//                return new BiednyCamelCase();
//            case "sumowanieliczbnaturalnych":
//                return new SumowanieLiczbNaturalnych();
//            case "sumaliczb":
//                return new SumaLiczb();
//            case "banknoty":
//                return new BanknotyZadanie2();
//            case "rokprzestepny":
//                return new RokPrzestepny();
//            case "silnia":
//                return new Silnia();
//            case "sumasilni":
//                return new SumaSilni();
//            case "silniadziesiatkijednosci":
//                return new SilniaDziesiatkiJednosci();
//            case "ciagfibonacciego":
//                return new CiagFibonacciego();
//            case "szyfrcezara":
//                return new SzyfrCezara();
//            case "algorytmbabelkowy":
//                return new AlgorytmBabelkowy();
//            case "sortowaniepunktow":
//                return new SortowaniePunktow();
//            case "sortowanieprzezzlicznie":
//                return new SortowaniePrzezZliczanie();
//            case "algorytmkzryzowka":
//                return new AlgorytmKzryzowka();
//            case "najwiekszywspolnydzielnik":
//                return new NajwiekszyWspolnyDzielnik();
////            case "palindrom":
////                return new Palindrom();
//            case "wielkanoc":
//                return new Wielkanoc();
//            case "zadaniapraktyczne":
//                return new ZadaniaPraktyczneTablice();
//            case "maxmin":
//                return new MaxMinElement();
//            case "minmaxlider":
//                return new MinMaxLider();
//            case "testowanielisty":
//                return new TestowanieListyDwukierunkowej();
////            case "listadotestow":
////                return new ListaDoTestow();
//            case "prostedrzewo":
//                return new ProsteDrzewo();
////            case "kopiec":
////                return new Kopiec();
//            case "testowaniekopca":
//                return new TestowanieKopca();
//            case "testowaniekopca2":
//                return new TestowanieKopca();
//            case "stos":
//                return new Stos();
//            case "onp":
//                return new ONP();
//            case "testoweanie_one_way_list":
//                return new TestowanieOneWayList();
            case "rekurencja":
                return new Zad1_Rekurencja_NwD();
            case "tablicedwuwymiarowe_warcaby":
                return new Zad2_TabliceDwuwymiarowe_Warcaby();
            case "tablice_dominanta":
                return new Zad3_Tablice_Dominanta();
            case "sprawdzian":
                return new Zad4_InterpretacjaTekstu_Sprawdzian();
            case "wielkanoc":
                return new Zad5_WlasnyPomysl_Wielkanoc();
            case "zmienneitablice":
                return new Zad1_Zmienne_i_Tablice();
            case "arraylist":
                return new Zad2_ArrayList();
            //            case "wlasnalista":
//                return new Zad3_WlasnaLista();
            case "stos_array_list":
                return new Zad4_Stos_ArrayList();
            case "onp_zadanie5":
                return new Zad5_Stos_Pseudokod();
            default:

                throw new Exception("Nie ma takiego algorytmu!");
        }
    }
}
