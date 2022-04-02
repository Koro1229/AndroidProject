package com.example.a108820027_hw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox chocolate;
    private CheckBox sprinkle;
    private CheckBox nut;
    private CheckBox cherry;
    private CheckBox cookie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chocolate = findViewById(R.id.chocolate);
        sprinkle = findViewById(R.id.sprinkles);
        nut = findViewById(R.id.crushed_nut);
        cherry = findViewById(R.id.cherries);
        cookie = findViewById(R.id.orio_cookie);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void onSubmit(View view) {
        String content = "";
        if(chocolate.isChecked())
            content = content + getString(R.string.chocolate_syrup) + " ";
        if(sprinkle.isChecked())
            content = content + getString(R.string.sprinkles) + " ";
        if(nut.isChecked())
            content = content + getString(R.string.crushed_nuts) + " ";
        if(cherry.isChecked())
            content = content + getString(R.string.cherries) + " ";
        if(cookie.isChecked())
            content = content + getString(R.string.orio_cookie_crumbles) + " ";
        displayToast(content);
    }
}