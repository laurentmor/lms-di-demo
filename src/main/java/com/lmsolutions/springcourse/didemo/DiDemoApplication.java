package com.lmsolutions.springcourse.didemo;

import com.lmsolutions.springcourse.didemo.controllers.ConstructorInjectedController;
import com.lmsolutions.springcourse.didemo.controllers.GetterInjectedController;
import com.lmsolutions.springcourse.didemo.controllers.MyController;
import com.lmsolutions.springcourse.didemo.controllers.PropertyInjectedController;
import com.lmsolutions.springcourse.didemo.services.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        controller.hello();

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        class Test implements GreetingService {

        }
        GreetingService service = new Test();
        System.out.println(service.sayHello());
    }

}

