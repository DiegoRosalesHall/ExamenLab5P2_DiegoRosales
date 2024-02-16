
import java.util.Date;

public class Tramite {
String nombre, descripcion, identidad;
Date fechaSolicitud;

    public Tramite(String nombre, String descripcion, String identidad, Date fechaSolicitud) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.identidad = identidad;
        this.fechaSolicitud = fechaSolicitud;
    }

    public Tramite() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    @Override
    public String toString() {
        return "Tramite{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", identidad=" + identidad + ", fechaSolicitud=" + fechaSolicitud + '}';
    }


}
