public class Course {

    public String idCourse;
    public String nameCourse;
    public String descriptionC;
    public String schedule;
    private Student student; // Un solo estudiante por curso
    private Professor professor; // Un solo profesor por curso

    public Course(String idCourse ,String nameCourse ,String descriptionC ,String schedule){
        this.idCourse = idCourse;
        this.nameCourse = nameCourse;
        this.descriptionC = descriptionC;
        this.schedule = schedule;
    }


    public String getIdCourse(){
        return idCourse;
    }

    public String getNameCourse(){
        return nameCourse;
    }

    public String getDescriptionC(){
        return descriptionC;
    }

    public String getSchedule(){
        return schedule;
    }

    public void setStudent(Student student){
        this.student = student;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    @Override
    public String toString(){
        return "Curso" +
                "\n Código Curso: " + idCourse +
                "\n Nombre Curso: " + nameCourse +
                "\n Descripción: " + descriptionC +
                "\n Horario: " + schedule +
                "\n Estudiantes asignados: " + (student != null ? student.getName() + " " + student.getLastName() :"Aún sin estudiantes asignados"+
                "\n Profesor asignado: " + (professor != null ? professor.getName() + " " + professor.getLastName() :"Aún sin profesores asignados"));
    }
}
