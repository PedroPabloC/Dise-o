public class DoublyLinkedList {
    private DoublyLink first; 
    private DoublyLink last; 
    
    public DoublyLinkedList() {
        first = null; 
        last = null;
    }

    public boolean isEmpty() { 
        return first==null; 
    }
    
    public void insertFirst(Movie dd){
        DoublyLink newLink = new DoublyLink(dd); 
        if( isEmpty() ) 
            last = newLink; 
        else
            first.previous = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(Movie dd) {
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


    //ADA2
    public DoublyLink getFirst(){
        return first;
    }

    public DoublyLink getLast(){
        return last;
    }

    public boolean insertAfter(Movie key, Movie dd) { 
        DoublyLink current = first; 
        while(!current.dData.equals(key)) {
            current = current.next; 
            if(current == null)
                return false; 
        }
        DoublyLink newLink = new DoublyLink(dd);
        if(current==last){
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

    public void deleteElementAfter(Movie element) {
        DoublyLink current = first;

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

    public void insertElementBefore(Movie element, Movie newData) {
        DoublyLink current = first;
        DoublyLink prev = null;

        try {
            if (first != null) {
                while (current != null) {

                    if (current.dData.equals(element)) {

                        DoublyLink n = new DoublyLink(newData);
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
    public void deleteElementBefore(Movie element) {
        DoublyLink current = first;
        DoublyLink prev = null;
        DoublyLink prevPrev = null;

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

    public DoublyLink searchByName(String objeto) {
        if (!isEmpty()) {
            DoublyLink current = first;

            while (!current.dData.getTitle().equals(objeto)) {

                current = current.next;

            }

            return current;
        } else {
            return null;
        }
    }



        public void updateData(Movie element) {
        DoublyLink current = first;

        try {
            while (current != null) {

                if (current.dData.equals(element)) {

                    current.dData = element;

                }

                current = current.next;
            }

        } catch (NullPointerException e) {
            System.out.println("El nodo elegido no existe");
        }
    }

    public DoublyLink deleteKey(Movie key) { 
        DoublyLink current = first; 
        while(!current.dData.equals(key)) {
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


} 
