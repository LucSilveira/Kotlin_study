public class User {
    public String firstName;
    private String lastName;

    public void setFirstName(String firstName)
    {
        this.firstName = firstName.toUpperCase();
    }

    public String getFirstName()
    {
        return firstName;
    }
}
