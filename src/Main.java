import java.util.InputMismatchException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args){
        int mainMenu = 0;

        do {
            try {
                System.out.println( "\u001B[34m\nSistema Universidad ABC \u001B[0m" );
                System.out.println( "\u001B[32mMenú de opciones:" );
                System.out.println( "1. Gestionar empleados" );
                System.out.println( "2. Gestionar Fila de la Caja" );
                System.out.println( "0. Salir del sistema\u001B[0m" );
                System.out.print( "Seleccione una opción: " );
                mainMenu = scanner.nextInt();
                scanner.nextLine();


                switch (mainMenu) {
                    case 1:
                        gestionarEmpleados();
                        break;
                    case 2:
                        gestionarFilaCaja();
                        break;
                    case 0:
                        System.out.println( "\u001B[32mCerrando Sesión...\u001B[0m" );
                        break;
                    default:
                        System.out.println( "\u001B[31mIngresar un número del menú de Opciones.\u001B[0m" );
                }
            }
            catch (InputMismatchException e) {
                System.out.println( "\u001B[31m Ingresar un número del menú de Opciones \u001B[0m" );
                scanner.nextLine();
            }
        } while (mainMenu != 0);
    }
        public static void gestionarEmpleados() {
            int opcionEmpleados = 0;

            do {
                try {
                    System.out.println( "\u001B[34m\nSistema Universidad ABC - Gestión de Empleados\u001B[0m" );
                    System.out.println( "\u001B[32mMenú de Sistema Empleados:" );
                    System.out.println( "1. Registrar un Estudiante" );
                    System.out.println( "2. Crear un Curso para el cuatrimestre" );
                    System.out.println( "3. Listar Estudiantes" );
                    System.out.println( "4. Listar Cursos" );
                    System.out.println( "0. Volver al menú principal\u001B[0m" );
                    System.out.print( "Seleccione una opción: " );
                    opcionEmpleados = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcionEmpleados) {
                        case 1:
                            registrarEstudiante();
                            break;
                        case 2:
                           // crearCurso();
                            break;
                        case 3:
                           // listarEstudiantes();
                            break;
                        case 4:
                          // listarCursos();
                            break;
                        case 0:
                            System.out.println( "\u001B[32mVolviendo al menú principal...\u001B[0m" );
                            break;
                        default:
                            System.out.println( "\u001B[31mIngresar un número del menú de Opciones.\u001B[0m" );
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println( "\u001B[31m Ingresar un número del menú de Opciones \u001B[0m" );
                    scanner.nextLine();
                }
            } while (opcionEmpleados != 0);
        }

        public static void gestionarFilaCaja() {
            int opcionCaja = 0;

            do {
                try {
                    System.out.println( "\u001B[34m\nSistema Universidad ABC - Gestión de Caja\u001B[0m" );
                    System.out.println( "\u001B[32mMenú de Gestión de Caja:" );
                    System.out.println( "1. Agregar persona a la fila" );
                    System.out.println( "2. Atender siguiente persona" );
                    System.out.println( "3. Mostrar fila actual" );
                    System.out.println( "0. Volver al menú principal\u001B[0m" );
                    System.out.print( "Seleccione una opción: " );
                    opcionCaja = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcionCaja) {
                        case 1:
                            //agregarAFila();
                            break;
                        case 2:
                            //atenderSiguiente();
                            break;
                        case 3:
                            //mostrarFila();
                            break;
                        case 0:
                            System.out.println( "\u001B[32mVolviendo al menú principal...\u001B[0m" );
                            break;
                        default:
                            System.out.println( "\u001B[31mIngresar un número del menú de Opciones.\u001B[0m" );
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println( "\u001B[31m Ingresar un número del menú de Opciones \u001B[0m" );
                    scanner.nextLine();
                }
            } while (opcionCaja != 0);
        }


        public static void registrarEstudiante(){
            try {
                System.out.println("Ingrese numero de cédula(ej1-1111-1111): ");
                String id = scanner.nextLine();
                System.out.println("Ingrese el nombre del estudiante: ");
                String name = scanner.nextLine();
                System.out.println("Ingrese el apellido del estudiante: ");
                String lastName = scanner.nextLine();
                System.out.println("Ingrese la dirección, ej:SanJosé: ");
                String address = scanner.nextLine();
                System.out.println("Ingrese la fecha de nacimiento ej:SanJosé: ");
                LocalDate dateOfBirth = LocalDate.parse( scanner.nextLine() );
                System.out.println("Ingrese número de teléfono(ej:8888-8888): ");
                String telNumber = scanner.nextLine();

                Student student = new Student(  id , name , lastName , address , dateOfBirth , telNumber);

                System.out.println("\u001B[32mEstudiante registrado exitosamente!\u001B[0m");
                System.out.println(student);

            } catch (Exception e) {
                System.out.println("\u001B[31mValidar datos ingresados: " + e.getMessage() + "\u001B[0m");
            }
        }


}

