package org.za.ac.cput.domain;

public class Category {
    private int categoryID;
    private String name;
    private String categoryDescription;

    private Category() {

    }

    private Category(Builder builder) {
        this.categoryID = builder.categoryID;
        this.name = builder.name;
        this.categoryDescription = builder.categoryDescription;
    }

    @Override
    public String toString() {
        return "Category:" +
                "CategoryI: " + categoryID +
                ", Name: " + name + '\'' +
                ", Description:" + categoryDescription;
    }

    public static class Builder {
        private int categoryID;
        private String name;
        private String categoryDescription;

        public Builder setCategoryID(int categoryID) {
            this.categoryID = categoryID;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCategoryDescription(String categoryDescription) {
            this.categoryDescription = categoryDescription;
            return this;
        }

        public Builder copy(Category category) {
            this.categoryID = categoryID;
            this.name = name;
            this.categoryDescription = categoryDescription;
            return this;

        }

        public Category build() {
            return new Category(this);
        }
    }

}

