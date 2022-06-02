import java.io.File;
import java.io.IOException;
/*Orlando Arzate Alcantara, Isamel Mendoza */
public class CrearArchivo {

    String nombre;
    String path;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    //Crea un nuevo archivo o verifica si existe un archivo ya existente.
    public void nuevoArchivo(String nombreArchivo) throws IOException {
        File archivo = new File(nombreArchivo);//instancia un nuevo objeto de tipo file
        boolean creado = false; //bandera para verificar los archivos creado y no creados

        this.setNombre(nombreArchivo); //recibe el nombre del archivo
        if (archivo.exists()) {
            System.out.println(archivo.exists());
            this.setPath(archivo.getAbsolutePath());//busca la direccion de almacenamiento de el archivo si es que existe
            System.out.println("Archivo existente en la ruta:\n"+this.getPath());//muestra la direccion
        } else {
            //crea el archivo en caso de no existir
            creado = archivo.createNewFile();
            System.out.println("Archivo creado con el nombre de: " + this.getNombre());
            System.out.println(archivo.exists());
        }
    }

}
