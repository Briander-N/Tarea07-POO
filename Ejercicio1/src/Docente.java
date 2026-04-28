public class Docente extends PersonaAcademica {
    private int horasClase;
    private double valorHora;

    public Docente(String codigo, String nombre, int edad,
                   int horasClase, double valorHora) {
        super(codigo, nombre, edad);
        setHorasClase(horasClase);
        this.valorHora = valorHora;
    }
    // Setter con validación
    public void setHorasClase(int horasClase) {
        if (horasClase >= 1 && horasClase <= 40) {
            this.horasClase = horasClase;
        } else {
            System.out.println("Las horas deben estar entre 1 y 40");
        }
    }
    // Getter
    public int getHorasClase() {
        return horasClase;
    }
    // Sobrescritura
    @Override
    public double calcularPago() {
        return horasClase * valorHora;
    }
    @Override
    public void describirRol() {
        System.out.println("Rol: Docente");
    }
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Horas de clase: " + horasClase);
        System.out.println("Valor por hora: " + valorHora);
    }
}