import java.util.EmptyStackException;
import java.util.ArrayList;

class Stack<T> {
    private int maxSize;
    private int top;
    private T[] stackArray;
    //private ArrayList <T> stackArray = new ArrayList<T>();
     
    public Stack(int s) {
        maxSize = s;
        top = -1; 
        stackArray = (T[]) new Object[s];
    }

    public void push(T j) throws StackOverflowError {
        if(isFull()){
            throw new StackOverflowError("La pila está llena");
        }
        this.stackArray[++top] = j;
        //this.stackArray.add(j);
    }
    
    public T pop() throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return (T) stackArray[top--];
        //return this.stackArray.remove(stackArray.size()); 
    }
     
    public T peek() throws Exception {
        if(isEmpty()){
            throw new Exception("La pila está vacía");
        }
        return (T) stackArray[top];     
    }
    
    public boolean isEmpty() {
        return (top == -1); 
    }
     
    public boolean isFull() {
        return (top == maxSize-1); 
    }
}

