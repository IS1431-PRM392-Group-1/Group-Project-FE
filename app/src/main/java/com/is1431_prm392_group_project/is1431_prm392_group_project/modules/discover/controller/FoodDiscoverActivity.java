package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.discover.controller;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.is1431_prm392_group_project.is1431_prm392_group_project.R;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.food.Food;
import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.discover.provider.FoodProvider;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FoodDiscoverActivity extends AppCompatActivity {
    private HashMap _$_findCachedViewById;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FoodProvider provider = new FoodProvider(this);
        this.setContentView(R.layout.activity_food_calories);
        ListView listview = this.findViewById(R.id.listView);
        boolean var4 = false;
        List<Food> list =  provider.getFoods();
        TextView calorieText = this.findViewById(R.id.calorieText);
        Button reset = this.findViewById(R.id.reset);
        final TextView value = this.findViewById(R.id.valueCal);


        listview.setAdapter(new FoodAdapter(this, R.layout.listview_row, list));
        ((ListView) this.findViewById(R.id.listView)).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public final void onItemClick(@NotNull AdapterView parent, @NotNull View view, int position, long id) {
                TextView var10000;
                TextView var10001;
                String var6;
                boolean var7;

                if (position == 0) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 200));
                }

                if (position == 1) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 100));
                }

                if (position == 2) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 50));
                }

                if (position == 3) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 50));
                }

                if (position == 4) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 140));
                }

                if (position == 5) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 200));
                }

                if (position == 6) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 250));
                }

                if (position == 7) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 140));
                }

                if (position == 8) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 110));
                }

                if (position == 9) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 200));
                }

                if (position == 10) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 114));
                }

                if (position == 11) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 65));
                }


                if (position == 12) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 132));
                }

                if (position == 13) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 47));
                }

                if (position == 14) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 30));
                }

                if (position == 15) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 220));
                }

                if (position == 16) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 200));
                }

                if (position == 17) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 110));
                }

                if (position == 18) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 170));
                }

                if (position == 19) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 110));
                }

                if (position == 20) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 52));
                }

                if (position == 21) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 95));
                }

                if (position == 22) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 68));
                }

                if (position == 23) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 115));
                }


                if (position == 24) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 110));
                }

                if (position == 25) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 100));
                }

                if (position == 26) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 110));
                }

                if (position == 27) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 300));
                }

                if (position == 28) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 70));
                }

            }

        });
        reset.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View it) {
                value.setText("0");
            }
        });
    }
}
