import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Clase para representar un servicio
class Servicio {
    int id;
    String nombre;
    double precio;

    public Servicio(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
}
  
// Clase para representar un empleado
class Empleado {
    int id;
    String nombre;
    String puesto;

    public Empleado(int id, String nombre, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
    }
}

public class Programa {
    public static void main(String[] args) {
        // Crear la lista circular de servicios
        Queue<Servicio> servicios = new LinkedList<>();
        servicios.add(new Servicio(0, "Cambio de Fibras", 4000));
        servicios.add(new Servicio(1, "Cambio de aceite", 6000));

        // Crear la pila de empleados
        Stack<Empleado> empleados = new Stack<>();
        empleados.push(new Empleado(0, "Pablo Ortiz", "Mecánico"));
        empleados.push(new Empleado(1, "Luis Calderon", "Secretario"));

        // Mostrar los servicios
        System.out.println("Lista de servicios:");
        for (Servicio servicio : servicios) {
            System.out.println("ID: " + servicio.id + ", Nombre: " + servicio.nombre + ", Precio: " + servicio.precio);
        }

        // Mostrar los empleados
        System.out.println("\nLista de empleados:");
        while (!empleados.isEmpty()) {
            Empleado empleado = empleados.pop();
            System.out.println("ID: " + empleado.id + ", Nombre: " + empleado.nombre + ", Puesto: " + empleado.puesto);
        }
    }
}