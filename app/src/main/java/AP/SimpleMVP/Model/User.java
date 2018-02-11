package AP.SimpleMVP.Model;

/**
 * Created by Admin on 2/7/18.
 */

public class User {

    private int id;

    private String firstName;
    private String lastName;

    public int getID() { return id; }
    public void setID(int id) { this.id = id;}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
