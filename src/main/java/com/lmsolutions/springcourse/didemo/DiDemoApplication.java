package com.lmsolutions.springcourse.didemo;

import com.lmsolutions.springcourse.didemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.ProtocolResolver;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.stream.IntStream;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

       ApplicationContext ctx= SpringApplication.run(DiDemoApplication.class, args);
        MyController controller=(MyController)ctx.getBean("myController");
        controller.hello();
        int[] tab={1,2,3};
       IntStream i= Arrays.stream(tab);
        try {
            FileOutputStream fileInputStream=new FileOutputStream("Test");
            fileInputStream.write(i);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

