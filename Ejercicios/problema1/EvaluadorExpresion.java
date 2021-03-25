
/**
 * La clase contiene dos arreglos de chars para verificar que sea números o operadores abarcados
 */

public class EvaluadorExpresion {
    private char[] listaOperandos = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private char[] listaOperadores = {'+', '-', '*', '/', '^'};
    



    public Boolean isOperando(char entrada){
        Boolean aux = false;
        for(int i = 0; i<=9 && aux==false; i++){
            if(listaOperandos[i] == entrada){
                aux = true;
            }
        }
        return aux;
    }

    public Boolean isOperador(char entrada){
        Boolean aux = false;
        for(int i = 0; i<=4 && aux==false; i++){
            if(listaOperadores[i] == entrada){
                aux = true;
            }
        }
        return aux;
    }

    public int getPrioridad(char c){
        int priority = 0;
        if(c == '+' || c=='-'){priority = 1;}
        if(c == '*' || c=='/'){priority = 2;}
        return priority;
    }
}