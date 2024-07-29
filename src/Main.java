import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                //Solicite nombre
                System.out.print("Ingrese su nombre: ");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese su edad: ");
                int edad = scanner.nextInt();

                //Determinar si el usuario es mayor de edad
                boolean esMayorDeEdad = esMayorDeEdad(edad);

                // Imprimir saludo y mensaje
                imprimirsaludo(nombre, esMayorDeEdad);

                scanner.close();
            }
            public static boolean esMayorDeEdad(int edad){
                return edad >= 18;
            }
            public static void imprimirsaludo(String nombre, boolean esMayorDeEdad){
                System.out.println("Hola, " + nombre + "!");

                if(esMayorDeEdad){
                    System.out.println("Eres mayor de edad.");
                } else {
                    System.out.println("No eres mayor de edad. ");
                }
            }
        }
