package co.edu.cesde.ga.models;

public class Student {

    long user_ID;
    String code;
    String documentNumber;
    String firstName;
    String lastName;
    Boolean status;

    public Student(long user_ID, Boolean status, String lastName, String code, String documentNumber, String firstName) {
        this.user_ID = user_ID;
        this.status = status;
        this.lastName = lastName;
        this.code = code;
        this.documentNumber = documentNumber;
        this.firstName = firstName;
    }

    public Student(long user_ID) {
        this.user_ID = user_ID;
    }

    public void setUser_ID(long user_ID) {
        this.user_ID = user_ID;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getUser_ID() {
        return user_ID;
    }

    public Boolean getStatus() {
        return status;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getCode() {
        return code;
    }
}