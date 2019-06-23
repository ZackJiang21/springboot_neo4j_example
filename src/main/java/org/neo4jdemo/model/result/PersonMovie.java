package org.neo4jdemo.model.result;

import org.neo4jdemo.model.node.Movie;
import org.neo4jdemo.model.node.Person;
import org.springframework.data.neo4j.annotation.QueryResult;

import java.util.Set;

@QueryResult
public class PersonMovie {
    private Person person;

    private Set<Movie> movies;

    public PersonMovie() {
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }
}
