public class User {
    private String firstName;
    private String lastName;

    // Criando o construtor da nossa clase de usuário
    public User(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User()
    {

    }

    public String getFirstName()
    {
        return firstName;
    }
}
