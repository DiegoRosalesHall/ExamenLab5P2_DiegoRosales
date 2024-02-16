
import java.util.Date;


public class Usuario {
     protected String nombre, apellido, contra, sexo, departamento, identidad;
   protected Date fechaNacimiento;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String contra, String sexo, String departamento, String identidad, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contra = contra;
        this.sexo = sexo;
        this.departamento = departamento;
        this.identidad = identidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Usuario(String nombre, String apellido, String contra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contra = contra;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", contra=" + contra + ", sexo=" + sexo + ", departamento=" + departamento + ", identidad=" + identidad + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
}
