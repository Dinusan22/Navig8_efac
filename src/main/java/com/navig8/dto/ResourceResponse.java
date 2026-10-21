
package com.navig8.dto;

import com.navig8.resource.ResourceCategory;
import java.time.Instant;

public class ResourceResponse {

    private Long id;
    private String name;
    private ResourceCategory category;
    private String description;
    private String location;
    private boolean deleted;
    private Instant createdAt;
    private Instant updatedAt;
    private MaintenancePersonResponse maintenancePerson;

    public ResourceResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public MaintenancePersonResponse getMaintenancePerson() {
        return maintenancePerson;
    }

    public void setMaintenancePerson(
            MaintenancePersonResponse maintenancePerson) {
        this.maintenancePerson = maintenancePerson;
    }

    public static class MaintenancePersonResponse {

        private Long id;
        private String fullName;
        private String jobTitle;
        private String department;
        private String email;

        public MaintenancePersonResponse() {
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
