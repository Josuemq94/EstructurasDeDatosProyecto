import java.time.LocalDate;


public class User {
    protected String id;
    protected String name;
    protected String lastName;
    protected String address;
    protected LocalDate dateOfBirth;
    protected String telNumber;

    public User (String id ,String name ,String lastName ,String address ,LocalDate dateOfBirth ,String telNumber){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.telNumber = telNumber;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String getTelNumber(){
        return telNumber;
    }

    public void setTelNumber(String telNumber){
        this.telNumber = telNumber;
    }

    @Override
    public String toString(){
        return "Usuario:{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", telNumber='" + telNumber + '\'' +
                '}';
    }
}

