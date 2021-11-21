import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld a1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld a2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(a1.equals(a2));

        Cat b1 = (Cat) applicationContext.getBean("cat");
        Cat b2 = (Cat) applicationContext.getBean("cat");
        System.out.println(b1.equals(b2));
    }
}