package com.example.a108820027_hw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean chocolate = false;
    private boolean sprinkle = false;
    private boolean nut = false;
    private boolean cherry = false;
    private boolean cookie = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked(View view) {
        switch (view.getId()) {
            case R.id.chocolate:
                if (chocolate)
                    chocolate = false;
                else
                    chocolate = true;
                break;
            case R.id.sprinkles:
                if (sprinkle)
                    sprinkle = false;
                else
                    sprinkle = true;
                break;
            case R.id.crushed_nut:
                if (nut)
                    nut = false;
                else
                    nut = true;
                break;
            case R.id.cherries:
                if (cherry)
                    cherry = false;
                else
                    cherry = true;
                break;
            case R.id.orio_cookie:
                if (cookie)
                    cookie = false;
                else
                    cookie = true;
                break;
            default:
                break;
        }
    }

    public void show_selected_toast(View view) {
        String content = "";
        if(chocolate)
            content = content + getString(R.string.chocolate_syrup) + " ";
        if(sprinkle)
            content = content + getString(R.string.sprinkles) + " ";
        if(nut)
            content = content + getString(R.string.crushed_nuts) + " ";
        if(cherry)
            content = content + getString(R.string.cherries) + " ";
        if(cookie)
            content = content + getString(R.string.orio_cookie_crumbles) + " ";
        displayToast(content);
    }
}