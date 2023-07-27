package MyLibrary.models;

public class UserModel {

    private String name;
    private String surname;
    private int doc_id;
    private String email;
    private String program;
    private int doc_type;

    public UserModel() {

    }
    public UserModel(String name, String surname, String email, String program, int doc_id, int doc_type) {
        this.name = name;
        this.surname = surname;
        this.doc_id = doc_id;
        this.email = email;
        this.program = program;
        this.doc_type = doc_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(int doc_id) {
        this.doc_id = doc_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getDoc_type() {
        return doc_type;
    }

    public void setDoc_type(int doc_type) {
        this.doc_type = doc_type;
    }
}
