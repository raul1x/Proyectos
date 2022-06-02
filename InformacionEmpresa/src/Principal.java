import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        CrearArchivo archivoNuevo = new CrearArchivo();
        Persona persona = new Persona();
        int op;
        do{
            System.out.println("Menu de la Empresa");
            System.out.println("1. Alta-Empleado");
            System.out.println("2. Alta-Cliente");
            System.out.println("3. Alta-Regresar");
            System.out.println("4. Consultar-Empleados");
            System.out.println("5. Consultar -Clientes");
            System.out.println("6. Consultar -Regresar");
            System.out.println("7. Salir");
            op = entrada.nextInt();
            entrada.nextLine();
            System.out.println(op);
            switch(op){
                case 1: 
                        System.out.print("Dame el nombre del archivo: ");
                        Empleado empleado = new Empleado();
                        archivoNuevo.nuevoArchivo(entrada.nextLine());
                        empleado.guardarDatos(archivoNuevo.getNombre());
                        break;
            }
        }while(op != 7);
    }
}
