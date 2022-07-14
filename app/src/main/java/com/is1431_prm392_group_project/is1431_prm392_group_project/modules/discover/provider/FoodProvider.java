package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.discover.provider;

import android.content.Context;

import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.food.Food;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.user.User;
import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.profile.provider.IProfileProvider;

import java.util.List;

public class FoodProvider extends IFoodProvider {
    public FoodProvider(Context context) {
        super(context);
    }

    public List<Food> getFoods(){
      return   repo.getFood().getAll();
    }
}
