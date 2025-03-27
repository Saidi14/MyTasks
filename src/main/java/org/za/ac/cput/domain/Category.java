package org.za.ac.cput.domain;

public class Category {
    private int categoryID;
    private String name;
    private String description;

    private Category() {

    }

    private Category(Builder builder) {
        this.categoryID = builder.categoryID;
        this.name = builder.name;
        this.description = builder.description;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryID=" + categoryID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder {
        private int categoryID;
        private String name;
        private String description;

        public Builder setCategoryID(int categoryID) {
            this.categoryID = categoryID;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder copy(Category category) {
            this.categoryID = categoryID;
            this.name = name;
            this.description = description;
            return this;

        }

        public Category build() {
            return new Category(this);
        }
    }

}

