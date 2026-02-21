package co.edu.cesde.ga.models;

public class Person {

    long user_ID;
    String code;
    String documentNumber;
    String firstName;
    String lastName;
    Boolean status;

    public void setUser_ID(long user_ID) {
        this.user_ID = user_ID;
    }

    public Person(long user_ID, Boolean status, String lastName, String firstName, String documentNumber, String code) {
        this.user_ID = user_ID;
        this.status = status;
        this.lastName = lastName;
        this.firstName = firstName;
        this.documentNumber = documentNumber;
        this.code = code;
    }

    public Person() {
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getUser_ID() {
        return user_ID;
    }

    public String getCode() {
        return code;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Boolean getStatus() {
        return status;
    }
}
