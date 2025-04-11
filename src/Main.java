import java.util.InputMismatchException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner( System.in );
    static GenericLinkedList<Student> studentList = new GenericLinkedList<>();
    static GenericLinkedList<Course> courseList = new GenericLinkedList<>();
    static GenericLinkedList<Professor> professorList = new GenericLinkedList<>();

    public static void main(String[] args){
        int mainMenu = 0;

        do {
            try {
                System.out.println( "\u001B[34m\nBienvenido a Universidad ABC \u001B[0m" );
                System.out.println( "\u001B[32mMenú de opciones:" );
                System.out.println( "1. Gestionar Registro" );
                System.out.println( "2. Gestionar Fila de la Caja" );
                System.out.println( "3. Buscar en Registro" );
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
                    case 3:
                        gestionarBusqueda();
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

    public static void gestionarEmpleados(){
        int opcionEmpleados = 0;

        do {
            try {
                System.out.println( "\u001B[34m\nSistema Universidad ABC - Gestión Administrativa\u001B[0m" );
                System.out.println( "\u001B[32mMenú de Sistema Empleados:" );
                System.out.println( "1. Registrar un Estudiante" );
                System.out.println( "2. Crear un Curso para el cuatrimestre" );
                System.out.println( "3. Registrar un Profesor" );
                System.out.println( "4. Listar Estudiantes" );
                System.out.println( "5. Listar Cursos" );
                System.out.println( "6. Listar Profesor" );
                System.out.println( "7. Matricular estudiante en el curso" );
                System.out.println( "8. Asignar un profesor al curso" );
                System.out.println( "0. Volver al menú principal\u001B[0m" );
                System.out.print( "Seleccione una opción: " );
                opcionEmpleados = scanner.nextInt();
                scanner.nextLine();

                switch (opcionEmpleados) {
                    case 1:
                        registrarEstudiante();
                        break;
                    case 2:
                        crearCurso();
                        break;
                    case 3:
                        registrarProfesor();
                        break;
                    case 4:
                        //se usa linkedlist para acceder de forma dinámica a la lista
                        listarEstudiantes();
                        break;
                    case 5:
                        listarCursos();
                        break;
                    case 6:
                        listarProfesor();
                        break;
                    case 7:
                        asignarEstudianteACurso();
                        break;
                    case 8:
                        asignarProfesorACurso();
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

    public static void gestionarFilaCaja(){
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

    public static void gestionarBusqueda(){
        int opcionBusqueda = 0;

        do {
            try {
                System.out.println( "\u001B[34m\nSistema Universidad ABC - Buscar\u001B[0m" );
                System.out.println( "\u001B[32mMenú de Búsqueda:" );
                System.out.println( "1. Buscar Estudiante por Nombre" );
                System.out.println( "2. Buscar Estudiante por ID" );
                System.out.println( "3. Buscar Profesor" );
                System.out.println( "0. Volver al menú principal\u001B[0m" );
                System.out.print( "Seleccione una opción: " );
                opcionBusqueda = scanner.nextInt();
                scanner.nextLine();

                switch (opcionBusqueda) {
                    case 1:
                        //se pasa argumento la list
                        buscarPorNombre(studentList);
                        break;
                    case 2:
                        buscarPorId(studentList);
                        break;
                    case 3:
                        buscarPorNombreProfesor(professorList);
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
        } while (opcionBusqueda != 0);
    }




    //metodo de Gestion Empleados Universidad
    public static void registrarEstudiante(){
        try {
            System.out.println( "Ingrese numero de cédula(ej:112345678): " );
            String id = scanner.nextLine();
            System.out.println( "Ingrese el nombre del estudiante: " );
            String name = scanner.nextLine();
            System.out.println( "Ingrese el apellido del estudiante: " );
            String lastName = scanner.nextLine();
            System.out.println( "Ingrese la dirección, ej:SanJosé: " );
            String address = scanner.nextLine();
            System.out.println( "Ingrese la fecha de nacimiento YYYY-MM-DD: " );
            LocalDate dateOfBirth = LocalDate.parse( scanner.nextLine() );
            System.out.println( "Ingrese número de teléfono(ej:77777777): " );
            String telNumber = scanner.nextLine();

            Student student = new Student( id ,name ,lastName ,address ,dateOfBirth ,telNumber );
            studentList.insertNode( student );

            System.out.println( "\u001B[32mEstudiante registrado exitosamente!\u001B[0m" );
            System.out.println( student );

        }
        catch (Exception e) {
            System.out.println( "\u001B[31mValidar datos ingresados: " + e.getMessage() + "\u001B[0m" );
        }
    }
    public static void listarEstudiantes(){
        try {
            studentList.printList();
        }
        catch (Exception e) {
            System.out.println( "\u001B[31mError al listar: " + e.getMessage() + "\u001B[0m" );
        }
    }
    public static void crearCurso(){
        try {
            System.out.println( "Ingrese el código del curso a registrar: " );
            String idCourse = scanner.nextLine();
            System.out.println( "Ingrese el nombre del curso: " );
            String nameCourse = scanner.nextLine();
            System.out.println( "Ingrese horario : " );
            String schedule = scanner.nextLine();
            System.out.println( "Ingrese una descripción: " );
            String descriptionC = scanner.nextLine();

            Course course = new Course( idCourse ,nameCourse ,descriptionC ,schedule );
            courseList.insertNode( course );

            System.out.println( "\u001B[32mCurso creado exitosamente!\u001B[0m" );
            System.out.println( course );

        }
        catch (Exception e) {
            System.out.println( "\u001B[31mValidar datos ingresados: " + e.getMessage() + "\u001B[0m" );
        }
    }
    public static void listarCursos(){
        try {
            courseList.printList();
        }
        catch (Exception e) {
            System.out.println( "\u001B[31mError al listar: " + e.getMessage() + "\u001B[0m" );
        }
    }
    public static void registrarProfesor(){
        try {
            System.out.println( "Ingrese numero de cédula(ej:112345678): " );
            String id = scanner.nextLine();
            System.out.println( "Ingrese el nombre del profesor(a): " );
            String name = scanner.nextLine();
            System.out.println( "Ingrese el apellido del profesor(a): " );
            String lastName = scanner.nextLine();
            System.out.println( "Ingrese la dirección, ej:SanJosé: " );
            String address = scanner.nextLine();
            System.out.println( "Ingrese la fecha de nacimiento YYYY-MM-DD: " );
            LocalDate dateOfBirth = LocalDate.parse( scanner.nextLine() );
            System.out.println( "Ingrese número de teléfono(ej:77777777): " );
            String telNumber = scanner.nextLine();

            Professor professor = new Professor( id ,name ,lastName ,address ,dateOfBirth ,telNumber );
            professorList.insertNode( professor );

            System.out.println( "\u001B[32mProfesor registrado exitosamente!\u001B[0m" );
            System.out.println( professor );

        }
        catch (Exception e) {
            System.out.println( "\u001B[31mValidar datos ingresados: " + e.getMessage() + "\u001B[0m" );
        }
    }
    public static void listarProfesor(){
        try {
            professorList.printList();
        }
        catch (Exception e) {
            System.out.println( "\u001B[31mError al listar: " + e.getMessage() + "\u001B[0m" );
        }
    }
    public static void asignarEstudianteACurso() {
        try {
            // Pedir ID del curso
            System.out.println("Ingrese el ID del curso:");
            String idCourse = scanner.nextLine();

            // Buscar el curso en la lista
            Course cursoEncontrado = null;
            Node<Course> currentCourse = courseList.head;
            while (currentCourse != null) {
                if (currentCourse.data.getIdCourse().equals(idCourse)) {
                    cursoEncontrado = currentCourse.data;
                    break;
                }
                currentCourse = currentCourse.next;
            }

            if (cursoEncontrado == null) {
                System.out.println("\u001B[31mEl curso no existe\u001B[0m");
                return;
            }

            // Pedir ID del estudiante
            System.out.println("Ingrese el ID del estudiante:");
            String id = scanner.nextLine();

            // Buscar el estudiante en la lista
            Student estudianteEncontrado = null;
            Node<Student> currentStudent = studentList.head;
            while (currentStudent != null) {
                if (currentStudent.data.getId().equals(id)) {
                    estudianteEncontrado = currentStudent.data;
                    break;
                }
                currentStudent = currentStudent.next;
            }

            if (estudianteEncontrado == null) {
                System.out.println("\u001B[31mEl estudiante no existe\u001B[0m");
                return;
            }

            // Verificar si el estudiante ya tiene este curso
            boolean estaInscrito = false;
            for (Course curso : estudianteEncontrado.getCourses()) {
                if (curso.getIdCourse().equals(idCourse)) {
                    estaInscrito = true;
                    break;
                }
            }
            if (estaInscrito) {
                System.out.println("\u001B[31mEl estudiante ya está inscrito en este curso\u001B[0m");
                return;
            }

            // Asignar el curso al estudiante y viceversa
            estudianteEncontrado.addCourse(cursoEncontrado);
            cursoEncontrado.setStudent(estudianteEncontrado);

            System.out.println("\u001B[32mEstudiante asignado al curso exitosamente\u001B[0m");

        } catch (Exception e) {
            System.out.println("\u001B[31mError al asignar: " + e.getMessage() + "\u001B[0m");
        }
    }
    public static void asignarProfesorACurso() {
        try {
            // Pedir ID del curso
            System.out.println("Ingrese el ID del curso:");
            String idCourse = scanner.nextLine();

            // Buscar el curso en la lista
            Course cursoEncontrado = null;
            Node<Course> currentCourse = courseList.head;
            while (currentCourse != null) {
                if (currentCourse.data.getIdCourse().equals(idCourse)) {
                    cursoEncontrado = currentCourse.data;
                    break;
                }
                currentCourse = currentCourse.next;
            }

            if (cursoEncontrado == null) {
                System.out.println("\u001B[31mEl curso no existe\u001B[0m");
                return;
            }

            // Pedir ID del usuario
            System.out.println("Ingrese el ID del profesor:");
            String id= scanner.nextLine();

            // Buscar el estudiante en la lista
            Professor profesorEncontrado = null;
            Node<Professor> currentProfessor = professorList.head;
            while (currentProfessor != null) {
                if (currentProfessor.data.getId().equals(id)) {
                    profesorEncontrado = currentProfessor.data;
                    break;
                }
                currentProfessor = currentProfessor.next;
            }

            if (profesorEncontrado == null) {
                System.out.println("\u001B[31mEl profesor no existe\u001B[0m");
                return;
            }

            // Verificar si el profesor ya esta asignado al curso
            boolean estaInscrito = false;
            for (Course curso : profesorEncontrado.getCourses()) {
                if (curso.getIdCourse().equals(idCourse)) {
                    estaInscrito = true;
                    break;
                }
            }
            if (estaInscrito) {
                System.out.println("\u001B[31mEl profesor ya está asignado en este curso\u001B[0m");
                return;
            }

            // Asignar el curso al estudiante y viceversa
            profesorEncontrado.addCourse(cursoEncontrado);
            cursoEncontrado.setProfessor(profesorEncontrado);

            System.out.println("\u001B[32mProfesor asignado al curso exitosamente\u001B[0m");

        } catch (Exception e) {
            System.out.println("\u001B[31mError al asignar: " + e.getMessage() + "\u001B[0m");
        }
    }

    //Método Busqueda

    public static void buscarPorNombre(GenericLinkedList<Student> studentList) {
        try {
            // Pedir nombre estudiante
            System.out.println("Ingrese el nombre del estudiante:");
            String nombre = scanner.nextLine();
            Node<Student> currentStudent = studentList.head;
            while (currentStudent != null) {
                // Acceder a la data dentro del nodo
                if (currentStudent.data.getName().equals(nombre)) {
                    System.out.println("Estudiante encontrado: " + currentStudent.data.getName());
                    return;
                }
                currentStudent = currentStudent.next;
            }
            System.out.println("Estudiante no encontrado con el nombre de: " + nombre);

        } catch (Exception e) {
            System.out.println( "\u001B[31mError al listar: " + e.getMessage() + "\u001B[0m" );
        }
    }

    public static void buscarPorId(GenericLinkedList<Student> studentList) {
        try{
            // Pedir nombre estudiante
            System.out.println("Ingrese el ID del estudiante:");
            String id = scanner.nextLine();
            Node<Student> currentStudent = studentList.head;
        while (currentStudent != null) {
            // Acceder a la data dentro del nodo
            if (currentStudent.data.getId().equals(id)) {
                System.out.println("Estudiante encontrado: " + currentStudent.data.getName()+ "con el ID: "+currentStudent.data.getId());
                return;
            }
            currentStudent = currentStudent.next;
        }
        System.out.println("Estudiante no encontrado con ID: " + id);

    } catch (Exception e) {
            System.out.println( "\u001B[31mError al listar: " + e.getMessage() + "\u001B[0m" );
        }
}

    public static void buscarPorNombreProfesor(GenericLinkedList<Professor> professorList) {
        try {
            // Pedir nombre estudiante
            System.out.println("Ingrese el nombre del Profesor:");
            String nombre = scanner.nextLine();
            Node<Professor> currentProfessor = professorList.head;
            while (currentProfessor != null) {
                // Acceder a la data dentro del nodo
                if (currentProfessor.data.getName().equals(nombre)) {

                    //se agrega curso y nombre cuando encuentra el nombre al print
                    System.out.println("Profesor encontrado: " + currentProfessor.data.getName());

                    // Mostrar solo el código y el nombre de los cursos
                    System.out.println("Lista de cursos:");
                    for (Course course : currentProfessor.data.getCourses()) {
                        System.out.println("Código: " + course.getIdCourse() + ", Nombre: " + course.getNameCourse());
                    }
                    return;
                }
                currentProfessor = currentProfessor.next;
            }
            System.out.println("Profesor no encontrado con el nombre de: " + nombre);

        } catch (Exception e) {
            System.out.println( "\u001B[31mError al listar: " + e.getMessage() + "\u001B[0m" );
        }
    }

    //método de Gestion Fila de Cajas


}

