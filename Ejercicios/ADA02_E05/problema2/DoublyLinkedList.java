public class DoublyLinkedList<T> {
    private DoublyLink first; 
    private DoublyLink last; 
    
    public DoublyLinkedList() {
        first = null; 
        last = null;
    }

    public boolean isEmpty() { 
        return first==null; 
    }
    
    public void insertFirst(T dd){
        DoublyLink newLink = new DoublyLink(dd); 
        if( isEmpty() ) 
            last = newLink; 
        else
            first.previous = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(T dd) {
        DoublyLink newLink = new DoublyLink(dd); 
        if( isEmpty() ) 
            first = newLink; 
        else {
            last.next = newLink; 
            newLink.previous = last; 
        }
        last = newLink; 
    }

    public DoublyLink deleteFirst() { 
        DoublyLink temp = first;
        if(first.next == null) 
            last = null;
        else
            first.next.previous = null;
        first = first.next; 
        return temp;
    }

    public DoublyLink deleteLast(){
        DoublyLink temp = last;
        if(first.next == null) 
            first = null; 
        else
            last.previous.next = null; 
        last = last.previous; 
        return temp;
    }
    
    public boolean insertAfter(T key, T dd) { 
        DoublyLink current = first; 
        while(current.dData != key) {
            current = current.next; 
            if(current == null)
                return false; 
        }
        DoublyLink newLink = new DoublyLink(dd);
        if(current==last) {
            newLink.next = null; 
            last = newLink;
        }
        else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current; 
        current.next = newLink; 
        return true; 
    }
    
    public DoublyLink deleteKey(T key) { 
        DoublyLink current = first; 
        while(current.dData != key) {
            current = current.next; 
            if(current == null)
            return null;
        }
        if(current==first)
            first = current.next;
        else
            current.previous.next = current.next;
        if(current==last) 
            last = current.previous;
        else
            current.next.previous = current.previous;
        return current;
    }

    public void displayForward() {
        System.out.print("List (first-->last): ");
        DoublyLink current = first;
        while(current != null) {
            current.displayLink(); 
            current = current.next; 
        }
        System.out.println("");
    }

    public void displayBackward() {
        System.out.print("List (last-->first): ");
        DoublyLink current = last;
        while(current != null) {
            current.displayLink(); 
            current = current.previous; 
        }
        System.out.println("");
    }

    
    
    
    // Inciso 1
    public DoublyLink<T> getFirstLink() {
        return first;
    }

    // Inciso 1
    public DoublyLink<T>getLastLink() {
        DoublyLink<T> current = first;

        while (current.next != null) {
            current = current.next;
        }
        return current;

    }

    // Inciso 2
    public void insertElementBefore(T element, T newData) {
        DoublyLink<T> current = first;
        DoublyLink<T> prev = null;

        try {
            if (first != null) {
                while (current != null) {

                    if (current.dData.equals(element)) {

                        DoublyLink<T> n = new DoublyLink<T>(newData);
                        n.next = current;
                        prev.next = n;

                    }
                    prev = current;
                    current = current.next;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("No se pudo insertar el elemento");
        }

    }

    //Inciso 3 
    public void deleteElementBefore(T element) {
        DoublyLink<T> current = first;
        DoublyLink<T> prev = null;
        DoublyLink<T> prevPrev = null;

        try {

            if (current != null && current.dData == element) {
                first = prev.next;

            }

            while (current != null && current.dData != element) {
                prevPrev = prev;
                prev = current;
                current = current.next;
            }

            prevPrev.next = prev.next;
        } catch (NullPointerException e) {
            System.out.println("No se pudo eliminar el nodo");
        }

    }

    // Inciso 4 
    public void insertElementAfter(T element, T newData) {
        DoublyLink<T> current = first;
        DoublyLink<T> next = null;

        try {
            if (first != null) {
                while (current != null) {
                    if (current.dData.equals(element)) {
                        DoublyLink<T> n = new DoublyLink<T>(newData);

                        n.next = current.next;

                        current.next = n;

                        next = current.next;

                    }

                    current = current.next;

                }
            }
        } catch (NullPointerException e) {

        }
    }

    // Inciso 5
    public void deleteElementAfter(T element) {
        DoublyLink<T> current = first;

        try {

            if (current.next.next == null) {

                current.next.next = null;
            }

            while (current != null && current.dData != element) {

                current = current.next;

            }

            current.next = current.next.next;

        } catch (NullPointerException e) {
            System.out.println("No se pudo encontrar el nodo");
        }

    }

    // Inciso 6 
    public DoublyLink<T> searchNode(T objeto) {
        if (!isEmpty()) {
            DoublyLink<T> current = first;

            while (current.dData != objeto) {

                current = current.next;

            }

            return current;
        } else {
            return null;
        }
    }

    // Inciso 7
    public void deleteElement(T element) {
        DoublyLink<T> current = first;
        DoublyLink<T> prev = null;

        try {

            if (current != null && current.dData == element) {
                first = current.next;

            }

            while (current != null && current.dData != element) {
                prev = current;
                current = current.next;
            }

            prev.next = current.next;

        } catch (NullPointerException e) {

        }

    }

    //Inciso 8 
    public void updateData(T element, T data) {
        DoublyLink<T> current = first;

        try {
            while (current != null) {

                if (current.dData.equals(element)) {

                    current.dData = data;

                }

                current = current.next;
            }

        } catch (NullPointerException e) {
            System.out.println("El nodo elegido no existe");
        }
    }

    
} 