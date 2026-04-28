import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Código: ");
        String codigo = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Promedio: ");
        double promedio = sc.nextDouble();

        System.out.print("Matrícula: ");
        double matricula = sc.nextDouble();

        System.out.print("Porcentaje beca: ");
        double beca = sc.nextDouble();

        System.out.print("Bono excelencia: ");
        double bono = sc.nextDouble();

        // Polimorfismo
        Estudiante estudiante = new BecadoExcelencia();

        estudiante.setCodigo(codigo);
        estudiante.setNombre(nombre);
        estudiante.setPromedio(promedio);
        estudiante.setValorMatricula(matricula);

        BecadoExcelencia b = (BecadoExcelencia) estudiante;
        b.setPorcentajeBeca(beca);
        b.setBonoExcelencia(bono);

        estudiante.mostrarDatos();

        System.out.println("Pago final: $" + estudiante.calcularPagoFinal());

        System.out.println("Pago con descuento extra: $" +
                estudiante.calcularPagoFinal(50));
    }
}