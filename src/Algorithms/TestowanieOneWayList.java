package Algorithms;

import Struktury.mOneWayLIst;

public class TestowanieOneWayList extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "testoweanie_one_way_list";
    }

    @Override
    public void runAlgorithm(String[] input) {

        mOneWayLIst oneWayList = new mOneWayLIst();

        System.out.printf("Testujemy dodawanie elementów\n");
        oneWayList.addElementAtBeginng(23);
        oneWayList.addElementAtBeginng(24);
        oneWayList.addElementBeforeElement(25, 24);
        oneWayList.addElementBeforeElement(20, 24);
        oneWayList.addElementAtEnd(10);
        oneWayList.addElementAtEnd(11);
        oneWayList.addElementAfterElement(12, 11);
        oneWayList.addElementAfterElement(88, 23);
        oneWayList.printAllElements();
        System.out.printf("\n");

        System.out.printf("Zaczynamy testować usuwanie\n");
        System.out.printf("Usuwam element 25\n");
        oneWayList.deleteElement(25);
        oneWayList.printAllElements();
        System.out.printf("Usuwam element 10\n");
        oneWayList.deleteElement(10);
        oneWayList.printAllElements();
        System.out.printf("Usuwam ostatni element\n");
        oneWayList.deleteElementAtEnd();
        oneWayList.printAllElements();
    }
}
