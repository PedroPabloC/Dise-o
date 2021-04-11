import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LectorCSV {

    /***
     * Clase leer archivo CSV. Lee solo las primeras 100 lineas y las transforma a tipo Movie
     * @return DoublyLinkedList
     */
    public DoublyLinkedList leerCSV(){
        Path filePath = Paths.get("Movie.csv");
        DoublyLinkedList listaPeliculas = new DoublyLinkedList();
        try {
             BufferedReader br = Files.newBufferedReader(filePath);
             String linea;

             for(int i = 0; i<100; i++){
                 linea = br.readLine();
                 String[] datos = linea.split(",");

                 if(datos[2].equals("duration")){
                     continue;
                 }else if(datos[2].equals("") || datos[7].equals("") || datos[0].equals("65")){
                    continue;
                 }else{
                    Movie aux = new Movie(Integer.parseInt(datos[0]), datos[1], Integer.parseInt(datos[2]), datos[3], datos[4], datos[5],
                    datos[6], Integer.parseInt(datos[7]), Integer.parseInt(datos[8]), Float.parseFloat(datos[9]), Float.parseFloat(datos[10]),
                    datos[11]);
                    listaPeliculas.insertLast(aux);
                 }

             }
        } catch (IOException e) {
            //TODO: handle exception

            e.printStackTrace();
        }

        return listaPeliculas;
    }
}
