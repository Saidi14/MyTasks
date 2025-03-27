package org.za.ac.cput.factory;

import org.za.ac.cput.domain.Category;
import org.za.ac.cput.util.Helper;

public class CategoryFactory {
    public static Category createCategory(int categoryID, String name, String description){
        if(Helper.isNullOrEmpty(categoryID)||Helper.isNullOrEmpty(name)||Helper.isNullOrEmpty(description));
        return new Category.Builder().

    setCategoryID(categoryID)
    .

    setName(name)
    .

    setDescription(description)
    .

    build();
}
}
