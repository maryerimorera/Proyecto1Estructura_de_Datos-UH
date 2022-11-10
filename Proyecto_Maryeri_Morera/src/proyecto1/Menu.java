package proyecto1;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Menu {

    //Atributos
    private String medicamento;
    private String paciente;
    boolean validarOpcion = true;
    String acciones;

    //Cantidad 
    //JOptionPane.showMessageDialog(null, "Cantidad de medicamentos: " + listamedicamentos.cantidadMedicamentos());
    //Medicamentos
    //JOptionPane.showMessageDialog(null, "Medicamentos: " + listamedicamentos.mostrarMedicamentos());
    Medicamentos listamedicamentos = new Medicamentos();

    //Metodo para agregar medicamentos
    public void agg() {
        medicamento = JOptionPane.showInputDialog(null, "Ingrese el nombre del medicamento que desea agregar");
        listamedicamentos.agregarMedicamentos(medicamento);
    }

    //Metodo concatenado
    LinkedList<Pacientes> pacientes = new LinkedList<Pacientes>();

    int cont = 0;
    
    Pacientes pacientesAdd = new Pacientes();

    public void AggPaciente() {
        paciente = JOptionPane.showInputDialog(null, "Ingrese el nombre del paciente que desea agregar");
 
    }

    public void AggMedicamento() {

        medicamento = JOptionPane.showInputDialog(null, "Ingrese el nombre del medicamento que desea agregar");
        listamedicamentos.agregarMedicamentos(medicamento);
        acciones = JOptionPane.showInputDialog(null, "Si desea agregar otro medicamento presione 1, de lo contrario 2");
        cont++;

        switch (acciones) {
            case "1":
                AggMedicamento();
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Paciente: " + paciente + ", Medicamentos: " + listamedicamentos.toString());
                break;
            default:
                MensajeAdvertencia();
                break;
        }

    }
    
    public void EliminarMedicamento(){
        medicamento = JOptionPane.showInputDialog(null, "Digite el numero del medicamento que desea eliminar\n" + listamedicamentos);
        listamedicamentos.Borrar(medicamento);
    }

    //Métodos para mostrar mensajes
    public void MensajeBienvenida() {
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema del Hospital");
    }

    public void MensajeAdvertencia() {
        JOptionPane.showMessageDialog(null, "Por favor ingrese una opcion valida",
                "MENSAJE DE ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
    }

    //Metodo de Menu
    public void MenuHospital() {

        while (validarOpcion) {

            acciones = JOptionPane.showInputDialog(null, "MENU\n"
                    + "1. Insertar una nueva medicina a la lista de Medicamentos\n"
                    + "2. Insertar un paciente a la clínica y cada uno de sus medicamentos\n"
                    + "3. Borrar los medicamentos que ya no sean tomados por nadie\n"
                    + "4. Salir");
            {
                switch (acciones) {
                    case "1":
                        agg();
                        validarOpcion = false;
                        MenuHospital();
                        break;
                    case "2":
                        AggPaciente();
                        AggMedicamento();
                        validarOpcion = false;
                        MenuHospital();
                        break;
                    case "3":
                        EliminarMedicamento();
                        validarOpcion = false;
                        MenuHospital();
                        break;
                    case "4":
                        validarOpcion = false;
                        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema de Hospital");
                        break;
                    default:
                        MensajeAdvertencia();
                        MenuHospital();
                        break;
                }
            }
        }
    }
}
