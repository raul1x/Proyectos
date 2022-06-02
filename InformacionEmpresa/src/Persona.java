import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Persona {
    String nombre;
    int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   
    public void guardarDatos(String nombreArchivo) throws IOException {
       
        
    }

    //Recupera el/los archivos solicitados
    public void cargarDatos(String nombreArchivo) throws FileNotFoundException, IOException {
        //lee y busca el nombre del archivo que se le es ingresado
        try ( FileReader archivoLeer = new FileReader(nombreArchivo)) {
            Scanner entrada = new Scanner(archivoLeer);

            BufferedReader registro = new BufferedReader(archivoLeer);
            String linea = registro.readLine(); //son  los  encargados de leer el nombre

            while (linea != null) {
                //en el caso del que el nombre del archivo exista regresara el valor null por lo tanto regresara el archvo 
                System.out.println(linea);
                linea = registro.readLine();
            }
            archivoLeer.close();//lo cierra
        } catch (IOException ioe) {
            //en el caso de que el archivo no exista lanzara esta excepcion.
            System.out.println("Error en el archivo");
        }
    }
}

