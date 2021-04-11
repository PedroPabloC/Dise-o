import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscritorCSV {
    

    public void escribirCSV(DoublyLinkedList lista) throws IOException{
        File f;
        FileWriter archivo = null;
        BufferedWriter bw;
        PrintWriter escritor = null;
    

        try {
            f = new File("MovieFinal.csv");
            archivo = new FileWriter(f);
            bw = new BufferedWriter(archivo);
            escritor = new PrintWriter(bw);

            DoublyLink current = lista.getFirst();
            while(current!=null){
                escritor.println(current.dData.toString());
                current = current.next;
            }

            escritor.close();
            bw.close();

        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }finally{

            archivo.close();
        }
    }
}
