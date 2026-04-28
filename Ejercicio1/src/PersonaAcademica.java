public class PersonaAcademica {
    private String codigo;
    private String nombre;
    private int edad;

    public PersonaAcademica(String codigo, String nombre, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        setEdad(edad);
    }

    // Setter con validación
    public void setEdad(int edad) {
        if (edad >= 18) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe ser mayor o igual a 18");
        }
    }

    // Getter
    public int getEdad() {
        return edad;
    }

    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void describirRol() {
        System.out.println("Rol: Persona académica");
    }

    public double calcularPago() {
        return 0;
    }
}