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

        public Category getTasks(int categoryID, String name, String categoryDescription) {
            return new Category.Builder()
                    .setCategoryID(categoryID)
                    .setName(name)
                    .setCategoryDescription(categoryDescription)
                    .build();
        }


        public Builder copy(Category category) {
            this.categoryID = category.categoryID;
            this.name = category.name;
            this.categoryDescription = category.categoryDescription;
            return this;

        }

        public Category build() {
            return new Category(this);
        }
    }

}

