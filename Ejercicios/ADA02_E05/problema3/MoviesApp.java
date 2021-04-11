
public class MoviesApp {
    public static void main(String[] args) {
        LectorCSV leer = new LectorCSV();
        DoublyLinkedList listaPeliculas = new DoublyLinkedList();
        EscritorCSV escribir = new EscritorCSV();


        listaPeliculas = leer.leerCSV();

        
        //Ejemplo de ejecucion
        Movie RobinHood = new Movie(23, "Robin Hood ", 156, "Color", "English", "USA", "PG-13", 200000000, 2010, 67, (float) 2.35, "http://www.imdb.com/title/tt0955308/?ref_=fn_tt_tt_1");
        listaPeliculas.deleteLast();
        listaPeliculas.deleteFirst();
        listaPeliculas.deleteFirst();
        listaPeliculas.deleteFirst();
        listaPeliculas.deleteFirst();
        listaPeliculas.deleteKey(RobinHood);
        listaPeliculas.displayForward();


        //Escribir archivo csv
        try {
            escribir.escribirCSV(listaPeliculas);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
