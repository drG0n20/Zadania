package Algorithms;

import Struktury.mList;

public class TestowanieListyDwukierunkowej extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "testowanielisty";
    }

    @Override
    public void runAlgorithm(String[] input) {

        mList lista = new mList();

        lista.addElementAtBeginning(14, lista);
        lista.addElementAtBeginning(25, lista);
        lista.addElementBefore(45, 14, lista);
        lista.addElementAfter(23, 45, lista);
        lista.addElementAtEnd(66, lista);
        lista.addElementAtBeginning(01, lista);
        lista.printAllEllements(lista);
        System.out.println("-------");
        lista.removeElementFromTail();
        lista.removeElementFromHead();
        lista.printAllEllements(lista);
        System.out.println("--------");
        lista.goThroughListForward(lista);
        lista.removeElement(23, lista);
        lista.printAllEllements(lista);
        System.out.println("--------");
        lista.removeElement(45, lista);
        lista.printAllEllements(lista);
    }
}
