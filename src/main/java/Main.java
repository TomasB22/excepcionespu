import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

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
    public static void mostrarMenuPrincipal (){
        System.out.println ("------------------------------------------");
        System.out.println ("1. Guardar la boleta en un archivo txt");
        System.out.println ("2. Modificar cantidad de un producto");
        System.out.println ("3. Eliminar un producto de la lista");
        System.out.println ("4. Analisis de la lista de compra");
        System.out.println ("0.  Salir (S/N)");
        System.out.println ("------------------------------------------");
    }
    public static void switchesMenuPrincipal(){
        switch (validarMenu (5)){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                mostrarMenuAnalisis ();
                break;
            case 5:
                System.out.println ("Programa finalizado");
                break;
        }
    }
    public static void mostrarMenuAnalisis (){
        System.out.println ("------------------------------------------");
        System.out.println ("1. Productos en los que se gastará más dinero.");
        System.out.println ("2. Productos en los que se gastará menos dinero.");
        System.out.println ("3. Cantidad máxima de productos con $XXX");
        System.out.println ("4.  Salir (S/N)");
        System.out.println ("------------------------------------------");
    }
    public static void switchesMenuAnalisis(){
        switch (validarMenu (4)){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println ("Programa finalizado");
                break;
        }
    }

    public static int validarMenu ( int x) {
        int n = -1;
        do {
            //Scanner ponerlo dentro del DO, y dentro de una funcion
            Scanner teclado = new Scanner (System.in);
            //System.out.println("ingrese otro numero");
            try {
                n = teclado.nextInt ();
            } catch (Exception e) {
                System.out.println ("Error");
            }
            if (n < 0 || n > x) {
                System.out.println ("Ingrese un numero valido");
            }
        } while (n < 0 || n > x);
        return n;
    }
}
