package week4;

public class RegistrationForm {

    public String firstName;
    public String lastName;

    public RegistrationForm(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public RegistrationForm(String firstName) {
        this(firstName, "NA");
//        this.firstName = firstName;
//        this.lastName = "NA";
    }

    public RegistrationForm() {
        this( "NA");
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}
