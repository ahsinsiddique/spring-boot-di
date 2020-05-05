package com.springframework.sf.di;

import com.springframework.sf.di.Controllers.ConstructorInjController;
import com.springframework.sf.di.Controllers.PropertyInjectorController;
import com.springframework.sf.di.Controllers.SetterInjController;
import com.springframework.sf.di.Controllers.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.out.println("Primary: --------------");

        ApplicationContext context = SpringApplication.run(Application.class, args);
        UserController controller = (UserController) context.getBean("userController");
        String s = controller.hello();
        System.out.println(s);

        System.out.println("property: --------------");
        PropertyInjectorController propertyInjectorController =
                (PropertyInjectorController) context.getBean("propertyInjectorController");
        System.out.println( propertyInjectorController.sayGreetings());

        System.out.println("Constructor: --------------");
        ConstructorInjController constructorInjController =
                (ConstructorInjController) context.getBean("constructorInjController");
        System.out.println(constructorInjController.sayHello());


        System.out.println("Setter: --------------");
        SetterInjController setterInjController =(SetterInjController) context.getBean("setterInjController");
        System.out.println(setterInjController.sayHello());



    }

}
