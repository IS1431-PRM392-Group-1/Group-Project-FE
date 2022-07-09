package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.home.controller;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.is1431_prm392_group_project.is1431_prm392_group_project.R;
import com.is1431_prm392_group_project.is1431_prm392_group_project.databinding.FragmentDiscoverBinding;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.food.Food;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.food.ParentItem;
import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.common.adaper.ParentItemAdapter;

import java.util.ArrayList;
import java.util.List;

public class DiscoverFragment extends AppCompatActivity {

    private FragmentDiscoverBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_discover);

        RecyclerView
                ParentRecyclerViewItem
                = findViewById(
                R.id.parent_recyclerview);

        // Initialise the Linear layout manager
        LinearLayoutManager
                layoutManager
                = new LinearLayoutManager(
                DiscoverFragment.this);

        // Pass the arguments
        // to the parentItemAdapter.
        // These arguments are passed
        // using a method ParentItemList()
        ParentItemAdapter
                parentItemAdapter
                = new ParentItemAdapter(
                ParentItemList());

        // Set the layout manager
        // and adapter for items
        // of the parent recyclerview
        ParentRecyclerViewItem
                .setAdapter(parentItemAdapter);
        ParentRecyclerViewItem
                .setLayoutManager(layoutManager);
    }

    private List<ParentItem> ParentItemList()
    {
        List<ParentItem> itemList
                = new ArrayList<>();

        ParentItem item
                = new ParentItem(
                "Vegetarian",
                ChildItemList());
        itemList.add(item);
        ParentItem item1
                = new ParentItem(
                "Pre-Workout",
                ChildItemList());
        itemList.add(item1);
        ParentItem item2
                = new ParentItem(
                "Post-Workout",
                ChildItemList());
        itemList.add(item2);
        ParentItem item3
                = new ParentItem(
                "Low-Card",
                ChildItemList());
        itemList.add(item3);

        return itemList;
    }

    // Method to pass the arguments
    // for the elements
    // of child RecyclerView
    private List<Food> ChildItemList()
    {
        List<Food> ChildItemList
                = new ArrayList<>();

        ChildItemList.add(new Food("food1",120));
        ChildItemList.add(new Food("food2",30));
        ChildItemList.add(new Food("food3",300));
        ChildItemList.add(new Food("food4",50));
        return ChildItemList;
    }


}