import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ExpressionWriter {
    


    public void escribirTexto(ArrayList <String> salidas) throws IOException{
        FileWriter archivo = null;
        PrintWriter escritor = null;
        EvaluadorExpresion evaluador = new EvaluadorExpresion();


        try {
            archivo = new FileWriter("exp_postfijas.txt");
            escritor = new PrintWriter(archivo);

            for(String cadenaPostfijo: salidas){
                Stack <Integer> enteros = new Stack<Integer>(30);
                for(int j = 0; j<cadenaPostfijo.length(); j++){
                    if(evaluador.isOperando(cadenaPostfijo.charAt(j))){
                        String aux = Character.toString(cadenaPostfijo.charAt(j));
                        enteros.push(Integer.parseInt(aux));
                    }else{
                        int ultimo = enteros.pop();
                        int penultimo = enteros.pop();
                        int resultado = 0;
                        if(cadenaPostfijo.charAt(j)=='+'){
                            resultado = ultimo + penultimo;
                            enteros.push(resultado);
                        }else if(cadenaPostfijo.charAt(j)=='-'){
                            resultado = ultimo - penultimo;
                            enteros.push(resultado);
                        }else if(cadenaPostfijo.charAt(j)=='*'){
                            resultado = ultimo * penultimo;
                            enteros.push(resultado);
                        }else if(cadenaPostfijo.charAt(j)=='/'){
                            resultado = ultimo/penultimo;
                            enteros.push(resultado);
                        }else{
                            resultado = ultimo^penultimo;
                            enteros.push(resultado);
                        }
                    }
                }
                escritor.println( cadenaPostfijo + ";" + " " + "Eval:" + enteros.peek());
                
            }


        } catch (IOException e) {
            e.printStackTrace();
        
        }catch(Exception p){
            p.printStackTrace();
        }finally{
            archivo.close();
    }
}}
