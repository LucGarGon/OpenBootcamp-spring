import org.example.model.Saludo;
import org.example.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Saludo saludo = (Saludo) context.getBean("saludo");
        saludo.imprimirSaludo();

        UserService user = (UserService) context.getBean("userService");

        user.imprimirSaludo();
    }
}
