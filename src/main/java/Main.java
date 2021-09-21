import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        iniciarPrograma();

    }

    public static void iniciarPrograma() throws IOException {
        imprimirArray(leerArchivo());
    }

    public static String leerIngresoRuta(){
        Scanner input = new Scanner(System.in);
        String ruta = "";
        System.out.println("Ingresa la ruta del archivo: ");

        return ruta;
    }

    public static ArrayList<String> leerArchivo() throws IOException {
        File file = new File(leerIngresoRuta());
        Scanner input = new Scanner(file);
        ArrayList<String> arr = new ArrayList<>();
        while (input.hasNextLine()) {
            arr.add(input.nextLine());
        }
        return arr;
    }

    public static void imprimirArray(ArrayList<String> arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(1));
        }
    }
}
