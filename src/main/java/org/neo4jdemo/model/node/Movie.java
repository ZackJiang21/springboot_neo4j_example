package org.neo4jdemo.model.node;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4jdemo.model.relation.ActIn;

import java.util.Set;

@NodeEntity(label = "Movie")
public class Movie {
    @GraphId
    private Long id;

    @Property
    private int released;

    @Property
    private String tagline;

    @Property
    private String title;

    @Relationship(direction = Relationship.INCOMING, type = "ACTED_IN")
    private Set<ActIn> actIns;

    public Movie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getReleased() {
        return released;
    }

    public void setReleased(int released) {
        this.released = released;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<ActIn> getActIns() {
        return actIns;
    }

    public void setActIns(Set<ActIn> actIns) {
        this.actIns = actIns;
    }
}
