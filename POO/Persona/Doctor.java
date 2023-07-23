public class Doctor extends Persona {
    private String especialidad;

    public Doctor(String datoDni, int datoEdad, String especialidad) {
        super(datoDni, datoEdad);
        this.especialidad = especialidad;
    }
}
