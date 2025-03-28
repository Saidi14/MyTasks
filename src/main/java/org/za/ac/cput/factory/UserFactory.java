package org.za.ac.cput.factory;

import org.za.ac.cput.domain.User;
import org.za.ac.cput.util.Helper;

/**
 * User Factory class
 * Author: Masithembe Ndzotyana
 * Stud No: 219145091
 */
public class UserFactory {

    public static User createUser(int userId, String name, String lastName, String email, String password,
                                  String phoneNumber, String role) {

        if (Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(lastName) || Helper.isNullOrEmpty(email)
                || Helper.isNullOrEmpty(password) || Helper.isNullOrEmpty(phoneNumber) || Helper.isNullOrEmpty(role)) {
            throw new IllegalArgumentException("All fields are required and cannot be null or empty");
        }

        return new User.Builder()
                .setUserId(userId)
                .setName(name)
                .setLastName(lastName)
                .setEmail(email)
                .setPassword(password)
                .setPhoneNumber(phoneNumber)
                .setRole(role)
                .build();
    }
}
