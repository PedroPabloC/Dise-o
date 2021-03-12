import java.util.EmptyStackException;

public class StackApp {



    public static void main(String[] args){

        Stack<Float> pila = new Stack<Float>(10);

        try {
           pila.pop();
            
        } catch (EmptyStackException e) {
            System.out.println("No hay nada en la pila");
            
        } catch(StackOverflowError st){
            System.out.println(st.getMessage());

        } catch(Exception b){
            System.out.println(b.getMessage());
        }



    }
    
}
