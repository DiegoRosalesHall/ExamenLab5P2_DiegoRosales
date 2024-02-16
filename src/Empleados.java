
import java.util.Date;


public class Empleados extends Usuario{
    String carrera, puestoLaboral, tiempotrabajo;

    public Empleados(String carrera, String puestoLaboral, String tiempotrabajo) {
        this.carrera = carrera;
        this.puestoLaboral = puestoLaboral;
        this.tiempotrabajo = tiempotrabajo;
    }
    
    public Empleados(String nombre, String apellido, String contra, String sexo, String departamento, String identidad, Date fechaNacimiento) {
        super(nombre, apellido, contra, sexo, departamento, identidad, fechaNacimiento);
        
    }

    public Empleados() {
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuestoLaboral() {
        return puestoLaboral;
    }

    public void setPuestoLaboral(String puestoLaboral) {
        this.puestoLaboral = puestoLaboral;
    }

    public String getTiempotrabajo() {
        return tiempotrabajo;
    }

    public void setTiempotrabajo(String tiempotrabajo) {
        this.tiempotrabajo = tiempotrabajo;
    }

    @Override
    public String toString() {
        return "Empleados{" + "carrera=" + carrera + ", puestoLaboral=" + puestoLaboral + ", tiempotrabajo=" + tiempotrabajo + '}';
    }
    
}
