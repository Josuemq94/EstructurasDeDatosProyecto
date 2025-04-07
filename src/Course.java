public class Course {
    public String idCourse;
    public String nameCourse;
    public String descriptionC;

    public Course(String idCourse ,String nameCourse ,String descriptionC){
        this.idCourse = idCourse;
        this.nameCourse = nameCourse;
        this.descriptionC = descriptionC;
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

    @Override
    public String toString(){
        return "Course{" +
                "idCourse='" + idCourse + '\'' +
                ", nameCourse='" + nameCourse + '\'' +
                ", descriptionC='" + descriptionC + '\'' +
                '}';
    }
}
