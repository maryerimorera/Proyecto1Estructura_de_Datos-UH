
package proyecto1;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Medicamentos {
    
    String nombre;
    LinkedList<String> medicamentos = new LinkedList<String>();

    public Medicamentos(String nombre) {
        this.nombre = nombre;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
    
    public Medicamentos(){}
    //Metodo para agg medicamento
    public void agregarMedicamentos(String nomb){
        medicamentos.add(nomb);
    }
    
    //Metodo para eliminar medicamento
    
    
    //Funcion para ver todos los medicamentos
    public int cantidadMedicamentos(){
        return medicamentos.size() + 1;
    }
    
    //Metodo para mostrar los medicamentos
    public String mostrarMedicamentos(){
        
        for (String medicamento : medicamentos) {
            JOptionPane.showMessageDialog(null, "Medicamento: " + medicamento);
            
        }
        return medicamentos.set(0, "");
    }
    
    //Metodo para borrar medicamentos
    public boolean Borrar(String Num){
        return medicamentos.remove(Num);
    }
    
}