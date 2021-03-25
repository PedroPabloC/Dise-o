import java.io.File;
import java.util.ArrayList;

public class InfijoAPostfijoApp{


    public static void main(String[] args) {
        //Declarando la variables que van a servir en todo momento
        ArrayList <String> listaCadenas = new ArrayList<String>();
        EvaluadorExpresion evaluador = new EvaluadorExpresion(); //Sirve para evaluar las expresiones
        Stack <Character> pila = new Stack<Character>(30);//Pila para las expresiones
        //Para escribir el doc
        ExpressionWriter writer = new ExpressionWriter();//Para escribir el .txt
        ArrayList <String> salidas = new ArrayList<String>();
        


        ExpressionReader listaExpresiones = new ExpressionReader();
        File example = new File(args[1]);
        listaExpresiones.fileReader(example);
        listaCadenas = listaExpresiones.getExpresiones();
        try{
            for(String cadenaInfijo : listaCadenas){
                String cadenaPostfijo = "";
                for(int i = 0; i<cadenaInfijo.length(); i++){
                    if(cadenaInfijo.charAt(i)=='('){
                        pila.push(cadenaInfijo.charAt(i));
                    }else if(cadenaInfijo.charAt(i)==')'){
                        while(pila.peek()!='('){
                            cadenaPostfijo += pila.pop();
                        }
                        pila.pop();
                    
                        
                    }else if(evaluador.isOperando(cadenaInfijo.charAt(i))){
                        cadenaPostfijo += cadenaInfijo.charAt(i);
                    
                    }else if(evaluador.isOperador(cadenaInfijo.charAt(i))){
                        while(!pila.isEmpty() && (evaluador.getPrioridad(cadenaInfijo.charAt(i))<evaluador.getPrioridad(pila.peek()))){
                            cadenaPostfijo += pila.pop();
                        }
                        pila.push(cadenaInfijo.charAt(i));
                        
                    }else if(cadenaInfijo.charAt(i)==';'){
                        while(!pila.isEmpty()){
                            cadenaPostfijo += pila.pop();
                        }
                    }
                }




                salidas.add(cadenaPostfijo);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

//Escribir el doc
        try {
            writer.escribirTexto(salidas);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}