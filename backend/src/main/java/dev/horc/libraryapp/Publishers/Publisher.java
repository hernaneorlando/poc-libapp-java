package dev.horc.libraryapp.Publishers;

import dev.horc.libraryapp.Gateway.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "publishers")
public class Publisher extends BaseEntity {

    @Column(nullable = false)
    private String name;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
