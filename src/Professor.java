import java.time.LocalDate;
import java.util.LinkedList;


public class Professor extends User{
    private LinkedList<Course> courses;
    public Professor(String id,String name,String lastName,String address,LocalDate dateOfBirth,String telNumber){
        super(id,name,lastName,address,dateOfBirth,telNumber);
        this.courses = new LinkedList<>(); // Inicializar la lista de cursos
    }

    public LinkedList<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public String toString(){
        return "\n Profesor" +
                "\n Cédula: " + id +
                "\n Nombre: " + name + " " + lastName +
                "\n Dirección: " + address +
                "\n Fecha Nacimiento: " + dateOfBirth +
                "\n Teléfono: " + telNumber + "\n";
    }
}
