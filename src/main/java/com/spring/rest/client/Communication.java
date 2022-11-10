package com.spring.rest.client;


import com.spring.rest.client.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Communication class for sending http request and get response
 * "@Component" = bean
 */
@Component
public class Communication {

    // create BEAN
    @Autowired
    private RestTemplate restTemplate;

    // If server is working client can use this URL to set http request
    private final String URL =
            "http://localhost:8080/com_spring_rest/api/employees";

    /**
     * The showAllEmployee take ResponseEntity for URL and Http Get
     * Plus ParameterizedTypeReference do List<JSON> -> List<Java_Object>
     * @return List of JSON from DB converted into List of Java objects
     */
    public List<Employee> getAllEmployee(){

        ResponseEntity<List<Employee>>responseEntity =
                restTemplate.exchange(URL, HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<Employee>>() {
                });

        return responseEntity.getBody();
    }

    /**
     * Make URL for http request and get JSON Object from DB by ID
     * @param id of object in DB
     * @return JSON Object turned into Java object
     */
    public Employee getEmployee(int id){
        return restTemplate.getForObject(URL+"/"+id,
                Employee.class);
    }

    public void saveEmployee(Employee employee){

    }

    public void deleteEmployee(int id ){

    }
}
