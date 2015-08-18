package com.elisa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;



/**
 * Created by elisa on 18/08/15.
 */
@Configuration
@ComponentScan
public class Application {

    @Bean
    Person testPerson() {
        return new Person() {
            public String personName() {
                return "Elisa";
            }
        };
    }

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);
        Printer namePrinter = context.getBean(Printer.class);
        namePrinter.printName();
    }

}
