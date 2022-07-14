package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.profile.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.is1431_prm392_group_project.is1431_prm392_group_project.R;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.user.User;
import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.home.controller.HomeMenu;
import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.profile.provider.ProfileProvider;

public class ProfileActivity extends AppCompatActivity {
    private User profile;
    private ProfileProvider provider;
    private Button save_creds;
    private Spinner ch_gender;
    private EditText ename, eage, eheight, ewt, eemail;
    private long maxid = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        provider = new ProfileProvider(this);
        try {
            profile = provider.getUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
        OnBindingView();
        OnBindingAction();
    }

    private void OnBindingView() {
        save_creds = (Button) findViewById(R.id.btn_save1);
        ch_gender = (Spinner) findViewById(R.id.edit_gender1);
        ename = (EditText) findViewById(R.id.edit_name1);
        ename.setText(profile.getName() + "");
        eage = (EditText) findViewById(R.id.edit_age1);
        eage.setText(profile.getAge() + "");
        eheight = (EditText) findViewById(R.id.edit_height1);
        eheight.setText(profile.getHeight() + "");
        ewt = (EditText) findViewById(R.id.edit_weight1);
        ewt.setText(profile.getWeight() + "");
        eemail = (EditText) findViewById(R.id.edit_email1);
        eemail.setText(profile.getEmail() + "");
    }

    private void OnBindingAction() {
        save_creds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertProfile();
            }
        });
    }

    private void insertProfile() {
        String name = ename.getText().toString();
        int age = Integer.parseInt(eage.getText().toString().trim());
        float height = Float.parseFloat(eheight.getText().toString().trim());
        float weight = Float.parseFloat(ewt.getText().toString().trim());
        String gender = ch_gender.getSelectedItem().toString();
        String email = eemail.getText().toString();
        try {
            provider.insertProfile(name, age, height, weight, gender, email);
            Toast.makeText(this, "Profile Created!", Toast.LENGTH_SHORT).show();
            Intent intent2 = new Intent(this, HomeMenu.class);
            startActivity(intent2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}