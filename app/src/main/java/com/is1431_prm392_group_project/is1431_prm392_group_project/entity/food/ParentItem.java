package com.is1431_prm392_group_project.is1431_prm392_group_project.entity.food;


import java.util.List;

public class ParentItem {

    // Declaration of the variables
    private String ParentItemTitle;
    private List<Food> foodList;

    // Constructor of the class
    // to initialize the variables
    public ParentItem(
            String ParentItemTitle,
            List<Food> foodList) {

        this.ParentItemTitle = ParentItemTitle;
        this.foodList = foodList;
    }

    // Getter and Setter methods
    // for each parameter
    public String getParentItemTitle() {
        return ParentItemTitle;
    }

    public void setParentItemTitle(
            String parentItemTitle) {
        ParentItemTitle = parentItemTitle;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setChildItemList(
            List<Food> foodList) {
        foodList = foodList;
    }
}
