package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.feature;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.is1431_prm392_group_project.is1431_prm392_group_project.MainActivity;
import com.is1431_prm392_group_project.is1431_prm392_group_project.R;

public class UpdateOnFeature extends AppCompatActivity {
    private Button button;

    private void onBindingView() {
        button = findViewById(R.id.btn_restart);
    }

    private void onBindingAction() {
        button.setOnClickListener(v -> restart());
    }

    private void restart() {
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_on_feature);
        onBindingView();
        onBindingAction();
    }
}
