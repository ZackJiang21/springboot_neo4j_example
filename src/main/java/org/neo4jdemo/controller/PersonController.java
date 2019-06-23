package org.neo4jdemo.controller;

import org.neo4jdemo.model.node.Person;
import org.neo4jdemo.model.result.PersonMovie;
import org.neo4jdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/rest/v1/person")
    public List<PersonMovie> getMoviesByPersonName(@RequestParam String name) {
        return personRepository.getPersonMoviesbyName(name);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/rest/v2/person")
    public List<Person> getPersonRels(@RequestParam String name) {
        List<Person> people = personRepository.getPersonByName(name);
        // you can process the people object in java
        return people;
    }
}
