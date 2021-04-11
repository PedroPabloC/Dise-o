public class DoublyLink {
    public Movie dData; 
    public DoublyLink next; 
    public DoublyLink previous; 

    public DoublyLink(Movie d) { 
        dData = d; 
    }

    public void displayLink() { 
        System.out.print(dData + ","); 
    }
} 
