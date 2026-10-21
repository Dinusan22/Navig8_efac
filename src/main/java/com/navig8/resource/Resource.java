
package com.navig8.resource;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "resources")
public class Resource {

    


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 40)
    private ResourceCategory category;

    @Column(length = 2000)
    private String description;

    @Column(length = 300)
    private String location;

    @Column(nullable = false)
    private boolean deleted = false;
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "maintenance_person_id", nullable = false)
    private MaintenancePerson maintenancePerson;

    @Column(nullable = false, updatable = false)
    private Instant createdAt;

    @Column(nullable = false)
    private Instant updatedAt;

    protected Resource() {
        // Required by JPA.
    }

    @PrePersist
    protected void onCreate() {
        Instant now = Instant.now();
        createdAt = now;
        updatedAt = now;
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = Instant.now();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceCategory getCategory() {
        return category;
    }

    public void setCategory(ResourceCategory category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }


    public MaintenancePerson getMaintenancePerson() {
    return maintenancePerson;
    }

    public void setMaintenancePerson(MaintenancePerson maintenancePerson) {
    this.maintenancePerson = maintenancePerson;
     }
}
