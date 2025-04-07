import java.time.LocalDate;
import java.util.Date;

public class Professor extends User{
    public Professor(String id,String name,String lastName,String address,LocalDate dateOfBirth,String telNumber){
        super(id,name,lastName,address,dateOfBirth,telNumber);
    }

    @Override
    public String toString(){
        return "Professor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", telNumber='" + telNumber + '\'' +
                "} " + super.toString();
    }
}
