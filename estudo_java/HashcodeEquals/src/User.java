import java.util.Objects;

public class User
{
    private String firstName;
    private String lastName;

    // Criando o método construtor
    public User(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    // Criando uma função para devolver os nomes concatenados
    public String concatenarNomes()
    {
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    public String concatenarNomes( boolean mostrarApelido )
    {
        if( mostrarApelido )
        {
            return concatenarNomes() + " seu(ua) lindo(a)";

        }else{
            return concatenarNomes();
        }
    }

    // Criando os métodos de comparação dos elementos

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
