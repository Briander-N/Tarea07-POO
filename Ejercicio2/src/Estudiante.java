public class Estudiante {
    protected String codigo;
    protected String nombre;
    protected double promedio;
    protected double valorMatricula;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void setValorMatricula(double valorMatricula) {
        this.valorMatricula = valorMatricula;
    }

    public double calcularPagoFinal() {
        return valorMatricula;
    }

    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Matrícula: $" + valorMatricula);
    }

    public boolean validarPromedio() {
        return promedio >= 0 && promedio <= 10;
    }

    public double calcularPagoFinal(double descuentoExtra) {
        return calcularPagoFinal() - descuentoExtra;
    }
}