
package com.navig8.dto;

import com.navig8.resource.ResourceCategory;

public class ResourceCreateRequest {

    private String name;
    private ResourceCategory category;
    private String description;
    private String location;
    private MaintenancePersonRequest maintenancePerson;

    public ResourceCreateRequest() {
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

    public MaintenancePersonRequest getMaintenancePerson() {
        return maintenancePerson;
    }

    public void setMaintenancePerson(
            MaintenancePersonRequest maintenancePerson) {
        this.maintenancePerson = maintenancePerson;
    }

    public static class MaintenancePersonRequest {

        private String fullName;
        private String jobTitle;
        private String department;
        private String email;

        public MaintenancePersonRequest() {
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
