import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 */
public class Cliente extends Persona {
    private String nombre_empresa;
    private int telefono_de_contacto;

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public int getTelefono_de_contacto() {
        return telefono_de_contacto;
    }

    public void setTelefono_de_contacto(int telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }
    public void guardarDatos(String nombreArchivo) throws IOException {
        try ( FileWriter archivoEscribir = new FileWriter(nombreArchivo)) {
            int numeroRegistros, i;
            Scanner entrada = new Scanner(System.in);
            System.out.println("Dame el numero de registros: ");//recibe la cantidad de alumnos
            numeroRegistros = entrada.nextInt();
            for (i = 1; i <= numeroRegistros; i++) {
                //crea la cantidad necesaria de espacios para almacenar los diferentes datos de los alumnos
                System.out.println("Nombre: ");
                this.setNombre(entrada.nextLine());
                System.out.println("Edad: ");
                this.setEdad(entrada.nextInt());
                System.out.println("Nombre de la Empresa: ");
                this.setNombre_empresa(entrada.nextLine());
                System.out.println("Numero de telefono: ");
                this.setTelefono_de_contacto(entrada.nextInt());
                //Escribe los datos que se proporcionaron
                archivoEscribir.write(nombre + " " + edad + "\n");

            }
            archivoEscribir.close();//cierra el archivo
        }
    }

    
    
    
    
}