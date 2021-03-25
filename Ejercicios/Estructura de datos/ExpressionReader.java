import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ExpressionReader {
    private ArrayList <String> expresiones = new ArrayList<String>();


    public ExpressionReader(){
        expresiones = new ArrayList<String>();
    }

    public ArrayList<String> getExpresiones(){
        return this.expresiones;
    }




    public void fileReader(File archivo){
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String cadena;

            while((cadena=br.readLine()) != null){
                expresiones.add(cadena);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
