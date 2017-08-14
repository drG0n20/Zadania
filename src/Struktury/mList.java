package Struktury;

public class mList {
    Element _head;
    Element _tail;
    int counter;

    public void goThroughListForward(mList list) {
        Element p = list._head; // . kompilator odszukuje w klasie pola i je podpowiada
        while (p.next != null) { //wykonujemy jakas logike
            p = p.next; //dopuki mam nastepnika
        }
    }

    public void goThroughListBackward(mList list) {
        Element p = list._tail;
        while (p.prev != null) {
            p = p.prev;
        }
    }

    public void addElementAtBeginning(int newElement, mList list) {
        Element p = new Element();
        p.data = newElement;
        p.prev = null; //nie chcemy, zeby byl poprzednik (bo nie jest lista cykliczna)
        p.next = list._head; //jezeli jest nowy obiekt listy | glowa bedzie nulem
        list._head = p;
        list.counter++;

        if (p.next != null) {
            Element nextEl = p.next;
            nextEl.prev = p;
        } else {
            list._tail = p;
        }
    }

    //usuwamy element z poczatku listy

    public void removeElementFromHead() {
        Element p = _head;
        if (p != null) {
            _head = p.next;
            _head.prev = null;
        }
        counter--;
    }

    //usuwamy element z konca listy

    public void removeElementFromTail() {
        Element p = _tail;
        if (p != null) {
            _tail = p.prev;
            _tail.next = null;
        }
        counter--;
    }

    public void removeElement(int elementToDelete, mList lista) {
        Element toDelete = getElementForward(elementToDelete, lista);
        if (_head == toDelete) {
            removeElementFromHead();
        } else {
            Element counter = _head;
            while (counter.next != toDelete) {
                counter = counter.next;
            }
            counter.next = toDelete.next;
            toDelete = null;
        }
    }

    //dodajemy el na koncu listy

    public void addElementAtEnd(int newElement, mList list) {
        Element p = new Element();
        p.data = newElement;
        p.next = null;
        p.prev = list._tail;
        list._tail = p;
        list.counter++;

        if (p.prev != null) {
            Element nextEl = p.prev;
            nextEl.next = p;
        } else {
            list._head = p;
        }
    }

    public Element getElementForward(int data, mList list) {
        Element p = list._head;
        while (p.next != null) {
            if (p.data == data) {
                break;
            }
            p = p.next;
        }
        return p;
    }

    public Element getElementBackward(int data, mList list) {
        Element p = list._tail;
        while (p.prev != null) {
            if (p.data == data) {
                break;
            }
            p = p.prev;
        }
        return p;
    }

    public void printAllEllements(mList list) {
        Element p = list._head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }

    public void addElementBefore(int elementToAdd, int elementBefore, mList list) {

        Element before = list.getElementForward(elementBefore, list); //mam to zapisane do naszego obiektu

        if (before == list._head) { //czy te 2 wskazniki wskazuja na to samo
            list.addElementAtBeginning(elementToAdd, list);
        } else {
            Element p = new Element();
            p.data = elementToAdd;
            p.prev = before.prev;
            p.next = before;
            Element prevBefore = before.prev;
            prevBefore.next = p;

            before.prev = p;
            list.counter++;
        }
    }

    public void addElementAfter(int elementToAdd, int elementAfter, mList list) {

        Element after = list.getElementForward(elementAfter, list);

        if (after == list._tail) {
            list.addElementAtBeginning(elementToAdd, list);
        } else {
            Element p = new Element();
            p.data = elementToAdd;
            p.next = after.next;
            p.prev = after;
            Element afterAfter = after.next;
            afterAfter.prev = p;

            after.next = p;
            list.counter++;
        }
    }
}

