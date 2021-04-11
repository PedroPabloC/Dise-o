public class DoublyLink<T> {
    public T dData; 
    public DoublyLink next; 
    public DoublyLink previous; 

    public DoublyLink(T d) { 
        dData = d; 
    }

    public void displayLink() { 
        System.out.print(dData + ","); 
    }
} 