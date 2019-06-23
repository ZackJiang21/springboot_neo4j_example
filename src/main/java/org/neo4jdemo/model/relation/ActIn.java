package org.neo4jdemo.model.relation;

import org.neo4j.ogm.annotation.*;
import org.neo4jdemo.model.node.Movie;
import org.neo4jdemo.model.node.Person;

@RelationshipEntity(type = "ACTED_IN")
public class ActIn {
    @GraphId
    private Long id;

    @Property
    private String role;

    @StartNode
    private Person person;

    @EndNode
    private Movie movie;


    public ActIn() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
