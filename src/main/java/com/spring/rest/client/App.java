package com.spring.rest.client;


import com.spring.rest.client.configuration.MyConfig;
import com.spring.rest.client.entity.Employee;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    private final static Logger log4j = Logger.getLogger(App.class);

    public static void main(String[] args) {
        // crate Spring context
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        // Get communication object using Reflection
        Communication communication = context.getBean("communication"
                , Communication.class);

        // List of employee
        List<Employee> allEmployees = communication.getAllEmployee();
        for (Employee e : allEmployees) {
            log4j.info(e);
        }
        //
        Employee employeeByID = communication.getEmployee(10);
        log4j.info("\nShow single object"+employeeByID);
    }
}
