import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Empleado {
    double sueldo_bruto;
    double sueldo_net;
    String nombre;
    double edad;

    public double getEdad() {
        return edad;
    }
    public void setEdad(double edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSueldo_bruto() {
        return sueldo_bruto;
    }
    public void setSueldo_bruto(double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }
    
    public double getSueldo_net() {
        return sueldo_net;
    }
    public void setSueldo_net(double sueldo_net) {
        this.sueldo_net = sueldo_net;
    } 
    
    public void guardarDatos(String nombreArchivo) throws IOException{
        try(FileWriter archivoEscribir = new FileWriter(nombreArchivo)) {
            int numeroRegistros, i;
            Scanner entrada = new Scanner (System.in);
            System.out.print("Ingrese el numero de registros: ");
            numeroRegistros = entrada.nextInt();
            for(i=1; i  <= numeroRegistros; i++){
                System.out.print("Nombre: "); this.setNombre(entrada.nextLine());entrada.nextLine();
                System.out.print("Edad: "); this.setEdad(entrada.nextDouble());entrada.nextLine();
                System.out.print("Sueldo bruto: "); this.setSueldo_bruto(entrada.nextDouble());entrada.nextLine();

                archivoEscribir.write(nombre+""+edad+""+sueldo_bruto+"\n");
            }
            archivoEscribir.close();
        }
    }
    public void cargarDatos(String nombreArchivo) throws FileNotFoundException, IOException{
        try(FileReader archivoLeer = new FileReader(nombreArchivo)){
            Scanner empleado = new Scanner(archivoLeer);

            BufferedReader registro = new BufferedReader(archivoLeer);

            String linea = registro.readLine();

            while(linea != null){
                System.out.println(linea);
                linea = registro.readLine();
            }
            archivoLeer.close();
        }catch (IOException ioe){
            System.out.println("Error en el archivo");
        }
    }
}