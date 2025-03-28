package org.za.ac.cput.domain;

/**
 * User domain class
 * Author: Masithembe Ndzotyana
 * Stud No: 219145091
 */
public class User {
    // Attributes
    private int userId;
    private String name;
    private String lastName;
    private String email;
    private String password;

    // Optional extra attributes
    private String phoneNumber;
    private String role; // Example: "Admin", "Employee"

    // Constructors
    public User() {
        // Default constructor for frameworks
    }

    private User(Builder builder) {
        this.userId = builder.userId;
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.password = builder.password;
        this.phoneNumber = builder.phoneNumber;
        this.role = builder.role;
    }

    // Getters
    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getRole() {
        return role;
    }

    // toString method
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    // Builder Class
    public static class Builder {
        private int userId;
        private String name;
        private String lastName;
        private String email;
        private String password;
        private String phoneNumber;
        private String role;

        public Builder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setRole(String role) {
            this.role = role;
            return this;
        }

        // Copy method
        public Builder copy(User user) {
            this.userId = user.userId;
            this.name = user.name;
            this.lastName = user.lastName;
            this.email = user.email;
            this.password = user.password;
            this.phoneNumber = user.phoneNumber;
            this.role = user.role;
            return this;
        }

        // Build method
        public User build() {
            return new User(this);
        }
    }
}
