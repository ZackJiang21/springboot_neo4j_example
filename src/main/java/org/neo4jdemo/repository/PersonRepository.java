package org.neo4jdemo.repository;

import org.neo4jdemo.model.node.Person;
import org.neo4jdemo.model.result.PersonMovie;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends Neo4jRepository<Person, Long> {
    @Query("MATCH (person:Person {name: {name}})-[r:ACTED_IN]->(movie) RETURN person,collect(movie) as movies")
    List<PersonMovie> getPersonMoviesbyName(@Param("name") String name);
    @Query("MATCH (person:Person {name: {name}})-[r:ACTED_IN]->(movies) RETURN person,r,movies")
    List<Person> getPersonByName(@Param("name") String name);
}
