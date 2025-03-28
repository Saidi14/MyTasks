package org.za.ac.cput.factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.za.ac.cput.domain.Category;

import static org.junit.jupiter.api.Assertions.*;


class CategoryFactoryTest {

    @Test
    void testCreateCategoryUsingGetTasks() {
        Category category = CategoryFactory.createCategory(1001, "Electronics", "Gadgets and devices");

        assertNotNull(category);
    }


    @Test
    void testCreateCategoryID() {
        Category category = CategoryFactory.createCategory(-1, "Clothing", "Fashion items");
        assertNull(category, "Category should be null for invalid categoryID");
    }

    @Test
    void testCreateEmptyName() {
        Category category = CategoryFactory.createCategory(2002, "", "Home essentials");
        assertNull(category, "Category should be null for empty name");
    }



    @Test
    void testCreateEmptyDescription() {
        Category category = CategoryFactory.createCategory(4004, "Toys", "");
        assertNull(category, "Category should be null for empty description");
    }

    }

