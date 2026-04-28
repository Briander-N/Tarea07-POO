import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese código: ");
        String codigo = sc.nextLine();

        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese horas de clase: ");
        int horasClase = sc.nextInt();

        System.out.print("Ingrese valor por hora: ");
        double valorHora = sc.nextDouble();

        System.out.print("Ingrese publicaciones: ");
        int publicaciones = sc.nextInt();

        // Polimorfismo
        PersonaAcademica persona = new DocenteInvestigador(codigo, nombre, edad, horasClase, valorHora, publicaciones
        );

        persona.mostrarDatos();
        persona.describirRol();

        System.out.println("Pago final: $" + persona.calcularPago());
        // Para usar la sobrecarga
        DocenteInvestigador docente = (DocenteInvestigador) persona;

        System.out.println("Pago con bono extra: $" +
                docente.calcularPago(50));
        
    }
}