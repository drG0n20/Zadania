package Struktury;

public class mOneWayLIst {
    OneWayListElement _head;
    int _counter;

    //DODAWANIE ELEMENTU NA POCZATKU I KONCU LISTY

    public void addElementAtBeginng(int newElement) {
        OneWayListElement p = new OneWayListElement();
        p.data = newElement;
        p.next = _head;
        _head = p;
        _counter++;
    }

    public void deleteElementAtBeginning() {
        OneWayListElement p = _head;
        if (p != null) {
            _head = p.next;
            p = null;
        }
        _counter--;
    }

    public OneWayListElement getLastElement() {
        OneWayListElement iterator;
        iterator = _head;
        while (iterator.next != null) {
            iterator = iterator.next;
        }
        return iterator;
    }

    public void addElementAtEnd(int newElement) {
        OneWayListElement p = new OneWayListElement();
        p.data = newElement;
        p.next = null;

        if (_counter == 0) {
            _head = p;
        } else {
            OneWayListElement iterator = _head;
            while (iterator.next != null) {
                iterator = iterator.next;
            }
            iterator.next = p;
        }
        _counter++;
    }

    public void deleteElementAtEnd() {
        OneWayListElement iterator = _head;
        if (_counter == 0)
            return;
        if (iterator.next != null)
        {
            while (iterator.next.next != null)
            {
                iterator = iterator.next;
            }
            iterator.next = null;
        } else
        {
            _head = null;
            iterator = null;
            _counter--;
        }
    }

    public void addElementBeforeElement(int elementToAdd, int beforeElement) {

        OneWayListElement elementBefore = getElementForward(beforeElement);

        if (elementBefore == _head)
        {
            addElementAtBeginng(elementToAdd);
        } else
        {
            OneWayListElement iterator = _head;
            while (iterator.next != elementBefore)
            {
                iterator = iterator.next;
            }

            OneWayListElement newElement = new OneWayListElement();
            newElement.data = elementToAdd;
            newElement.next = iterator.next;
            iterator.next = newElement;
        }
        _counter++;
    }

    public void addElementAfterElement(int elementToAdd, int afterElement) {
        OneWayListElement elementAfter = getElementForward(afterElement);

        OneWayListElement newElement = new OneWayListElement();
        newElement.data = elementToAdd;
        newElement.next = elementAfter.next;

        elementAfter.next = newElement;
        _counter++;
    }

    public void deleteElement(int elementToDelete) {
        OneWayListElement toDelete = getElementForward(elementToDelete);

        if (_head == toDelete)
        {
            deleteElementAtBeginning();
        } else
        {
            OneWayListElement iterator = _head;
            while (iterator.next != toDelete)
            {
                iterator = iterator.next;
            }
            iterator.next = toDelete.next;
            toDelete = null;
        }
    }

    //SEKCJA POMOCNICZO - TECHNICZNA
    public OneWayListElement getElementForward(int data)

    {
        OneWayListElement p = _head;
        while (p.next != null)
        {
            if (p.data == data) {
                break;
            }
            p = p.next;
        }
        return p;
    }

    public void printAllElements()

    {
        OneWayListElement p = _head;
        while (p != null)
        {
            System.out.println(p.data);
            p = p.next;
        }
    }
}




