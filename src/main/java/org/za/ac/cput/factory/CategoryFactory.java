package org.za.ac.cput.factory;

import org.za.ac.cput.domain.Category;
import org.za.ac.cput.util.Helper;

public class CategoryFactory {
    public static Category createCategory(int categoryID, String name, String categoryDescription) {
        if (categoryID <= 0 || Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(categoryDescription)) {
            System.out.println("Invalid input: categoryID must be positive, and name/description must not be empty.");
           return null;
        }
        return new Category.Builder().setCategoryID(categoryID)
                        .setName(name)
                        .setCategoryDescription(categoryDescription)
                        .build();
    }
}
