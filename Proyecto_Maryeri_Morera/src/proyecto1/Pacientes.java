
package proyecto1;

import java.util.LinkedList;

public class Pacientes {
    
    String nombre;
    Medicamentos medicamentos = new  Medicamentos();
    
    public Pacientes() {
        this.nombre = nombre;
        this.medicamentos = medicamentos;
    }
    public Pacientes(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
