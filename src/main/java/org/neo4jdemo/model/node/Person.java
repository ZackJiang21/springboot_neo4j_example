package org.neo4jdemo.model.node;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4jdemo.model.relation.ActIn;

import java.util.Set;

@NodeEntity(label = "Person")
public class Person {
    @GraphId
    private Long id;

    @Property
    private int born;

    @Property
    private String name;

    @Relationship(direction = Relationship.OUTGOING, type = "ACTED_IN")
    private Set<ActIn> ActInList;


    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getBorn() {
        return born;
    }

    public void setBorn(int born) {
        this.born = born;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ActIn> getActInList() {
        return ActInList;
    }

    public void setActInList(Set<ActIn> actInList) {
        ActInList = actInList;
    }
}
