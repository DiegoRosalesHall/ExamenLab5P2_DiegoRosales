
import java.util.ArrayList;
import java.util.Date;


public class Civiles extends Usuario{
    ArrayList<Tramite> tramites = new ArrayList<>();

    public Civiles() {
    }
    
    public Civiles(String nombre, String apellido, String contra, String sexo, String departamento, String identidad, Date fechaNacimiento) {
        super(nombre, apellido, contra, sexo, departamento, identidad, fechaNacimiento);
    }

  

    public Civiles(String nombre, String apellido, String contra) {
        super(nombre, apellido, contra);
    }

    @Override
    public String toString() {
        return super.identidad;
    }
    
}
