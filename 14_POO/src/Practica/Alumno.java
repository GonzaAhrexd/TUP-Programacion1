package Practica;

public class Alumno {
    int nroLegajo;
    String nombreAlumno;
    String apellidoAlumno;
    String domicilioAlumno;
    
    public static final String APELLIDO_DEFAULT = "Unasigned";
    public static final String DOMICILIO_DEFAULT = "Unasigned";
    /*Constructores */
    public Alumno(int legajo, String nombre){
        nroLegajo = legajo;
        nombreAlumno = nombre;
        apellidoAlumno = APELLIDO_DEFAULT;
        domicilioAlumno = DOMICILIO_DEFAULT;
    }
    public Alumno(int legajo, String nombre, String apellido){
        nroLegajo = legajo;
        nombreAlumno = nombre;
        apellidoAlumno = apellido;
        domicilioAlumno = DOMICILIO_DEFAULT;
    }
    public Alumno(int legajo, String nombre, String apellido, String domicilio){
        nroLegajo = legajo;
        nombreAlumno = nombre;
        apellidoAlumno = apellido;
        domicilioAlumno = domicilio;
    }

}
