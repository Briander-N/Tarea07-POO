public class EstudianteBecado extends Estudiante {
    protected double porcentajeBeca;

    public void setPorcentajeBeca(double porcentajeBeca) {
        if (porcentajeBeca >= 0 && porcentajeBeca <= 100) {
            this.porcentajeBeca = porcentajeBeca;
        }
    }

    @Override
    public double calcularPagoFinal() {
        double descuento = valorMatricula * (porcentajeBeca / 100);
        return valorMatricula - descuento;
    }
}