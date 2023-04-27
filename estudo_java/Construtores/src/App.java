import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args)
    {
        // Criando uma lista de usuários por meio do elemento List<>  do java
        // e definindo o objeto como do tipo ArrayList para gerar uma lista sem definição de limite
        List<User> users = new ArrayList<>();

        for (int i = 0; i < 5; i++)
        {
            User newUser = new User(("Nome" + i), ("Sobrenome" + i) );
            users.add( newUser );

            System.out.println( users.get(i).getFirstName() );
        }
    }
}
