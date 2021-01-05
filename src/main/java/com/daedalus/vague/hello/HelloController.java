package com.daedalus.vague.hello;

import com.daedalus.vague.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.daedalus.vague.response.Status.SUCCESS;

@RestController
public class HelloController {

    @RequestMapping(
            value = "/hello",
            method = RequestMethod.GET)
    public ResponseEntity<Response> index() {
        Response response = new Response(SUCCESS, "Hello, World!");
        response.setDescription("Hello world message.");
        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }

    @RequestMapping(
            value = "/greeting-phrases",
            method = RequestMethod.GET)
    public ResponseEntity<Response> getAllGreetingPhrases() {
        String[] phrases = {"Hello", "GoodDay", "Good Afternoon", "Good Morning", "Hi", "Greetings", "Salutations"};
        Response response = new Response(SUCCESS, phrases);
        response.setDescription("List of some greeting phrases");
        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }

    @RequestMapping(
            value = "/person",
            method = RequestMethod.GET)
    public ResponseEntity<Response> getPerson() {
        Person person = new Person("Rocky", "Balboa", 60, "eggs");
        Response response = new Response();
        response.setStatus(SUCCESS);
        response.setData(person);
        response.setDescription("A fictional character.");
        return new ResponseEntity<Response>(response, HttpStatus.OK);

    }

    @RequestMapping(
            value = "/persons",
            method = RequestMethod.GET)
    public ResponseEntity<Response> getPersons() {
        Person[] persons = {
                new Person("Rocky", "Balboa", 60, "eggs"),
                new Person("Scooby", "Doo", 50, "scooby snacks"),
                new Person("Peter", "Parker", 28, "Aunt May's Cherry Pie")
        };
        Response response = new Response();
        response.setStatus(SUCCESS);
        response.setData(persons);
        response.setDescription("A list of fictional characters.");
        return new ResponseEntity<Response>(response, HttpStatus.OK);

    }
}

class Person {

    private String name;
    private String surname;
    private Integer age;
    private String favourite_food;

    public Person(String name, String surname, Integer age, String favourite_fruit) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.favourite_food = favourite_fruit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFavourite_fruit() {
        return favourite_food;
    }

    public void setFavourite_fruit(String favourite_fruit) {
        this.favourite_food = favourite_fruit;
    }
}