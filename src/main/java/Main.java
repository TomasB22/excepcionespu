import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        iniciarPrograma();

    }

    public static void iniciarPrograma() throws IOException {
        leerArchivo("items.csv");
    }

    public static String leerIngresoRuta(){
        String ruta = "";


        return ruta;
    }

    public static void leerArchivo(String ruta) throws IOException {
        BufferedReader csvReader = null;
        try {
            csvReader = new BufferedReader(new FileReader(ruta));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String row="";
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            System.out.println(Arrays.toString(data));
        }
        csvReader.close();
    }
}
